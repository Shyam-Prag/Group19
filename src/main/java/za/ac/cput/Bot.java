package za.ac.cput;

import java.util.Objects;

public class Bot {
    private String type;
    private int power;

    public Bot(String type, int power){
        this.setType(type);
        this.setPower(power);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return power == bot.power && Objects.equals(type, bot.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, power);
    }
}

