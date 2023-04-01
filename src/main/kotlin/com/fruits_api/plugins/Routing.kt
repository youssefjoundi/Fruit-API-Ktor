package com.fruits_api.plugins

import com.fruits_api.routes.fruitRoute
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import com.fruits_api.routes.getSimpleResponse

fun Application.configureRouting() {
    routing {
//        getSimpleResponse()
        fruitRoute()
//        get("/") {
//            this@routing.getSimpleResponse()
//            call.respondText("Hello World!")
//        }
    }
}
