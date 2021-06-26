package com.dmdev.lesson22

import java.lang.reflect.Field
import java.lang.reflect.Method

class CustomMetaClass {

    Map<String, Method> methods = new HashMap<>()
    Map<String, Field> fields = new HashMap<>()
}
