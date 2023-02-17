package com.huawei.adjustsdksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.oaid.AdjustOaid;
import com.adjust.sdk.oaid.OaidInfo;

public class MainActivity extends AppCompatActivity {

    private AdjustConfig config;
    private String apptoken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adjustGetOAID();
    }

    public void adjustGetOAID() {
        AdjustOaid.readOaid(getApplicationContext());

        apptoken = "TOKEN";

        config = new AdjustConfig(getApplicationContext(), apptoken, AdjustConfig.ENVIRONMENT_SANDBOX);
        config.setLogLevel(LogLevel.VERBOSE);

        Adjust.onCreate(config);
    }
}