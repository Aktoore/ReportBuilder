public class App {
    public static void main(String[] args) {
        Report report1 = new Report.Builder()
                .setTitle("Clean code Report")
                .setAuthor("Aktore Sagyn")
                .setDate("2025-09-14")
                .setContent("This report about Builder pattern")
                .setSignature(true)
                .build();

        Report report2 = new Report.Builder().build();

        System.out.println(report1);
        System.out.println(report2);
    }
}
