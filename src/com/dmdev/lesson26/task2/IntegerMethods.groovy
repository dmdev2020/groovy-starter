package com.dmdev.lesson26.task2

@Category(Integer)
class IntegerMethods {

    def getCm() {
        this * 10
    }

    def getMm() {
        this
    }

    def getM() {
        getCm() * 100
    }
}
