
public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		//System.out.println(s1);
		s1.setId(100);
		s1.setName("Rich");
		s1.setCourse("Java");
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Akib");
		s2.setCourse("java");
		System.out.println(s2);
	}

}
