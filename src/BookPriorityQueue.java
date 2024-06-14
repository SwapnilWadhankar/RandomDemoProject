import java.util.PriorityQueue;
import java.util.Queue;

public class BookPriorityQueue implements Comparable<BookPriorityQueue> {
    int id;
    String name, author;
    int price;

    BookPriorityQueue(int id, String name, String author, int price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price= price;
    }


    @Override
    public int compareTo(BookPriorityQueue b) {
        if(b.id > id){
            return 1;
        } else if (b.id < id) {
            return -1;
        }else{
            return 0;
        }
    }


}

class Book {
    public static void main(String[] args) {
        Queue<BookPriorityQueue> b = new PriorityQueue<BookPriorityQueue>();
        BookPriorityQueue b1 = new BookPriorityQueue(10,"Wings of fire", "Dr. Abdul Kalam", 25000);
        BookPriorityQueue b2= new BookPriorityQueue(20,"Mein Kamf", "Adolf Hitler", 15000);
        BookPriorityQueue b3 = new BookPriorityQueue(30,"Harry Potter and the Goblet fire", "J. K. Rowling", 30000);
        b.add(b1);
        b.add(b2);
        b.add(b3);

        for(BookPriorityQueue p : b){
            System.out.println("Id: "+p.id+"     Name of the book : "+p.name+"      Author : "+ p.author+ "        Price : "+p.price);
        }

        System.out.println("After removal ");
        b.poll();
        for(BookPriorityQueue p : b){
            System.out.println("Id: "+p.id+"     Name of the book : "+p.name+"      Author : "+ p.author+ "        Price : "+p.price);
        }
    }
}


