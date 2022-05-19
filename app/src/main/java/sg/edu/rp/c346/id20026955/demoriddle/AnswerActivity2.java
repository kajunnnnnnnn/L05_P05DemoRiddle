package sg.edu.rp.c346.id20026955.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.textViewAns2);
        Intent intentReceived = getIntent();
        String questionsSelectd = intentReceived.getStringExtra("Questions");
        tvAnswer.setText(questionsSelectd + " answer is : Gone");
    }
}