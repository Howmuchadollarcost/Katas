public class BinaryAdd {
    public static void main(String[] args) {
        System.out.println(toBin(addNumbers(6, 1)));
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static String toBin(int sum) {
        String binNum = "";
        while (sum > 0) {
            if (sum % 2 == 0) {
                binNum = "0" + binNum;
            } else {
                binNum = "1" + binNum;
            }
            sum = sum / 2;
        }
        return binNum;
    }

}