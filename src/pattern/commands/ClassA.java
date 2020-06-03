//Command class

package pattern.commands;

import pattern.icommand.Command;
import pattern.receiver.ExecutableClass;

public class ClassA implements Command {

    public ClassA(ExecutableClass executableObject) {
        this.executableObject = executableObject;
    }

    private ExecutableClass executableObject;

    @Override
    public void execute() {
        executableObject.operation1();
    }

}
