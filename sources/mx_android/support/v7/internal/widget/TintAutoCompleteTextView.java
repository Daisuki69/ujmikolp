package mx_android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes7.dex */
public class TintAutoCompleteTextView extends AutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.popupBackground};
    private final TintManager mTintManager;

    public TintAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public TintAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public TintAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            setDropDownBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(1));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mTintManager = tintTypedArrayObtainStyledAttributes.getTintManager();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(this.mTintManager.getDrawable(i));
    }
}
