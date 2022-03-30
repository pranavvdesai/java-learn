import java.io.*;

class Product {
    
    private String code;
    private String name;
    private double price;
    private int quantity;
    
    public Product() {
        code = "";
        name = "";
        price = 0;
        quantity = 0;
    }

    public Product(String prodcode, String prodName, double prodPrice, int prodQuantity) {
        code = prodcode;
        name = prodName;
        price = prodPrice;
        quantity = prodQuantity;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

}

public class LabDA1 {

    public static DataInputStream inp;

    public static void main(String[] args) throws Exception {

        inp = new DataInputStream(System.in);
        do {
            System.out.print("A)Add record B)Display all C)Find record D)Change Price and Quantity E)Exit:");
            char ch = (inp.readLine()).charAt(0);
            switch (ch) {
                case 'A':
                    Add();
                    break;
                case 'B':
                    Read();
                    break;
                case 'C':
                    Find();
                    break;
                case 'D':
                    Change();
                    break;
                case 'E':
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);

    }

    public static void Add() throws Exception {
        System.out.print("Enter product code:");
        String code = inp.readLine();
        System.out.print("Name: ");
        String name = inp.readLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(inp.readLine());
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(inp.readLine());
        Product prod = new Product(code, name, price, quantity);
        PrintWriter write = new PrintWriter(new FileOutputStream("Product.bin", true));
        write.println(prod.getCode());
        write.println("" + prod.getName());
        write.println("" + prod.getPrice());
        write.println("" + prod.getQuantity());
        write.close();

    }

    public static void Read() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Product.bin"));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();

    }

    public static void Find() throws Exception {
        System.out.print("Code: ");
        String n = inp.readLine();
        BufferedReader br = new BufferedReader(new FileReader("Product.bin"));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(n)) {
                System.out.println("Name:" + br.readLine());
                System.out.println("Price: " + br.readLine());
                System.out.println("Quantity: " + br.readLine());
                break;
            }
        }
        br.close();
    }
    public static void Change() throws Exception {
        System.out.print("Enter product code:");
        String code = inp.readLine();
        System.out.print("Enter new price: ");
        double newPrice = Double.parseDouble(inp.readLine());
        System.out.print("Enter new quantity: ");
        int newQuantity = Integer.parseInt(inp.readLine());
        BufferedReader br = new BufferedReader(new FileReader("Product.bin"));
        String line;
        PrintWriter write = new PrintWriter(new FileOutputStream("Product.bin"));
        while ((line = br.readLine()) != null) {
            if (line.equals(code)) {
                write.println(line);
                write.println(br.readLine());
                write.println(newPrice);
                write.println(newQuantity);                
                
            } else {
                write.println(line);
                write.println(br.readLine());
                write.println(br.readLine());
                write.println(br.readLine());
            }
        }
        write.close();
        br.close();

    }

}