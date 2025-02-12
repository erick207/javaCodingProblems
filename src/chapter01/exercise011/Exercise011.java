package chapter01.exercise011;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise011 {
    public static void main(String[] args) {
        String nameAndAddress = "Mark Janson;243 West Main St;Louisville;40202;USA";
        
        Pattern p = Pattern.compile("""
            (?<name>[ a-zA-Z]+);\
            (?<address>[ 0-9a-zA-Z]+);\
            (?<city>[ a-zA-Z]+);\
            (?<zip>[\\d]+);\
            (?<country>[ a-zA-Z]+)$""");
    
        Matcher m = p.matcher(nameAndAddress);

        if(m.matches()) {
            System.out.println("Name: " + m.group("name"));
            System.out.println("Address: " + m.group("address"));
            System.out.println("City: " + m.group("city"));
            System.out.println("Zip: " + m.group("zip"));
            System.out.println("Country: " + m.group("country"));
        }else{
            System.out.println("No match found");
        }
    }
}
