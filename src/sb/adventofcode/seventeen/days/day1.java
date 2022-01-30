package sb.adventofcode.seventeen.days;

public class day1 {
    public int GetSolution(String input){
        int[] ints = ParseInput(input);
        return 0;
    }

    private int[] ParseInput(String input) {
        var chars = input.split("");
        int[] res = new int[chars.length];
        for (int i = 0; i < chars.length; i++){
            res[i] = Integer.parseInt(chars[i]);
        }
        return res;
    }
    
}
