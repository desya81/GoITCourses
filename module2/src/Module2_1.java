/**
 * Created by Denis on 13.12.2015.
 */
public class Module2_1 {

    public static void main(String[] args){
        TextFile text = new TextFile("text");
        AudioFile audio = new AudioFile("audio");
        ImageFile image = new ImageFile("image");
        Folder folder = new Folder(text, audio, image);
        folder.getFileDescription();
    }


    public static class TextFile extends File{

        public TextFile(String type) {
            super(type);
        }

        public String getProperty(){
            return "You can store and read info with this Class";
        }
    }

    public static class AudioFile extends File{

        public AudioFile(String type) {
            super(type);
        }

        public String getProperty(){
            return "You can listen music with this Class";
        }
    }

    public static class ImageFile extends File{

        public ImageFile(String type) {
            super(type);
        }

        public String getProperty(){
            return "You can show image with this Class";
        }
    }


    public static class File{

        private String type;

        public File(String type) {
            this.type = type;
        }

        public String getType(){
            return this.type;
        }

        public String getProperty(){
            return "This Class can something";
        }
    }


    public static class Folder{

        private final File text;
        private final File audio;
        private final File image;

        public Folder(File text, File audio, File image) {
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



}
