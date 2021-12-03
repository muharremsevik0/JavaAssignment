package assigmentmuci1;

public class SoftwareDeveloper extends Employee {

	protected Department department;
	protected String projectName;


	
	public static int getNumber() {
		return number;
	}

	
	public SoftwareDeveloper(String name, int yearOfSeniority, String projectName, Department department) {
		super(name,yearOfSeniority);
		this.department =department;
		this.name =name;
		this.projectName=projectName;
		this.yearOfSeniority=yearOfSeniority;

		
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof SoftwareDeveloper) {
				return true;}
		return false;
		}

	// Erase the content.
	// Fill in the blanks. Format: [name]@[departmentName]-P:[projectName]-S:[yearOfSeniority]
	// For example: Jim@Android-P:ElectroAndroid-S:7
	@Override
	public String toString() {
		//System.out.println(name +"@"+ department.name + "-P:" + projectName+ "-S:"+ yearOfSeniority);
		return name +"@"+ department.name + "-P:" + projectName+ "-S:"+ yearOfSeniority;

	}

  //Erase the content. Fill in the blanks. It calculates salary of employee.
	//Formula is 2000 +  30 * (yearOfSeniority^2)
	@Override
	public double calculateSalary() {
		
		double salary =(2000 +  30 * (Math.pow(yearOfSeniority, 2))) ;
		return salary;
	}}