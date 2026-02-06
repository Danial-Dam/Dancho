
public class MainISP {
    public static void main(String[] args) {

        Printable basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print("Document");
        printer.scan("Document");
        printer.fax("Document");
    }
}
