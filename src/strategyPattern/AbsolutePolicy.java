package strategyPattern;

public class AbsolutePolicy implements GradePolicy {

	@Override
	public void applyPolicy(Subject subject) {
		// TODO Auto-generated method stub
		if (subject.getScorePoint() > 80) {
			System.out.println(subject.getName() + " 과목은 PASS 입니다.");
		}
		else
			System.out.println(subject.getName() + " 과목은 FAIL 입니다.");
	}

}
