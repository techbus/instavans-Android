package com.Techbus.Instavansporter;

/**
 * Created by Sravan on 3/6/2016.
 */


public class DataObject {
    private String mText1;
    private String mText2;

    public String getmText3() {
        return mText3;
    }

    public void setmText3(String text3) {
        this.mText3 = text3;
    }

    private String mText3;

    DataObject (String text1, String text2,String text3){
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
    }

    public String getmText1() {
        return mText1;
    }

    public void setmText1(String mText1) {
        this.mText1 = mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }
}