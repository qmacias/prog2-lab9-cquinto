package university.jala.structural.adapter;

/**
 * @author Cristian Quinto
 */
public final class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }

}
