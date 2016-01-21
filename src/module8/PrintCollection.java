package module8;

import module3.home1.BaseFile;

import java.util.List;

/**
 * Created by Denis on 21.01.2016.
 */
public class PrintCollection {


    private List<BaseFile> someCollection;

    public PrintCollection(List someCollection) {
        this.someCollection = someCollection;
    }

    public void print(){
        int j = 1;
        for(int i = 0; i< this.someCollection.size(); i++){

            if(j % 2 == 0){
                System.out.println(this.someCollection.get(i).toString() + ' ');
            }else{
                System.out.print(this.someCollection.get(i).toString() + ' ');
            }

            j++;

        }
    }
}
