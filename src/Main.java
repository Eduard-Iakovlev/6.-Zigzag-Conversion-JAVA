public class Main {
    public static void main(String[] args) {
        int example = 0;
        int numRows;
        String s, expected;

        OutputSolution outputSolution = new OutputSolution();

        example++;
        numRows = 3;
        s = "PAYPALISHIRING";
        expected = "PAHNAPLSIIGYIR";
        outputSolution.setOutput(example, numRows, s, expected);
        outputSolution.print();

        example++;
        numRows = 4;
        s = "PAYPALISHIRING";
        expected = "PINALSIGYAHRPI";
        outputSolution.setOutput(example, numRows, s, expected);
        outputSolution.print();
    }
}