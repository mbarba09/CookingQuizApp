// Generated code from Butter Knife. Do not modify!
package com.example.android.cookingquiz;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.burgerImageView = Utils.findRequiredViewAsType(source, R.id.burger, "field 'burgerImageView'", ImageView.class);
    target.quizBanner = Utils.findRequiredViewAsType(source, R.id.banner, "field 'quizBanner'", ImageView.class);
    target.setTextHeader = Utils.findRequiredViewAsType(source, R.id.quizHeader, "field 'setTextHeader'", TextView.class);
    target.setTextQuestion = Utils.findRequiredViewAsType(source, R.id.quizQuestion, "field 'setTextQuestion'", TextView.class);
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.quizRadioGroup, "field 'radioGroup'", RadioGroup.class);
    target.radioButton1 = Utils.findRequiredViewAsType(source, R.id.radio1, "field 'radioButton1'", RadioButton.class);
    target.radioButton2 = Utils.findRequiredViewAsType(source, R.id.radio2, "field 'radioButton2'", RadioButton.class);
    target.radioButton3 = Utils.findRequiredViewAsType(source, R.id.radio3, "field 'radioButton3'", RadioButton.class);
    target.radioButton4 = Utils.findRequiredViewAsType(source, R.id.radio4, "field 'radioButton4'", RadioButton.class);
    target.checkboxView = Utils.findRequiredViewAsType(source, R.id.checkbox, "field 'checkboxView'", LinearLayout.class);
    target.checkBox1 = Utils.findRequiredViewAsType(source, R.id.checkboxOption1, "field 'checkBox1'", CheckBox.class);
    target.checkBox2 = Utils.findRequiredViewAsType(source, R.id.checkboxOption2, "field 'checkBox2'", CheckBox.class);
    target.checkBox3 = Utils.findRequiredViewAsType(source, R.id.checkboxOption3, "field 'checkBox3'", CheckBox.class);
    target.checkBox4 = Utils.findRequiredViewAsType(source, R.id.checkboxOption4, "field 'checkBox4'", CheckBox.class);
    target.checkBoxText1 = Utils.findRequiredViewAsType(source, R.id.checkboxText1, "field 'checkBoxText1'", TextView.class);
    target.checkBoxText2 = Utils.findRequiredViewAsType(source, R.id.checkboxText2, "field 'checkBoxText2'", TextView.class);
    target.checkBoxText3 = Utils.findRequiredViewAsType(source, R.id.checkboxText3, "field 'checkBoxText3'", TextView.class);
    target.checkBoxText4 = Utils.findRequiredViewAsType(source, R.id.checkboxText4, "field 'checkBoxText4'", TextView.class);
    target.userInput = Utils.findRequiredViewAsType(source, R.id.editTextInput, "field 'userInput'", EditText.class);
    target.button = Utils.findRequiredViewAsType(source, R.id.quizButton, "field 'button'", Button.class);
    target.displayScore = Utils.findRequiredViewAsType(source, R.id.score_textView, "field 'displayScore'", TextView.class);
    target.scoreView = Utils.findRequiredView(source, R.id.score_view, "field 'scoreView'");
    target.commentTextView = Utils.findRequiredViewAsType(source, R.id.commentTextView, "field 'commentTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.burgerImageView = null;
    target.quizBanner = null;
    target.setTextHeader = null;
    target.setTextQuestion = null;
    target.radioGroup = null;
    target.radioButton1 = null;
    target.radioButton2 = null;
    target.radioButton3 = null;
    target.radioButton4 = null;
    target.checkboxView = null;
    target.checkBox1 = null;
    target.checkBox2 = null;
    target.checkBox3 = null;
    target.checkBox4 = null;
    target.checkBoxText1 = null;
    target.checkBoxText2 = null;
    target.checkBoxText3 = null;
    target.checkBoxText4 = null;
    target.userInput = null;
    target.button = null;
    target.displayScore = null;
    target.scoreView = null;
    target.commentTextView = null;
  }
}
