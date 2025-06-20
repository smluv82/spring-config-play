package me.play.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringConfigPlayApplication

fun main(args: Array<String>) {
    runApplication<SpringConfigPlayApplication>(*args)
}
