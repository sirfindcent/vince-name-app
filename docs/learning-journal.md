# Learning Journal

## Phase 0: Git, Environment Setup & Project Foundation

### Git and GitHub

- **What is Git?**
  Distributed version control that track every change in our code.
- **What is GitHub?**
  Cloud software acting as a hub for repositories.
- **What is the difference between Git and GitHub?**
  Git is a tool to track changes while Git is a online place to store git repositories. Git is decentralized. Github is centralized.
- **Why do developers use Git?**
  To track changes in code
- **What is a repository?**
  Folder is just container for any file. Repository is a folder that stores all files for one project.
- **What is a git repository?**
  Git repo is a repo that git tracks. `.git` folder inside the repo is the one tracking all changes made to files in the project.
- **What is the difference between a local repo and a remote repo?**
  Local repo is a git repo stored in the computer. Remote repo is a git repo stored online.

### Git Workflow

- **What does `git status` show?**
  To see which files are staged, unstaged, or untracked.

- **What does `git add` do?**
  Choose which changes we want to save.
- **What does `git commit` do?**
  Saved the staged changes as a checkpoint to the repository.

- **What does `git push` do?**
  Send the checkpoint to a remote repository like github so others can see them.

- **What is the difference between commit and push?**
  Commit saves staged changes in local repo while push sends that staged changes to Github.

### Branching

- **What is a branch?**
  Separate workspace where you can make changes and try new ideas without affecting the main project.
  
- **Why should you use branches instead of always working on `main`?**
  It allows us to work on different parts of a project without interfering with the main branch

- **What does it mean to merge a branch?**
  Combining changes from one branch into another. Bringing work together after working separately on different features.

### Merge Conflict

- **What is a merge conflict?**
  Conflict happens when Git cannot automatically merge changes.

- **Why does a merge conflict happen?**
  When two branches touch the same part of a file.

- **What should you do when there is a merge conflict?**
  We decide what the final version should be.

### `.gitignore`

- **What is `.gitignore`?**
  This tells Git which files and folders to ignore.

### Commit Messages

- **What is a conventional commit?**
  Specification for writing standarized commit messages that follow a specific format.
  
- **What are the common types**
  - `feat`: new feature
  - `fix`: bug fix
  - `docs`: documentation only
  - `style`: formatting only, no logic change
  - `refactor`: code cleanup without changing behavior
  - `test`: adding or changing tests
  - `chore`: setup, config, maintenance
  
- **Why is a clear commit message important?**
  Clear intention of changes, automate version bumping, and generate changelogs automaticlly.

## Phase 1: Console Java Foundation + IDE Mastery + Testing
Reference: https://www.geeksforgeeks.org/java/java-main-method-public-static-void-main-string-args/

### Capability 1.1: Basic Console Application
- **What is a Java console application?**
  Java application where we can input something in the command line and it outputs something in the command line.

- **What is the `main` method?**
  JVM looks specifically for a properly defined main() method to start execution.

- **Why is `public static void main(String[] args)` important?**
 - `public` - Access modifier. Ensure that the method can be accesed globally.
 - `static` - Keyword. JVM can invoke it without 
 - `void` - Return type. Return nothing.
 - `main` - name of the Java main method. This is an identifier which means the JVM will look for this method name.
 - `String[] args`: `String[]` means Array of String and `args` is the name of the array.

- **What is a command-line argument?**
  - command-line argument allows you to input something in the command-line.

- **Why should I check `args.length` before using `args[0]`?**
  If the args.length is zero, there is nothing in the input.
---

### Capability 1.2: IntelliJ Debugger
Reference: https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#setting-breakpoints

- **What is a debugging?**
 Debugging is the process of detecing and correcting errors in a program. With debugger, you can pause the execution at a specified point, and analyzing the program state.

- **What is a breakpoint?**
  marker in specific line so when the program reaches the line, the program will be paused and we can examine what is happening.

- **Why is debugging better than only using `System.out.println`?**
  Less repetitive, better integrations with IDEs, and precise.

- **What happens when I run the program in Debug mode?**
  The program runs normally until a breakpoint is hit. IntelliJ IDEA pauses the program, hightlight the breakpoint line, and shows the Debug tool window.

- **What is `Step Over`?**
  Run this line, the move to the next line


- **What is `Step Into`?**
  Go inside the method being called

- **What is `Step Out`?**
  Finish the current method and return to the place that called it

- **What is `Resume Program`?**
  Continue the program until next breakpoint

- **What variables did I inspect while debugging?**
  `args`

- **What did `args.length` show when I ran the program without an argument?**
  args.length equal to 0

- **What did `args.length` show when I ran the program with an argument**
  args.length equal to 1

- **What did `args[0]` contain when I provided a name?**
  The provided name

- **What is Evaluate Expression used for?**
  Evaluate the state of an expression. To see a code's value at a specific point.

- **What is the call stack?**
  Shows the active methods that led to the current line.

---

### Capability 1.3: JUnit Unit Testing

- **What is a unit test?**
  Type of test where **one invidual piece of code or unit** is being tested by itself. Unit test isolates one single piece of code and verify that piece is working correctly.

- **What is JUnit?**
  Java testing framework used for writing and executing unit tests for individual classes.

- **What does `@Test` mean?**
  Indicates that the class below is for testing. 

- **What is an assertion?**
    Used to validate the expected outcome of a test by comparing it with the actual result.

- **Why should I test the greeting logic automatically?**
  It helps improve code quality and reduc the effort of repeated testing.

- **What is the difference between manual testing and automated testing?**
  Verifying individual units of code without relying on automated test framework. Mainly during debugging or initial code validation.

- **Why is it better to separate greeting logic from printing logic?**
  Greeting logic can be tested separately.
  
- **How do automated tests help when I change code later?**
  Help catching the mistakes early by checking that the program still gives the expected result after changes.

- **What did I learn from writing tests for the greeting program?**
  Learn how to do unit test automatically with Junit 5 frameworl.

### Phase 1 Reflection
- **What do I feel more confident about now?**
  - Explaining public static void main(String[] args)
  - Debugging my code with IntelliJ
  - Testing my code with IntelliJ

## Phase 2: Spring Boot REST API
Reference: https://www.geeksforgeeks.org/springboot/introduction-to-spring-boot/

### Capability 2.1: Generate and Run Spring Boot Project

- **What is Enterprise application?**
  Software system developed to meet the complex needs of large organizations.
  
- **What is Spring Framework?**
  Most popular frameworks for building enterpise applications.

- **What is Spring Boot?**
  Spring framework that allows us to create spring application without any complexity in the xml configuration. It provides a production ready framework on top of Spring.
  
- **What is Spring Initializr?**
  Web tool to create and customize Spring boot projects.

- **What is Maven?**
  Software to organize and build java project in shortest period of time. It's like project manager for java application.what is pom.xml
  

- **What is `pom.xml`?**
  Main configuration file for a Maven project. Project Object Model tells everything Maven needs to know about your Java project.

- **What is Spring Web?**
  It's a module in the spring framework that allows you to build web application and REST APIs using Java. It gives Java program the ability to recieve HTTP requests and send HTTP responses back.

- **What is `@SpringBootApplication`?**
  To mark the main class of a Spring Boot application.

- **What is embedded Tomcat?**
  Allowing applications to run without external server installation. The web server (Tomcat) is included inside the Spring Boot application.

- **Why does the app run on port 8080?**
  Because spring boot default port number is 8080

- **What happens when I run `./mvnw spring-boot:run`?**
  - Maven Wrapper starts Maven
  - Reads pom.xml
  - Downloads dependencies
  - Compiles Java Code
  - Runs Spring boot plugin
  - Starts ebedded Tomcat
  - Application runs on port 8080

---

### Capability 2.2: First GET Endpoint

- **What is an API?**
A set of rules that allows one piece of software to talk to another.

- **What is a REST API?**
API that allows client and server to communicate over HTTP
  
- **What is an endpoint?**
Specific digital address (URL) where client and server communicate.

- **What is HTTP GET?**
Method to retrieve a resource.

- **What is `@RestController`?**
Annotation to tell Java that code below will be a controller. Controller is code that recieves a user's request, talks to the database, and then decides what to send back.

- **What is `@GetMapping`?**
If a client sents an HTTP `GET` requests to this exact endpoint, run the code below. Mapping basically connects point A (web request) to point B (exact code).

- **How does Spring know which method should handle `/api/hello`?**
Once spring runs, it will look to controller and see if there is mapping related to the endpoint.

- **What does HTTP 200 mean?**
It means success.

- **Why do I use Postman to test the endpoint?**
Testing REST APIs by acting as a fake client and send a request to a server.

---

### Capability 2.3: Endpoint Test

- **What is `@WebMvcTest`?**
  Annotation to write unit test specifically for REST Controllers. We can test our endpoints if they return the correct HTTP status codes (like 200 OK) and JSON data, without having to start up your entire application.t

- **What is MockMvc?**
  Built-in testing tool to send fake HTTP requests to REST Controllers and check their responses without starting a real web server.

- **Why test the endpoint automatically instead of only using Postman?**
  So we can test a lot of endpoints without having to send a lot requests in postman.
  
- **What should the test check for the GET endpoint?**
  To check if the right users gets the exact right data in the right format.

- **What is the difference between manual API testing and automated API testing?**
  In manual api testing, you have to click buttons to send requests. In Contrast, you just need a code to test other code in automated testing.

---

### Capability 2.4: Structured JSON Response

- **What is JSON?**
  Lightweight format for storing and transporting data.

- **Why do APIs usually return JSON instead of plain text?** 
  Universal compatibility, Structured, Handles Complex Data, and Lightweight.

- **What is a DTO?**
  Data Transfer Object is a design pattern to transfer data between different parts of an application. It carries information from point A to point B.


- **What is Jackson?**
  Popular, high performance library used to process JSON data.

- **What does serialization mean?**
  Serialization is where Jackson takes your Java object and convert it into a formatted JSON string when backend sends data to a client.

- **Why is structured response data better than plain text?**
  Computer require predictability to process information reliably.
  
  
---

### Capability 2.5: Query Parameter

# Learning Journal

## Phase 0: Git, Environment Setup & Project Foundation

### Git and GitHub

- **What is Git?**
  Distributed version control that track every change in our code.
- **What is GitHub?**
  Cloud software acting as a hub for repositories.
- **What is the difference between Git and GitHub?**
  Git is a tool to track changes while Git is a online place to store git repositories. Git is decentralized. Github is centralized.
- **Why do developers use Git?**
  To track changes in code
- **What is a repository?**
  Folder is just container for any file. Repository is a folder that stores all files for one project.
- **What is a git repository?**
  Git repo is a repo that git tracks. `.git` folder inside the repo is the one tracking all changes made to files in the project.
- **What is the difference between a local repo and a remote repo?**
  Local repo is a git repo stored in the computer. Remote repo is a git repo stored online.

### Git Workflow

- **What does `git status` show?**
  To see which files are staged, unstaged, or untracked.

- **What does `git add` do?**
  Choose which changes we want to save.
- **What does `git commit` do?**
  Saved the staged changes as a checkpoint to the repository.

- **What does `git push` do?**
  Send the checkpoint to a remote repository like github so others can see them.

- **What is the difference between commit and push?**
  Commit saves staged changes in local repo while push sends that staged changes to Github.

### Branching

- **What is a branch?**
  Separate workspace where you can make changes and try new ideas without affecting the main project.
  
- **Why should you use branches instead of always working on `main`?**
  It allows us to work on different parts of a project without interfering with the main branch

- **What does it mean to merge a branch?**
  Combining changes from one branch into another. Bringing work together after working separately on different features.

### Merge Conflict

- **What is a merge conflict?**
  Conflict happens when Git cannot automatically merge changes.

- **Why does a merge conflict happen?**
  When two branches touch the same part of a file.

- **What should you do when there is a merge conflict?**
  We decide what the final version should be.

### `.gitignore`

- **What is `.gitignore`?**
  This tells Git which files and folders to ignore.

### Commit Messages

- **What is a conventional commit?**
  Specification for writing standarized commit messages that follow a specific format.
  
- **What are the common types**
  - `feat`: new feature
  - `fix`: bug fix
  - `docs`: documentation only
  - `style`: formatting only, no logic change
  - `refactor`: code cleanup without changing behavior
  - `test`: adding or changing tests
  - `chore`: setup, config, maintenance
  
- **Why is a clear commit message important?**
  Clear intention of changes, automate version bumping, and generate changelogs automaticlly.

## Phase 1: Console Java Foundation + IDE Mastery + Testing
Reference: https://www.geeksforgeeks.org/java/java-main-method-public-static-void-main-string-args/

### Capability 1.1: Basic Console Application
- **What is a Java console application?**
  Java application where we can input something in the command line and it outputs something in the command line.

- **What is the `main` method?**
  JVM looks specifically for a properly defined main() method to start execution.

- **Why is `public static void main(String[] args)` important?**
 - `public` - Access modifier. Ensure that the method can be accesed globally.
 - `static` - Keyword. JVM can invoke it without 
 - `void` - Return type. Return nothing.
 - `main` - name of the Java main method. This is an identifier which means the JVM will look for this method name.
 - `String[] args`: `String[]` means Array of String and `args` is the name of the array.

- **What is a command-line argument?**
  - command-line argument allows you to input something in the command-line.

- **Why should I check `args.length` before using `args[0]`?**
  If the args.length is zero, there is nothing in the input.
---

### Capability 1.2: IntelliJ Debugger
Reference: https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#setting-breakpoints

- **What is a debugging?**
 Debugging is the process of detecing and correcting errors in a program. With debugger, you can pause the execution at a specified point, and analyzing the program state.

- **What is a breakpoint?**
  marker in specific line so when the program reaches the line, the program will be paused and we can examine what is happening.

- **Why is debugging better than only using `System.out.println`?**
  Less repetitive, better integrations with IDEs, and precise.

- **What happens when I run the program in Debug mode?**
  The program runs normally until a breakpoint is hit. IntelliJ IDEA pauses the program, hightlight the breakpoint line, and shows the Debug tool window.

- **What is `Step Over`?**
  Run this line, the move to the next line


- **What is `Step Into`?**
  Go inside the method being called

- **What is `Step Out`?**
  Finish the current method and return to the place that called it

- **What is `Resume Program`?**
  Continue the program until next breakpoint

- **What variables did I inspect while debugging?**
  `args`

- **What did `args.length` show when I ran the program without an argument?**
  args.length equal to 0

- **What did `args.length` show when I ran the program with an argument**
  args.length equal to 1

- **What did `args[0]` contain when I provided a name?**
  The provided name

- **What is Evaluate Expression used for?**
  Evaluate the state of an expression. To see a code's value at a specific point.

- **What is the call stack?**
  Shows the active methods that led to the current line.

---

### Capability 1.3: JUnit Unit Testing

- **What is a unit test?**
  Type of test where **one invidual piece of code or unit** is being tested by itself. Unit test isolates one single piece of code and verify that piece is working correctly.

- **What is JUnit?**
  Java testing framework used for writing and executing unit tests for individual classes.

- **What does `@Test` mean?**
  Indicates that the class below is for testing. 

- **What is an assertion?**
    Used to validate the expected outcome of a test by comparing it with the actual result.

- **Why should I test the greeting logic automatically?**
  It helps improve code quality and reduc the effort of repeated testing.

- **What is the difference between manual testing and automated testing?**
  Verifying individual units of code without relying on automated test framework. Mainly during debugging or initial code validation.

- **Why is it better to separate greeting logic from printing logic?**
  Greeting logic can be tested separately.
  
- **How do automated tests help when I change code later?**
  Help catching the mistakes early by checking that the program still gives the expected result after changes.

- **What did I learn from writing tests for the greeting program?**
  Learn how to do unit test automatically with Junit 5 frameworl.

### Phase 1 Reflection
- **What do I feel more confident about now?**
  - Explaining public static void main(String[] args)
  - Debugging my code with IntelliJ
  - Testing my code with IntelliJ

## Phase 2: Spring Boot REST API
Reference: https://www.geeksforgeeks.org/springboot/introduction-to-spring-boot/

### Capability 2.1: Generate and Run Spring Boot Project

- **What is Enterprise application?**
  Software system developed to meet the complex needs of large organizations.
  
- **What is Spring Framework?**
  Most popular frameworks for building enterpise applications.

- **What is Spring Boot?**
  Spring framework that allows us to create spring application without any complexity in the xml configuration. It provides a production ready framework on top of Spring.
  
- **What is Spring Initializr?**
  Web tool to create and customize Spring boot projects.

- **What is Maven?**
  Software to organize and build java project in shortest period of time. It's like project manager for java application.what is pom.xml
  

- **What is `pom.xml`?**
  Main configuration file for a Maven project. Project Object Model tells everything Maven needs to know about your Java project.

- **What is Spring Web?**
  It's a module in the spring framework that allows you to build web application and REST APIs using Java. It gives Java program the ability to recieve HTTP requests and send HTTP responses back.

- **What is `@SpringBootApplication`?**
  To mark the main class of a Spring Boot application.

- **What is embedded Tomcat?**
  Allowing applications to run without external server installation. The web server (Tomcat) is included inside the Spring Boot application.

- **Why does the app run on port 8080?**
  Because spring boot default port number is 8080

- **What happens when I run `./mvnw spring-boot:run`?**
  - Maven Wrapper starts Maven
  - Reads pom.xml
  - Downloads dependencies
  - Compiles Java Code
  - Runs Spring boot plugin
  - Starts ebedded Tomcat
  - Application runs on port 8080

---

### Capability 2.2: First GET Endpoint

- **What is an API?**
A set of rules that allows one piece of software to talk to another.

- **What is a REST API?**
API that allows client and server to communicate over HTTP
  
- **What is an endpoint?**
Specific digital address (URL) where client and server communicate.

- **What is HTTP GET?**
Method to retrieve a resource.

- **What is `@RestController`?**
Annotation to tell Java that code below will be a controller. Controller is code that recieves a user's request, talks to the database, and then decides what to send back.

- **What is `@GetMapping`?**
If a client sents an HTTP `GET` requests to this exact endpoint, run the code below. Mapping basically connects point A (web request) to point B (exact code).

- **How does Spring know which method should handle `/api/hello`?**
Once spring runs, it will look to controller and see if there is mapping related to the endpoint.

- **What does HTTP 200 mean?**
It means success.

- **Why do I use Postman to test the endpoint?**
Testing REST APIs by acting as a fake client and send a request to a server.

---

### Capability 2.3: Endpoint Test

- **What is `@WebMvcTest`?**
  Annotation to write unit test specifically for REST Controllers. We can test our endpoints if they return the correct HTTP status codes (like 200 OK) and JSON data, without having to start up your entire application.t

- **What is MockMvc?**
  Built-in testing tool to send fake HTTP requests to REST Controllers and check their responses without starting a real web server.

- **Why test the endpoint automatically instead of only using Postman?**
  So we can test a lot of endpoints without having to send a lot requests in postman.
  
- **What should the test check for the GET endpoint?**
  To check if the right users gets the exact right data in the right format.

- **What is the difference between manual API testing and automated API testing?**
  In manual api testing, you have to click buttons to send requests. In Contrast, you just need a code to test other code in automated testing.

---

### Capability 2.4: Structured JSON Response

- **What is JSON?**
  Lightweight format for storing and transporting data.

- **Why do APIs usually return JSON instead of plain text?** 
  Universal compatibility, Structured, Handles Complex Data, and Lightweight.

- **What is a DTO?**
  Data Transfer Object is a design pattern to transfer data between different parts of an application. It carries information from point A to point B.


- **What is Jackson?**
  Popular, high performance library used to process JSON data.

- **What does serialization mean?**
  Serialization is where Jackson takes your Java object and convert it into a formatted JSON string when backend sends data to a client.

- **Why is structured response data better than plain text?**
  Computer require predictability to process information reliably.
  
  
---

### Capability 2.5: Query Parameter

- **What is a query parameter?**
  A way of attaching data to a server by attaching it directly to the end of a URL

- **What does `/api/hello?name=Alex` mean?**
  It is request telling the server to run the `/api/hello` endpoint and passing it the specific data the the `name` variable is "Alex".


- **What is `@RequestParam`?**
  To extract query parameters from a URL and map it directly to Java variables.

- **Why should the parameter be optional?**
  Gives API flexibility and prevents it from throwing unnecessary errors when there is no data.

- **Why should there be a default value like `Vincent`?**
  Similiar to answer above, ensuring application stability and providing safety when data is missing.

- **What test cases should check query parameter behavior?**
  Test need to verify that the application handles all possible input scenarios correctly such as when Parameter is provided, missing parameter, and empty parameter.

## Phase 3: Adding Persistence Layer (H2)

### Capability 3.1 - Add JPA/H2 Dependencies and Configuration
  
- **What is JPA (Java Persistence API)?**
  JPA allows you to save, select, and search for information in a database using regular Java code (no need raw SQL).
  
- **What is an in-memory database (like H2), and why use it for development instead of a real database like MySQL?**
  An in-memory database stores all data in computer's main memory (RAM) instead of writing it to a physical hard drive. Because it lives in RAM, it is temporary (everytime you stop or restarts the application, the database vanishes) and also it is faster. In MySQL the database will survive and it is slower.

- **What does spring.jpa.hibernate.ddl-auto=update do?**
  Configuration in `application.properties` that tells Hibernate (my jpa translator) how it should handle the dataabse schema when the Spring boot application starts up.

- **What is the application.properties file used for?**
  Central control panel for configuring a Spring Boot application.

### Capability 3.2 - Create Entity and Repository
- **What does the @Entity annotation do in JPA?**
  It indicates that the marked class represents tables in the relation database.

- **Why do we need the @Id and @GeneratedValue annotations on our primary key?**
@Id marks field as the primary key of the entity, and @GeneratedValue defines how primary key values are automatically generated.

- **What does extending the JpaRepository interface provide for our application?**
  No need to write SQL queries for common operations.

- **How does Spring Data JPA know how to write the SQL queries for us?**
  It has query derivation with a dynamic proxy pattern to automatically write and execute SQL queries without having to implement the repository interface by ourself.
  
### Capability 3.3 - Implement Service Layer + DB-Backed GET
- **What is the purpose of a Service layer, and why don't we just call the repository directly from the controller?**

- **What is constructor injection, and why is it considered the best practice over field injection?**

- **What makes @DataJpaTest different from @WebMvcTest or @SpringBootTest?**

### Capability 3.4 - Return Multiple Records + Collections
- **What is the main performance difference between an ArrayList and a LinkedList?**

- **How does a HashMap store data, and what is an example of when to use one?**

- **What are Java Streams, and how do they make processing collections easier?**