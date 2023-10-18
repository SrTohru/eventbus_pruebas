package event_bus;

public class SomeDomainClass implements EventListener {
    
//    public SomeDomainClass() {
//        // Regístrate en el Event Bus para recibir eventos TileAddedEvent
//        EventBus.getInstance().register(TileAddedEvent.class, this);
//    }
//
//    @Override
//    public void onEvent(Event event) {
//        if (event instanceof TileAddedEvent) {
//            TileAddedEvent tileAddedEvent = (TileAddedEvent) event;
//            Tile tile = tileAddedEvent.getTile();
//            // Realiza acciones en respuesta al evento TileAddedEvent
//        }
//    }

    @Override
    public void handleEvent(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

