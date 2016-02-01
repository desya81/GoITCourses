package module3.home3;

/**
 * Created by denys on 21.12.15.
 */
public class MusicShop {

    private static String state;
    private static String itemsForSale = "and you can buy here: ";

    public MusicShop(String state) {
        MusicShop.state = state;
    }

    public void setShopState(String state){
        MusicShop.state = state;
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
