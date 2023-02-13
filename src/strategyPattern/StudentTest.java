package strategyPattern;


public class StudentTest {

	  public static void main(String[] args) {
		  
		  GradePolicy absolute = new AbsolutePolicy();
		  
		  Student studentLee = new Student(1001, "Lee");
	  
		  studentLee.addSubject("국어", 100, false);
		  studentLee.addSubject("수학", 100, true);
	  
		  Student studentKim = new Student(1002, "Kim");
	  
		  studentKim.addSubject("국어", 55, true);
		  studentKim.addSubject("수학", 55, false);
		  studentKim.addSubject("영어", 100, false);
	  
		  studentLee.showGradeInfo();
		  
		  studentLee.changePolicy(absolute);
		  
		  studentLee.showGradeInfo();
		  
	  
		  System.out.println("======================================");
	  
		  studentKim.showGradeInfo();
		  
		  studentKim.changePolicy(absolute);
		  
		  studentKim.showGradeInfo();
		  
	  
	  
	  }
}