public class DizininHarmonikOrtalamas─▒ {
    public static void main(String[] args) {
        double [] list = {2,4,5,454,7,87,863,543,};
        double avarage;
        double sum = 0 ;
        System.out.println("Say─▒lar: ");

        for (int i = 0;i< list.length;i++){
            list[i] = 1 / list [i];

            System.out.println(list[i]);
            sum += list[i];

        }
        System.out.println("===========");
        avarage = list.length / sum;
        System.out.println(avarage);
    }
}
