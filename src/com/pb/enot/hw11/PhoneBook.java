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
import java.util.List;
import java.util.Scanner;
//  -************************-телефоны -**************************
//  -****************-(количество не ограничено)-*****************
class Phones {
    public String type;
    public String number;
    public Phones() {    }
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
    public PhoneBook(String firstName, String lastName, ArrayList phonsLists, LocalDate dateOfBirth, String streetAddress) throws JsonProcessingException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones =  phonsLists;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.modifyDate = LocalDateTime.now();
    }
//  -*****************-добавление элемента-*****************
    public void newContact() throws Exception {
        String qq;
        String pNumb;
        String pType;
        Scanner init = new Scanner(System.in);
        System.out.print("Створеня нового контакту:");
       System.out.print("Імя >>" );           String firstNames = "Олександр"; // init.next();
        System.out.print("Фамілія >>");        String lastNames = "Андрущишен"; //  init.next();
        //  -***
        System.out.println("Введіть ");
        do {
            System.out.print("Тип номеру: ->");  pType =  init.next(); //= "Робочий";
            System.out.print("Номер -> ");       pNumb = init.next(); // "0997624803";
            System.out.print("добавить ще? так/ні --> ");   qq = init.next();
            Phones phonee =  new Phones(pType,pNumb);
            ph.add(phonee);
       }        while (!qq.equals("-"));

        System.out.print("streetAddress >>");        String streetAddress = "Десь в Полі";// init.next();
        System.out.print("День >>");                  int DD = 11;      //init.nextInt();
        System.out.print("Місяць >>");                int MM = 9;      //init.nextInt();
        System.out.print("Рік >>");                   int RR = 2020;   // init.nextInt();

        PhoneBook cb = new PhoneBook(firstNames,lastNames,ph, LocalDate.of(RR, MM, DD),streetAddress);
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
    }
//  -*****************-поиск элементов-*****************
    public  void searchMember() throws Exception {
        System.out.println(member);
        searchOneMember();


        printGUI();
        run();
    }
//  -*****************-поиск возврат ІД-*****************
    public void searchOneMember() {
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
                System.out.println(member + "  111  ");
                System.out.print( "Введіть імя Для Пошуку: >> ");
                Scanner string1 = new Scanner(System.in);
                String getName = string1.nextLine();
                for(PhoneBook c:member)
                {
                    if (c.getFirstName().equals(getName)) {

                        flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                        System.out.println(member.indexOf(c));
                        // return member.indexOf(c);
                        System.out.println(c);
                        break;
                    }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");
                }
                // FIND BY NAME
                break;
            case "2":
                System.out.println(member + "  222  ");
                System.out.print( "Введіть Фамілію Для Пошуку: >> ");
                Scanner string2 = new Scanner(System.in);
                String getLast = string2.nextLine();
                for(PhoneBook c:member)
                {
                    if (c.getLastName().equals(getLast)) {
                        flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                        //  return member.indexOf(c);
                        System.out.println(c);
                        break;
                    }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");
                }
                // FIND BY PHONE
                break;
            default: break;
        }

    }
//  -*****************-вывод всех записей -*****************
    public  void displayMember() throws Exception {
        System.out.println("\n" +
                "Ласкаво просимо до нашої книги зв'язків!\n");
        System.out.println(member.size() + "- збережено в памяті");
                System.out.println( member );
        printGUI();
        run();
    }
//  -*****************-редактирование элемента-*****************
    public void modifyMember() throws Exception {
        System.out.print("Кого из участников вы хотите изменить?\n");
        searchOneMember();
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
         File file = Paths.get("src/com/pb/enot/hw11/numbers.json").toFile();
         FileInputStream fileInputStream = new FileInputStream(file);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

     //    ArrayList<PhoneBook> persons = (ArrayList<PhoneBook>)  objectInputStream.readObject();

         System.out.println(objectInputStream);


    }
    //  -*****************-Меню-*****************
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
    }
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
                System.out.println(1);
                newContact();
                break;
            case 2:           // удаление элемента
                System.out.println(2);

                break;
            case 3:           // поиск элементов
                System.out.println(3);
                searchOneMember();
              //  pb.searchMember();
                break;
            case 4:           // вывод всех записей с сортировкой по указанному полю
                System.out.println(4);
                displayMember();
                break;
            case 5:           // редактирование элемента
                System.out.println(5);
                modifyMember();
                break;
            case 6:           // запись в файл всех данных
                System.out.println(6);
                 createNumbersFile();
                break;
            case 7:           // загрузка из файла всех данных
                System.out.println(7);
                backupContactFile();
                break;
            case 0:          // qex
                System.out.println("exit! ");
                System.out.println(0);
                System.exit(0);
                break;
            default:
                break;
        }
    }
//  -*****************---*****************-
    ArrayList<PhoneBook> member = new ArrayList<>();
    ArrayList<Phones> ph = new ArrayList<>(); //телефоны (количество не ограничено) +
//  -*****************---*****************-
    private String firstName = "";          //   ім'я
    private String lastName = "";          //  Прізвеще
    private ArrayList phones;                //телефон
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
                ", Телефони " + (phones) +
                ", Дата народженя " + dateOfBirth +
                ", Адреса '" + streetAddress + '\'' +
                ", Дата модифікації " + modifyDate +
                '}'+ "\n";
    }
//  -*****************- -*****************-
}





