package net.rsprot.protocol.game.incoming.misc.user

import net.rsprot.protocol.message.IncomingMessage

/**
 * Client cheats are commands sent in chat using the :: prefix,
 * or through the console on the C++ client.
 */
public class ClientCheat(
    public val command: String,
) : IncomingMessage {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClientCheat

        return command == other.command
    }

    override fun hashCode(): Int {
        return command.hashCode()
    }

    override fun toString(): String {
        return "ClientCheat(command='$command')"
    }
}
