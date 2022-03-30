import java.util.*;

class ExceptionA extends Exception{
    public void f1() throws Exception{
        System.out.println("ExceptionA.f1");
        try{
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("ExceptionA.f1.catch");
            throw e;
        }
    }
}

class ExceptionB extends ExceptionA {
    public void f2() throws Exception {
        System.out.println("ExceptionB.f2");
        try{
            super.f1();
        }
        catch(Exception e){
            System.out.println("ExceptionB.f2.catch");
            throw e;
        }
    }
    
}



class ExceptionC extends ExceptionB {

    public void f3() throws Exception{
        System.out.println("ExceptionC.f3");
        try{
            super.f2();
        }
        catch(Exception e){
            System.out.println("ExceptionC.f3.catch");
            throw e;
        }
    }
}

public class pset51 {
    public static void main(String[] args) {
        ExceptionC obj = new ExceptionC();
        try{
            obj.f3();
        }
        catch(Exception e){
            System.out.println("ExceptionAll.catch");
        }
        
    }
}
