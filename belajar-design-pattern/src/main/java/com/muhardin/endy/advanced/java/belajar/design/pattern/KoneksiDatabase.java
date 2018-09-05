package com.muhardin.endy.advanced.java.belajar.design.pattern;

import java.sql.ResultSet;

public class KoneksiDatabase {
    private String jdbcUrl;
    private String username;
    private String password;
    
    private static KoneksiDatabase sendiri;
    
    public static KoneksiDatabase getKoneksiDatabase(String jdbcUrl, String username, String password){
        if(sendiri == null){
            sendiri = new KoneksiDatabase(jdbcUrl, username, password);
        }
        return sendiri;
    }

    private KoneksiDatabase(String jdbcUrl, String username, String password) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
        System.out.println("Membuat object koneksi database ke "+jdbcUrl+" dengan username "+username+" dan password "+password);
    }
    
    public void connect(){
        
    }
    
    public void disconnect() {
    
    }
    
    public ResultSet executeQuery(String sql){
        return null;
    }
    
    public int executeUpdate(String sql){
        return 0;
    }
}
