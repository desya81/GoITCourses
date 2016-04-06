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

    public void showResultTable() throws ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException,
            FileNotFoundException,
            UnsupportedEncodingException {

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
                }else if(entry2.getKey().equals("iterator.add")){
                    iteratorAddF = entry2.getValue();
                }else if(entry2.getKey().equals("iterator.remove")){
                    iteratorRemoveF = entry2.getValue();
                }
            }
            System.out.printf("%-11s %-7s %-9s %-7s %-7s %-10s %-15s %-7s%n", entry.getKey(), addF, getF, removeF, containsF, populateF, iteratorAddF, iteratorRemoveF);
            writer.printf("%-11s %-7s %-9s %-7s %-7s %-10s %-15s %-7s%n", entry.getKey(), addF, getF, removeF, containsF, populateF, iteratorAddF, iteratorRemoveF);
        }
        writer.close();
    }

    private HashMap<String, HashMap<String, Long>> getCalculationResult() {
        HashMap<String, HashMap<String, Long>> result = new HashMap<String, HashMap<String, Long>>();

        ArrayList arrayList = new ArrayList<Integer>();
        result.put("ArrayList", doListFunction(arrayList));
        LinkedList linkedList = new LinkedList();
        result.put("LinkedList", doListFunction(linkedList));
        Set hashSet = new HashSet();
        result.put("HashSet", doSetFunction(hashSet));
        Set treeSet = new TreeSet();
        result.put("TreeSet", doSetFunction(treeSet));

        return result;
    }

    /**
     * Function List function
     * @param obj List
     * @return HashMap
     */
    private HashMap doListFunction(List obj){
        HashMap<String, Long> tmpData = new HashMap<String, Long>();
        Random rand = new Random();
        long startTime;
        long endTime;
        long averageTime;

        startTime = System.currentTimeMillis();
        for (int j = 0; j < this.countOfData; j++) {
            obj.add(j);
        }
        endTime = System.currentTimeMillis();
        long averagePopulateTime = (endTime - startTime);

        for (int i = 0; i < this.functionsForObjects.length; i++) {
            startTime = System.currentTimeMillis();
            if(this.functionsForObjects[i].equals("add")){
                for (int j = 0; j < 100; j++) {
                    obj.add(j);
                }
            }else if(this.functionsForObjects[i].equals("get")){
                for (int j = 0; j < 100; j++) {
                    obj.get(j);
                }
            }else if(this.functionsForObjects[i].equals("remove")){

                for (int j = 0; j < 100; j++) {
                    obj.remove(j);
                }
            }else if(this.functionsForObjects[i].equals("contains")){
                obj.contains(100);
            }else if(this.functionsForObjects[i].equals("iterator.add")){
                ListIterator ArrayIterator = obj.listIterator();
                for (int j = 0; j < 100; j++) {
                    ArrayIterator.add(rand.nextInt());
                }
            }else if(this.functionsForObjects[i].equals("iterator.remove")){
                ListIterator ArrayIterator = obj.listIterator();
                for (int j = 0; j < 100; j++) {
                    ArrayIterator.next();
                    ArrayIterator.remove();
                }
            }
            endTime = System.currentTimeMillis();
            if(this.functionsForObjects[i].equals("populate")){
                averageTime = averagePopulateTime;
            }else{
                averageTime = (endTime - startTime);
            }
            tmpData.put(functionsForObjects[i], averageTime);
        }

        return tmpData;
    }


    private HashMap doSetFunction(Set obj){
        HashMap<String, Long> tmpData = new HashMap<String, Long>();
        Random rand = new Random();
        long startTime;
        long endTime;
        long averageTime;

        startTime = System.currentTimeMillis();
        for (int j = 0; j < this.countOfData; j++) {
            obj.add(j);
        }
        endTime = System.currentTimeMillis();
        long averagePopulateTime = (endTime - startTime);

        for (int i = 0; i < this.functionsForObjects.length; i++) {
            startTime = System.currentTimeMillis();
            if(this.functionsForObjects[i].equals("add")){
                for (int j = 0; j < 100; j++) {
                    obj.add(j);
                }
            }else if(this.functionsForObjects[i].equals("remove")){
                for (int j = 0; j < 100; j++) {
                    obj.remove(j);
                }
            }else if(this.functionsForObjects[i].equals("contains")){
                obj.contains(100);
            }else if(this.functionsForObjects[i].equals("iterator.remove")){
                Iterator iterator = obj.iterator();
                for (int j = 0; j < 100; j++) {
                    iterator.next();
                    iterator.remove();
                }
            }
            endTime = System.currentTimeMillis();
            if(this.functionsForObjects[i].equals("populate")){
                averageTime = averagePopulateTime;
            }else{
                averageTime = (endTime - startTime);
            }
            tmpData.put(functionsForObjects[i], averageTime);
        }

        return tmpData;
    }
}
