package com.pb.enot.hw11;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//  -************************-телефоны -**************************
//  -****************-(количество не ограничено)-*****************
class Phones {
    public String type;
    public String number;
    public Phones(String type, String number) {
        this.type = type;
        this.number = number;
    }
    @Override
    public String toString() {
        return  "Тип'" + type + '\'' +
                ", Номер '" + number + '\'' ;
    }
}
public class PhoneBook {
//  -*****************---*****************
    public PhoneBook() {    }
//  -*****************---*****************
    public PhoneBook(String firstName, String lastName, ArrayList<Phones> phoneList, LocalDate dateOfBirth, String streetAddress) throws JsonProcessingException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone =  phoneList;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.modifyDate = LocalDateTime.now();
    }
//  -*****************-добавление элемента-*********************
    public void newContact() throws Exception {
        String qq;
        String pNumb;
        String pType;
        Scanner init = new Scanner(System.in);
        System.out.print("Створеня нового контакту:");
       System.out.print("Імя >>" );           String firstNames =   init.next();//"Олександр";
        System.out.print("Фамілія >>");        String lastNames = "Андрущишен"; //  init.next();
        //  -***
        System.out.println("Введіть ");
        do {
            System.out.print("Тип номеру: ->");  pType  = "Робочий";//=  init.next();
            System.out.print("Номер -> ");       pNumb =  "0997624803";// init.next();
            System.out.print("добавить ще? так/ні --> ");   qq = init.next();
            Phones phonee =  new Phones(pType,pNumb);
            phone.add(phonee);
       }        while (!qq.equals("-"));

        System.out.print("streetAddress >>");        String streetAddress = "Десь в Полі";// init.next();
        System.out.print("День >>");                  int DD = 11;      //init.nextInt();
        System.out.print("Місяць >>");                int MM = 9;      //init.nextInt();
        System.out.print("Рік >>");                   int RR = 2020;   // init.nextInt();

        PhoneBook cb = new PhoneBook(firstNames,lastNames,phone, LocalDate.of(RR, MM, DD),streetAddress);
        member.add(cb);
        // Проверяем, что назначение успешно
        for(PhoneBook c:member)
        {
            System.out.println(c);
        }
        System.out.print(" Добавлено контакт  <" + cb.getFirstName() + " - " + cb.getLastName() + ">  Успішно!!\n");
        System.out.println(member);
        printGUI();
        run();
    }//-**********
//  -*****************-delete элементов-************************
    public void deleteContact() throws Exception{
        Scanner init = new Scanner(System.in);
        boolean flag = false; // решение о том, найти ли совпадение
        System.out.println("Видаленя контакту!");
        System.out.println("Знайти за назвою, введіть 1" + "\n" +
                           "за Фамфлією >> 2" + "\n" );
        System.out.print( ">> ");
        String searchType  = init.next();
        switch (searchType) {
            case "1": // FIND BY NAME
        System.out.println( "Введіть Імя для Пошуку: >> ");
        String getName = init.next();
                for(PhoneBook c:member)
                {
                    if (c.getFirstName().equals(getName)) {
                        member.remove(c);
                        flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                        System.out.println("Контакт видалено!");
                        break;
                    }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");

                }break;
        case "2":// FIND BY LastNAME
        System.out.println( "Введіть Фамілію для Пошуку: >> ");
        String getLast = init.next();
            for(PhoneBook c:member)
            {
                if (c.getLastName().equals(getLast)) {
                    member.remove(c);
                    flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                    System.out.println("Контакт видалено!");
                    break;
                }
            }
            if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                System.out.print("Нічого не Знайдено!\n");

            } break;
        default: break;
        }
        printGUI();
        run();
    }//-********
//  -*****************-поиск элементов-*************************
    public  void searchMember() throws Exception {
        System.out.println(member);
            boolean flag = false; // решение о том, найти ли совпадение
            Scanner init = new Scanner(System.in);
            System.out.println("Якщо ви хочете шукати :" + "\n"+
                    "за назвою, введіть 1" + "\n" +
                    "за Фамфлією >> 2" + "\n" +
                    "за номером  >> 3");
            System.out.print( ">> ");
            String searchType  = init.next();
            switch (searchType) {
                case "1":
                    System.out.print( "Введіть імя Для Пошуку: >> ");
                    Scanner string1 = new Scanner(System.in);
                    String getName = string1.nextLine();
                    for(PhoneBook c:member)
                    {
                        if (c.getFirstName().equals(getName)) {
                            flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                            System.out.println(c);
                        }
                    }
                    if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                        System.out.print("Нічого не Знайдено!\n");
                    }
                    // FIND BY NAME
                    break;
                case "2":
                    System.out.print( "Введіть Фамілію Для Пошуку: >> ");
                    Scanner string2 = new Scanner(System.in);
                    String getLast = string2.nextLine();
                    for(PhoneBook c:member)
                    {
                        if (c.getLastName().equals(getLast)) {
                            flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                            System.out.println(c);
                        }
                    }
                    if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                        System.out.print("Нічого не Знайдено!\n");
                    }
                    // FIND BY PHONE
                    break;
                default: break;
            }
        printGUI();
        run();
    }//-********
//  -*****************-вывод всех записей -***********************
    public  void displayMember() throws Exception {
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
                System.out.println(member);
                break;
            case "2":
                member.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
                System.out.println(member);
                // FIND BY PHONE
                break;
            case "3":
                member.sort((o1, o2) -> o1.getStreetAddress().compareTo(o2.getStreetAddress()));
                System.out.println(member);
                break;
            default: break;
        }
        printGUI();
        run();
    }//-*******  + lamda ! ! !
//  -*****************-редактирование элемента-*****************
    public void modifyMember() throws Exception {
        System.out.print("Кого из участников вы хотите изменить?\n");
       // searchOneMember();
        System.out.print("Пожалуйста, введите новую информацию:\n");
        Scanner init = new Scanner(System.in);



      //  System.out.printf("Участник %s  збережено!! \n", getFirstName());

        printGUI();
        run();
    }
//  -*****************-запись в файл всех данных-*****************
    public  void createNumbersFile() throws Exception {

        try (FileWriter writer = new FileWriter("src/com/pb/enot/hw11/numbers.json", false)) {

            ObjectMapper mapper = new ObjectMapper();
            SimpleModule modules = new SimpleModule();
            modules.addSerializer(LocalDate.class, new LocalDateSerializer());
            modules.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
            modules.addDeserializer(LocalDate.class, new LocalDateDeserializer());
            modules.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
            mapper.registerModule(modules);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            String personsJson = mapper.writeValueAsString(member);
            System.out.println(personsJson);

            writer.write(personsJson);
            writer.flush();
            writer.close();
            System.out.println("File created: !!!");
            run();
        } catch (IOException e) {
            System.out.println("Шота сломалось :(");
            e.printStackTrace();
            run();
        }
    }
//  -*****************-загрузка из файла данных-*****************
     public void backupContactFile() throws Exception {

    }
    //  -*****************-Меню-*******************
    public void printGUI()    {

        System.out.println("...Меню...");
        System.out.println(
                " 1 добавление элемента"              + "\n"+
                        " 2 удаление элемента"                + "\n"+
                        " 3 поиск элементов"                  + "\n"+
                        " 4 вывод всех записей с сортировкой" + "\n"+
                        " 5 редактирование элемента"          + "\n"+
                        " 6 запись в файл всех данных"        + "\n"+
                        " 7 загрузка из файла всех данных"    + "\n"+
                        " 0 Вийти!");
        System.out.println(" ");
        System.out.println(member);
    }//-*************
//  -*****************-функционал-*****************
    public void run() throws Exception {
        //  System.out.println(member);
        int n;
        PhoneBook pb = new PhoneBook();
        Scanner init = new Scanner(System.in);
        System.out.print( ">> ");
        n = init.nextInt();
        switch (n) {
            case 1:            // добавление элемента

                newContact();  //провірено*********
                break;
            case 2:           // удаление элемента
                deleteContact();  //провірено*******
                break;
            case 3:           // поиск элементов

                searchMember();
                break;
            case 4:           // вывод всех записей с сортировкой по указанному полю

                displayMember();
                break;
            case 5:           // редактирование элемента

                //*****    modifyMember();
                break;
            case 6:           // запись в файл всех данных

                //*****     createNumbersFile();
                break;
            case 7:           // загрузка из файла всех данных

                //*****    backupContactFile();
                break;
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
    ArrayList<Phones> phone = new ArrayList<>(); //телефоны (количество не ограничено) +
//  -*****************---*****************-
    private String firstName = "";          //   ім'я
    private String lastName = "";          //  Прізвеще
    private LocalDate dateOfBirth;       //дата рождения
    private String streetAddress;       //адрес
    private LocalDateTime modifyDate;  //дата и время редактирования
//  -*****************---*****************-
    public String getFirstName() {           return firstName;      }
    public String getLastName() {            return lastName;       }
    public LocalDate getDateOfBirth() {      return dateOfBirth;    }
    public String getStreetAddress() {       return streetAddress;  }
    public LocalDateTime getModifyDate() {   return modifyDate;     }
//  -*****************-String-*****************-
    @Override
    public String toString() {
        return " {" +

                ", Імя/Фамілія'" + firstName  +
                "/'" + lastName +
                ", Телефони:" + (phone) +
                ", Дата народженя " + dateOfBirth +
                ", Адреса '" + streetAddress + '\'' +
                ", Дата модифікації " + modifyDate +
                '}'+ "\n";
    }
//  -*****************- -*****************-
}





