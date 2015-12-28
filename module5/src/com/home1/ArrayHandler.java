package com.home1;

/**
 * Created by denys on 28.12.15.
 */
public class ArrayHandler {

    public int[] getSomeArr() {
        return someArr;
    }

    protected int[] someArr;
    protected int min;
    protected int max;

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public ArrayHandler(int[] someArr) {
        this.someArr = someArr;
    }

    public void checkArray(){
        for(int i = 0; i < this.someArr.length; i++){
            if(this.getMax() == 0){
                this.setMax(this.someArr[i]);
            }

            if(this.getMin() == 0){
                this.setMin(this.someArr[i]);
            }

            if(this.someArr[i] > this.getMax()){
                this.setMax(this.someArr[i]);
            }
            if(this.someArr[i] < this.getMin()){
                this.setMin(this.someArr[i]);
            }
        }
    }


    public void sortArrayByBubble(){
        for(int i = this.someArr.length - 1; i >=2; i--){
            boolean sorted = true;

            for(int j = 0; j < i; j++){
                if (this.someArr[j] > this.someArr[j+1]) {
                    int temp = this.someArr[j];
                    this.someArr[j] = this.someArr[j+1];
                    this.someArr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
    }
}
