package com.example.android.artquizapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.PrivateKey;

import static android.R.attr.button;
import static android.R.attr.checked;
import static android.R.attr.checkedButton;
import static android.R.attr.id;
import static android.R.attr.name;
import static android.R.attr.onClick;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.M;
import static com.example.android.artquizapp.R.id.angeloFive;
import static com.example.android.artquizapp.R.id.boschEight;
import static com.example.android.artquizapp.R.id.boschFour;
import static com.example.android.artquizapp.R.id.boschSix;
import static com.example.android.artquizapp.R.id.botticelliSeven;
import static com.example.android.artquizapp.R.id.botticelliTen;
import static com.example.android.artquizapp.R.id.botticelliTree;
import static com.example.android.artquizapp.R.id.buttonSubmit;
import static com.example.android.artquizapp.R.id.cezanneTree;
import static com.example.android.artquizapp.R.id.daliSeven;
import static com.example.android.artquizapp.R.id.degasOne;
import static com.example.android.artquizapp.R.id.degasTwo;
import static com.example.android.artquizapp.R.id.goghFive;
import static com.example.android.artquizapp.R.id.goghNine;
import static com.example.android.artquizapp.R.id.klimtNine;
import static com.example.android.artquizapp.R.id.klimtTree;
import static com.example.android.artquizapp.R.id.leonardoOne;
import static com.example.android.artquizapp.R.id.manetEight;
import static com.example.android.artquizapp.R.id.manetFive;
import static com.example.android.artquizapp.R.id.manetOne;
import static com.example.android.artquizapp.R.id.manetTen;
import static com.example.android.artquizapp.R.id.manetTwo;
import static com.example.android.artquizapp.R.id.millaisEight;
import static com.example.android.artquizapp.R.id.millaisFour;
import static com.example.android.artquizapp.R.id.millaisTwo;
import static com.example.android.artquizapp.R.id.picassoFive;
import static com.example.android.artquizapp.R.id.picassoNine;
import static com.example.android.artquizapp.R.id.picassoTree;
import static com.example.android.artquizapp.R.id.picassoTwo;
import static com.example.android.artquizapp.R.id.pissarroFour;
import static com.example.android.artquizapp.R.id.pissarroNine;
import static com.example.android.artquizapp.R.id.pissarroOne;
import static com.example.android.artquizapp.R.id.pissarroSeven;
import static com.example.android.artquizapp.R.id.radioGroupBosch;
import static com.example.android.artquizapp.R.id.radioGroupDegas;
import static com.example.android.artquizapp.R.id.radioGroupManet;
import static com.example.android.artquizapp.R.id.seuratSeven;
import static com.example.android.artquizapp.R.id.seuratTen;
import static com.example.android.artquizapp.R.id.velazquezSix;
import static com.example.android.artquizapp.R.id.vermeerEight;
import static com.example.android.artquizapp.R.id.vinciSix;
import static com.example.android.artquizapp.R.id.waterhouseSix;
import static com.example.android.artquizapp.R.id.waterhouseTen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int Total = 0;

    /*
   *This method is used to check the answers.
    */
    public void submitQuiz(View view) {

        Total = 0;

        int checkedRadioButtons = 0;

        //To check if all questions were answerd

        RadioGroup radioGroupDegas = (RadioGroup) findViewById(R.id.radioGroupDegas);
        if (radioGroupDegas.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupManet = (RadioGroup) findViewById(R.id.radioGroupManet);
        if (radioGroupManet.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupKlimt = (RadioGroup) findViewById(R.id.radioGroupKlimt);
        if (radioGroupKlimt.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupVermeer = (RadioGroup) findViewById(R.id.radioGroupVermeer);
        if (radioGroupVermeer.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupPicasso = (RadioGroup) findViewById(R.id.radioGroupPicasso);
        if (radioGroupPicasso.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupBosch = (RadioGroup) findViewById(R.id.radioGroupBosch);
        if (radioGroupBosch.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupBotticelli = (RadioGroup) findViewById(R.id.radioGroupBotticelli);
        if (radioGroupBotticelli.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupMillais = (RadioGroup) findViewById(R.id.radioGroupMillais);
        if (radioGroupMillais.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupGogh = (RadioGroup) findViewById(R.id.radioGroupGogh);
        if (radioGroupGogh.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        RadioGroup radioGroupSeurat = (RadioGroup) findViewById(R.id.radioGroupSeurat);
        if (radioGroupSeurat.getCheckedRadioButtonId() > 0) {
            checkedRadioButtons = checkedRadioButtons + 1;
        }

        //Show a message to user when he tries to submit partially the quiz
        if (checkedRadioButtons < 10) {
            Toast.makeText(getApplicationContext(), "You have to answer to all the questions before submitting your Quiz!", Toast.LENGTH_LONG).show();
            return;
        }

        //Checks if the correct answer is clicked in the RadioGroups and attributes a score
        RadioButton degasOne = (RadioButton) findViewById(R.id.degasOne);
        boolean checkedOne = degasOne.isChecked();
        if (checkedOne)
            Total += 1;

        RadioButton manetTwo = (RadioButton) findViewById(R.id.manetTwo);
        boolean checkedTwo = manetTwo.isChecked();
        if (checkedTwo)
            Total += 1;

        RadioButton klimtTree = (RadioButton) findViewById(R.id.klimtTree);
        boolean checkedTree = klimtTree.isChecked();
        if (checkedTree)
            Total += 1;

        RadioButton vermeerFour = (RadioButton) findViewById(R.id.vermeerFour);
        boolean checkedFour = vermeerFour.isChecked();
        if (checkedFour)
            Total += 1;

        RadioButton picassoFive = (RadioButton) findViewById(R.id.picassoFive);
        boolean checkedFive = picassoFive.isChecked();
        if (checkedFive)
            Total += 1;

        RadioButton boschSix = (RadioButton) findViewById(R.id.boschSix);
        boolean checkedSix = boschSix.isChecked();
        if (checkedSix)
            Total += 1;

        RadioButton botticelliSeven = (RadioButton) findViewById(R.id.botticelliSeven);
        boolean checkedSeven = botticelliSeven.isChecked();
        if (checkedSeven)
            Total += 1;

        RadioButton millansEight = (RadioButton) findViewById(millaisEight);
        boolean checkedEight = millansEight.isChecked();
        if (checkedEight)
            Total += 1;

        RadioButton goghNine = (RadioButton) findViewById(R.id.goghNine);
        boolean checkedNine = goghNine.isChecked();
        if (checkedNine)
            Total += 1;

        RadioButton seuratTen = (RadioButton) findViewById(R.id.seuratTen);
        boolean checkedTen = seuratTen.isChecked();
        if (checkedTen)
            Total += 1;

        //Displays Total Message to user

        if (Total < 1) {
            //Show a message to user
            Toast.makeText(getApplicationContext(), "You're Score is " + Total + "! " + "Better luck Next Time", Toast.LENGTH_LONG).show();
            return;
        } else if (Total <= 5) {
            Toast.makeText(getApplicationContext(), "You're Score is " + Total + "! " + "You have some knowledge about Art, but you should improve it!", Toast.LENGTH_LONG).show();
            return;
        } else if (Total <= 7) {
            Toast.makeText(getApplicationContext(), "You're Score is " + Total + "! " + "You have a good knowledge about Art, Congratulations!", Toast.LENGTH_LONG).show();
            return;
        } else if (Total <= 9) {
            Toast.makeText(getApplicationContext(), "You're Score is " + Total + "! " + "Waw! You really know Art, Congratulations!", Toast.LENGTH_LONG).show();
            return;
        } else {
            Toast.makeText(getApplicationContext(), "You're Score is " + Total + "! " + "Amazing! You're the Best!", Toast.LENGTH_LONG);
            return;
        }

    }

    //To reset all the answers

    public void resetQuiz(View v) {
        RadioGroup radioGroupDegas = (RadioGroup) findViewById(R.id.radioGroupDegas);
        radioGroupDegas.clearCheck();

        RadioGroup radioGroupManet = (RadioGroup) findViewById(R.id.radioGroupManet);
        radioGroupManet.clearCheck();

        RadioGroup radioGroupKlimt = (RadioGroup) findViewById(R.id.radioGroupKlimt);
        radioGroupKlimt.clearCheck();

        RadioGroup radioGroupVermeer = (RadioGroup) findViewById(R.id.radioGroupVermeer);
        radioGroupVermeer.clearCheck();

        RadioGroup radioGroupPicasso = (RadioGroup) findViewById(R.id.radioGroupPicasso);
        radioGroupPicasso.clearCheck();

        RadioGroup radioGroupBosch = (RadioGroup) findViewById(R.id.radioGroupBosch);
        radioGroupBosch.clearCheck();

        RadioGroup radioGroupBotticelli = (RadioGroup) findViewById(R.id.radioGroupBotticelli);
        radioGroupBotticelli.clearCheck();

        RadioGroup radioGroupMillais = (RadioGroup) findViewById(R.id.radioGroupMillais);
        radioGroupMillais.clearCheck();

        RadioGroup radioGroupGogh = (RadioGroup) findViewById(R.id.radioGroupGogh);
        radioGroupGogh.clearCheck();

        RadioGroup radioGroupSeurat = (RadioGroup) findViewById(R.id.radioGroupSeurat);
        radioGroupSeurat.clearCheck();
    }

}



