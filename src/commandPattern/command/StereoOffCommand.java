package commandPattern.command;

import commandPattern.Command;
import commandPattern.receiver.Stereo;


public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
    	this.stereo = stereo;
    }

	@Override
	public void execute() {
        stereo.off();
    }
}