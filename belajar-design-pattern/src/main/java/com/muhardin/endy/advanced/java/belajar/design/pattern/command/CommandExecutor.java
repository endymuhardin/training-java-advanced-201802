package com.muhardin.endy.advanced.java.belajar.design.pattern.command;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class CommandExecutor {
    private List<Command> daftarCommand = new ArrayList<>();
    
    public void jalankan(){
        for(Command c : daftarCommand){
            c.execute();
        }
    }
    
    public void jalankan(Command c){
        c.execute();
    }
}
