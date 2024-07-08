package com.cjg.mario

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarioApplication

fun main(args: Array<String>) {
    runApplication<MarioApplication>(*args)
}
