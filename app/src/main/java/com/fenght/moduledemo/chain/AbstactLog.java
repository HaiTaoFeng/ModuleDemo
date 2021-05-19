package com.fenght.moduledemo.chain;

public abstract class AbstactLog {
    static int level1 = 1;
    static int level2 = 2;
    static int level3 = 3;
    protected AbstactLog nextAbstactLog;
    protected int level;

    public void setAbstactLog(AbstactLog nextAbstactLog) {
        this.nextAbstactLog = nextAbstactLog;
    }

    public void logMessage(int level,String message){
        if (this.level < level) {
            write(message);
        }
        if (nextAbstactLog != null) {
            nextAbstactLog.logMessage(level,message);
        }
    }

    abstract protected void write(String msg);
}
