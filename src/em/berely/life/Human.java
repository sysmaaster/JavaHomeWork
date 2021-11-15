package em.berely.life;

import java.util.Objects;

public abstract class Human {
    private String name;
    private String status;
    private double height;
    private double balance;




    public Human(String name, String status, double height, double balance) {
        this.name = name;
        this.status = status;
        this.height = height;
        this.balance = balance;
    }

    public String getName() {               return name;            }
    public void setName(String name) {      this.name = name;       }
    public String getStatus() {             return status;          }
    public void setStatus(String status) {  this.status = status;   }
    public double getHeight() {                 return height;           }
    public void setHeight(double height) {       this.height = height;     }
    public double getBalance() {                return balance;          }
    public void setBalance(double balance) {     this.balance = balance;   }

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
        return "Human {" +
                " name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", height=" + height +
                ", balances=" + balance +
                " }";
    }
}
