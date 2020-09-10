package y2019.aoc.alaa.nadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt;
    private EditText first,last;
    private Person person ;

    //private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.editfirst);
        last = findViewById(R.id.editlast);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(this) ;



            }

    @Override
    public void onClick(View v) {
        if (v == bt){
            Intent intent = new Intent(this,Sec.class);
            intent.putExtra("first" , first.getText().toString());
            intent.putExtra("last",last.getText().toString());
            startActivity(intent);
            finish();

        }

    }

}
