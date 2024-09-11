public class Loan extends Account{
    private double loanamount, interest;
    private int years;
    private int months = years*12;
    Loan(double loanamount, double interest, int years){
        this.loanamount = loanamount;
        this.interest = interest;
        this.years = years;
        setBalance(loanamount);
    }
}