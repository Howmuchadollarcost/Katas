public class Capitalization {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    str += Character.toString(s.charAt(i)).toUpperCase();
                } else {
                    str += Character.toString(s.charAt(i)).toLowerCase();
                }
            }
            if (i != s.length() - 1) {
                str += "-";
            }

        }
        return str;
    }
}

// accum("abcd"); //"A-Bb-Cc-Dddd"