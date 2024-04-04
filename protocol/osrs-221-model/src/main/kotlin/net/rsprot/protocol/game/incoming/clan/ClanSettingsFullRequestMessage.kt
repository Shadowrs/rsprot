package net.rsprot.protocol.game.incoming.clan

import net.rsprot.protocol.message.IncomingMessage

/**
 * Clan settings requests are made whenever the server sends a clansettings
 * delta update, but the update counter in the clan settings message
 * is greater than that of the clan itself. In order to avoid problems,
 * the client requests for a full clan settings update from the server,
 * to re-synchronize all the values.
 * @property clanId the id of the clan to request, ranging from 0 to 3 (inclusive),
 * or a negative value if the request is for a guest-clan
 */
public class ClanSettingsFullRequestMessage(
    public val clanId: Int,
) : IncomingMessage {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClanSettingsFullRequestMessage

        return clanId == other.clanId
    }

    override fun hashCode(): Int {
        return clanId
    }

    override fun toString(): String {
        return "ClanSettingsFullRequestMessage(clanId=$clanId)"
    }
}
