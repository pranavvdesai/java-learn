class Customer {
    public String name;
    public String mobile;
    public double bill;
    public double bonus;

    public Customer(String name, String mobile, double bill, double bonus) {
        if (name.length() <= 0) {
            throw new IllegalArgumentException("Name must be at least 1 character long");
        } else {
            this.name = name;
        }
        if (mobile.length() <= 0) {
            throw new IllegalArgumentException("Mobile number must be present");
        } else {
            this.mobile = mobile;
        }
        if (bill < 0) {
            this.bill = 0;
        } else {
            this.bill = bill;
        }
        if (bonus < 0) {
            this.bonus = 0;
        } else {
            this.bonus = bonus;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBonus() {
        return bonus;
    }

    public double computeBonus() {
        return this.bonus = this.bill * 0.02;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Pranav", "9876543210", 100, 0);
        customers[1] = new Customer("Desai", "9876543211", 200, 0);
        customers[2] = new Customer("Hello", "9876543212", 300, 0);
        for (Customer customer : customers) {
            System.out.println(customer.getName() + " " + customer.getMobile() + " " + customer.getBill() + " "
                    + customer.computeBonus());

        }
    }
}