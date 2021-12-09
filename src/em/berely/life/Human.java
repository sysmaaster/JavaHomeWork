package em.berely.life;

import java.util.Objects;


public abstract class Human {
    private String name;
    private String status;
    private double height;
    private double balance;
    private int debitNumber;
    private int inn;

    public Human(String name, String status, double height, double balance, int inn) {
        this.name = name;
        this.status = status;
        this.height = height;
        this.balance = balance;
        this.inn = inn;
    }

    public Human(String name, String status, double height, double balance, int inn, int debitNumber) {
        this.name = name;
        this.status = status;
        this.height = height;
        this.balance = balance;
        this.debitNumber = debitNumber;
        this.inn = inn;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDebitNumber() {
        return debitNumber;
    }

    public int getInn() {
        return inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(status, human.status) && Objects.equals(height, human.height) && Objects.equals(balance, human.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, height, balance);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", height=" + height +
                ", balance=" + balance +
                ", debitNumber=" + debitNumber +
                ", inn=" + inn +
                '}';
    }

    public static void getHumaus(Human[] humans) {
        System.out.println("Проведемо перепись");
        for (Human hums : humans) {
            if (hums instanceof Man) {
                System.out.println(hums + " Козачок!");
            } else {
                System.out.println(hums + " Баришня");
            }
        }
    }
}
