package com.psideris.spring.annotation_tutorial;

import org.springframework.stereotype.Component;

@Component("squirel")
public class FileWriter implements LogWriter
{
    public void write(String text)
    {
        System.out.println(text);
    }
}
