public class EqualsOrNot {


    public int CompareNumbers(int first, int second){

        if (first == second){
            return 0;
        }else{
            if(first>second){
                return 1;
            }else{
                return -1;
            }
        }
    }
}
