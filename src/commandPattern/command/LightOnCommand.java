package commandPattern.command;

import commandPattern.Command;
import commandPattern.receiver.Light;

public class LightOnCommand  implements Command {
    Light light;

    public LightOnCommand(Light light) {
      this.light = light;
    }

    public void execute() {
      light.on();
    }
}
