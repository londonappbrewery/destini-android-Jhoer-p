package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    mStoryIndex = 3;
                }else if (mStoryIndex == 2){
                    mStoryIndex = 3;
                }else if (mStoryIndex == 3){
                    mStoryIndex = 6;
                }
                actualizarEstado();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    mStoryIndex = 2;
                }else if (mStoryIndex == 2){
                    mStoryIndex = 4;
                }else if (mStoryIndex == 3){
                    mStoryIndex = 5;
                }
                actualizarEstado();
            }
        });
    }

    // TODO: Crear metodo actualizar estado

    public void actualizarEstado(){
        switch (mStoryIndex){
            case 1:
                storyTextView.setText(R.string.T1_Story);
                buttonTop.setText(R.string.T1_Ans1);
                buttonBottom.setText(R.string.T1_Ans2);
                break;
            case 2:
                storyTextView.setText(R.string.T2_Story);
                buttonTop.setText(R.string.T2_Ans1);
                buttonBottom.setText(R.string.T2_Ans2);
                break;
            case 3:
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
                break;
            case 4:
                storyTextView.setText(R.string.T4_End);
                break;
            case 5:
                storyTextView.setText(R.string.T5_End);
                break;
            case 6:
                storyTextView.setText(R.string.T6_End);
                break;
        }

        if (mStoryIndex == 4 || mStoryIndex == 5 || mStoryIndex == 6){
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }
    }
}
