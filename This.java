class Box {
    private int l, b, h;

    public void setDimentions(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void sendBox() {
        GiftTaker gf = new GiftTaker();
        gf.acceptBox(this);
    }
}

public class This {
    public static void main(String[] args) {
        Box b = new Box();
        b.setDimentions(10, 20, 30);
        b.sendBox();
    }
}
