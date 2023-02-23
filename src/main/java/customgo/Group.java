package customgo;

import org.bukkit.entity.Player;
import org.csg.group.Lobby;

import java.util.List;
import java.util.UUID;

public interface Group {

    /**
     * 向队伍中所有玩家发送消息（到聊天栏）。
     *
     * @param str
     */
    void sendNotice(String str);

    /**
     * 获得队伍所属的大厅
     *
     * @return
     */
    Lobby getLobby();

    /**
     * 检查队伍中是否有玩家。
     *
     * @param player
     * @return
     */
    boolean hasPlayer(Player player);

    /**
     * 获得玩家列表。
     *
     * @return
     */
    List<UUID> getPlayerList();

    /**
     * 获得队伍的玩家数量。
     *
     * @return
     */
    int getPlayerAmount();

    /**
     * 获得队伍名字。
     *
     * @return
     */
    String getName();
}
