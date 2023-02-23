package customgo.event;

import customgo.Lobby;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ListenerCalledEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Lobby lobby;
    private final Player player;
    private final Object[] args;
    private final String listener;

    public ListenerCalledEvent(String li, Lobby lb, Player p, Object[] a) {
        super();
        listener = li;
        lobby = lb;
        player = p;
        args = a;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public Player getStriker() {
        return player;
    }

    public Object[] getArgs() {
        return args;
    }

    public Object[] getListenerName() {
        return args;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
