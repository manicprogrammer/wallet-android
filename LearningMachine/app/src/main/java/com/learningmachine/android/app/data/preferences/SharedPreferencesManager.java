package com.learningmachine.android.app.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private static final String PREF_NAME = "LearningMachine";
    private static final String PREF_FIRST_LAUNCH = "SharedPreferencesManager.FirstLaunch";
    private static final String PREF_LEGACY_RECEIVE_ADDRESS = "SharedPreferencesManager.LegacyReceiveAddress";

    private SharedPreferences mPrefs;

    public SharedPreferencesManager(Context context) {
        mPrefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public boolean isFirstLaunch() {
        return mPrefs.getBoolean(PREF_FIRST_LAUNCH, true);
    }

    public void setFirstLaunch(boolean firstLaunch) {
        mPrefs.edit()
                .putBoolean(PREF_FIRST_LAUNCH, firstLaunch)
                .apply();
    }

    public String getLegacyReceiveAddress() {
        return mPrefs.getString(PREF_LEGACY_RECEIVE_ADDRESS, null);
    }

    public void setLegacyReceiveAddress(String receiveAddress) {
        mPrefs.edit()
                .putString(PREF_LEGACY_RECEIVE_ADDRESS, receiveAddress)
                .apply();
    }
}
