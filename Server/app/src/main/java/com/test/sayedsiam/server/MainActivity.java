package com.test.sayedsiam.server;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Server server;
    TextView infoip, msg;

    Button btnReply;
    EditText edtReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoip = (TextView) findViewById(R.id.infoip);
        msg = (TextView) findViewById(R.id.msg);
        edtReply=(EditText) findViewById(R.id.edtReply1);
        btnReply=(Button) findViewById(R.id.btnReply1);
        btnReply.setOnClickListener(this);
        server = new Server(this);

        infoip.setText(server.getIpAddress() + ":" + server.getPort());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        server.onDestroy();
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReply1){

        }
    }
}