package School_Management_System;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 

	public static void main(String[] args) {
		
		
		Teachers kannika=new Teachers(1,"kannika",500);
		Teachers jp=new Teachers(2,"jp",900);
		Teachers gobi=new Teachers(3,"gobi",700);
		Teachers sabhary=new Teachers(4,"sabhary",800);
		Teachers sudhakar=new Teachers(5,"sudahkar",1500);  
		
		List<Teachers> teachersList=new ArrayList<>();
		 
		
		teachersList.add(sudhakar);
		teachersList.add(sabhary);
		teachersList.add(gobi);
		teachersList.add(jp);
		teachersList.add(kannika);
		List<Student> studentList=new ArrayList<>();
		
		Student pandi=new Student(1,"pandi",5);
		
		Student mani=new Student(2,"mani",4);
		Student abdul=new Student(3,"abdul",3);
		Student abhi=new Student(4,"abhi",2);
		Student hissam=new Student(5,"hissam",1);
		
		studentList.add(hissam);
		studentList.add(mani);
		studentList.add(abdul);
		studentList.add(pandi);
		studentList.add(abhi);
		
		
		
		Schl ghssk =new Schl(teachersList,studentList);
		pandi.payfees(2000);
		abdul.payfees(700);
		System.out.println("ghssk iss earned  = " +ghssk.getTotalMoneyEarned());
		
		
		System.out.println("---------MAKING SCHOOL PAY SALERY--------");
		kannika.receiveSalary(kannika.getSalery());
		System.out.println("GHSSK HAS spent for salery to " + kannika.getName()+ "  and now has $"+ghssk.getTotalMoneyEarned());
		sudhakar.receiveSalary(sudhakar.getSalery());
		System.out.println("GHSSK HAS spent for salery to " + sudhakar.getName()+ "  and now has $"+ghssk.getTotalMoneyEarned());
		System.out.println(pandi);
		System.out.println(kannika);
		
		
		
		
	}

}
