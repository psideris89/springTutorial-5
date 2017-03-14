package com.psideris.spring.autowiringAnnotation;

public class FileWriter implements LogWriter
{
    public void write(String text)
    {
        System.out.println(text);
    }
}
