package com.example.android.cookingquiz;


import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    //Track of user's score
    int score = 0;
    //score converted to a percent
    int percent = (score / 5) * 10;
    //@count used for case statement to switch ImageViews and TextViews
    int count = 0;

    //Find All Relevant Views
    //for the "splash page"
    @BindView(R.id.burger)
    ImageView burgerImageView;
    //Used in all questions
    @BindView(R.id.banner)
    ImageView quizBanner;
    @BindView(R.id.quizHeader)
    TextView setTextHeader;
    @BindView(R.id.quizQuestion)
    TextView setTextQuestion;
    //For Radio Questions
    @BindView(R.id.quizRadioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.radio1)
    RadioButton radioButton1;
    @BindView(R.id.radio2)
    RadioButton radioButton2;
    @BindView(R.id.radio3)
    RadioButton radioButton3;
    @BindView(R.id.radio4)
    RadioButton radioButton4;
    //For CheckBox Questions
    @BindView(R.id.checkbox)
    LinearLayout checkboxView;
    @BindView(R.id.checkboxOption1)
    CheckBox checkBox1;
    @BindView(R.id.checkboxOption2)
    CheckBox checkBox2;
    @BindView(R.id.checkboxOption3)
    CheckBox checkBox3;
    @BindView(R.id.checkboxOption4)
    CheckBox checkBox4;
    @BindView(R.id.checkboxText1)
    TextView checkBoxText1;
    @BindView(R.id.checkboxText2)
    TextView checkBoxText2;
    @BindView(R.id.checkboxText3)
    TextView checkBoxText3;
    @BindView(R.id.checkboxText4)
    TextView checkBoxText4;
    //For EditText Questions
    @BindView(R.id.editTextInput)
    EditText userInput;
    //for buttons
    @BindView(R.id.quizButton)
    Button button;
    //for scoring
    @BindView(R.id.score_textView)
    TextView displayScore;
    @BindView(R.id.score_view)
    View scoreView;
    @BindView(R.id.commentTextView)
    TextView commentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method used to populate views and text using @count as a variable to keep track of the question
    public void onClick(View view) {
        //        Initialize butterknife
        ButterKnife.bind(this);
        //find case #. for each case, replace text each time quiz button is clicked
        switch (count) {
            //where case = 0, display quiz 1
            case 0:
                Log.i("string", "count: " + count);
                Log.i("string", "score: " + score);

                //Hide the burger picture
                burgerImageView.setVisibility(View.GONE);
                //Quiz 1 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.pasta_2);
                //Quiz 1 Header text replacement
                setTextHeader.setText(R.string.quiz_1_header);
                setTextHeader.setGravity(Gravity.BOTTOM);
                //Quiz 1 Question text Replacement
                setTextQuestion.setVisibility(View.VISIBLE);
                setTextQuestion.setText(R.string.quiz_1_question);
                //Quiz 1 Radio Group
                checkboxView.setVisibility(View.VISIBLE);
                //Quiz 1 Radio Buttons
                checkBoxText1.setText(R.string.quiz_1_checkbox_1);
                checkBoxText2.setText(R.string.quiz_1_checkbox_2);
                checkBoxText3.setText(R.string.quiz_1_checkbox_3);
                checkBoxText4.setText(R.string.quiz_1_checkbox_4);
                //Quiz 1 Button. Change text to submit
                button.setText(R.string.submitButton);
                //Add one to count to keep track of page
                count += 1;
                break;

            //where case = 1, check answer 1 & display quiz 2
            case 1:
                Log.i("string", "count: " + count);
                //Add one to score if correct answer has been clicked!
                boolean checked1_1 = checkBox1.isChecked(); //checkBox1 is one of the correct answers for this question
                boolean checked1_2 = checkBox2.isChecked(); //checkBox2 is one of the correct answers for this question
                boolean checked1_3 = checkBox3.isChecked();//checkBox3 is one of the correct answers for this question
                boolean checked1_4 = checkBox4.isChecked();//checkBox4 is incorrect for this question
                //These three must be checked to add one to score
                if (checked1_1 && checked1_2 && checked1_3 && !checked1_4) {
                    score = score + 1;
                    Log.i("string", "score: " + score);
                }
                //Quiz 2 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.bread);
                //Quiz 2 Header text replacement
                setTextHeader.setText(R.string.quiz_2_header);
                //Quiz 2 Question text Replacement
                setTextQuestion.setText(R.string.quiz_2_question);
                //hide checkboxes and set radio group to visible
                checkboxView.setVisibility(View.GONE);
                radioGroup.setVisibility(View.VISIBLE);
                //Quiz 2 Radio Buttons
                radioButton1.setText(R.string.quiz_2_radio_1);
                radioButton2.setText(R.string.quiz_2_radio_2);
                radioButton3.setText(R.string.quiz_2_radio_3);
                radioButton4.setText(R.string.quiz_2_radio_4);
                //Add one to count to keep track of page
                count += 1;
                break;

            //where case = 2, check answer 2 & display quiz 3
            case 2:
                Log.i("string", "count: " + count);
                //Add one to score if correct answer has been clicked!
                boolean checked2 = radioButton3.isChecked(); //radioButton3 is the correct answer for this question
                if (checked2) {
                    score = score + 1;
                    Log.i("string", "score: " + score);
                }
                //Quiz 3 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.julienned);
                //Quiz 3 Header text replacement
                setTextHeader.setText(R.string.quiz_3_header);
                //Quiz 3 Question text Replacement
                setTextQuestion.setText(R.string.quiz_3_question);
                //hide radio group and set edit text to visible
                radioGroup.setVisibility(View.GONE);
                userInput.setVisibility(View.VISIBLE);
                //Add one to count to keep track of page
                count += 1;
                break;

            //where case = 3, check answer 3 & display quiz 4
            case 3:
                Log.i("string", "count: " + count);
                //Add one to score if correct answer has been clicked!
                //reference: https://stackoverflow.com/questions/17443201/why-doesn-t-work-on-string
                if (userInput.getText() != null) {
                    String checked3 = userInput.getText().toString().toLowerCase();
                    if (checked3.equals(getString(R.string.answer3))) {
                        score = score + 1;
                        Log.i("string", "score: " + score);
                    } else  {
                        Log.i("string", "score: " + score);
                    }
                }

                //Quiz 4 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.tomatoes);
                //Quiz 4 Header text replacement
                setTextHeader.setText(R.string.quiz_4_header);
                //Quiz 4 Question text Replacement
                setTextQuestion.setText(R.string.quiz_4_question);
                //hide EditText and set Radio Group to visible
                radioGroup.setVisibility(View.VISIBLE);
                userInput.setVisibility(View.GONE);
                //Quiz 4 Radio Buttons
                radioButton1.setText(R.string.quiz_4_radio_1);
                radioButton2.setText(R.string.quiz_4_radio_2);
                radioButton3.setText(R.string.quiz_4_radio_3);
                radioButton4.setText(R.string.quiz_4_radio_4);
                //Add one to count to keep track of page
                count += 1;
                break;

            //where case = 4,  check answer 4 & display quiz 5
            case 4:
                Log.i("string", "count: " + count);
                //Add one to score if correct radio button has been clicked!
                boolean checked4 = radioButton1.isChecked(); //radioButton3 is the correct answer for this question
                if (checked4) {
                    score = score + 1;
                    Log.i("string", "score: " + score);
                } else  {
                    Log.i("string", "score: " + score);
                }
                //Quiz 5 Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.baking);
                //Quiz 5 Header text replacement
                setTextHeader.setText(R.string.quiz_5_header);
                //Quiz 5 Question text Replacement
                setTextQuestion.setText(R.string.quiz_5_question);
                //Quiz 5 Radio Buttons
                radioButton1.setText(R.string.quiz_5_radio_1);
                radioButton2.setText(R.string.quiz_5_radio_2);
                radioButton3.setText(R.string.quiz_5_radio_3);
                radioButton4.setText(R.string.quiz_5_radio_4);
                //Add one to count to keep track of page
                count += 1;
                break;

            //where case = 5, check answer 5 & display results page
            case 5:
                Log.i("string", "count: " + count);
                //Add one to score if correct radio button has been clicked!
                boolean checked5 = radioButton3.isChecked(); //radioButton3 is the correct answer for this question
                if (checked5) {
                    score = score + 1;
                    Log.i("string", "score: " + score);
                }
                else {
                    Log.i("string", "score: " + score);
                }
                //results Banner replacement. Change image to default
                quizBanner.setImageResource(R.mipmap.gordon);
                //results quote Header text replacement
                setTextHeader.setText(R.string.results_header);
                setTextHeader.setTextSize(24);
                setTextHeader.setPadding(0, 36, 0, 0);
                //results quote author text Replacement
                setTextQuestion.setText(R.string.results_quote);
                //Quiz 1 Radio Group
                radioGroup.setVisibility(View.GONE);
                //results text view. used to display score of the user
                scoreView.setVisibility(View.VISIBLE);
                String scoreToText = Integer.toString(score);
                displayScore.setText(scoreToText);
                //Score Response! places text under the score depending on the user's final score
                if (score == 0) {
                    commentTextView.setText(R.string.zeroOfFive);
                    Toast.makeText(this, R.string.toastZero, Toast.LENGTH_LONG).show();
                } else if (score == 1) {
                    commentTextView.setText(R.string.oneOfFive);
                    Toast.makeText(this, R.string.toastOne, Toast.LENGTH_LONG).show();
                } else if (score == 2) {
                    commentTextView.setText(R.string.twoOfFive);
                    Toast.makeText(this, R.string.toastTwo, Toast.LENGTH_LONG).show();
                } else if (score == 3) {
                    commentTextView.setText(R.string.threeOfFive);
                    Toast.makeText(this, R.string.toastThree, Toast.LENGTH_LONG).show();
                } else if (score == 4) {
                    commentTextView.setText(R.string.fourOfFive);
                    Toast.makeText(this, R.string.toastFour, Toast.LENGTH_LONG).show();
                } else if (score == 5) {
                    commentTextView.setText(R.string.fiveOfFive);
                    Toast.makeText(this, R.string.toastFive, Toast.LENGTH_LONG).show();
                } else {
                    commentTextView.setText(R.string.error);
                    Toast.makeText(this, R.string.toastError, Toast.LENGTH_LONG).show();
                }
                //Quiz 5 Button. Change text to submit
                button.setText(R.string.reset_button);
                //Add one to count to keep track of page
                count += 1;
                break;
            //Reset the App

            //where case = 6, reset the app to start of quiz
            case 6:
                Log.i("string", "count: " + count);
                //reference: https://stackoverflow.com/questions/15564614/how-to-restart-an-android-application-programmatically?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                break;

        }
    }

}
