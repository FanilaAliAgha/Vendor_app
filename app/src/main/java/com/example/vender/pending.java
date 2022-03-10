package com.example.vender;

public class pending {


    int pic;
    String pname;
    String pdetail;
    String pnumber;
    String date;
    String time;


    public pending(int pic, String pname, String pdetail, String pnumber, String date, String time) {
        this.pic = pic;
        this.pname = pname;
        this.pdetail = pdetail;
        this.pnumber = pnumber;
        this.date = date;
        this.time = time;
    }


    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
