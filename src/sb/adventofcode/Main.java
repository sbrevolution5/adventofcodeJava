package sb.adventofcode;

import sb.adventofcode.seventeen.Inputs;
import sb.adventofcode.seventeen.days.*;

public class Main {

    public static void main(String[] args) {
	    var d1 = new day1();
        System.out.println(d1.GetSolution(Inputs.Day1));
        System.out.println(d1.GetPart2(Inputs.Day1));
        var d2 = new day2();
        System.out.println(d2.GetChecksum(Inputs.Day2));
        try{

            //System.out.println(d2.GetDivsum("5\t9\t2\t8\n" +
              //      "9\t4\t7\t3\n" +
                //    "3\t8\t6\t5"));
            System.out.println(d2.GetDivsum(Inputs.Day2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
