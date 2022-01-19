package com.example.datachess;

public class matchRecordCLass {

    int slno;
    String Player1Name;
    String Player2Name;
    String Result;

    matchRecordCLass( int slno, String Player1Name, String Player2Name, String Result){

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
}
