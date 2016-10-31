package ru.fml239;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main
{

    public static void main(String[] args)
    {
        Pupil pupil = new Pupil(8);
        System.out.println("Create 8 : "+pupil);
        pupil.nextGrade();
        System.out.println("nextGrade: "+pupil);
        pupil.nextGrade();
        System.out.println("toRepeat : "+pupil);
        pupil.toRepeat();
        System.out.println("nextGrade : "+pupil);
        pupil.nextGrade();
        System.out.println("nextGrade : "+pupil);
        pupil.nextGrade();
        System.out.println("nextGrade : "+pupil);
        Class c = pupil.getClass();
        System.out.println("Public Fields:");
        Field [] publicFields = c.getFields();
        for (Field field : publicFields)
        {
            Class fieldType = field.getType();
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
        }
        System.out.println("All Fields:");
        Field [] allFields = c.getDeclaredFields();
        for (Field field : allFields)
        {
            Class fieldType = field.getType();
            int mods = fieldType.getModifiers();
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
            if (Modifier.isPublic(mods))
                System.out.println("public");
            if (Modifier.isPrivate(mods))
                System.out.println("private");
            if (Modifier.isProtected(mods))
                System.out.println("protected");
            if (Modifier.isFinal(mods))
                System.out.println("final");
            if (Modifier.isStatic(mods))
                System.out.println("static");
        }
        System.out.println("Public Methods:");
        Method[] publicMethods = c.getMethods();
        for (Method method : publicMethods)
        {
            Class methodReturnType = method.getReturnType();
            int mods = methodReturnType.getModifiers();
            System.out.println("Name: " + method.getName());
            System.out.println("ReturnType: " + methodReturnType.getName());
            if (Modifier.isPublic(mods))
                System.out.println("public");
            if (Modifier.isPrivate(mods))
                System.out.println("private");
            if (Modifier.isProtected(mods))
                System.out.println("protected");
            Class [] paramTypes = method.getParameterTypes();
            System.out.println("Parameters Types:");
            for (Class paramType : paramTypes)
            {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }
    }
}
