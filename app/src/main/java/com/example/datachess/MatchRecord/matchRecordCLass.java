package com.example.datachess.MatchRecord;

public class matchRecordCLass {

    int slno;
    String Player1Name;
    String Player2Name;
    String Result;

    public matchRecordCLass(int slno, String Player1Name, String Player2Name, String Result){

        this.slno=slno;
        this.Player1Name=Player1Name;
        this.Player2Name=Player2Name;
        this.Result=Result;
    }

    public int getSlno() {
        return slno;
    }

    public String getPlayer1Name() {
        return Player1Name;
    }

    public String getPlayer2Name() {
        return Player2Name;
    }

    public String getResult() {
        return Result;
    }

    @Override
    public String toString() {
        return "matchRecordCLass{" +
                "slno=" + slno +
                ", Player1Name='" + Player1Name + '\'' +
                ", Player2Name='" + Player2Name + '\'' +
                ", Result='" + Result + '\'' +
                '}';
    }
}
