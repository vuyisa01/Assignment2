package za.ac.cput;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void listAdd() {

        List<String> DataAnalystList = new ArrayList<>();
        DataAnalystList.add("Thokoani");
        DataAnalystList.add("Sivuyile");
        DataAnalystList.add("Kungentando");

        for (int i = 0; i < DataAnalystList.size(); i++) {
            System.out.println(DataAnalystList.get(i));
        }
        assertEquals(3, DataAnalystList.size());
    }
    @Test
    public void listRemove() {

        List<String> DataAnalystList = new ArrayList<>();
        DataAnalystList.add("Thokoani");
        DataAnalystList.add("Sivuyile");
        DataAnalystList.add("Kungentando");

        boolean isremoved = DataAnalystList.remove("Sivuyile");
        System.out.println(DataAnalystList);
    }

    @Test
    public void listFind() {

        List<String> DataAnalystList = new ArrayList<>();
        DataAnalystList.add("Thokoani");
        DataAnalystList.add("Sivuyile");
        DataAnalystList.add("Kungentando");

        System.out.println(DataAnalystList.indexOf("Sivuyile"));

    }
    //------------------------------- SET -----------------------------------------
    @Test
    public void SetAdd() {
        Set<Employee> DataAnalystSet = new HashSet<>();

        DataAnalystSet.add(new Employee("Thokozani", 2181922));
        DataAnalystSet.add(new Employee("Sivuyile", 2181923));
        DataAnalystSet.add(new Employee("Kungentando", 2181924));

        System.out.println(DataAnalystSet);
        assertEquals(3,DataAnalystSet.size());
    }

    @Test
    public void SetRemove() {
        Set<String> DataAnalystSet = new HashSet<String>();

        DataAnalystSet.add("Thokozani");
        DataAnalystSet.add("Sivuyile");
        DataAnalystSet.add("Kungentando");

        boolean isremoved = DataAnalystSet.remove("Kungentando");
        System.out.println(DataAnalystSet);
    }

    @Test
    public void SetFind() {
        Set<String> DataAnalystSet = new HashSet<String>();

        DataAnalystSet.add("Thokozani");
        DataAnalystSet.add("Sivuyile");
        DataAnalystSet.add("Kungentando");

        DataAnalystSet.contains("Kungentando");
        System.out.println(DataAnalystSet.contains("Kungentando"));
    }
    //************************* MAP ***************************************
    @Test
    public void MapAdd() {

        Map<String, Integer> DataAnalystMap = new HashMap<>();
        DataAnalystMap.put("Thokozani", 2181922);
        DataAnalystMap.put("Kungentando", 2181923);
        DataAnalystMap.put("Sivuyile", 2181924);

        System.out.println(DataAnalystMap);
        assertEquals(3, DataAnalystMap.size());
    }

    @Test
    public void MapRemove() {

        Map<Integer, String> DataAnalystMap = new HashMap<>();
        DataAnalystMap.put(1,"Thokozani");
        DataAnalystMap.put(2,"Kungentando");
        DataAnalystMap.put(3,"Sivuyile");
        DataAnalystMap.remove(1);

        System.out.println(DataAnalystMap);
        assertEquals(2, DataAnalystMap.size());
    }
    @Test
    public void MapFind() {

        Map<Integer, String> DataAnalystMap = new HashMap<>();
        DataAnalystMap.put(1,"Thokozani");
        DataAnalystMap.put(2,"Kungentando");
        DataAnalystMap.put(3,"Sivuyile");
        DataAnalystMap.get(1);

        System.out.println(DataAnalystMap.get(1));
    }
    //*************************** COLLECTION ********************************
    @Test
    public void CollectionAdd(){
        Collection<String> DataAnalystCollection = new ArrayList<>();
        DataAnalystCollection.add("Thokozani");
        DataAnalystCollection.add("Sivuyile");
        DataAnalystCollection.add("Kungentando");

        for (int i = 0; i < 2; i++);
        System.out.println(DataAnalystCollection);

        assertEquals(3,DataAnalystCollection.size());
    }

    @Test
    public void CollectionRemove() {
        Collection<String> DataAnalystCollection = new ArrayList<>();
        DataAnalystCollection.add("Thokozani");
        DataAnalystCollection.add("Sivuyile");
        DataAnalystCollection.add("Kungentando");
        DataAnalystCollection.remove("Kungentando");

        for (int i = 0; i < 2; i++) ;
        System.out.println(DataAnalystCollection);

        assertEquals(2, DataAnalystCollection.size());
    }
    @Test
    public void CollectionFind() {
        Collection<String> DataAnalystCollection = new ArrayList<>();
        DataAnalystCollection.add("Thokozani");
        DataAnalystCollection.add("Sivuyile");
        DataAnalystCollection.add("Kungentando");

        DataAnalystCollection.contains("Kungentando");
        System.out.println(DataAnalystCollection.contains("Kungentando"));
    }

}