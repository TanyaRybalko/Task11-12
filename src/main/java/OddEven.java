public class OddEven {

    public String oddEven (long number){

        //Создать алгоритм OddEven, который примет на вход число, вернет “Odd”,  если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

        String result;

        if(number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE ){
            result = number % 2 == 0 ? "Even" : "Odd";
        }else{
            result = "Undefined";
        }
        return result;
    }


    public static void main(String[] args) {
        OddEven d = new OddEven();
        long num = (long)2147483647 + 1;
        System.out.println(d.oddEven(num) + "Check test for print");
    }



}
