public abstract class ProRoom extends Room{
    private RoomPrices price;

    public ProRoom(RoomPrices price) {
        this.price = price;
    }

    public int getPrice() {
        return price.getPrice();
    }
    public ProRoom(){


    }
}
