package Printer;

public class TestPrinter {
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>("Never Give Up");
        printer.print();
    }
}
