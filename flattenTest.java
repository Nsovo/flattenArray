import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class flattenTest {

    @Test
    public void makeFlat(){
        Flat flat = new Flat();
        int[] arrayNumbers =  {1,2,3,4};
        String numbers = "{{1,2,{3}},4}";
        assertEquals(flat.makeFat(numbers).equals(arrayNumbers),arrayNumbers.equals(flat.makeFat(numbers)));
    }
}
