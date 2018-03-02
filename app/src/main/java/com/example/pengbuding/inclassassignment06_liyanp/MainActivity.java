package com.example.pengbuding.inclassassignment06_liyanp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText studentNameEditText;
    private RadioButton maleRadioButton;
    private RadioButton femaleRadioButton;
    private EditText gradesEditText;
    private CheckBox passedCheckBox;
    private EditText otherCommentsEditText;
    private Student student;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentNameEditText = (EditText) findViewById(R.id.student_name_edit_text);
        maleRadioButton = (RadioButton) findViewById(R.id.male_radio_button);
        femaleRadioButton = (RadioButton) findViewById(R.id.female_radio_button);
        gradesEditText = (EditText) findViewById(R.id.grades_edit_text);
        passedCheckBox = (CheckBox) findViewById(R.id.passed_check_box);
        otherCommentsEditText = (EditText) findViewById(R.id.other_comments_edit_text);
        submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student = new Student(studentNameEditText.getText().toString(),
                        maleRadioButton.isChecked(),
                        femaleRadioButton.isChecked(),
                        Integer.parseInt(gradesEditText.getText().toString()),
                        passedCheckBox.isChecked(),
                        otherCommentsEditText.getText().toString());
                Intent intent = new Intent(v.getContext(), InformationActivity.class);
                intent.putExtra(Keys.STUDENT_KEY, student);
                startActivity(intent);
            }
        });
    }
}

