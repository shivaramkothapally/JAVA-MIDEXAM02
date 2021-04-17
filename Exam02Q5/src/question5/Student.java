/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Shivaram kothapally
 */
public class Student extends Person{
    private double grade;
    private final String classStatus = "Graduate";// constant

    public Student(double grade, String name, String address, String phoneNumber, String email)
    {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getClassStatus() {
        return classStatus;
    }
    
    @Override
    public String toString() {
        return  super.toString() + ",grade=" + grade + ", classStatus=" + classStatus ;
    }
    
    
}
    

