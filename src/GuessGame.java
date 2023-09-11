public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1Correct = false;
        boolean p2Correct = false;
        boolean p3Correct = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9... ");

        while(true){
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            p1Guess = p1.number;
            System.out.println("Player one guessed " + p1Guess);

            p2Guess = p2.number;
            System.out.println("Player two guessed " + p2Guess);

            p3Guess = p3.number;
            System.out.println("Player three guessed " + p3Guess);

            if(p1Guess == targetNumber) {
                p1Correct = true;
            } else if (p2Guess == targetNumber){
                p2Correct = true;
            } else if (p3Guess == targetNumber) {
                p3Correct = true;
            }

            if(p1Correct || p2Correct || p3Correct){
                System.out.println("We have winner!");
                System.out.println("Player one got it right? " + p1Correct);
                System.out.println("Player two got it right? " + p2Correct);
                System.out.println("Player three got it right? " + p3Correct);

                System.out.println("Game is over.");

                break;
            } else {
                System.out.println("Player will have to try again.");
            }
        }
    }

}
