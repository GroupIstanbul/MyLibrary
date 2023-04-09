/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Burak
 */
public class Student {
    private String studentName;
    private String studentSurname;
    private String ID ;
    private int adress;
    private int idStarter=0;
    
    public Student(String studentName, String studentSurname, String ID, int adress) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.ID = ID;
        this.adress = adress;
    }
     private int generateName() {
             this.idStarter++;

                 return this.idStarter;
                }
 
   public String toString() {
		
		return "\nName of student:" + this.studentName+ " " +this.studentSurname +"\n*********\nstudent ID:" + this.ID + "\n*********\nstudent adress:" + this.adress;//+ this.ID.toString();
	}
 
    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
    
    
 
}
