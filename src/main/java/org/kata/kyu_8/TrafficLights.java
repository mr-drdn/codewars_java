package org.kata.kyu_8;

import java.util.Map;
import java.util.Objects;

public class TrafficLights {
    public static String updateLight(String current) {
    /*    Map<String, String> x = Map.of(
                "green", "yellow",
                "yellow", "red",
                "red", "green"
        );
        return current;
    }*/


        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");

        /*switch (current) {
            case "red": return "green";
            case "yellow": return "red";
            case "green": return "yellow";
            default: throw new IllegalArgumentException();
        }*/

//        if (current.equals("green")) {
//            return "yellow";
//        } else if (current.equals("yellow")) {
//            return "red";
//        } else if (current.equals("red")) {
//            return "green";
//        }
//        return current;
    }

        public static void main (String[]args){
            System.out.println(updateLight("red"));
            System.out.println(updateLight("yellow"));
            System.out.println(updateLight("green"));
        }
    }
