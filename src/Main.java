public class Main {
    public static void main(String[] args) {

        int[] highs = {45,29,10,22,41,28,33};
        double[] precipitation={.95,.60,.25,.05,0,.75,.9};
        String[] weekDays={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        for (int i = 0; i < highs.length; i++) {
            if(highs[i]<= 32 && precipitation[i]>= .5 ){
                System.out.println(weekDays[i]+" are the days it's going to snow.");
            }
        }

        // use the decimal verson of the percentages
    }
}