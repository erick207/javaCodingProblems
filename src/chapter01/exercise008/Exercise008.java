package chapter01.exercise008;

public class Exercise008 {
    public static void main(String[] args) {
        int num = 207;
        String name = "Erick";
        float pi = 3.141f;

        String s1 = """
            This repo belongs to: %s%d
            The value of pi is aprox.: %f
            """.formatted(name, num, pi); // newest, JDK 15

        String s2 = String.format("""
            This repo belongs to: %s%d
            The value of pi is aprox.: %f
            """, name, num, pi);


        System.out.println(s1.equals(s2)? "Same" : "Different");
    }
}
