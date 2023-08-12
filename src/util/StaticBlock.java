package util;

public class StaticBlock {
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses class StaticBlock");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
