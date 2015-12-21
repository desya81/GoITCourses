package com.home1;

/**
 * Created by denys on 21.12.15.
 */
public class Main {
    public static void main(String[] args){
        TextFile text = new TextFile("text");
        AudioFile audio = new AudioFile("audio");
        ImageFile image = new ImageFile("image");
        Folder folder = new Folder(text, audio, image);
        folder.getFileDescription();
    }
}
