package com.pb.enot.hw11;

public  class main {
    public static void main(String[] args) throws Exception {


        PhoneBook pb = new PhoneBook();

        //pb.printGUI();  // меню
        //pb.run();  //  меню с вибором

        pb.backupContactFile();
        pb.displayMember();


        System.out.println(pb.member);
    }

}
