package com.fruits_api.routes

import com.fruits_api.data.model.SimpleResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getSimpleResponse(){
    route("/get-simple"){
        get {
            val simpleResponse = SimpleResponse(successful = true, message = "This is a simple response")
            // respond to the get request with a status code OK and a simple response
            call.respond(HttpStatusCode.OK,simpleResponse)
        }
    }
}