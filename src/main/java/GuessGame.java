public class GuessGame {
        double score;

    public void play(int max) {
        int compNumber = genarateRandom(max);
        int yourNumber = 0;
        int counter = 1;


        while (compNumber!=yourNumber){
            JoptionPlane j = new JoptionPlane();
            yourNumber = j.showInputDialog();
            if(yourNumber>compNumber){
                System.out.println("Your number is bigger, than computer number. Please, try again!");
            }else if(yourNumber<compNumber){
                System.out.println("Your number is less, than computer number. Please, try again!");
            }else {
                 score = printBestScore(counter, max);
            }
            counter ++;
    }


    }

    private int genarateRandom(int max) {
        return 0 + (int) (Math.random() * max+1);
    }



    public double printBestScore(int counter, int max) {
        double myscore = max/counter;
        System.out.println("Local score is: " + myscore);
        return myscore;
    }
}
