package strategyPattern;

public class BasicPolicy  implements GradePolicy {

	@Override
	public void applyPolicy(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println(subject.getName() + " 과목은 " + subject.getScorePoint() + " 입니다.");
	}

}
