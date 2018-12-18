package com.medicare.sisgninnotwork4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.medicare.sisgninnotwork4.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements NotificationFragment.OnFragmentInteractionListener,AmbulanceFragment.OnFragmentInteractionListener,CreateaccountFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    @Override
    public void onFragmentInteraction(Uri uri) {
    }


}
