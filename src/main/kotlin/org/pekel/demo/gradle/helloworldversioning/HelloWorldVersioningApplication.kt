package org.pekel.demo.gradle.helloworldversioning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorldVersioningApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldVersioningApplication>(*args)
}
