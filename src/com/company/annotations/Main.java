package com.company.annotations;


import jdk.internal.org.objectweb.asm.commons.Method;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        Coockies coock = new Coockies();

        System.out.println(coock.getClass().getAnnotation(ControlledObject.class).name());

        Annotation[] all = coock.getClass().getAnnotations();

        for(Annotation a : all){
            System.out.println(a);
        }

        System.out.println(coock.getClass().getAnnotationsByType(ControlledObject.class));

        java.lang.reflect.Method[] m = coock.getClass().getDeclaredMethods();

        for(java.lang.reflect.Method mm : m){
            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StartObject.class));
            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StopObject.class));
        }

    }
}
