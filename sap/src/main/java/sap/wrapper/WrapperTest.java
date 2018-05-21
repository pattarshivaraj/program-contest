package sap.wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 10;
        Integer iRef = new Integer(i);
        System.out.println(" i : " + i);
        System.out.println("iRef " + iRef);

        i++;
        System.out.println(" i : " + i);
        System.out.println("iRef " + iRef);

        int k = iRef.intValue();
        System.out.println(" k : " + k);
        System.out.println("iRef " + iRef);

        k++;
        System.out.println(" k : " + k);
        System.out.println("iRef " + iRef);

    }
}
