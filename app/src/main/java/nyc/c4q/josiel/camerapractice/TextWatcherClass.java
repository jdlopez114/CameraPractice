package nyc.c4q.josiel.camerapractice;


import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextWatcherClass implements TextWatcher {

    private TextView textView;
    private EditText editText;

    public TextWatcherClass(TextView textView, EditText editText) {
        this.textView = textView;
        this.editText = editText;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() == 0) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setText(editText.getText());
        }
    }
}
