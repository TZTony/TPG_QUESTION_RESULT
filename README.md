# TPG_QUESTION_RESULT

Test Result from Tony Tian, please load as Maven project

The code requires JDK 1.8 and cglib-nodep-3.2.5.jar (defined in pom.xml) is in build path to run.

Question 1:
The IP List file is in the class root path called iplist.txt. Running the main method in IPValidationRegex class will generate a list of valid IP address from the file.

Question 2:
Running the main method in StudentSort class will generate a sorted list of Student object. The solution can be done by two ways, by implements the Comparable interface in Student class is an easy way, directly call List.sort() method will generate a sorted list (Using LinkedList have a better performance compare with ArrayList). However, using a static Comparator can have more options, different Comparator can use different sorting orders, so I choose using this solution.

Question 3：
My first though is using JDK proxy to implement an AOP for timing framework. However, it will require the running object have implemented an interface and it is not compatible with most of the classes. Instead of using JDK proxy, using OGLIB lib can wildly improve the compatibility (except final classes); So in this case, an OGLIB jar dependency is required to add into build path.
Running the main method in MethodRunningTimeTest class to test the Timing Framework.
