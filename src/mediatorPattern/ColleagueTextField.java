package mediatorPattern;

import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements Colleague {
	private Mediator mediator;
	private CustomTextListener customTextListener;

	public ColleagueTextField(String string, int i) {
		// TODO Auto-generated constructor stub
		super(string, i);
	}

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

	public void addTextListener(ColleagueTextField text) {
		// TODO Auto-generated method stub
		customTextListener = new CustomTextListener(mediator, text);
		this.addTextListener(customTextListener);
	}

}
