package net.rsprot.protocol.game.outgoing.interfaces

import net.rsprot.protocol.message.OutgoingMessage

/**
 * If open-top messages are sent to open 'root' interfaces.
 * These root interfaces are the base to everything, and every
 * other sub-interface will be opened on a component on this top interface.
 * @property interfaceId the id of the top-level interface to open
 */
public class IfOpenTop(
    public val interfaceId: Int,
) : OutgoingMessage {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IfOpenTop

        return interfaceId == other.interfaceId
    }

    override fun hashCode(): Int {
        return interfaceId
    }

    override fun toString(): String {
        return "IfOpenTop(interfaceId=$interfaceId)"
    }
}