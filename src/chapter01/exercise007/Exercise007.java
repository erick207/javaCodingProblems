package chapter01.exercise007;

public class Exercise007 {
    public static void main(String[] args) {
        String s = """
            The boy said:\\n\\t"Sit!"\\nThe dog said:\\n\\t"Bark!"
            """;
        System.out.println("BEFORE: \n" + s);
        System.out.println("AFTER: \n" + s.translateEscapes());
    }
}
