package com.muhardin.endy.advanced.java.belajar.design.pattern.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class TulisFileCommand implements Command {

    private String namafile;
    private String content;
    
    @Override
    public void execute() {
        System.out.println("menulis data "+content+" ke file ");
    }
    
}
