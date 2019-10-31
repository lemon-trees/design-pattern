package patterns.structure.adaptor;

public class LenovoComputer implements Computer
{
    @Override
    public String readSD(SDCard sdCard)
    {
        if(null == sdCard)
        {
            System.out.println("请插入sd卡");
            return null;
        }
        return sdCard.readSD();
    }
}
