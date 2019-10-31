package patterns.structure.adaptor;

public class TFCardImpl implements TFCard
{
    @Override
    public String readTF()
    {
        return "read from tf card";
    }
    
    @Override
    public int writeTF(String msg)
    {
        System.out.println("write into tf card" + msg);
        return 1;
    }
}
