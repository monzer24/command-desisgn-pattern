//Receiver class

package pattern.receiver;

public class ExecutableClass {

    public ExecutableClass(String name) {
        this.name = name;
    }

    private String name;

    public void operation1(){
        System.out.println("operation1 with name : " + name);
    }

    public void operation2(){
        System.out.println("operation2 with name : " + name);
    }

    public void operation3(){
        System.out.println("operation3 with name : " + name);
    }
}
