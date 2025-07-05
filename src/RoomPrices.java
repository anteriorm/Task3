public enum RoomPrices {
    STANDARDROOM(100),
    LUXROOM(200),
    ULTRALUXROOM(300);

    private final int price;

    RoomPrices(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
