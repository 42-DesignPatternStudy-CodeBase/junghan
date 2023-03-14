package mediatorPattern;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague{
	private Mediator mediator;
	private CustomItemListener customItemListener;

	public ColleagueCheckbox(String string, CheckboxGroup g, boolean b) {
		// TODO Auto-generated constructor stub
		super(string, g, b);
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

	public void addItemListener(ColleagueCheckbox checkItem) {
		// TODO Auto-generated method stub
		customItemListener = new CustomItemListener(mediator, checkItem);
		this.addItemListener(customItemListener);
    }

}
