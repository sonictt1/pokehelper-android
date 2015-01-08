package com.bearsoft.pokeassistant.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bearsoft.pokeassistant.R;

/**
 * Created by Sonic on 12/14/2014.
 */
public class ButtonView extends Button {

    private String buttonText = "Placeholder";
    private View rootView;
    private TextView label;
    private Context context;

    public ButtonView(Context context)
    {
        super(context);
        sharedConstructor(context, "Placeholder");
    }

    public ButtonView(Context context, String buttonLabel)
    {
        super(context);
        sharedConstructor(context, buttonLabel);
    }

    private void sharedConstructor(Context context, String buttonLabel)
    {
        buttonText = buttonLabel;
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        rootView = inflater.inflate(R.layout.view_button, null, false);
        label = (TextView) rootView.findViewById(R.id.button_view_text);
        label.setText(buttonText);
    }

    public void setButtonText(String text)
    {
        buttonText = text;
        label.setText(buttonText);
    }
}
