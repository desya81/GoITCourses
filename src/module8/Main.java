package module8;

import module3.home1.BaseFile;

import java.util.*;


/**
 * Created by Denis on 21.01.2016.
 */
public class Main {

    public static void main(String[] args) {

        List<BaseFile> fileList = new ArrayList<BaseFile>();
        fileList.add(new BaseFile("audio"));
        fileList.add(new BaseFile("image"));
        fileList.add(new BaseFile("text"));
        fileList.add(new BaseFile("video"));

        PrintCollection printer = new PrintCollection(fileList);
        printer.print();

        TreeSet<Integer> treeMap = new TreeSet<Integer>();
        treeMap.add(3);
        treeMap.add(4);
        treeMap.add(1);
        treeMap.add(2);

        for (Integer i: treeMap) {
            System.out.println(i);
        }
    }
}
