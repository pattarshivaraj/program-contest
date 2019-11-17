package sap.stringoperation;

public class ReplaceTest {
    public static void main(String[] args) {
        String s = "Open in \\\"Explore Individual Customers\\\"";
        System.out.println(s);
        if(s.contains("\\\"")){
            System.out.println("contains");
            s = s.replace("\\\"", "\"");
        }
       // s = s.replaceAll("\\\"", "\"");
        System.out.println(s);
    }
}
