package module1ForEnterprise;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by denys on 23.03.16.
 */
public class ObjectService {

    private int countOfData = 10000;
    private String[] functionsForObjects = {"add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove"};
    private String[] objectsForTest = {"ArrayList", "LinkedList", "HashSet", "TreeSet"};

    public ObjectService(Integer countOfData){
        this.countOfData = countOfData;
    }

    public void showResultTable() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        HashMap<String, HashMap<String, Long>> result = this.getCalculationResult();

        System.out.printf("%-10s %-7s %-7s %-7s %-7s %-7s %-7s %-7s%n", "    ", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
        writer.printf("%-10s %-7s %-7s %-7s %-7s %-7s %-7s %-7s%n", "    ", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
        for (Map.Entry<String, HashMap<String, Long>> entry:result.entrySet()){
            Long addF = null;
            Long getF = null;
            Long removeF = null;
            Long containsF = null;
            Long populateF = null;
            Long iteratorAddF = null;
            Long iteratorRemoveF = null;
            for (Map.Entry<String, Long> entry2: entry.getValue().entrySet()) {
                if(entry2.getKey().equals("add")){
                    addF = entry2.getValue();
                }else if(entry2.getKey().equals("get")){
                    getF = entry2.getValue();
                }else if(entry2.getKey().equals("remove")){
                    removeF = entry2.getValue();
                }else if(entry2.getKey().equals("contains")){
                    containsF = entry2.getValue();
                }else if(entry2.getKey().equals("populate")){
                    populateF = entry2.getValue();
                }else if(entry2.getKey().equals("iteratorAddF")){
                    iteratorAddF = entry2.getValue();
                }else if(entry2.getKey().equals("iteratorRemoveF")){
                    iteratorRemoveF = entry2.getValue();
                }
            }
            System.out.printf("%-11s %-7s %-9s %-7s %-7s %-7s %-15s %-7s%n", entry.getKey(), addF, getF, removeF, containsF, populateF, iteratorAddF, iteratorRemoveF);
            writer.printf("%-11s %-7s %-9s %-7s %-7s %-7s %-15s %-7s%n", entry.getKey(), addF, getF, removeF, containsF, populateF, iteratorAddF, iteratorRemoveF);
        }
        writer.close();
    }

    private HashMap<String, HashMap<String, Long>> getCalculationResult() {
        HashMap<String, HashMap<String, Long>> result = new HashMap<String, HashMap<String, Long>>();
        for (int k = 0; k<this.objectsForTest.length; k++){
            String type = this.objectsForTest[k];
            HashMap<String, Long> tmpData = new HashMap<String, Long>();
            Long averageTime = null;
            ArrayList<Integer> obj = new ArrayList<Integer>();
            for (int i = 0; i < this.functionsForObjects.length; i++) {
                if(this.functionsForObjects[i].equals("add")){
                    long startTime = System.currentTimeMillis();
                    for (int j = 0; j < this.countOfData; j++) {
                        obj.add(j);
                    }
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("get")){
                    long startTime = System.currentTimeMillis();
                    for (int j = 0; j < this.countOfData; j++) {
                        obj.get(j);
                    }
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("remove")){
                    long startTime = System.currentTimeMillis();
                    for (int j = 0; j < obj.size(); j++) {
                        obj.remove(j);
                    }
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("contains")){
                    long startTime = System.currentTimeMillis();
                    obj.contains(countOfData);
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("populate")){
                    long startTime = System.currentTimeMillis();
                    // TODO implement logic
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("iterator.add")){
                    long startTime = System.currentTimeMillis();
                    // TODO implement logic
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }else if(this.functionsForObjects[i].equals("iterator.remove")){
                    long startTime = System.currentTimeMillis();
                    // TODO implement logic
                    long endTime = System.currentTimeMillis();
                    averageTime = (endTime - startTime);
                }
                tmpData.put(functionsForObjects[i], averageTime);
            }
            result.put(type, tmpData);
        }
        return result;
    }
}
