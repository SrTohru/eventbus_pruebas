package event_bus;
public class Event {
    private String eventType;
    private Object data;

    public Event(String eventType, Object data) {
        this.eventType = eventType;
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }

    public Object getData() {
        return data;
    }
}
