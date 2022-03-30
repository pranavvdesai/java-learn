import java.util.*;

class Book {
    private String title;
    private Double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

}

class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        } else if (b1.getPrice() < b2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Compratr {
    public static void main(String[] args) {

        Book b1, b2, b3;
        b1 = new Book("java", 100.0);
        b2 = new Book("php", 60.0);
        b3 = new Book("c", 30.0);

        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(b1);
        ts.add(b2);
        ts.add(b3);

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Book b = (Book) it.next();
            System.out.println(b.getTitle() + " " + b.getPrice());
        }

    }
    
}
