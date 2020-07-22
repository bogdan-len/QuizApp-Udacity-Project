package com.example.quizproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public void submitAnswers(View view) {
        int correctAnswers = 0;

        /**
         * Calculates if the QUESTION 1 is answered correctly
         */
        RadioButton questionOneAnswerOne = (RadioButton) findViewById(R.id.question_one_answer_one);
        boolean correctAnswerQuestionOne = questionOneAnswerOne.isChecked();
        if (correctAnswerQuestionOne) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if the QUESTION 2 is answered correctly
         */
        CheckBox questionTwoAnswerOne = (CheckBox) findViewById(R.id.question_two_wrong_answer);
        boolean wrongAnswerQuestionTwo = questionTwoAnswerOne.isChecked();
        CheckBox questionTwoAnswerTwo = (CheckBox) findViewById(R.id.question_two_correct_answer_one);
        boolean correctAnswerOneQuestionTwo = questionTwoAnswerTwo.isChecked();
        CheckBox questionTwoAnswerThree = (CheckBox) findViewById(R.id.question_two_correct_answer_two);
        boolean correctAnswerOneQuestionThree = questionTwoAnswerThree.isChecked();
        if (correctAnswerOneQuestionTwo && correctAnswerOneQuestionThree && !(wrongAnswerQuestionTwo)) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if the QUESTION 3 is answered correctly
         */
        EditText userAnswer = (EditText) findViewById(R.id.question_three_edit_box);
        String userAnswerQuestionThree = userAnswer.getText().toString();
        if (userAnswerQuestionThree.equals("50")) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if QUESTION 4 is answered correctly
         */
        RadioButton questionFourAnswerOne = (RadioButton) findViewById(R.id.question_four_answer_one);
        boolean questionFourAnswer = questionFourAnswerOne.isChecked();
        if (questionFourAnswer) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if QUESTION 5 is answered correctly
         */
        RadioButton questionFiveAnswertTwo = (RadioButton) findViewById(R.id.question_five_answer_two);
        boolean questionFiveAnswer = questionFiveAnswertTwo.isChecked();
        if (questionFiveAnswer) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if the QUESTION 6 is answered correctly
         */
        CheckBox questionSixAnswerOne = (CheckBox) findViewById(R.id.question_six_correct_answer_one);
        boolean correctAnswerOneQuestionSix = questionSixAnswerOne.isChecked();
        CheckBox questionSixAnswerTwo = (CheckBox) findViewById(R.id.question_six_wrong_answer_one);
        boolean wrongAnswerOneQuestionSix = questionSixAnswerTwo.isChecked();
        CheckBox questionSixAnswerThree = (CheckBox) findViewById(R.id.question_six_wrong_answer_two);
        boolean wrongAnswerTwoQuestionSix = questionSixAnswerThree.isChecked();
        CheckBox questionSixAnswerFour = (CheckBox) findViewById(R.id.question_six_correct_answer_two);
        boolean correctAnswerTwoQuestionSix = questionSixAnswerFour.isChecked();

        if (correctAnswerOneQuestionSix && correctAnswerTwoQuestionSix && !(wrongAnswerOneQuestionSix) && !(wrongAnswerTwoQuestionSix)) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if the QUESTION 7 is answered correctly
         */
        EditText userAnswerQuestionSeven = (EditText) findViewById(R.id.question_seven);
        String questionSevenAnswer = userAnswerQuestionSeven.getText().toString();
        if (questionSevenAnswer.equals("Berlin")) {
            correctAnswers = correctAnswers + 1;
        }
        /**
         * Calculates if QUESTION 8 is answered correctly
         */
        RadioButton questionEightAnswerTwo = (RadioButton) findViewById(R.id.question_eight_answer_two);
        boolean questionEightAnswer = questionEightAnswerTwo.isChecked();
        if (questionEightAnswer) {
            correctAnswers = correctAnswers + 1;
        }

        /**
         * Calculates if the QUESTION 9 is answered correctly
         */
        CheckBox questionNineAnswerOne = (CheckBox) findViewById(R.id.question_nine_correct_answer_one);
        boolean questionNineCorrectAnswerOne = questionNineAnswerOne.isChecked();
        CheckBox questionNineAnswerTwo = (CheckBox) findViewById(R.id.question_nine_correct_answer_two);
        boolean questionNineCorrectAnswerTwo = questionNineAnswerTwo.isChecked();
        CheckBox questionNineAnswerThree = (CheckBox) findViewById(R.id.question_nine_wrong_answer);
        boolean questionNineWrongAnswer = questionNineAnswerThree.isChecked();
        if (questionNineCorrectAnswerOne && questionNineCorrectAnswerTwo && !(questionNineWrongAnswer)) {
            correctAnswers = correctAnswers + 1;
        }

        Toast.makeText(this, "You answered " + correctAnswers + " out of 9 questions correctly", Toast.LENGTH_SHORT).show();
    }

}



