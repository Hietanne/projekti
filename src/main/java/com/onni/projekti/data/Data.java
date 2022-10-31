package com.onni.projekti.data;

public class Data {
    private String firstName;
    private String lastName;
    private int classID;
    private int studentID;

    private static int count = 1;


    //Konstruktori ottaa vastaan etunimen sukunimen ja luokkatunnuksen(numero)
    //Lisätään myös yksi numero lisää jokaisen opiskelijan päätteeksi
    public Data(String firstName, String lastName, int classID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classID = classID;
        this.studentID = count++;
    }

    public Data() {
        this("", "", 0);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }
}
