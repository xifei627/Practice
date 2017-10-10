package cn.flyaudio.intertransmission.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cn.flyaudio.intertransmission.R;
import cn.flyaudio.intertransmission.activity.WiFiDirectActivity;


/**
 * Created by Lu on 2016/5/22.
 */
public class ConnectFragment extends Fragment {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View mainView = inflater.inflate(R.layout.fragment_connect_main,container,false);

        return mainView;
    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
        Button phone = (Button)getActivity().findViewById(R.id.phone_connect_id);
//        Button pc =(Button) getActivity().findViewById(R.id.pc_connect_id);
//        Button bluetooth =(Button) getActivity().findViewById(R.id.bluttooth_id);

        phone.setOnClickListener(new WayClickListener());
//        pc.setOnClickListener(new WayClickListener());
//        bluetooth.setOnClickListener(new WayClickListener());

    }

    class WayClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            switch (view.getId()){

                case R.id.phone_connect_id:

                    Intent intent_direcet = new Intent(getActivity(), WiFiDirectActivity.class);
                    getActivity().startActivity(intent_direcet);

                    break;

//                case R.id.pc_connect_id:
//
//                    Intent intent_pc = new Intent(getActivity(), FtpActivity.class);
//                    getActivity().startActivity(intent_pc);
//
//                    break;
//
//                case R.id.bluttooth_id:
//
//                    Intent intent_bluetooth = new Intent();
//                    intent_bluetooth.setAction(Intent.ACTION_SEND);
//                    intent_bluetooth.setType("*/*");
//                    intent_bluetooth.setClassName("com.android.bluetooth", "com.android.bluetooth.opp.BluetoothOppLauncherActivity");
//                    File f = new File("///data/app/com.lu.kuaichuan.wifidirect-1/base.apk");
//                    intent_bluetooth.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(f));
//                    Log.d("ConnectFragment", "onItemLongClick: "+Uri.fromFile(f));
//                    startActivity(intent_bluetooth);
//
//                    break;

                default:
                    break;
            }

        }
    }
}
