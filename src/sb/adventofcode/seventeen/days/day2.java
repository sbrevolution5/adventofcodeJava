package sb.adventofcode.seventeen.days;

public class day2 {
    public int GetChecksum(String input){
        int[][] spreadsheet = ParseInput(input);
        int sum = 0;
        for (int i = 0; i < 16; i++) {
            sum+= getChecksum(spreadsheet[i]);
        }
        return sum;
    }

    private int getChecksum(int[] ints) {
        var high = Integer.MIN_VALUE;
        var low = Integer.MAX_VALUE;
        for (int anInt : ints) {
            if (anInt > high) {
                high = anInt;
            }
            if (anInt < low) {
                low = anInt;
            }
        }
        return high-low;
    }

    private int[][] ParseInput(String input) {
        var rows = input.split("\n");
        int[][] res = new int[16][16];
        for (int i = 0; i < rows.length; i++) {
            var row = rows[i];
            var rowSplit = row.split("\t");
            for (int j = 0; j < rows.length; j++) {
                res[i][j] = Integer.parseInt(rowSplit[j]);
            }
        }
        return res;
    }
}
