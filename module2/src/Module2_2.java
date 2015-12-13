/**
 * Created by Denis on 13.12.2015.
 */
public class Module2_2 {

    public static void main(String[] args){
        Flower Rose = new Flower("Rose");
        Flower Chamomile = new Flower("Chamomile");
        Flower Astra = new Flower("Astra");
        Bouquet Bouquet = new Bouquet();
        Bouquet.setBouquet(Rose);
        Bouquet.setBouquet(Chamomile);
        Bouquet.setBouquet(Astra);
        Bouquet.getFileDescription();
        Flower tulip = new Flower("Tulip");
        Flower rosebush = new Flower("Rosebush");
        Bouquet.setBouquet(tulip);
        Bouquet.setBouquet(rosebush);
        Bouquet.getFileDescription();
    }

    public static class Flower{

        private String type;

        public Flower(String type) {
            this.type = type;
        }

        public String getType(){
            return this.type;
        }

    }


    public static class Bouquet{

        private static String composition = "This Bouquet include next flower(s): ";

        public Bouquet() {
        }


        public void setBouquet(Flower flower){
            this.composition = this.composition + flower.getType() + " ";
        }

        public void getFileDescription(){
            System.out.println(composition);
        }
    }



}
