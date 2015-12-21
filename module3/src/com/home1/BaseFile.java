package com.home1;

/**
 * Created by denys on 21.12.15.
 */
public class BaseFile {
    private String type;

    public BaseFile(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String getProperty(){
        return "This Class can something";
    }
}
