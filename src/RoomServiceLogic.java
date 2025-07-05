public class RoomServiceLogic implements RoomService<ProRoom> {
    @Override
    public void clean(ProRoom room) {
        System.out.println("Комната " + room.getNumber() + " убрана.");
    }

    @Override
    public void reserve(ProRoom room) {
        if (!room.isOccupied()) {
            room.setOccupied(true);
            System.out.println("Комната " + room.getNumber() + " успешно забронирована.");
        } else {
            throw new RoomOccupiedException("Комната уже занята");
        }
    }

    @Override
    public void free(ProRoom room) {
        if (room.isOccupied()) {
            room.setOccupied(false);
            System.out.println("Комната " + room.getNumber() + " теперь свободна.");
        } else {
            throw new RoomOccupiedException("Комната уже свободна");
        }
    }
}
