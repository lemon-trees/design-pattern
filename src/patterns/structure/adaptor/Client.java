package patterns.structure.adaptor;

/**
 * 适配器模式
 */
public class Client
{
    public static void main(String[] args)
    {
        Computer computer = new LenovoComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        
        TFCard tfCard = new TFCardImpl();
        SDCard sdCard1 = new SDAdaptorTF(tfCard);
        System.out.println(computer.readSD(sdCard1));
    }
}
