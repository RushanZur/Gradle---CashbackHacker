import org.junit.Assert;

public class CashbackHackerTest {
    @org.junit.Test
    public void remain() {
        CashbackHacker service = new CashbackHacker();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;


        Assert.assertEquals(expected, actual);

    }
    @org.junit.Test
    public void calculateOneThousand(){
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected =0;

        Assert.assertEquals(expected, actual);
    }

}