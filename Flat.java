
public class Flat {
    public int[] makeFat(String test) {

        String num = test.replaceAll("[^0-9]+", " ");
        int[]digits = num.chars().map(c -> c-='0').toArray();
        return digits;
    }
}
