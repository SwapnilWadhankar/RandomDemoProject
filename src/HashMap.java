import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer,String> map = new java.util.HashMap<Integer,String>();
        map.put(1,"Swapnil");
        map.put(2,"Shreyas");
        map.put(3,"Vinay");
        map.put(4,"Shreyanshu");

        //to travere through Map we need to convert it into Set first using either entrySet() or keySet()

        Set set = map.entrySet();

        //traversing the set using iterator() method
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            //in order to get the methods which provides key and values of the map we use Map.Entry
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("Key : "+entry.getKey() + " Value : "+entry.getValue());
        }
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
