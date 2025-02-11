package chapter01.exercise010;

public class Exercise010 {
    public static void main(String[] args) {
        String user = "Erick207";
        String tbBio = """
            This repo belongs to: %s""".formatted(user);

        String sBio = "This repo belongs to: Erick207";

        System.out.println(tbBio.equals(sBio)? "Same" : "Different");
    }
}
