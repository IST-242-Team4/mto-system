package edu.psu.ist242;

/**
Project: Configure
Purpose Details: To load the program defaults and user settings
Author: Luke Jackson
Date Developed: 03.13.18
Last Date Changed: 03.13.18
Rev:1.0.1
*/

public class Configure {

    private String host;
    private String port;
    private String user;
    private String pass;

    public Configure(String host, String port, String user, String pass) {
        this.host = "";
        this.port = "";
        this.user = "";
        this.pass = "";
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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
