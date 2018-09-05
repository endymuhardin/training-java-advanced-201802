package com.muhardin.endy.advanced.java.belajar.design.pattern.factory;

import java.util.UUID;

public class StorageFactory {
    public static Storage createStorage(StorageType type){
        if(null != type) switch (type) {
            case LOCAL:
                return new FileStorage(UUID.randomUUID().toString()+".txt");
            case CLOUD:
                return new CloudStorage("gdrive");
            case DATABASE:
                return new DatabaseStorage(UUID.randomUUID().toString()+"-db");
            default:
                break;
        }
        throw new UnsupportedOperationException("Storage Type belum disupport");
    }
    
    public static Storage createStorage(String type){
        if(null != type) switch (type.toLowerCase().trim()) {
            case "local":
                return new FileStorage(UUID.randomUUID().toString()+".txt");
            case "cloud":
                return new CloudStorage("gdrive");
            case "database":
                return new DatabaseStorage(UUID.randomUUID().toString()+"-db");
            default:
                break;
        }
        throw new UnsupportedOperationException("Storage Type belum disupport");
    }
    
    public enum StorageType {
        LOCAL,CLOUD,DATABASE
    }
}
