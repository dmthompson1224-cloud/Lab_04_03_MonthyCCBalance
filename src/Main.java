//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//A program that starts with a credit card balance of $5000 and then calculates the interest at a rate of 17%.
// Assume the user does not make any payments. Display the interest due after one month and again after two months.
public class Main {
    public static void main(String[] args){

        double balance = 5000;
        double interest_rate = 0.17;

        //after one month
        double intrest = balance + (balance * interest_rate);
        System.out.println("The balance after one month is " + balance);

        intrest = balance + (balance * interest_rate);
        System.out.println("The balance after two months is " + balance);

    }
}
