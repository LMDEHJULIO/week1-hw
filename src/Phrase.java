public class Phrase {
    public static void main(String[] args) {
        String[] wordList1 = {"Lisp", "Cobal", "Fortran"};

        String[] wordList2 = {"C", "Java", "Haskell"};

        String[] wordList3 = {"JavaScript", "Ruby", "Python"};

        int length1 = wordList1.length;
        int length2 = wordList2.length;
        int length3 = wordList3.length;

        int rand1, rand2, rand3;

        rand1 = (int) (Math.random() * length1);
        rand2 = (int) (Math.random() * length2);
        rand3= (int) (Math.random() * length3);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

        System.out.println("You should learn " + phrase);
    }
}
