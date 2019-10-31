package patterns.structure.adaptor;

public class SDCardImpl implements SDCard
{
    @Override
    public String readSD()
    {
        return "read from sdCard";
    }
    
    @Override
    public int writeSD(String msg)
    {
        System.out.println("write into sd card" + msg);
        return 1;
    }
}
