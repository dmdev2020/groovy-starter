package com.dmdev.lesson17

class OopRunner {

    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan"  // setFirstName
        println student.firstName   // getFirstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName  // not recommended

        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18, id: 222)
        println student1

        student1.properties.each { println it }

        Student student2 = ['Sveta', 'Svetikova', 30]
        println student2

        def (fn, ln) = student2
        println fn
        println ln

        assert [student1, student2].collect { it.firstName } == ['Petr', 'Sveta']
        assert [student1, student2]*.firstName == ['Petr', 'Sveta']

        String.mixin(OopRunner.class)

        "Ivan".printStr()
    }

    static def printStr(String self) {
        println "It's mixin $self"
    }
}
