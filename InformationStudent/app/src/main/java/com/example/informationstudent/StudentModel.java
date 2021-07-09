package com.example.informationstudent;

import android.nfc.tech.NfcA;
import android.provider.ContactsContract;

public class StudentModel {
    private String Name;
    private int Age;
    private String Address;
    private String dob;
    private int ImageId;
    public StudentModel(String Name , int Age,String Address,String dob,int ImageId){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.dob = dob;
        this.ImageId = ImageId;

    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public String getDob() {
        return dob;
    }

    public int getImageId() {
        return ImageId;
    }
}
