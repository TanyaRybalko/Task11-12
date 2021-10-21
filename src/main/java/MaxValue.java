public class MaxValue {




    public int Max (int first, int second ) {

        int max =0;

        if (first>second){
            max=first;
        } else{
            if (second>first){
                max = second;
            }else{
                if( first == second){
                    System.out.println("Valui is equils");
                }
            }
        }

        return max;
    }



}
