package com.example.hyeoktest1102;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // MainActivity로부터 StartService시 해당하는 Intent에 대해 데이터를 받아옴.
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // getParcelableExtra(parcelableData)
        Student s = intent.getParcelableExtra("test");
        // StringBuffer에 append하여 Toast로 띄움.==> 데이터가 들어왔는지 확인
        StringBuffer sb = new StringBuffer();
        sb.append(s.getName());
        sb.append(s.getScore());
        sb.append(s.getAddress());
        sb.append(s.getPhoneNum());
        Toast.makeText(this,sb,Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;
    }
}
