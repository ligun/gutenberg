package net.ligun.gutenberg.core

import groovy.transform.CompileStatic

@CompileStatic
class ConfigParser {
    def parse(File config) {
        Script script = new GroovyShell().parse(config)
    }

    def plugin(Closure closure) {

    }
}
