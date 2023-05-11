public class InsertionSort implements ISortierAlgorithmus {
    @Override
    public void sortiereAbsteigend(double[] liste) {
        double temp;
        for (int i = 1; i < liste.length; i++) {
            temp = liste[i];
            int j = i;
            while (j > 0 && liste[j - 1] < temp) {
                liste[j] = liste[j - 1];
                j--;
            }
            liste[j] = temp;
        }

        for(double value:liste)
            System.out.println(value);
    }


    @Override
    public void sortiereAufsteigend(double[] liste) {
        double temp;
        for (int i = 1; i < liste.length; i++) {
            temp = liste[i];
            int j = i;
            while (j > 0 && liste[j - 1] > temp) {
                liste[j] = liste[j - 1];
                j--;
            }
            liste[j] = temp;
        }

        for(double value:liste)
            System.out.println(value);


    }
}
