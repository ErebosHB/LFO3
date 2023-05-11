public class BubbleSort implements ISortierAlgorithmus {
    @Override
    public void sortiereAbsteigend(double[] liste) {
        int n = liste.length;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (liste[j - 1] < liste[j]) {
                    temp = liste[j - 1];
                    liste[j - 1] = liste[j];
                    liste[j] = temp;
                }
            }
        }
        for(double value:liste)
            System.out.println(value);

    }


    @Override
    public void sortiereAufsteigend(double[] liste) {
        int n = liste.length;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (liste[j - 1] > liste[j]) {
                    temp = liste[j - 1];
                    liste[j - 1] = liste[j];
                    liste[j] = temp;
                }
            }
        }
        for(double value:liste)
            System.out.println(value);
    }

}

