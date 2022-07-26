package com.example.greetingservice.hello.interfacses.controller

import com.example.greetingservice.hello.interfacses.dto.CommonResponse
import com.example.greetingservice.hello.interfacses.dto.GreetingRequestDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/api/hello")
    fun hello(@RequestBody helloReq: GreetingRequestDto): CommonResponse {
        val name = helloReq.name
        return CommonResponse(
            statusCode = 200,
            message = "H3 $name"
        )
    }
}
