package com.example.agenda.Models;

public class Types_Model {
    String customer, meters, tape, note;

    public Types_Model(String customer, String meters, String tape, String note) {
        this.customer = customer;
        this.meters = meters;
        this.tape = tape;
        this.note = note;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getMeters() {
        return meters;
    }

    public void setMeters(String meters) {
        this.meters = meters;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
