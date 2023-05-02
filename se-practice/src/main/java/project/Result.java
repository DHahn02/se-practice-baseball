package project;

public enum Result {
    S, D, T, HR, BB, K, HBP, E;

    private int obp;
    private int ops;
    private int slg;

    static {
        S.ops = 2000;
        D.ops = 3000;
        T.ops = 4000;
        HR.ops = 5000;
        BB.ops = -1;
        K.ops = 0;
        HBP.ops = -1;
        E.ops = -1;
    }

    static {
        S.obp = 1000;
        D.obp = 1000;
        T.obp = 1000;
        HR.obp = 1000;
        BB.obp = 1000;
        K.obp = 0;
        HBP.obp = 1000;
        E.obp = -1;
    }

    static {
        S.slg = 1000;
        D.slg = 2000;
        T.slg = 3000;
        HR.slg = 4000;
        BB.slg = -1;
        K.slg = 0;
        HBP.slg = -1;
        E.slg = -1;
    }

    public int getObp(Result r) {
        return r.obp;
    }

    public int getOps(Result r){
        return r.ops;
    }

    public int getSlg(Result r){
        return r.slg;
    }
}
