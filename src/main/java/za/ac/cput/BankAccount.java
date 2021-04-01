import java.util.Objects;

public class BankAccount {

    String name;
    int money;

    public BankAccount(){
    }

    public BankAccount(String name, int amount){
        this.name = name;
        this.money = amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMoney(int amount){
        this.money = amount;
    }

    public int getMoney(){
        return this.money;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return money == that.money && name.equals(that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }
}
