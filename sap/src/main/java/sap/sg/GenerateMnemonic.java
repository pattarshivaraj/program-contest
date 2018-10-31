package sap.sg;

import java.util.ArrayList;
import java.util.List;

public class GenerateMnemonic {

    private static List<String> mnemonics = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("shivaraj");
        list.add("shivaraj-pattar");
        list.add("shivaraj-hsr");
        list.add("shivaraj-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.add("shiva-blr");
        list.forEach(ele -> {
                    System.out.println(getMnemonic(ele));
                }
        );
    }

    private static String getMnemonic(String eventName) {
        int i = 1;
        int j = 0;
        char c1 = 'A';
        char c2 = 'A';
        String s = "" + eventName.charAt(j) + eventName.charAt(i);
        int len = eventName.length();
        while (mnemonics.contains(s)) {
            i++;
            if (i < len && j < i) {
                if ('-' == eventName.charAt(i)) {
                    i++;
                } else {
                    s = "" + eventName.charAt(j) + eventName.charAt(i);
                }
            } else if (j < len) {
                if ('-' == eventName.charAt(j)) {
                    j++;
                } else {
                    i = 0;
                    s = "" + eventName.charAt(j++) + eventName.charAt(i);
                }
                j++;
            } else {
                if (c1 > 'Z') {
                    c1 = 'A';
                    c2++;
                }
                s = "" + c2 + c1++;
            }
        }
        mnemonics.add(s);
        return s;
    }
}
