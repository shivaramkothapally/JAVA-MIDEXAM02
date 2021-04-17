/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542269
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("Answer for question 5 : Shivaram kothapally");;
        
        Person pe = new Person("shiva", "horizons west", "9642580075", "shiva@gmail.com");
        System.out.println("Person: \n" + pe);
        
        Student sd = new Student(3.0, "shanmukh", "philadelphia", "6306162947", "shanu@gmail.com");
        System.out.println("Student: \n" + sd);
        
        Staff st = new Staff("Office clerk", "adminstration department", 2000, "05/12/2019",
                "Rambo", "Texas", "9848567902", "Rambo@gmail.com");
        System.out.println("Staff: \n" + st);
        
        Employee ep = new Employee("Facility services", 2400, "12/09/2018", "bairstow", 
                "California", "8985236330", "bairstow@gmail.com");
        System.out.println("Employee: \n" + ep);
        
        Faculty ft = new Faculty("10-3 PM", 4, "iS", 4500, "21/12/2016", 
                "Thomas", "omaha", "9876123457", "thomas@gmail.com");
        System.out.println("Faculty: \n" + ft);
        
    }
    
}

    
    
