package net.rsprot.protocol.game.outgoing.sound

import net.rsprot.protocol.message.OutgoingMessage

/**
 * Midi song old packet is used to play a midi song, in the old format.
 * This is equal to playing [MidiSong] with the arguments of `id, 0, 60, 60, 0`.
 * @property id the id of the song to play
 */
public class MidiSongOld(
    public val id: Int,
) : OutgoingMessage {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MidiSongOld

        return id == other.id
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "MidiSongOld(id=$id)"
    }
}
