package strategyPattern;

import java.util.ArrayList;


public class Student {

	  int studentID;
	  String studentName;
	  ArrayList<Subject> subjectList;
	  GradePolicy policy;
	  
	  public static final int BASIC = 0;
	  public static final int MAJOR = 1;
	  public Student(int studentID, String studentName) {
	  
		  this.studentID = studentID;
		  this.studentName = studentName;
	  
		  subjectList = new ArrayList<Subject>();
		  policy = new BasicPolicy();
	  
	  }
	  
	  public void addSubject(String name, int score, boolean majorCode){
		  Subject subject = new Subject();
		  subject.setName(name);
		  subject.setScorePoint(score);
		  subject.setMajorCode(majorCode);
		  subjectList.add(subject);
	  }
	  
	  public void changePolicy(GradePolicy policy){
		  this.policy = policy;
	  }
	 
	  public void showGradeInfo() {
		  for (Subject subject: this.subjectList) {
			  System.out.println("학생" + studentName + "님의 ");
			  policy.applyPolicy(subject);
		  }
	  }
}