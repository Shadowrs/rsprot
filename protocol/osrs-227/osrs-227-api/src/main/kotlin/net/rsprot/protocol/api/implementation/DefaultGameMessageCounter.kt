package net.rsprot.protocol.api.implementation

import net.rsprot.protocol.ClientProtCategory
import net.rsprot.protocol.api.GameMessageCounter
import net.rsprot.protocol.game.incoming.GameClientProtCategory

/**
 * A default game message counter that follows the normal OldSchool limitations,
 * allowing for up to 10 user events and up to 50 client events, stopping decoding
 * whenever either of the limitations is reached.
 */
@Suppress("MemberVisibilityCanBePrivate")
public class DefaultGameMessageCounter
    @JvmOverloads
    constructor(
        public val clientEventLimit: Int = 50,
        public val userEventLimit: Int = 10,
    ) : GameMessageCounter {
        private val counts: IntArray = IntArray(PROT_TYPES_COUNT)

        override fun increment(clientProtCategory: ClientProtCategory) {
            counts[clientProtCategory.id]++
        }

        override fun isFull(): Boolean =
            counts[GameClientProtCategory.CLIENT_EVENT.id] >= clientEventLimit ||
                counts[GameClientProtCategory.USER_EVENT.id] >= userEventLimit

        override fun reset() {
            counts.fill(0)
        }

        private companion object {
            private const val PROT_TYPES_COUNT: Int = 2
        }
    }
