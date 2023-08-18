package com.example.rippleonyourwrist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.xrpl.*;

import okhttp3.HttpUrl;
import org.xrpl.xrpl4j.client.JsonRpcClientErrorException;
import org.xrpl.xrpl4j.client.XrplClient;
import org.xrpl.xrpl4j.client.faucet.FaucetClient;
import org.xrpl.xrpl4j.client.faucet.FundAccountRequest;
import org.xrpl.xrpl4j.codec.addresses.AddressCodec;
import org.xrpl.xrpl4j.crypto.keys.KeyPair;
import org.xrpl.xrpl4j.crypto.keys.Seed;
import org.xrpl.xrpl4j.model.client.accounts.AccountInfoRequestParams;
import org.xrpl.xrpl4j.model.client.accounts.AccountInfoResult;
import org.xrpl.xrpl4j.model.jackson.modules.Xrpl4jModule;
import org.xrpl.xrpl4j.model.transactions.Address;
import org.xrpl.xrpl4j.model.transactions.XAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //This segment controls the onCreate segment of the Android lifecycle. For a good review of the Android lifecycle, please consult the official resource at the following website (functional as of August 18th 2023): https://developer.android.com/guide/components/activities/activity-lifecycle#java
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        


    }

    @Override
    protected void onStart(){ //This segment controls the onStart segment of the Android lifecycle
        super.onStart();
    }

    @Override
    protected void onResume(){ //This segment controls the onResume() segment of the Android lifecycle.
        super.onResume();
    }

    @Override
    protected void onRestart(){ // This segment controls the onRestart() segment of the Android lifecycle.
        super.onRestart();
    }

    @Override
    protected void onPause(){ //This segment controls the onPause() segment of the Android lifecycle.
        super.onPause();
    }

    @Override
    protected void onStop(){ // This segment controls the onStop() segment of the Android lifecycle.
        super.onStop();
    }

    @Override
    protected void onDestroy(){ //This segment controls the onDestroy() segment of the Android lifecycle.
        super.onDestroy();
    }
}
