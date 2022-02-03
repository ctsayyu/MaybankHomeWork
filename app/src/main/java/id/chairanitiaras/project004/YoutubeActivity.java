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

public class YoutubeActivity extends AppCompatActivity {
    ActionBar youtubeActionBar;
    private Button youtube_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youtubeActionBar = getSupportActionBar();
        youtubeActionBar.setTitle("Youtube Fanbase");

        youtubeActionBar.setDisplayHomeAsUpEnabled(true);

        youtube_button = findViewById(R.id.youtube_button);

        youtube_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myImplicitIntent = new Intent(Intent.ACTION_VIEW);
                myImplicitIntent.setData(Uri.parse("https://www.youtube.com"));
                startActivity(myImplicitIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }
}