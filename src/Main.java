// Client class

import pattern.commands.ClassA;
import pattern.commands.ClassB;
import pattern.commands.ClassC;
import pattern.invoker.ClassExecutor;
import pattern.receiver.ExecutableClass;

public class Main {

    public static void main(String[] args) {
        ClassExecutor executor = new ClassExecutor();
        executor.doOperation(new ClassA(new ExecutableClass("AObject")));
        executor.doOperation(new ClassB(new ExecutableClass("BObject")));
        executor.doOperation(new ClassC(new ExecutableClass("CObject")));
    }

}
