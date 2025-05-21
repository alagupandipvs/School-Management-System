package School_Management_System;

/**
 * this class is responsible for name,id and the salery.
 */
public class Teachers { 
	 	private int id;
	 	private String name;
	 	private int salary;
	 	private int SalaryEarned;
	 	
	 	
	 	/** 	 * creates new teacher object
	 	 * @param id   id of the teacher 
	 	 * @param name name
	 	 * @param salery
	 	 */
	 	public Teachers(int id,String name,int salary) {
	 		this.id=id;
	 		this.name=name;
	 		this.salary=salary;
	 		this.SalaryEarned=0;
	 		 
	 	}
	 	 /** 
	 	 * @return id, salery, name of the teacher
	 	 */
	 	public int getId() {
	 		return id;
	 	}
	 	
	 	public String getName() {
	 		return name;
	 	}
	 	public int getSalery() {
	 		return salary;
	 	}
	 	/**
	 	 * set the salery
	 	 * @param salery
	 	 */
	 	public void setSalery(int salary) {
	 		this.salary=salary;
	 	}
	 	/**
	 	 * add to slaey
	 	 * remove from total money earned from ghss
	 	 * @param salery
	 	 */
	 	public void receiveSalary(int salery) {
	 		SalaryEarned+=salary;
	 		Schl.updateTotalMoneySpent(salery);
	 		
	 	 
	 	}
	 	public String toString() {
	 		return "name of the teacher: "+" "+name+" "+"totel salery earned for  $"+ SalaryEarned;
	 	}

	 }

	

