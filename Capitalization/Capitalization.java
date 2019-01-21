public class Capitalization {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String str = "";
        for (int index = 0; index < s.length(); index++) {
            int totalCount = index + 1;
            for (int j = 0; j < totalCount ; j++) {
                if (j == 0) {
                    str += Character.toString(s.charAt(index)).toUpperCase();
                } else {
                    str += Character.toString(s.charAt(index)).toLowerCase();
                }
            }
            if (index != s.length() - 1) {
                str += "-";
            }

        }
        return str;
    }
}

// accum("abcd"); //"A-Bb-Cc-Dddd"