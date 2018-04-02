package edu.psu.ist242;

/**
Project: Database
Purpose Details: To handle the initiation of the database
Author: Luke Jackson
Date Developed: 03.13.18
Last Date Changed: 03.13.18
Rev:1.0.1
*/

public class Database {
    private int port;
    private String server;
    private String user;
    private String pass;

    public Database() {
        this.port = 0;
        this.server = "";
        this.user = "";
        this.pass = "";
    }

    public Database(int port, String server, String user, String pass) {
        this.port = port;
        this.server = server;
        this.user = user;
        this.pass = pass;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
