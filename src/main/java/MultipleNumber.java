public class MultipleNumber {

    public String MultipleNumber(int enterNumber){


        if( enterNumber % 3==0 && enterNumber % 5 ==0){
            return "Good number";
        } else{
            if( enterNumber % 3==0 ) {
                return "Bad number";
            }else{
                if( enterNumber % 5==0 ) {
                    return "Poor number";
                }else{
                    return "-1";
                }
            }
        }
    }
}
