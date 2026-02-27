package mx_android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/* JADX INFO: loaded from: classes7.dex */
public class TintButton extends Button {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.textAppearance};
    private final TintManager mTintManager;

    public TintButton(Context context) {
        this(context, null);
    }

    public TintButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public TintButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        this.mTintManager = tintTypedArrayObtainStyledAttributes.getTintManager();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(this.mTintManager.getDrawable(i));
    }
}
