package com.orbyun.teststring1;

public class TestString {


    public static void main(String[] args) {
        String test = "24ab_2t2";
        String encode = TestString.encode(test);
        System.out.println(encode);
    }


    public static String encode(String str) {
        StringBuffer buffer = new StringBuffer();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != 0) {
                buffer.append("_");
                if (chars[i] > 48 && chars[i] <= 57) {
                    if (i < chars.length - 1) {
                        for (int j = 0; j < Integer.parseInt(String.valueOf(chars[i])); j++) {
                            buffer.append(chars[i + 1]);

                        }
                    } else {
                        buffer.append(chars[i]);
                    }
                } else {
                    if (chars[i] == 95) {
                        buffer.append("/UL");
                    } else {
                        buffer.append(chars[i]);
                    }
                }
            }


        }
        return buffer.toString();
    }

}
