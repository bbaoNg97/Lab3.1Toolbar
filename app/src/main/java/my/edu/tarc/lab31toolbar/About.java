package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        WebView webViewAbout=(WebView)findViewById(R.id.webViewAbout);
        //but must have permission
        webViewAbout.loadUrl("http://bait2073.000webhostapp.com/welcome.html");
    }
}
