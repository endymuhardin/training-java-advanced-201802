package com.muhardin.endy.advanced.java.belajar.design.pattern.command;

public class PanggilWebServiceCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Mengakses REST API : https://aplikasisaya.com/api/customer/list");
    }
    
}
