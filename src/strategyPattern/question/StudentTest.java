package strategyPattern.question;


//학교의 학생이 수강 신청을 하게되면 과목마다 각각 성적을 받게 된다.

//이때, 성적에 대한 학점을 부여하는 정책은 다음과 같이 여러가지가 있을 수 있다. 전공 관련 여부에 따라 학점이 다르게 부여되는 경우,

//Pass/Fail로 만 학점을 부여하는 경우등 다양한 학점에 대한 정책이 있을때 각 성적에 대해 다양한 정책을 어떻게 구현하면 좋을까?

public class StudentTest {

	  public static void main(String[] args) {
		  
		  Student studentLee = new Student(1001, "Lee");
	  
		  studentLee.addSubject("국어", 100, false);
		  studentLee.addSubject("수학", 100, true);
	  
		  Student studentKim = new Student(1002, "Kim");
	  
		  studentKim.addSubject("국어", 55, true);
		  studentKim.addSubject("수학", 55, false);
		  studentKim.addSubject("영어", 100, false);
	  
		 // studentLee.showGradeInfo();
	  
		  System.out.println("======================================");
	  
		  //studentKim.showGradeInfo();
	  
	  }
}