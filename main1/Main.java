package com.main1;
import com.school1.*;
import com.student.*;

public class Main {	

public static void main(String[] args) {
	School sc = School.getSchoolDetails("Oxford", "A","1st Rank");
	Student st =Student.getStudentObjects("Kiran", "A", sc, 98.5);
	System.out.println(st);
	System.out.println(sc);
}
	
}