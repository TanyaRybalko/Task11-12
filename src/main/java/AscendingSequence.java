public class AscendingSequence {

    public int[] AscendingSequence(int startNumber, int endNumber, int step) {
//Написать алгоритм AscendingSequence, который строит возрастающую последовательность чисел от a до b с шагом n.



        if (startNumber >= endNumber || step < 0) {
           return new int[]{-1};
        }
        int[] arr =new int[((endNumber-startNumber)/step)+1];
        int element = startNumber;

        for (int i = 0; i <= arr.length; i ++) {
           arr[i] = element;
           element+=step;


        }
        return arr;
    }

}
