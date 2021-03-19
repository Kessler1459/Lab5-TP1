package pack;

import java.util.Random;

public class BeberEspartanoImpl implements Beber{
    @Override
    public Integer beber() {
        return new Random().nextInt(10);
    }
}