import java.util.Random;

public class HelloWorld{
    
     public static void main(String []args){
        Random r = new Random();
		
		String[] students = {"Richard Kwan","Brandon Nguyen", "Shawn Patel", "Byron James",
		"Anthonny Hernandez"};
		
		int index = r.nextInt(students.length);
		System.out.println(index);
		System.out.println(students[index]);

     }
}
