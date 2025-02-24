public class OutputSolution {
    private int example, numRows;
    private String s, expected, actual;

    public OutputSolution() {};
    public void setOutput(int example, int numRows, String s, String expected) {
        this.example = example;
        this.numRows = numRows;
        this.s = s;
        this.expected = expected;
    }
    private void run() {
        actual = Solution.convert(s, numRows);
    }

    public void print() {
        System.out.println("============ Тест " + example + " =============");
        System.out.println(" Входная строка: " + s);
        System.out.println(" Количество строк: " + numRows);
        System.out.println(" Ожидаемая строка: " + expected);
        run();
        System.out.println(" Результат: " + actual);
        System.out.println("============ Проверка ==========================");
        if ((CheckSolution.check(expected, actual))) {
            System.out.println(" Тест пройден");
        } else {
            System.out.println(" Тест не пройден");
        }
        System.out.println("============================================\n");
    }
}
