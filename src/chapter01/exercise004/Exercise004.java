package chapter01.exercise004;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise004 {
    public static void main(String[] args) {
        var s = """
                I would want to establish strength; root-like,
                anchored in the hopes of solidity.
                Forsake the contamination of instability.
                Prove I'm the poet of each line of prose.
""".indent(4);

        
        var lwsPerLine = new ArrayList<Integer>();
        for(String x: s.split("\n")) {
            var lws = 0;
            //System.out.println(x);
            for(int i = 0; i < x.length(); i++){
                if(Character.isWhitespace(x.charAt(i))) {
                    ++lws;
                }
            }
            lwsPerLine.add(lws);
        }
        System.out.println("first identify lws per line: " + lwsPerLine);
        System.out.println("the minimun lws count is the incidental lws: " + Collections.min(lwsPerLine));
        System.out.println("it will be erased by the compile in each line");
    }
}
