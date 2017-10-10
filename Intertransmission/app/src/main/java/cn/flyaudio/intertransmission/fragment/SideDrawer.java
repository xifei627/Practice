package cn.flyaudio.intertransmission.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import cn.flyaudio.intertransmission.R;
import cn.flyaudio.intertransmission.activity.Myapplication;

/**
 * Created by ckt on 2/28/16.
 */
public class SideDrawer extends Fragment {

    private ArrayList<HashMap<String, Object>> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.side_drawer_layout, container, false);
        final Myapplication Date = (Myapplication) getActivity().getApplication();

        SimpleAdapter adapter = new SimpleAdapter(getActivity(), list, R.layout.listview_item, new String[]{"Image", "Text"},
                new int[]{R.id.list_item_Image, R.id.list_item_Title});
        TextView name = (TextView) view.findViewById(R.id.user_name);
        name.setText(Date.getName());

        final EditText set_name = (EditText) view.findViewById(R.id.set_name);
        Button sure = (Button) view.findViewById(R.id.name_sure);
        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date.setName(set_name.getText().toString());


            }
        });


        return view;
    }
}
