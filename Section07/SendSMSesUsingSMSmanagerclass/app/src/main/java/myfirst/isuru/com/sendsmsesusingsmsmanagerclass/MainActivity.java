package myfirst.isuru.com.sendsmsesusingsmsmanagerclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMessage,etTelNo;
    Button btnSendSms;
    private static final int MY_REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMessage=findViewById(R.id.etMessage);
        etTelNo=findViewById(R.id.etTelNo);
        btnSendSms=findViewById(R.id.btnSendSms);
    }

    public void  Send_SMS_OnClick(View v){
        String Message=etMessage.getText().toString();
        String TelNo=etTelNo.getText().toString();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_REQUEST_CODE);
        }else {
            SmsManager sms=SmsManager.getDefault();
            sms.sendTextMessage(TelNo,null,Message,null,null);
        }

    }
}
