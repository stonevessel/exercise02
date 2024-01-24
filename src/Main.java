public class Main {
    public static void main(String[] args) {

        int[] highs = {45,29,10,22,41,28,33};
        double[] precipitation={.95,.60,.25,.05,0,.75,.9};
        String[] weekDays={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

        for (int i = 0; i < highs.length; i++) {
            if(highs[i]<= 32 && precipitation[i]>= .5 ){
                System.out.println("For "+ weekDays[i]+" the high is " +  highs[i]+" and the precipitation is " + precipitation[i]*100+"% its mostly going to snow yeah!!");
            }
        }

        // use the decimal verson of the percentages
    }
}