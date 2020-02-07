import java.util.StringTokenizer;

class Student
{
	private Name name; // name of student
	private int age;// age of student
	Student(Name name, int age)
	{
		this.name=name;
		this.age=age;
	}
	Name getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name.toString() + " " + age;
	}
}	
class Name 
{
	 private String fname; // First Name
	 private String mname; // Middle Name
	 private String lname; // Last Name
	 String getFName()
	 {
		 return fname;
	 }
	 String getMName()
	 {
		 return mname;
	 }
	 String getLName()
	 {
		 return lname;
	 }
	 String getName()
	 {
		String fullname;
		fullname = fname + " " + mname + " " + lname;
		return fullname;
	 }
	 Name(String name)
	 {
		 StringTokenizer stz=new StringTokenizer(name,"; ,");
		 while(stz.hasMoreTokens())
		 {
			 fname=stz.nextToken();
			 mname=stz.nextToken();
			 lname=stz.nextToken();
		 }
	 }
	 public String toString()
	 {
		 return getName();
	 }
} 
class StudentList
{
	 public static Student[] list = new Student[10]; // list of students
	 public static int count =0; // count of students added in the list
	 
	 public static void addStudent(Student std) 
	 {
		 if(count>= 20) return; // if count is already 20 or more then return
		 list[count] = std;
		 count++;
	 }
	 
	 public static Student[] getStudentsWithAge(int age) 
	 {
		 Student[] ageList = new Student[10];
		 int countAge=0;
		 for(int i=0; i<count; i++)
		 {
			 if(list[i].getAge()==age)
			 {
				 ageList[countAge]=list[i];
				 countAge++;
			 }
			 else
			 {
				 ;
			 }
		 }
		 if(countAge==0)
		 {
			 return null;
		 }
		 else
		 {
			return ageList; 
		 }
	 }
	 
	 public static Student[] getStudentsWithLastName(String lastName) 
	 {
		 Student[] lNameList = new Student[10];
		 int countLname=0;
		 for(int i=0; i<count; i++)
		 {
			 if(list[i].getName().getLName()==lastName)
			 {
				 lNameList[countLname]=list[i];
				 countLname++;
			 }
			 else
			 {
				 ;
			 }
		 }
		 if(countLname==0)
		 {
			 return null;
		 }
		 else
		 {
			return lNameList; 
		 }
	 }
	 
	 public static Student[] getStudentsInRange(int minAge, int maxAge) 
	 {
		 Student[] ageList = new Student[10];
		 int countAge=0;
		 for(int i=0; i<count; i++)
		 {
			 if(list[i].getAge()>=minAge && list[i].getAge()<=maxAge)
			 {
				 ageList[countAge]=list[i];
				 countAge++;
			 }
			 else
			 {
				 ;
			 }
		 }
		 if(countAge==0)
		 {
			 return null;
		 }
		 else
		 {
			return ageList; 
		 }
	 }
}