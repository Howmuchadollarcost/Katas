public class JadenCasing{
    public static void main(String[] args) {
        String str = "How can mirrors be real if our eye aren't real";
        System.out.println(toUpper(str));
    }

    public static String toUpper(String str){
        String[] words = str.split("\\s+");
        int len = words.length;
        String newStr = "";

        for (int i = 0; i < len; i++) {
            for(int j = 0; j < words[i].length(); j++){
                if(j == 0){
                    newStr += Character.toString(words[i].charAt(j)).toUpperCase();
                }else{
                    newStr += Character.toString(words[i].charAt(j)).toLowerCase();
                }
            }
            newStr +=" ";
        }
        return newStr;
    }
}