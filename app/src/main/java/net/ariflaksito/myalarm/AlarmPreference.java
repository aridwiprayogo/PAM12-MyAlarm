package net.ariflaksito.myalarm;

import android.content.Context;
import android.content.SharedPreferences;

public class AlarmPreference {
    private final String PREF_NAME = "AlarmPreference";
    private final String KEY_ONE_TIME_DATE = "oneTimDate";
    private final String KEY_ONE_TIME_TIME = "oneTimeTime";
    private final String KEY_ONE_TIME_MESSAGE = "oneTimeMessage";
    private final String KEY_REPEATING_TIME = "repeatingTime";
    private final String KEY_REPEATING_MESSAGE = "repeatingMessage";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor editor;

    AlarmPreference(Context context){
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    void setOneTimeDate(String date){
        editor = mSharedPreferences.edit();
        editor.putString(KEY_ONE_TIME_DATE, date);
        editor.apply();
    }

    String getOneTimeDate(){
        return mSharedPreferences.getString(KEY_ONE_TIME_DATE, null);
    }

    void setOneTimeTime(String time){
        editor = mSharedPreferences.edit();
        editor.putString(KEY_ONE_TIME_TIME, time);
        editor.apply();
    }

    public String getOneTimeTime(){
        return mSharedPreferences.getString(KEY_ONE_TIME_TIME, null);
    }

    public void setOneTimeMessage(String message){
        editor = mSharedPreferences.edit();

        editor.putString(KEY_ONE_TIME_MESSAGE, message);
        editor.apply();
    }

    public String getOneTimeMessage(){
        return mSharedPreferences.getString(KEY_ONE_TIME_MESSAGE, null);
    }

    public void setRepeatingTime(String time){
        editor = mSharedPreferences.edit();
        editor.putString(KEY_REPEATING_TIME, time);
        editor.apply();
    }

    public String getRepeatingTime(){
        return mSharedPreferences.getString(KEY_REPEATING_TIME, null);
    }

    public void setRepeatingMessage(String message){
        editor = mSharedPreferences.edit();
        editor.putString(KEY_REPEATING_MESSAGE, message);
        editor.apply();
    }

    public String getRepeatingMessage(){
        return mSharedPreferences.getString(KEY_REPEATING_MESSAGE, null);
    }

    public void clear(){
        editor = mSharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
