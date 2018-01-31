package cn.blinkdagger.selectbarview.sample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class MainFragment extends Fragment {

    private static final String ARGUMENT_TYPE = "tagType";
    private String type;
    private TextView textView;


    public MainFragment() {
    }

    public static MainFragment newInstance(String type) {
        MainFragment f = new MainFragment();
        Bundle b = new Bundle();
        b.putString(ARGUMENT_TYPE, type);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        type = getArguments().getString(ARGUMENT_TYPE);
        View rootView = inflater.inflate(R.layout.fragment_main_layout, container, false);
        textView = rootView.findViewById(R.id.main_fragment_tv);
        textView.setText(type);
        return rootView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
