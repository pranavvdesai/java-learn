interface Interface {
    // abstract and public by default and static
    public void method1();
    public void method2();
}

class A implements Interface {
    public void method1() {
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("Method 2");
    }
}