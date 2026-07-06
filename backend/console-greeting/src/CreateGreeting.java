public class CreateGreeting {
    private String name;

    public CreateGreeting(String name){ // args provided
        this.name = name;
    }

    public CreateGreeting(){ // for default
        this.name = "Vincent";
    }

    public String getGreeting(){ // print
        return "Hello " + name;
    }

}
