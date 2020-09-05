package saurabh.digipodium.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView textPhn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textPhn = findViewById(R.id.textphn);
        updateUI();
    }

    public void updateUI(){
        if(getIntent().getExtras()!=null){
            String phone = getIntent().getStringExtra("phone");
            textPhn.setText(phone);
        }
    }
}
