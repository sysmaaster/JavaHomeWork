package em.berely.life;

public class Bank {
    private double debit;
    private double credit;

    public double getDebit() {        return debit;    }
    public void setDebit(double debit) {        this.debit = debit;    }
    public double getCredit() {        return credit;    }
    public void setCredit(double credit) {        this.credit = credit;    }

    public Bank() {
    }

    public double getBankBalance(int inn){
return this.getCredit();
    }

}
