package event_bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    private static EventBus instance;
    private Map<Class<?>, List<EventListener>> listeners;

    private EventBus() {
        listeners = new HashMap<>();
    }

    public static EventBus getInstance() {
        if (instance == null) {
            instance = new EventBus();
        }
        return instance;
    }

    public void register(Class<?> eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners == null) {
            eventListeners = new ArrayList<>();
            listeners.put(eventType, eventListeners);
        }
        eventListeners.add(listener);
    }

    public void unregister(Class<?> eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners != null) {
            eventListeners.remove(listener);
        }
    }
//
//    public void post(Event event) {
//        Class<?> eventType = event.getClass();
//        List<EventListener> eventListeners = listeners.get(eventType);
//        if (eventListeners != null) {
//            for (EventListener listener : eventListeners) {
//                listener.onEvent(event);
//            }
//        }
//    }
}

