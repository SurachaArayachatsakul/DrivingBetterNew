package swu.sun.yut.ob.drivingbetter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickSignUp(View view) {
        Intent objIntent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(objIntent);
    }



}
