import java.text.MessageFormat;

public class BeerSong {
    public static void main(String[] args) {
        for(int beerNum = 99; beerNum > 0; beerNum--){
            String word = beerNum > 1 ? "bottles" : "bottle";

            String endString = beerNum > 1 ? beerNum - 1 + " bottles of beer on the wall." : "No more bottles of beer on the wall.";

            System.out.println(MessageFormat.format("{0} {1} of beer on the wall.\n {0} {1}  of beer \n Take one down. \n Pass it around \n {2}", beerNum, word, endString));
        }
    }
}
