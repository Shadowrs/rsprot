package net.rsprot.protocol.game.incoming.codec.friendchat

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.game.incoming.friendchat.FriendChatSetRank
import net.rsprot.protocol.game.incoming.prot.GameClientProt
import net.rsprot.protocol.message.codec.MessageDecoder
import net.rsprot.protocol.tools.MessageDecodingTools

public class FriendChatSetRankDecoder : MessageDecoder<FriendChatSetRank> {
    override val prot: ClientProt = GameClientProt.FRIENDCHAT_SETRANK

    override fun decode(
        buffer: JagByteBuf,
        tools: MessageDecodingTools,
    ): FriendChatSetRank {
        val rank = buffer.g1Alt2()
        val name = buffer.gjstr()
        return FriendChatSetRank(
            name,
            rank,
        )
    }
}
