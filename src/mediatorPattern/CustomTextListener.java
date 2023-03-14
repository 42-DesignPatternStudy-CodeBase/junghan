package mediatorPattern;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class CustomTextListener implements TextListener {
	private Mediator mediator;
	private ColleagueTextField text;

	public CustomTextListener(Mediator mediator, ColleagueTextField text) {
		this.mediator = mediator;
		this.text = text;
	}
	@Override
    public void textValueChanged(TextEvent e) {
    	this.mediator.colleagueChanged(text);               
     }
  }