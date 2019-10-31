package patterns.structure.adaptor;

/**
 * TF卡适配器
 */
public class SDAdaptorTF implements SDCard
{
    private TFCard tfCard;
    
    public SDAdaptorTF(TFCard tfCard)
    {
        this.tfCard = tfCard;
    }
    
    @Override
    public String readSD()
    {
        System.out.println("SDAdaptorTF read tf card");
        return tfCard.readTF();
    }
    
    @Override
    public int writeSD(String msg)
    {
        System.out.println("SDAdaptorTF write into TF card" + msg);
        return tfCard.writeTF(msg);
    }
}
