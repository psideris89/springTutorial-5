package com.psideris.spring.autowiringAnnotation;

public class Logger
{
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;
    
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    
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
