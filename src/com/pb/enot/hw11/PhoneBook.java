package com.pb.enot.hw11;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PhoneBook {
//  -*****************---*****************
    public PhoneBook() {    }
//  -*****************---*****************
    public PhoneBook(String firstName, String lastName, String phone, LocalDate dateOfBirth, String streetAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone =  phone;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.modifyDate = LocalDateTime.now();
    }
//стрим  -*****************-Показать элементu-*********************   //
    public void contactView() throws Exception {
        member.stream().forEach(System.out::println);
        printGUI();
        run();
    }
//  -*****************-добавление элемента-*********************
    public void newContact() throws Exception {
        String pNumb;
        Scanner init = new Scanner(System.in);
        System.out.println("*********** Створеня нового контакту ***********");
       System.out.print("Імя >>" );           String firstNames =   init.next();
        System.out.print("Фамілія >>");        String lastNames =    init.next();
        System.out.println("Введіть Номер -> ");       pNumb =   init.next();
        System.out.print("streetAddress >>");        String streetAddress =  init.next();
        System.out.print("День >>");                  int DD = init.nextInt();
        System.out.print("Місяць >>");                int MM = init.nextInt();
        System.out.print("Рік >>");                   int RR =  init.nextInt();

        PhoneBook cb = new PhoneBook(firstNames,lastNames,pNumb, LocalDate.of(RR, MM, DD),streetAddress);
        member.add(cb);
        // Проверяем, что назначение успешно
        for(PhoneBook c:member)
        {
            System.out.println(c);
        }
        System.out.print(" Добавлено контакт  <" + cb.getFirstName() + " - " + cb.getLastName() + ">  Успішно!!\n");
        printGUI();
        run();
    }//-**********
//  lamda -*****************-delete элементов-************************
    public void deleteContact() throws Exception{
        Scanner init = new Scanner(System.in);
        System.out.println("Видаленя контакту!");
        System.out.println("Знайти за назвою, введіть 1" + "\n" +
                           "за Фамілією >> 2" + "\n" +
                           "Адресою >> 3" + "\n" );
        System.out.print( ">> ");
        String searchType  = init.next();
        switch (searchType) {
            case "1": // FIND BY NAME
        System.out.println( "Введіть Імя для Пошуку: >> ");
                member.removeIf(c -> c.getFirstName().equals(init.next()));
                System.out.println(member);
                System.out.println("Контакт удален! ");
                break;
        case "2":// FIND BY LastNAME
        System.out.println( "Введіть Фамілію для Пошуку: >> ");
            member.removeIf(c -> c.getLastName().equals(init.next()));
            System.out.println("Контакт удален! ");
            case "3":
                System.out.println( "Введіть Адрес для Пошуку: >> ");
                member.removeIf(c -> c.getStreetAddress().equals(init.next()));
                System.out.println("Контакт удален! ");
             break;
        default: break;
        }

        printGUI();
        run();
    }//-********
//  -*****************-поиск элементов-*************************
    public  void searchMember() throws Exception {
        System.out.println(member);
            Scanner init = new Scanner(System.in);
            System.out.println("Якщо ви хочете шукати :" + "\n"+
                    "за назвою, введіть 1" + "\n" +
                    "за Фамфлією >> 2" + "\n" +
                    "за номером  >> 3");
            System.out.print( ">> ");
            String searchType  = init.next();
            switch (searchType) {
                case "1":// FIND BY NAME
                    System.out.print( "Введіть імя Для Пошуку: >> ");
                    member.stream().filter(c -> c.getFirstName().equals(init.next())).forEach(System.out :: println);

                    break;
                case "2": //  firstName
                    System.out.print( "Введіть Фамілію Для Пошуку: >> ");
                    member.stream().filter(c -> c.getLastName().equals(init.next())).forEach(System.out :: println);
                    break;
                case "3":// FIND BY PHONE
                    System.out.print( "Введіть Фамілію Для Пошуку: >> ");
                    member.stream().filter(c -> c.getFirstName().equals(init.next())).forEach(System.out :: println);

                default: break;
            }
        printGUI();
        run();
    }//-********
// lamda -*****************-вывод всех записей -***********************
    public  void shortBY() throws Exception {
        System.out.println("Ласкаво просимо до нашої книги зв'язків!");
        System.out.println(member.size() + "- збережено в памяті");
        Scanner init = new Scanner(System.in);
        System.out.println("Виконати Сортуваня За :" + "\n"+
                "назвою, введіть 1" + "\n" +
                "Фамфлією    ->  2"  + "\n" +
                "За адресою - >  3");
        System.out.print( ">> ");
        String searchType  = init.next();

        switch (searchType) {
            case "1":
                member.sort(Comparator.comparing(PhoneBook::getFirstName));
                if (member.isEmpty()) {
                    System.out.println("Список пуст! ");
                } else {
                    for (PhoneBook phoneBook : member) System.out.println("# " + phoneBook);
                    System.out.println();
                }
                break;
            case "2":
                member.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
                if (member.isEmpty()) {
                    System.out.println("Список пуст! ");
                } else {
                    for (PhoneBook phoneBook : member) System.out.println("# " + phoneBook);
                    System.out.println();
                }
                // FIND BY PHONE
                break;
            case "3":
                member.sort((o1, o2) -> o1.getStreetAddress().compareTo(o2.getStreetAddress()));
                if (member.isEmpty()) {
                    System.out.println("Список пуст! ");
                } else {
                    for (PhoneBook phoneBook : member) System.out.println("# " + phoneBook);
                    System.out.println();
                }
                break;
            default: break;
        }
        printGUI();
        run();
    }//-*******  +  ! ! !
//  -*****************-редактирование элемента-*****************
    public void modifyMember() throws Exception {
        if (member.isEmpty()) {
            System.out.println("Список пуст! ");
        } else {
            for (int i = 0; i < member.size(); i++) {
                System.out.println("#" + (i + 1) + " " + member.get(i));
            }
            System.out.println();
        }
        System.out.println("Введите номер редактируемого контакта: ");
        Scanner init = new Scanner(System.in);
        int index = init.nextInt();
        try {
            boolean exit = false;
            do {
                System.out.println("Введіть 1, щоб відредагувати ім'я\n" +
                                   "Введіть 2, щоб відредагувати Фамілію\n" +
                                   "Введіть 3, щоб відредагувати номер\n" +
                                   "Введіть 4, щоб відредагувати адресу\n" +
                                   "Введіть 5, щоб редагувати дату\n" +
                                   "Введіть 0, щоб выйти\n");
                int com = init.nextInt();
                switch (com) {
                    case 1:
                        System.out.println("Старое имя " + member.get(index-1).getFirstName());
                        System.out.println("Введите новое имя: ");
                        member.set(index-1, member.get(index-1)).setFirstName(init.next(), LocalDateTime.now());
                        System.out.println("Новое имя: " + member.get(index-1).getFirstName());

                        System.out.println("Контакт Збережено! ");//contacts.set(index-1, contacts.get(index-1));
                        break;
                    case 2:
                        System.out.println("Старая фамілія " + member.get(index-1).getLastName());
                        System.out.println("Введите новое фамілія: ");
                        member.set(index-1, member.get(index-1)).setLastName(init.next(), LocalDateTime.now());
                        System.out.println("Новое фамілія: " + member.get(index-1).getLastName());
                        System.out.println("Контакт Збережено! ");
                        break;
                    case 3:
                        System.out.println("Старый телефон: " + member.get(index-1).getPhone());
                        System.out.println("Введите новый номер телефона: ");
                        member.set(index-1, member.get(index-1)).setPhone(init.next(), LocalDateTime.now());
                        System.out.println("Новый телефон: " + member.get(index-1).getPhone());
                        System.out.println("Контакт Збережено! ");
                        break;
                    case 4:
                        System.out.println("Старый адрес: " + member.get(index-1).getStreetAddress());
                        System.out.println("Введите новый адрес: ");
                        member.set(index-1, member.get(index-1)).setStreetAddress(init.next(), LocalDateTime.now());
                        System.out.println("Новый адрес: " + member.get(index-1).getStreetAddress());
                        System.out.println("Контакт Збережено! ");
                        break;
                    case 5:
                        System.out.println("Старая дата рождения: " + member.get(index-1).getDateOfBirth());
                        System.out.println("Введите новую дату рождения через в формате XXXX XX XX через пробел: ");
                        member.set(index-1, member.get(index-1)).setDateOfBirth(LocalDate.of(init.nextInt(), init.nextInt(), init.nextInt()),
                                LocalDateTime.now());
                        System.out.println("Новая дата рождения: " + member.get(index-1).getDateOfBirth());
                        System.out.println("Контакт Збережено! ");
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Попробуйте еще раз. \n");
                }
            }  while (!exit);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
        printGUI();
        run();
    }
//  -*****************-запись в файл всех данных-*****************
    public  void createNumbersFile() throws Exception {
            File file = Paths.get("contacts.data").toFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(member);
            System.out.println("Файл записан! ");
            objectOutputStream.close();
            System.out.println(new String(Files.readAllBytes(Paths.get("contacts.data"))));
        printGUI();
        run();
        }
//  -*****************-загрузка из файла данных-*****************
     public void backupContactFile() throws Exception {
         ArrayList<PhoneBook> newContacts;
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("contacts.data"));
         newContacts = (ArrayList<PhoneBook>) objectInputStream.readObject();
         for (PhoneBook c : newContacts) {
             System.out.println(c.toString());
         }
         printGUI();
         run();
     }
    //  -*****************-Меню-*******************
    public void printGUI()    {
        System.out.println("\n...Меню...");
        System.out.println(
                        " 1 добавление элемента"              + "\n"+
                        " 2 Просмотр всех контактов"              + "\n"+
                        " 3 удаление элемента"                + "\n"+
                        " 4 поиск элементов"                  + "\n"+
                        " 5 вывод всех записей с сортировкой" + "\n"+
                        " 6 редактирование элемента"          + "\n"+
                        " 7 запись в файл всех данных"        + "\n"+
                        " 8 загрузка из файла всех данных"    + "\n"+
                        " 0 Нейти?");
    }//-*************
//  -*****************-функционал-*****************
    public void run() throws Exception {
        Scanner init = new Scanner(System.in);
        System.out.print( ">> ");
        int n = init.nextInt();
        switch (n) {
            case 1:            // добавление элемента
                newContact();  //провірено*********
                break;
            case 2:             //просмотр элементов
                contactView();
                break;
            case 3:     // удаление элемента
                deleteContact();  //провірено*******
                break;
            case 4:         // поиск элементов
                searchMember();
                break;
            case 5:          // вывод всех записей с сортировкой по указанному полю
                shortBY();
                break;
            case 6:          // редактирование элемента
                modifyMember();
                break;
            case 7:           // запись в файл всех данных
                createNumbersFile();
                break;
            case 8:// загрузка из файла всех данных
                backupContactFile();
            case 0:          // qex
                System.out.println("exit! ");
                System.exit(0);  //провірено
                break;
            default:
                break;
        }
    }//-****
//  -*****************---*****************-
    ArrayList<PhoneBook> member = new ArrayList<>();
//  -*****************---*****************-
    private String firstName = "";          //   ім'я
    private String lastName = "";          //  Прізвеще
    private LocalDate dateOfBirth;       //дата рождения
    private String streetAddress;       //адрес
    private LocalDateTime modifyDate;  //дата и время редактирования
    private String phone ; //телефоны (количество не ограничено)
//  -*****************---*****************-
    public ArrayList<PhoneBook> getMember() {        return member;    }
    public String getPhone() {        return phone;    }
    public String getFirstName() {        return firstName;    }
    public String getLastName() {        return lastName;    }
    public LocalDate getDateOfBirth() {        return dateOfBirth;    }
    public String getStreetAddress() {        return streetAddress;    }
    public LocalDateTime getModifyDate() {        return modifyDate;    }
//  -*****************---*****************-
    public void setMember(ArrayList<PhoneBook> member) {                      this.member = member;    }
    public void setPhone (String phone, LocalDateTime now) {                  this.modifyDate = now;      this.phone = phone;                     }
    public void setStreetAddress(String streetAddress, LocalDateTime now) {   this.modifyDate = now;      this.streetAddress = streetAddress;     }
    public void setFirstName(String firstName, LocalDateTime now) {           this.modifyDate = now;      this.firstName = firstName;             }
    public void setLastName(String lastName, LocalDateTime now) {             this.modifyDate = now;      this.lastName = lastName;               }
    public void setDateOfBirth(LocalDate dateOfBirth, LocalDateTime now) {   this.modifyDate = now;       this.dateOfBirth = dateOfBirth;         }
    public void setModifyDate(LocalDateTime modifyDate) {                     this.modifyDate = modifyDate;                                       }
//  -*****************-String-*****************-
    @Override
    public String toString() {
        return firstName + "/'" + lastName +
                ", Телефони:" + (phone) +
                ", Дата народженя " + dateOfBirth +
                ", Адреса '" + streetAddress + '\'' +
                ", Дата модифікації " + modifyDate ;
    }
//  -*****************- -*****************-
}





