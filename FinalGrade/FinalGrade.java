class FinalGrade {
    public static void main(String[] args) {

        System.out.println(finalGrade(100, 12)); 
        System.out.println(finalGrade(99, 0)); 
        System.out.println(finalGrade(10, 15)); 

        System.out.println(finalGrade(85, 5)); 

        System.out.println(finalGrade(55, 3)); 

        System.out.println(finalGrade(55, 0));
        System.out.println(finalGrade(20, 2)); 

    }

    public static int finalGrade(int grade, int projects) {
        int full;
        if (grade > 90 || projects > 10) {
            full = 100;
        } else if (grade > 75 && projects >= 5) {
            full = 90;
        } else if (grade > 50 && projects >= 2) {
            full = 75;
        } else {
            full = 0;
        }
        return full;
    }

}