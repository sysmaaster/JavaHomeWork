package com.pb.enot.test;
/*

         |\ _ /|
        /  @  @ \
       (  > * <  )
       '>>>>X<<<<'
       /    O    \

 */

import java.util.Scanner;

class Exercise11 {
    public static void main(String[] args) throws Exception {

    }
}



class ConnectionBook
{

    public void printGUI()
    {
        System.out.print("  Welcome to our ConnectionBook!  \n");

        System.out.printf("%d : Add member \n",index+1);
        System.out.printf("%d : Search member \n",index+2);
        System.out.printf("%d : Modifiy member \n",index+3);
        System.out.printf("%d : Display member \n",index+4);
        System.out.printf("%d : Eixt \n",index+5);

    }

    public void run()
    {
        System.out.println("Please input your choice:");
        Scanner in = new Scanner(System.in);
        index = in.nextInt();

        switch(index)
        {
            case 1:
                addMember();
                break;
            case 2:
                searchMember();
                break;
            case 3:
                modifyMember();
                break;
            case 4:
                displayMember();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }

    }

    public void addMember()
    {
        System.out.println("You will add a member to the ConnectionBook!\n");
        System.out.println(" Please input member's name:");
        Scanner string = new Scanner(System.in);
        getName = string.nextLine();
        System.out.println(" Please input member's sex:");
        getSex = string.nextLine();
        System.out.println(" Please input member's tel:");
        getTel = string.nextDouble();
        System.out.println(" Please input member's addr:");
        getAddr = string.nextLine();
        getAddr = string.nextLine();


        ConnectionBook cb = new ConnectionBook(getName,getSex,getTel,getAddr);
        member.add(cb);
        // Проверяем, что назначение успешно
        for(ConnectionBook c:member)
        {
            System.out.println("Name+Sex+Tel+Addr" + c.getName()+c.getSex()+c.getTel()+c.getAddr());
        }

        System.out.printf(" Add member %s Success !\n",getName);

        index = 0;
        printGUI();
        run();

    }

    public  void displayMember()
    {
        System.out.println("Welcome to our ConnectionBook!\n");
        System.out.println("Size" + member.size());
        if(member.size()>0)
        {
            System.out.println("Name  " + "Sex  " + "Tel       " + "Addr         ");
            for(int i=0;i<member.size();i++)
            {
                ConnectionBook cb = member.get(i);
                System.out.println(cb.getName()+"  " + cb.getSex() + "  " + cb.getTel() + "     " + cb.getAddr() + "        " );
            }
        }

        index = 0;
        printGUI();
        run();
    }

    public  void searchMember()
    {
        searchOneMember();
        index = 0;
        printGUI();
        run();

    }

    public void searchOneMember()
    {
        System.out.printf("Please input your search condition :");
        System.out.printf("1,Name; 2,Sex, 3,Tel, 4,Addr ");
        Scanner string = new Scanner(System.in);
        index = string.nextInt();
        if(index == 1)
        {
            System.out.printf("Please input member'name :");
            Scanner string1 = new Scanner(System.in);
            getName = string1.nextLine();
            boolean flag = false; // решение о том, найти ли совпадение

            for(ConnectionBook c:member)
            {
                если (c.getName (). Equals (GetName))
                System.out.println("Name " + "Sex " + "Tel " + "Addr ");
                System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                flag = true; // Устанавливается в true при нахождении чего-либо, что соответствует
            }
        }
        if (flag == false) {// флаг по-прежнему false, когда совпадений не найдено, вывести сообщение об ошибке
            System.out.printf("The member you found is not exists!\n");
        }
    }
		else if(index == 2)
    {
        System.out.printf("Please input member'sex :");
        Scanner string1 = new Scanner(System.in);
        getSex = string1.nextLine();
        boolean flag = false; // решение о том, найти ли совпадение

        for(ConnectionBook c:member)
        {
            if(c.getSex().equals(getSex)){
                System.out.println("Name " + "Sex " + "Tel " + "Addr ");
                System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                flag = true;
            }
        }
        if(flag==false){
            System.out.printf("The member you found is not exists!\n");
        }
    }
		else if(index == 3)
    {
        System.out.printf("Please input member'tel :");
        Scanner string1 = new Scanner(System.in);
        getTel = string1.nextDouble();
        boolean flag = false;

        for(ConnectionBook c:member)
        {
            if(c.getTel()== getTel){
                System.out.println("Name " + "Sex " + "Tel " + "Addr ");
                System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                flag = true;
            }
        }
        if(flag==false){
            System.out.printf("The member you found is not exists!\n");
        }
    }
		else if(index == 4)
    {
        System.out.printf("Please input member'addr :");
        Scanner string1 = new Scanner(System.in);
        getAddr = string1.nextLine();
        boolean flag = false;

        for(ConnectionBook c:member)
        {
            if(c.getAddr().equals(getAddr)){
                System.out.println("Name " + "Sex " + "Tel " + "Addr ");
                System.out.println(getName+" " + getSex + " " + getTel + " " + getAddr + " " );
                flag = true;
            }
        }
        if(flag==false){
            System.out.printf("The member you found is not exists!\n");
        }

    }
		else
                System.out.printf("The condition you input is error.Please input again\n");
}

    public void modifyMember()
    {
        System.out.printf("Which member would you like to modify?\n");
        searchOneMember();
        System.out.printf("Please input the new infomation:\n");
        System.out.println(" Please input member's name:");
        Scanner string = new Scanner(System.in);
        getName = string.nextLine();
        System.out.println(" Please input member's sex:");
        getSex = string.nextLine();
        System.out.println(" Please input member's tel:");
        getTel = string.nextDouble();
        System.out.println(" Please input member's addr:");
        getAddr = string.nextLine();
        getAddr = string.nextLine();

        ConnectionBook cb = new ConnectionBook(getName,getSex,getTel,getAddr);
        member.add(cb);

        System.out.printf("Member %s had modified \n",getName);

        index = 0;
        printGUI();
        run();
    }


    public ConnectionBook(String aName,String aSex,double aTel,String aAddr)    {
        name=aName;
        sex=aSex;
        tel=aTel;
        addr=aAddr;
    }
    public ConnectionBook()    {    }
    public String getName()   {        return name;    }
    public void setName(String aName)    {        aName=name;    }
    public String getSex()    {        return sex;    }
    public void setSex(String aSex)    {        aSex=sex;    }
    public double getTel()    {        return tel;    }
    public void setTel(double aTel)    {        aTel=tel;    }
    public String getAddr()    {        return addr;    }
    public void setAddr(String aAddr)    {        aAddr=addr;    }
    ArrayList<ConnectionBook> member = new ArrayList<ConnectionBook>();
    private String name="";
    private String sex;
    private double tel;
    private String addr;
    private static int index=0;
    public static String getName=null;
    public static String getSex=null;
    public static double getTel=0.0;
    public static String getAddr=null;


}


