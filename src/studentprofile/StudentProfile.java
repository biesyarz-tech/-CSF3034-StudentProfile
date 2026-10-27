/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

//************************************************************************

/* Author: Noorbiesyar Muqhriz Zulfan bin Noorsyahriman
* Program Name: MyProfile.java
* Description: To write a simple program that can display multiple messages in several lines.
* Date: 15 October 2026
* Modified Date: None
* Version: 1.0
************************************************************************/

public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: Noorbiesyar Muqhriz Zulfan bin Noorsyahriman");
        System.out.println("Student ID: S84757");
        System.out.println("Programme: Bachelor of Computer Science");
        System.out.println("Semester: Semester 1");
        System.out.println("Favourite Language: Java");
        
        GradeMessage g = new GradeMessage();
        g.displayGrade();
    }
    
}
