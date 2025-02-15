package Basics;

public class HelloWorld {
    static int a;   // default int value =0
    static String s;        // default string value = null

    /**
     * public - access modifier
     * static - object not required to call method/variables
     * void - returns nothing
     * main - Engine
     * @param args
     *
     * why static in main method ?
     * main() method is the first method that executes first while execution.
     * There will be no object for the class at first part of java runtime.
     * So by making method as static JVM can load the class into the main memory and call the main() method.
     */
    // Static variables/Blocks will be loaded before object creation
    //static block will execute first

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test1();
        test2();

    }
    public void test1(){
        System.out.println("Automation Testing");
    }

    public static void test2(){
        System.out.println("Selenium Testing");
    }

    static {
        System.out.println("Java Learning");
        System.out.println(s);
        System.out.println(a);
    }
}
