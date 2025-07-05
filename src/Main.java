public class Main {
    public static void main(String[] args) {
        LuxRoom Room1 = new LuxRoom(RoomPrices.LUXROOM);
        Room1.setNumber(101);
        Room1.setOccupied(false);
        RoomServiceLogic service1 = new RoomServiceLogic();
        service1.clean(Room1);
        service1.reserve(Room1);
        service1.free(Room1);

        StandardRoom Room2 = new StandardRoom(RoomPrices.STANDARDROOM);
        Room2.setNumber(102);
        Room2.setOccupied(false);
        RoomServiceLogic service2 = new RoomServiceLogic();
        service2.clean(Room2);
        service2.reserve(Room2);
        service2.free(Room2);

        LuxRoom luxRoom = new LuxRoom(RoomPrices.LUXROOM);
        System.out.println("Цена комнаты: " + luxRoom.getPrice());

        LuxRoomServiceLogic<LuxRoom> service = new LuxRoomServiceLogic<>();
        service.foodDelivery(Room1);

    }
}