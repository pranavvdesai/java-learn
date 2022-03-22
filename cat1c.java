// Create an interface, in a package, with two methods namely, add and multiply for addition and multiplication of mathematical objects such as vectors and matrices. 
// Create a class Vector in another package that implements the interface with necessary data members. 
// Create another class Matrix in some other package that implements the interface with necessary data members. 
// Create a class containing the main method in another package and show the computation of the sum of two vectors and their scalar product and the sum of two matrices and the product of the matrices. (Provision for user input is not necessary.)
package cat1c;

import java.util.*;
import cat1cvector.cat1cvector;

public class cat1c {
    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<Integer>(3, 4);
        Vector<Integer> v2 = new Vector<Integer>(5, 6);

        cat1cvector c1 = new cat1cvector();
        c1.add(v1, v2);
    }
}
