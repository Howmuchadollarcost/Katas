class Century{
    public static void main(String[] args) {
        System.out.println(centuryFromYear(1705));
        System.out.println(centuryFromYear(1900));
        System.out.println(centuryFromYear(1601));
        System.out.println(centuryFromYear(2000));
    }

    public static int centuryFromYear(int year){
        
        return (year % 100) > 0 ? (year/100) + 1 : (year/100);
        //alternative
        // int cent = year / 100;    //first two numbers
        // int decade = year % 100; // Second two numbers

        // if(decade > 0){
        //     return cent + 1;
        // }else{
        //     return cent;
        // }
    } 
}