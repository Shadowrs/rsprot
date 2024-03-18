package net.rsprot.protocol.message.codec

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ServerProt
import net.rsprot.protocol.message.OutgoingMessage

public interface MessageEncoder<in T : OutgoingMessage> {
    public val prot: ServerProt

    public fun encode(
        buffer: JagByteBuf,
        message: T,
    )
}
