package ir.smartlab.persiandatepicker.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class TypeFaceChangeableNumberPicker extends NumberPicker {

    private Typeface typeface;

    public TypeFaceChangeableNumberPicker(Context context) {
        super(context);
    }

    public TypeFaceChangeableNumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TypeFaceChangeableNumberPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        ((EditText)child).setTypeface(typeface);
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }
}
