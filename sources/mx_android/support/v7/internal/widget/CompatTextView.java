package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import mx_android.support.v7.appcompat.R;
import mx_android.support.v7.internal.text.AllCapsTransformationMethod;

/* JADX INFO: loaded from: classes7.dex */
public class CompatTextView extends TextView {
    public CompatTextView(Context context) {
        this(context, null);
    }

    public CompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CompatTextView, i, 0);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CompatTextView_textAllCaps, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z4) {
            setTransformationMethod(new AllCapsTransformationMethod(context));
        }
    }
}
