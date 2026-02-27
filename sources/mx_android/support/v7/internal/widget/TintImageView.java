package mx_android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class TintImageView extends ImageView {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.src};
    private final TintManager mTintManager;

    public TintImageView(Context context) {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        if (tintTypedArrayObtainStyledAttributes.length() > 0) {
            if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
                setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(1));
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.mTintManager = tintTypedArrayObtainStyledAttributes.getTintManager();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(this.mTintManager.getDrawable(i));
    }
}
