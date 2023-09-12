public class BeerSong {
    public static void main(String[] args) {
        for(int beerNum = 99; beerNum >= 0; beerNum--){
            if(beerNum == 0) { zeroPrint(); } else {beerPrint(beerNum);}
        }
    }
    private static void beerPrint(int beerNum){
        String word = beerNum > 1 ? "bottles" : "bottle";
        System.out.printf("%d %s of beer on the wall. \n %d %s of beer. \n Take one down. \n Pass it around. \n", beerNum, word, beerNum, word);
    }

    private static void zeroPrint(){
        System.out.println("No more bottles of beer on the wall");
    }

}
