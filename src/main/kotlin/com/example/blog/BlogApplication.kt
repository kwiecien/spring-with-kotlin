package com.example.blog

import com.samskivert.mustache.Mustache
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BlogApplication {

    @Bean
    fun mustacheCompiler(loader: Mustache.TemplateLoader?) =
            Mustache.compiler().escapeHTML(false).withLoader(loader)

}

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}
