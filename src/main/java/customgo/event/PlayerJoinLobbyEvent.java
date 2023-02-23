package customgo.event;

import customgo.Lobby;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerJoinLobbyEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    boolean cancel = false;
    private final Lobby lobby;

    public PlayerJoinLobbyEvent(Player who, Lobby lb) {
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

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        cancel = true;
    }
}
