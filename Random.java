class Box {
    private int length, breadth, height;

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void getVolume() {
        System.out.println("Volume is " + length * breadth * height);
    }
}

public class Random {
    public static void main(String[] args) {
        Box smallBox = new Box();
        smallBox.setDimension(10, 20, 15);
        smallBox.getVolume();
        smallBox = new Box();
        smallBox.getVolume();
    }
}
