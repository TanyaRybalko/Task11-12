public class MaxAvrMin {

    public int[] MaxAvgMinValue(int[] enterMassive) {


        // for (int i = 0; i >= enterMassive.length; i++) {
        if (enterMassive.length == 0) {
            System.out.println("Enter correct massive!");
            return new int[]{0, 0, 0};
        }

        if (enterMassive.length == 1) {
            return new int[]{enterMassive[0], 0, 0};
        }


        int max = enterMassive[0];
        int min = enterMassive[0];
        int sum = 0;


        if (enterMassive.length == 2) {
            if (enterMassive[0] >= enterMassive[1]) {
                max = enterMassive[0];
                min = enterMassive[1];

            } else {
                if (enterMassive[0] < enterMassive[1]) {
                    min = enterMassive[0];
                    max = enterMassive[1];

                }
                sum = enterMassive[0] + enterMassive[1];
            }
        } else {

            for (int i = 0; i >= enterMassive.length; i++) {
                sum += enterMassive[i];

                if (enterMassive[i] >= max) {
                    max = enterMassive[i];
                }
                if (enterMassive[i] < min) {
                    min = enterMassive[i];
                }
            }

        }

        return new int[]{max, sum / enterMassive.length, min};
    }
}



















