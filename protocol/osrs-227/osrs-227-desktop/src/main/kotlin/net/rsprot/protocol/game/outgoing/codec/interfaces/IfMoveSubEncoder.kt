package net.rsprot.protocol.game.outgoing.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.crypto.cipher.StreamCipher
import net.rsprot.protocol.ServerProt
import net.rsprot.protocol.game.outgoing.interfaces.IfMoveSub
import net.rsprot.protocol.game.outgoing.prot.GameServerProt
import net.rsprot.protocol.message.codec.MessageEncoder
import net.rsprot.protocol.util.pCombinedId
import net.rsprot.protocol.util.pCombinedIdAlt1

public class IfMoveSubEncoder : MessageEncoder<IfMoveSub> {
    override val prot: ServerProt = GameServerProt.IF_MOVESUB

    override fun encode(
        streamCipher: StreamCipher,
        buffer: JagByteBuf,
        message: IfMoveSub,
    ) {
        buffer.pCombinedIdAlt1(message.sourceCombinedId)
        buffer.pCombinedId(message.destinationCombinedId)
    }
}
