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

class Phones {
    public String type;
    public String number;

    public Phones(String type, String number) {
        this.type = type;
        this.number = number;
    }
}
public class PhoneBook {


    public PhoneBook() throws JsonProcessingException {
    }

    public PhoneBook(String firstName, String lastName, String phone, LocalDate dateOfBirth, String streetAddress) throws JsonProcessingException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.modifyDate = LocalDateTime.now();
    }

    public  void searchMember() throws Exception {
        searchOneMember();
        printGUI();
        run();
    }

    public  void displayMember() throws Exception {
        System.out.println("\n" +
                "Ласкаво просимо до нашої книги зв'язків!\n");
        System.out.println("Size" + member.size());

                System.out.println( member );

        printGUI();
        run();
    }

    public void modifyMember() throws Exception {
        System.out.print("Кого из участников вы хотите изменить?\n");
        searchOneMember();
        System.out.print("Пожалуйста, введите новую информацию:\n");
        Scanner init = new Scanner(System.in);
        System.out.print("Введите Імя >>");          String firstNames = init.nextLine();
        System.out.print("Введите Фамілію >>");      String lastNames = init.nextLine();
        System.out.print("Введите Номер >>");        String phones = init.nextLine();
        System.out.print("Введите Адрес >>");        String streetAddress = init.nextLine();
        System.out.print(" День   >>");        int DD = init.nextInt();
        System.out.print(" Місяць >>");        int MM = init.nextInt();
        System.out.print(" Рік    >>");        int RR = init.nextInt();
        //LocalDate dateOfBirths = LocalDate.of(RR, MM, DD);
        PhoneBook cb = new PhoneBook(firstNames,lastNames,phones,LocalDate.of(RR, MM, DD),streetAddress);
        member.add(cb);
        System.out.printf("Участник %s  збережено!! \n", getFirstName());

        printGUI();
        run();
    }

    public void newContact() throws Exception {
        Scanner init = new Scanner(System.in);
        System.out.println("");
        System.out.print("firstNames >>");
        String firstNames = init.nextLine();
        System.out.print("lastNames >>");
        String lastNames = init.nextLine();
        System.out.print("phones >>");
        String phones = init.nextLine();
        System.out.print("streetAddress >>");
        String streetAddress = init.nextLine();
        System.out.print("date >>");
        int DD = init.nextInt();
        System.out.print("mount >>");
        int MM = init.nextInt();
        System.out.print("year >>");
        int RR = init.nextInt();
        LocalDate dateOfBirths = LocalDate.of(RR, MM, DD);
        PhoneBook cb = new PhoneBook(firstNames,lastNames,phones,dateOfBirths,streetAddress);
        member.add(cb);
        // Проверяем, что назначение успешно
        for(PhoneBook c:member)
        {
            System.out.println(c);
        }
        System.out.print(" Add member  " + cb.getFirstName() + " - " + cb.getLastName() + "  Success !!\n");
        System.out.println(member);


        printGUI();
        run();
    }

    public void searchOneMember() {
        System.out.println(member);
        boolean flag = false; // решение о том, найти ли совпадение
        Scanner init = new Scanner(System.in);
        System.out.println("Якщо ви хочете шукати :" + "\n"+
                "за назвою, введіть 1" + "\n" +
                "за Фамфлією >> 2" + "\n" +
                "за номером  >> 3");
        System.out.print( ">> ");
        int searchType  = init.nextInt();


        switch (searchType) {
            case 1:
                System.out.println(member + "  111  ");
                System.out.print( "Введіть імя Для Пошуку: >> ");
                Scanner string1 = new Scanner(System.in);
                String getName = string1.nextLine();
                for(PhoneBook c:member)
                {
                    if (c.getFirstName().equals(getName)) {
                        System.out.println("Name " + "Sex " + "Tel " + "Addr " + c.getFirstName());
                        // System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                        flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                    }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");
                }
                // FIND BY NAME
                break;
            case 2:
                System.out.println(member + "  222  ");
                System.out.print( "Введіть Фамілію Для Пошуку: >> ");
                Scanner string2 = new Scanner(System.in);
                String getLast = string2.nextLine();
                for(PhoneBook c:member)
                {
                    if (c.getLastName().equals(getLast)) {
                    System.out.println("Name " + "Sex " + "Tel " + "Addr ");
                    // System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                    flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");
                }

                // FIND BY PHONE
                break;
            case 3:
                System.out.println(member + "  333  ");
                System.out.print( "Введіть номер для Пошуку: >> ");
                Scanner string3 = new Scanner(System.in);
               String getPhone = string3.nextLine();
                for(PhoneBook c:member)
                {
                    if (c.getPhone().equals(getPhone)) {
                        System.out.println("Name " + "Sex " + "Tel " + "Addr " + c.getPhone());
                        // System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                        flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
                    }
                }
                if (!flag) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
                    System.out.print("Нічого не Знайдено!\n");
                }
                // FIND BY EMAIL
                break;
        }
    }

    public  void createNumbersFils() throws Exception {

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

     public void backupContactFile() throws Exception {
         File file = Paths.get("src/com/pb/enot/hw11/numbers.json").toFile();
         FileInputStream fileInputStream = new FileInputStream(file);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

         ArrayList<PhoneBook> persons = (ArrayList<PhoneBook>)  objectInputStream.readObject();

         System.out.println(persons);


    }

//  -*****************---*****************
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
                pb.searchMember();
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
                // createNumbersFile();
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
//  -*****************---*****************
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
//  -*****************---*****************-
    @Override
    public String toString() {
        return
                " " + firstName + " - " + lastName  +
                ", Номер '" + phone +
                ", Дата народженя " + dateOfBirth +
                ", Номер = " + phoneNumbers +
                ", Адрес " + streetAddress +
                ", Дата модифікації = " + modifyDate ;
    }
//  -*****************---*****************-
    ArrayList<PhoneBook> member = new ArrayList<>();
//  -*****************---*****************-
    private String firstName = "";            //   ім'я
    private String lastName = "";             //  Прізвеще
    private String phone;                 //телефон
    private LocalDate dateOfBirth;        //дата рождения
    private List<Phones> phoneNumbers;   //телефоны (количество не ограничено) +
    private String streetAddress;       //адрес
    private LocalDateTime modifyDate;  //дата и время редактирования

//  -*****************---*****************-
    public String getFirstName() {        return firstName;    }
    public String getLastName() {        return lastName;    }
    public String getPhone() {        return phone;    }
    public LocalDate getDateOfBirth() {        return dateOfBirth;    }
    public List<Phones> getPhoneNumbers() {        return phoneNumbers;    }
    public String getStreetAddress() {        return streetAddress;    }
    public LocalDateTime getModifyDate() {        return modifyDate;    }




}





