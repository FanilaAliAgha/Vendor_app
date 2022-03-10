package com.example.vender;

public class stock { String ordernumber;
    String ordername;
    int pic;
    String status;
    String date;
    String rupees;
    String qty;
    String remqty;

    public stock(String ordernumber, String ordername, int pic, String status, String date, String rupees, String qty, String remqty) {
        this.ordernumber = ordernumber;
        this.ordername = ordername;
        this.pic = pic;
        this.status = status;
        this.date = date;
        this.rupees = rupees;
        this.qty = qty;
        this.remqty = remqty;
    }


    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRupees() {
        return rupees;
    }

    public void setRupees(String rupees) {
        this.rupees = rupees;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRemqty() {
        return remqty;
    }

    public void setRemqty(String remqty) {
        this.remqty = remqty;
    }
}
