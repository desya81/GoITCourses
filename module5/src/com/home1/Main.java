package com.home1;

/**
 * Created by denys on 28.12.15.
 */
public class Main {

    public static void main(String[] args){
        int[] arr = {1, 7, 6, 8, 3, 2, 4};
        ArrayHandler handler = new ArrayHandler(arr);
        handler.checkArray();
        System.out.println("Max arr value " + handler.getMax());
        System.out.println("Min arr value " + handler.getMin());
        handler.sortArrayByBubble();
        int[] handlerArr = handler.getSomeArr();
        for (int i = 0; i < handlerArr.length; i++){
            System.out.println(handlerArr[i]);
        }
    }
}
