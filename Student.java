package School_Management_System;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feestotal;
	
	
	public Student(int id,String name,int grade) {
		this.feespaid=0;
		this.feestotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
	}
	
	//students name ALter panna thevailla grade mattum panna pothum ok
	
	/**
	 * Used to update a student grade .
	 * @param grade new grade of the student.
	 */
  public void setgrade(int grade) {
	  this.grade=grade;
  }
  
  /*add the fees to the feespaid .so the update messsage ading the fees
   * 
   */
  public void payfees(int fees) {
	  this.feespaid=feespaid+fees;
	  Schl.updateTotalMoneyEarned(feespaid);
  }
  public int remainingfees() {
	  return feestotal-feespaid;
	  
  }

public int getId() {
	return id;
}

 
public String getName() {
	return name;
}

 

public int getGrade() {
	return grade;
}

 
public int getFeespaid() {
	return feespaid;
}
 
public int getFeestotal() {
	return feestotal;
}

 public String toString() {
	 return "student's name"+" "+name+" "+
			 "total fees paid so far $"+feespaid;
 }
 	
  
    
}
