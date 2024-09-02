public class Concat {
    public static void concatwithString() {
        String t = "java";
        for (int i = 0; i < 1000; i++) {
            t = t + "language";
        }
    }

    public static void concatwithStringBuffer() {
        StringBuffer sb = new StringBuffer("java");
        for (int i = 0; i < 1000; i++) {
            sb.append("language");
        }
    }

    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        concatwithString();
        System.out.println("The Time taken by String class is " + (System.currentTimeMillis() - starttime) + " ms");
        starttime = System.currentTimeMillis();
        concatwithStringBuffer();
        System.out
                .println("The Time taken by StringBuffer class is " + (System.currentTimeMillis() - starttime) + " ms");

    }

}
