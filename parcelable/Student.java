package com.example.hyeoktest1102;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private String score;
    private String address;
    private String phoneNum;

    // 값들을 매개변수로 받아올 수 있게 생성자 추가 해준다
    public Student(String name, String score, String address, String phoneNum){
        this.name=name;
        this.score=score;
        this.address=address;
        this.phoneNum=phoneNum;
    }

    protected Student(Parcel in) {
        name = in.readString();
        score = in.readString();
        address = in.readString();
        phoneNum = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(score);
        parcel.writeString(address);
        parcel.writeString(phoneNum);
    }
}
