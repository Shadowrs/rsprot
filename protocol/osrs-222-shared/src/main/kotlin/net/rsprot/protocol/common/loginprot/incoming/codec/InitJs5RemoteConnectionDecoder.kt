package net.rsprot.protocol.common.loginprot.incoming.codec

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.common.loginprot.incoming.prot.LoginClientProt
import net.rsprot.protocol.loginprot.incoming.InitJs5RemoteConnection
import net.rsprot.protocol.message.codec.MessageDecoder
import net.rsprot.protocol.tools.MessageDecodingTools

public class InitJs5RemoteConnectionDecoder : MessageDecoder<InitJs5RemoteConnection> {
    override val prot: ClientProt = LoginClientProt.INIT_JS5REMOTE_CONNECTION

    override fun decode(
        buffer: JagByteBuf,
        tools: MessageDecodingTools,
    ): InitJs5RemoteConnection {
        val revision = buffer.g4()
        return InitJs5RemoteConnection(revision)
    }
}
