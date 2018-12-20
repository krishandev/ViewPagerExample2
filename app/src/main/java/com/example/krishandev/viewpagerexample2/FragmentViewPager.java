package com.example.krishandev.viewpagerexample2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentViewPager extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment_view_pager, container, false);

        TextView tv=(TextView) v.findViewById(R.id.textView1);
        tv.setText(getArguments().getString("text"));

        ImageView iv=(ImageView) v.findViewById(R.id.imageView);
        iv.setBackgroundResource(getArguments().getInt("img"));

        return v;
    }

    public static FragmentViewPager newInstance(String text, int image) {

        FragmentViewPager f = new FragmentViewPager();

        Bundle b = new Bundle();

        b.putString("text", text);

        b.putInt("img", image);

        f.setArguments(b);

        return f;

    }


}
