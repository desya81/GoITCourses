package module3.home1;

/**
 * Created by denys on 21.12.15.
 */
public class Folder {
    private final TextFile text;
    private final AudioFile audio;
    private final ImageFile image;

    public Folder(TextFile text, AudioFile audio, ImageFile image) {
        this.text = text;
        this.audio = audio;
        this.image = image;
    }

    public void getFileDescription(){
        System.out.println("This is Folder and it has next files:");
        System.out.println("This is " + this.text.getType() + " and : " + this.text.getProperty());
        System.out.println("This is " + this.audio.getType() + " and : " + this.audio.getProperty());
        System.out.println("This is " + this.image.getType() + " and : " + this.image.getProperty());
    }
}
