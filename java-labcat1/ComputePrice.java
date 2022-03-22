abstract class Property {
    private String name;
    private String address;

    abstract int computePrice();

}

class House extends Property {
    public int price;
    public int no_of_floors;
    public int price_per_square_feet;
    public String location;

    public House(String name, String address, int no_of_floors, int price_per_square_feet, String location) {
        this.no_of_floors = no_of_floors;
        this.price_per_square_feet = price_per_square_feet;
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNo_of_floors() {
        return no_of_floors;
    }

    public void setNo_of_floors(int no_of_floors) {
        this.no_of_floors = no_of_floors;
    }

    public int getPrice_per_square_feet() {
        return price_per_square_feet;
    }

    public void setPrice_per_square_feet(int price_per_square_feet) {
        this.price_per_square_feet = price_per_square_feet;
    }

    public int computePrice() {
        if (location.equals("Gurgaon")) {
            return (this.price = (int) (20000 + this.no_of_floors * this.price_per_square_feet * 0.2));
        } else if (location.equals("Delhi")) {
            return (int) (this.price = (int) (10000 + this.no_of_floors * this.price_per_square_feet * 0.2));
        } else {
            return (int) (this.price = (int) (5000 + this.no_of_floors * this.price_per_square_feet * 0.2));
        }
    }

}

class Apartment extends Property {
    public int price;
    public int area;
    public String type;

    public Apartment(String name, String address, int area, String type) {
        this.area = area;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public int setArea(int area) {
        return this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int computePrice() {
        if (this.type.equals("3BHK")) {
            return this.price = (int) (this.area * 0.10);
        } else if (this.type.equals("2BHK")) {
            return this.price = (int) (this.area * 0.04);
        }
    }
}

public class ComputePrice {

    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House("Pranav", "churh st", 2, 100, "Gurgaon");
        houses[1] = new House("Desai", "churh st", 3, 200, "Delhi");
        houses[2] = new House("Hello", "churh st", 4, 300, "Bangalore");
        Apartment[] apartments = new Apartment[3];
        apartments[0] = new Apartment("Pranav", "churh st", 100, "3BHK");
        apartments[1] = new Apartment("Desai", "churh st", 200, "2BHK");
        apartments[2] = new Apartment("Hello", "churh st", 300, "3BHK");

        for (House house : houses) {
            System.out.println(house.computePrice());
        }
        for (Apartment apartment : apartments) {
            System.out.println(apartment.computePrice());
        }

    }
}