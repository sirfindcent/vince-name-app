public class GreetingApp{
    // Main method
    public static void main(String[] args){
        if (args.length > 0){ // if provided with the argument
            CreateGreeting greeting = new CreateGreeting(args[0]);
            System.out.println(greeting.getGreeting());
        }

        else{ // no argument
            CreateGreeting greeting = new CreateGreeting();
            System.out.println(greeting.getGreeting());
        }
    }

    // Method for testing
    public static String returnGreeting(String[] args){
        if (args.length > 0){ // if provided with the argument
            CreateGreeting greeting = new CreateGreeting(args[0]);
            return greeting.getGreeting();
        }
        else{ // no argument
            CreateGreeting greeting = new CreateGreeting();
            return greeting.getGreeting();
        }

    }
}

// public static void main(String[] args)
// public: access modifier. specifying where and who can access the method. public make the main method globally available.
// static: keyword. static so JVM can invoke the method without instantiating the class.
// void: return type.
// main: name of the main method. Identifier that JVM looks for as the starting point of the Java program.
// String[] args: Java command line arguments. The name of `String Array` is `args`, and we can change `args` to whatever name we have.
