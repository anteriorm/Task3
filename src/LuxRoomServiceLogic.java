public class LuxRoomServiceLogic<T extends LuxRoom> implements RoomService<T>, LuxRoomService<T> {
    @Override
    public void clean(T room) {
        System.out.println("Комната " + room.getNumber() + " убрана.");
    }

    @Override
    public void reserve(T room) {
        if (!room.isOccupied()) {
            room.setOccupied(true);
            System.out.println("Комната " + room.getNumber() + " успешно забронирована.");
        } else {
            throw new RoomOccupiedException("Комната уже занята");
        }
    }

    @Override
    public void free(T room) {
        if (room.isOccupied()) {
            room.setOccupied(false);
            System.out.println("Комната " + room.getNumber() + " теперь свободна.");
        } else {
            throw new RoomOccupiedException("Комната уже свободна");
        }
    }

    @Override
    public void foodDelivery(T luxRoom) {
        System.out.println("В комнату " + luxRoom.getNumber() + " доставлена еда.");
    }
}
