package event_bus;
public class EventProducer {
    private EventBus eventBus;

    public EventProducer(EventBus eventBus) {
        this.eventBus = eventBus;
    }

//    public void playerMove(String playerName, Move move) {
//        Event event = new Event("player_move", new PlayerMove(playerName, move));
//        eventBus.publish(event);
//    }
}

