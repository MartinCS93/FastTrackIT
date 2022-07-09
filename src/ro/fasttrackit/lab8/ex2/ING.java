package ro.fasttrackit.lab8.ex2;

public class ING implements ATM {
    int availableBalance;

    @Override
    public String depositAmount(int amount) {
        availableBalance = availableBalance + amount;
        return "You deposited with success " + amount + " euro. Your current balance is " + availableBalance;
    }

    @Override
    public String withdrawalAmount(int amount) {
        availableBalance = availableBalance - amount;
        return "Withdrawal successful! Remaining balance: " + availableBalance;
    }
}
