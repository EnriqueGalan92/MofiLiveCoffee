package mx.com.mofi.farmrealapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by mauricio on 30/10/2016.
 */

public class Fragmento extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
              View v = inflater.inflate(R.layout.fragmento,container,false);
        return v;

    }
}
