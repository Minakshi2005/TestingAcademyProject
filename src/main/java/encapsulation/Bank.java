package encapsulation;

public class Bank {
    private double acc_no;
    private int balance;

    public double getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(double acc_no) {
        this.acc_no = acc_no;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
