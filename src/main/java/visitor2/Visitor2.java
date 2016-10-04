package visitor2;

public class Visitor2 extends Visitor {
    
    private int aTotal;
    
    private int bTotal;

    public Visitor2() {
        super();
        aTotal = 0;
        bTotal = 0;
    }

    @Override
    public void visitElementA(ElementA e) {
        aTotal++;
    }

    @Override
    public void visitElementB(ElementB e) {
        bTotal++;
    }
    
    public int getAs() {
        return aTotal;
    }
    
    public int getBs() {
        return bTotal;
    }

}
