package id.chairanitiaras.project004;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ShareActivity extends AppCompatActivity {
    ActionBar shareActionBar;
    private Button button_facebook, button_insta, button_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        shareActionBar = getSupportActionBar();
        shareActionBar.setTitle("Share");

        shareActionBar.setDisplayHomeAsUpEnabled(true);

        button_facebook = findViewById(R.id.button_facebook);
        button_insta =findViewById(R.id.button_insta);
        button_twitter = findViewById(R.id.button_twitter);

        button_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent1 = new Intent(Intent.ACTION_VIEW);
                myIntent1.setData(Uri.parse("https://www.facebook.com"));
                startActivity(myIntent1);
            }
        });

        button_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent(Intent.ACTION_VIEW);
                myIntent2.setData(Uri.parse("https://www.twitter.com"));
                startActivity(myIntent2);
            }
        });

        button_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent3 = new Intent(Intent.ACTION_VIEW);
                myIntent3.setData(Uri.parse("https://www.instagram.com"));
                startActivity(myIntent3);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }
}