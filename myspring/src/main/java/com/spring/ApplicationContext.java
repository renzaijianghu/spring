package com.spring;

import com.spring.annotation.ComponentScan;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ApplicationContext {

    private Class clazz;

    public ApplicationContext(Class clazz,String[] args){
        this.clazz = clazz;
    }

    public void start() throws IOException {

        ComponentScan componentScan = (ComponentScan)clazz.getAnnotation(ComponentScan.class);
//        for (Annotation annotation:clazz.getDeclaredAnnotations()) {
//            System.out.println(annotation);
//        }
//        for (Annotation annotation:clazz.getAnnotations()
//        ) {
//            System.out.println(annotation);
//        }
        String scanPackage = componentScan.value();
        Properties properties = System.getProperties();
//        System.out.println(properties);
        String classpathes = properties.getProperty("java.class.path");
        String scanFilePath = scanPackage.replace(".","/");
        String[] classpathArray = classpathes.split(":");
        for (String s:classpathArray
             ) {
            System.out.println(s);
            if(s.endsWith(".jar")){
                JarFile jarFile = new JarFile(s);
                Enumeration<JarEntry> jarEntryEnumeration = jarFile.entries();
//                while (jarEntryEnumeration.hasMoreElements()){
//                    JarEntry jarEntry = jarEntryEnumeration.nextElement();
//                    System.out.println(jarEntry.toString());
//                }
                JarEntry jarEntry = jarFile.getJarEntry(scanFilePath);
//                if (jarEntry != null){
//                    jarEntry.isDirectory(){
//                        jarEntry.
//                    }
//                }
            }else {

            }
        }
//        java.net.URL resource = clazz.getResource("");

//        System.out.println(resource.getPath());
//        System.out.println(InputStream.class.getResource(""));

    }
}
