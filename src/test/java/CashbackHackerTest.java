import static org.testng.Assert.*;

public class CashbackHackerTest {
    @org.testng.annotations.Test
    public void remain() {
        CashbackHacker service = new CashbackHacker();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;


        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void calculateOneThousand(){
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected =0;

        assertEquals(actual, expected);
    }

}