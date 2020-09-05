package saurabh.digipodium.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editPhone = findViewById(R.id.editPhone);
    }

    public void sendNumberToNextScreen(View v){
      String phone  = editPhone.getText().toString(); //extract data from input
        Intent i= new Intent(this, HomeActivity.class); //this sends the user to the next screen
        i.putExtra("phone",phone); // this shows these items on the next screen
        startActivity(i); //this line is imp for launching to next activity
    }
}
