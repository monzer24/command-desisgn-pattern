// Invoker

package pattern.invoker;

import pattern.icommand.Command;

public class ClassExecutor {

    public void doOperation(Command command){
        command.execute();
    }

}
