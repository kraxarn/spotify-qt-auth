package com.kraxarn

import com.kraxarn.plugins.configureRouting
import com.kraxarn.plugins.configureSockets
import io.ktor.server.engine.*
import io.ktor.server.tomcat.*

fun main()
{
	embeddedServer(Tomcat, port = 8080, host = "0.0.0.0") {
		configureSockets()
		configureRouting()
	}.start(wait = true)
}
