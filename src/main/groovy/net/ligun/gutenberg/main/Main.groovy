package net.ligun.gutenberg.main

import groovy.cli.picocli.CliBuilder
import groovy.transform.CompileStatic

@CompileStatic
class Main {
    static void main(String[] args) {
        def cli = new CliBuilder(usage: 'Gutenberg')

        cli.h(longOpt: 'help', args: 0, 'help')

        def options = cli.parse(args)
    }
}
