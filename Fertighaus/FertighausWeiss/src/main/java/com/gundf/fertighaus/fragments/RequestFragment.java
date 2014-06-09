package com.gundf.fertighaus.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.gundf.fertighaus.R;

public class RequestFragment extends Fragment {

    private EditText mName;
    private EditText mSurname;
    private EditText mEmail;
    private EditText mPhone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_request, null);
        view.findViewById(R.id.send_request).setOnClickListener(mClickListener);
        mName = (EditText) view.findViewById(R.id.name);
        mSurname = (EditText) view.findViewById(R.id.surname);
        mEmail = (EditText) view.findViewById(R.id.email);
        mPhone = (EditText) view.findViewById(R.id.phone);

        return view;
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.send_request:
                    if(validate()) {
                        send();
                    }
                    break;
            }
        }
    };

    private boolean validate() {
        boolean result = false;
//        TODO
        return result;
    }

    private void send() {
//        TODO
    }



}
