package com.alanviana

import io.ktor.http.cio.websocket.DefaultWebSocketSession
import java.util.UUID

class Connection(val session: DefaultWebSocketSession) {
    private val id: UUID = UUID.randomUUID()
    val name = "USER ${id}"
}
