package com.psideris.spring.annotation_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Logger
{
	
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;
    
    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    
    @Autowired
    @Qualifier("squirel")
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    
    public void writeFile(String text) {
        fileWriter.write(text);
    }
    
    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
