import java.util.Random;

public abstract class Room {

    private int number;

    private int maxPerson;

    private int price;

    private boolean occupied;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }


    public Room(){
        Random random = new Random();
        maxPerson = random.nextInt(1, 8);
        System.out.println(maxPerson);

    }
}
