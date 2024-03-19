import java.util.Scanner;

// Class  BookStore
class BookStore {
    public void method1() {
        System.out.println("Welcome to BookStore");
    }
}

// Class representing the availability of books
class Availability {
    // Method to check availability based on price
    public String method2(int price) {
        if (price > 100) {
            return "Books are Available";
        } else {
            return "Books are not Available";
        }
    }
}

// Main class 
public class Methods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book price: ");
        int cost = sc.nextInt();
        
        // Create BookStore object 
        BookStore obj1 = new BookStore();
        obj1.method1();
        
        // Create Availability object 
        Availability obj2 = new Availability();
        System.out.println(obj2.method2(cost));
    }
}
