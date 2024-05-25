import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Swapnil");
        list.add("Vinay");
        list.add("Shreyanshu");
        list.add("Shreyas");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list.size());
        Collections.sort(list);

        list.forEach(e-> {System.out.println(e);});
    }
}
