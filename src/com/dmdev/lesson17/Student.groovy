package com.dmdev.lesson17

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Canonical
//@Immutable
@Builder
//@Slf4j
//@Mixin(WithId.class)
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student where $field = $fieldValue"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate
            Closure second = {
                println thisObject // == this
                println owner
                println delegate
            } // declaration

            second() // execution
        }
        closure
    }
}
