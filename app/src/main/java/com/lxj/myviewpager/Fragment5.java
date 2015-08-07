package com.lxj.myviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Luxj on 2015/8/7 15:23
 */
public class Fragment5 extends Fragment {
    private View view;

    static Fragment2 newInstance(String s) {
        Fragment2 newFragment = new Fragment2();
        Bundle bundle = new Bundle();
        bundle.putString("hello", s);
        newFragment.setArguments(bundle);
        return newFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = getActivity().getLayoutInflater().inflate(R.layout.tab1, null);
        Bundle args = getArguments();
        if (args != null) {
            TextView textView = (TextView) view.findViewById(R.id.te);
            textView.setText(args.getString("hello"));
        }
        return view;
    }
}
