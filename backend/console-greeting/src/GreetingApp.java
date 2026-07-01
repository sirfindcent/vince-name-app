public class GreetingApp{
    public static void main(String[] args){
        if (args.length > 0){ // if provided with the argument
            System.out.println("Hello " + args[0]);
        }
        else{ // no argument
            System.out.println("Hello Vincent");
        }

    }
    // Public: access modifier. specifying where and who can access the method. public make the main method globally available.
    // static: keyword. static so JVM can invoke the method without instantiating the class.
    // void: return type.
    // main: name of the main method. Identifier that JVM looks for as the starting point of the Java program.
    // String[] args: Java command line arguments. The name of `String Array` is `args`, and we can change `args` to whatever name we have.

}