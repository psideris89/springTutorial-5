package com.psideris.spring.autowiring;

public class FileWriter implements LogWriter
{
    public void write(String text)
    {
        System.out.println(text);
    }
}
