package com.dmdev.lesson22

import com.dmdev.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {

    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        println "Hello"

        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test 2")

//        MetaClassImpl
        println student.metaClass
//        println student.metaClass.methods

//        ExpandoMetaClass
        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "It's a new method"
        }
        student.test()
        student.class.metaClass.newMethod = {int value ->
            println "New method in class Student, $value"
        }
//        student.newMethod(28)
        new Student().newMethod(28)
        println student.metaClass

//        ProxyMetaClass - interceptors
    }
}
