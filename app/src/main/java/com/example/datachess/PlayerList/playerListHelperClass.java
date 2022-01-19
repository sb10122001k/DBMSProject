package com.example.datachess.PlayerList;

public class playerListHelperClass {

    String Name;
    String Pmail;
    String page;

    public playerListHelperClass(String name, String pmail, String page) {
        Name = name;
        Pmail = pmail;
        this.page = page;
    }

    public String getName() {
        return Name;
    }

    public String getPmail() {
        return Pmail;
    }

    public String getPage() {
        return page;
    }
}
