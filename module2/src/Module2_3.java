/**
 * Created by Denis on 13.12.2015.
 */
public class Module2_3 {

    public static void main(String[] args){
        MusicInstrument Guitar = new MusicInstrument("Guitar");
        MusicInstrument Piano = new MusicInstrument("Piano");
        MusicInstrument Trumpet = new MusicInstrument("Trumpet");
        MusicShop shop = new MusicShop("Closed");
        shop.setItem(Guitar);
        shop.setItem(Piano);
        shop.setItem(Trumpet);
        shop.setShopState("Open");
        shop.startWork();

    }

    public static class MusicInstrument{

        private String type;

        public MusicInstrument(String type) {
            this.type = type;
        }

        public String getType(){
            return this.type;
        }

    }


    public static class MusicShop{

        private static String state;
        private static String itemsForSale = "and you can buy here: ";

        public MusicShop(String state) {
            this.state = state;
        }

        public void setShopState(String state){
            this.state = state;
        }


        public void setItem(MusicInstrument instrument){
            itemsForSale = itemsForSale + instrument.getType() + " ";
        }

        public void startWork(){
            System.out.println("This Music Shop is " + state);
            if(state == "Open"){
                System.out.println(itemsForSale);
            }

        }
    }

}
