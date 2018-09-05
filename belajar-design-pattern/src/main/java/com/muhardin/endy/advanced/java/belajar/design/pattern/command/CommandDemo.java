package com.muhardin.endy.advanced.java.belajar.design.pattern.command;

public class CommandDemo {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        
        executor.getDaftarCommand().add(new PanggilWebServiceCommand());
        executor.getDaftarCommand().add(new TulisFileCommand("data.txt", "customerlist"));
        
        executor.jalankan();
    }
}
