package mediatorPattern;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;

public class CustomItemListener implements ItemListener {
	private Mediator mediator;
	private ColleagueCheckbox checkItem;

	public CustomItemListener(Mediator mediator, ColleagueCheckbox checkItem) {
		this.mediator = mediator;
		this.checkItem = checkItem;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		this.mediator.colleagueChanged(checkItem);
	}

}
