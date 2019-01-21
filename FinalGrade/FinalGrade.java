class FinalGrade {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println(finalGrade(100, 12));
        System.out.println(finalGrade(99, 0));
        System.out.println(finalGrade(10, 15));
        System.out.println(finalGrade(85, 5));
        System.out.println(finalGrade(55, 3));
        System.out.println(finalGrade(55, 0));
        System.out.println(finalGrade(20, 2));

        long endTime = System.nanoTime();

        long totalTime = endTime - startTime;
        System.out.println("Time: " + totalTime);       

    }

    public static int finalGrade(int grade, int projects) {
        if (grade > 90 || projects > 10) {
            return 100;
        }if (grade > 75 && projects >= 5) {
            return 90;
        }if (grade > 50 && projects >= 2) {
            return 75;
        } else {
            return 0;
        }
    }

}




 

 