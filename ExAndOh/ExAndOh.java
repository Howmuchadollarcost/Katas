class ExAndOh{
    public static void main(String[] args) {

        System.out.println(XO("ooxx"));
        System.out.println(XO("xooxx"));
        System.out.println(XO("ooxXm"));
        System.out.println(XO("zpzpzpp"));
        System.out.println(XO("zzoo"));

        // XO("ooxx") => true
        // XO("xooxx") => false
        // XO("ooxXm") => true
        // XO("zpzpzpp") => true
        // XO("zzoo") => false
        
    }

    public static Boolean XO(String str){
        int xCounter = 0;
        int oCounter = 0;
        int randomCounter = 0;

        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = Character.toLowerCase(strArr[i]);
            if(strArr[i] == 'x'){
                xCounter++;
            }
            else if(strArr[i] == 'o'){
                oCounter++;
            }else{
                randomCounter++;
            }            
        }
        return xCounter == oCounter;


        // if(xCounter - oCounter == 0){
        //     return true;
        // }else{
        //     return false;
        // }

        //return xCounter - oCounter == 0 ? true : false;
    }
}