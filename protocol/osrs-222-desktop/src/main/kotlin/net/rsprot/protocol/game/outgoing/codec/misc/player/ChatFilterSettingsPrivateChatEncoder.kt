package net.rsprot.protocol.game.outgoing.codec.misc.player

import io.netty.channel.ChannelHandlerContext
import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ServerProt
import net.rsprot.protocol.game.outgoing.misc.player.ChatFilterSettingsPrivateChat
import net.rsprot.protocol.game.outgoing.prot.GameServerProt
import net.rsprot.protocol.message.codec.MessageEncoder
import net.rsprot.protocol.metadata.Consistent

@Consistent
public class ChatFilterSettingsPrivateChatEncoder : MessageEncoder<ChatFilterSettingsPrivateChat> {
    override val prot: ServerProt = GameServerProt.CHAT_FILTER_SETTINGS_PRIVATECHAT

    override fun encode(
        ctx: ChannelHandlerContext,
        buffer: JagByteBuf,
        message: ChatFilterSettingsPrivateChat,
    ) {
        buffer.p1(message.privateChatFilter)
    }
}
