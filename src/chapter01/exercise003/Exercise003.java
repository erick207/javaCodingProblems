package chapter01.exercise003;

public class Exercise003 {
    public static void main(String[] args) {
        var s1 = """
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
""".indent(6);
        System.out.println(s1);
}
}