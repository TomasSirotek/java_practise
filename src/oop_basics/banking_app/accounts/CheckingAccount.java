package oop_basics.banking_app.accounts;

public class CheckingAccount extends Account{

    public int rewardPoints;

    public CheckingAccount(double balance,int rewardPoints) {
        super(balance);
        this.rewardPoints = rewardPoints;
    }

    public boolean withdraw(double amount){
        double fee = 0.025 * amount;
        amount += fee;
        return super.withdraw(amount);
    }

    public boolean purchase(double cost) {
        if(cost > balance){
            return false;
        }

        balance -= cost;
        rewardPoints += cost * 10;
        return true;
    }

    public int getRewardPoints(){
        return this.rewardPoints;
    }

}
