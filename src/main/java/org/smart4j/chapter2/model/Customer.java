package org.smart4j.chapter2.model;

/**
 * Created by stando on 2016/8/29.
 */
public class Customer {
    private int id;
    private String nickname;
    private String password;
    private String phone;
    private int rank;
    private int winNum;
    private int loseNum;
    private int level;

    public Customer() {
    }

    public Customer(String nickname, String password, String phone, int rank, int winNum, int loseNum, int level) {
        //this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.phone = phone;
        this.rank = rank;
        this.winNum = winNum;
        this.loseNum = loseNum;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    public int getLoseNum() {
        return loseNum;
    }

    public void setLoseNum(int loseNum) {
        this.loseNum = loseNum;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
