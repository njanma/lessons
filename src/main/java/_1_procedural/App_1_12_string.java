package _1_procedural;

public class App_1_12_string {

    public static void main(String[] args) {
//        System.out.println(invert("Hello"));
        System.out.println("hello" != new String("hello"));
        System.out.println("hello".equals(new String("hello")));
        System.out.println("hello" == "hello");

        "hello".equals("other");
        "hello".equalsIgnoreCase("Hello");//true
        int diff    = "c".compareTo          ("A"); //34
        int diffI   = "c".compareToIgnoreCase("A"); //2
        int idx     = "abcbc".indexOf("bc");        //1
        int lastIdx = "abcbc".lastIndexOf("bc");    //3

        char    ch       = "abc".charAt(1);      //b
        boolean contains = "abcd".contains("b"); //true

        String abcd = "abc".concat("d");
        String gbcd = "abcd".replace     ("a", "g");
        String ascb = "abcb".replaceFirst("b", "s");
        String ascs = "abcb".replaceAll  ("b", "s");
        String ABC  = "aBc".toUpperCase();
        String abc  = "AbC".toLowerCase();
        String ref  = "abc".intern(); //add to pool if not exist

        String[] letters       = "a b c".split(" ");
        String[] lettersRegex  = "a   b c".split("\\s+");
        boolean  nonMatches    = " abc".matches("^abc$");  //false
        String   trimmedWord   = " book   ".trim();        // "book"
        char[]   alphabetChars = "alphabet".toCharArray();
        int      strLenght     = "abc".length();           //3

        StringBuilder sb = new StringBuilder();
        String abcFromBuilder = sb.append("a")
                .append("b")
                .append("c")
                .toString();
        StringBuffer buffer = new StringBuffer(); //thread-safe
        String abcFromBuffer = buffer.append("a")
                .append("b")
                .append("c").toString();
    }

    //immutable invert
    public static String invert(String args) {
        char[] chars = args.toCharArray();
        for (int k = 0; k < chars.length / 2; k++) {
            char tmp = chars[k];
            chars[k] = chars[chars.length - k - 1];
            chars[chars.length - k - 1] = tmp;
        }
        return new String(chars);
    }
}
