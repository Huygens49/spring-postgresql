package com.huygens.springpostgresql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringPostgresqlApplication

fun main(args: Array<String>) {
    runApplication<SpringPostgresqlApplication>(*args)
}
