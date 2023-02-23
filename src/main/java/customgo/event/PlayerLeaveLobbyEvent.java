package customgo.event;

import customgo.Lobby;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerLeaveLobbyEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    private final Lobby lobby;

    public PlayerLeaveLobbyEvent(Player who, Lobby lb) {
        super(who);
        lobby = lb;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
