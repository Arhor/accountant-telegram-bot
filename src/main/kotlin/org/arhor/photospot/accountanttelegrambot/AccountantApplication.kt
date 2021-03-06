package org.arhor.photospot.accountanttelegrambot

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.lang.invoke.MethodHandles

private val log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())

fun main(args: Array<String>) {
    runApplication<AccountantApplication>(*args)
}

@SpringBootApplication
class AccountantApplication : CommandLineRunner {

    override fun run(vararg args: String?) {
        log.info("Application started ${args.joinToString(prefix = "[", postfix = "]")}")
    }
}
