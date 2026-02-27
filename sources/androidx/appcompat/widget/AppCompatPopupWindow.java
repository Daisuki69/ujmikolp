package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.core.widget.PopupWindowCompat;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i4) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.PopupWindow, i, i4);
        int i6 = R.styleable.PopupWindow_overlapAnchor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i6)) {
            setSupportOverlapAnchor(tintTypedArrayObtainStyledAttributes.getBoolean(i6, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z4) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z4;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z4);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i4) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i4, int i6, int i10) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.update(view, i, i4, i6, i10);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i4) {
        super(context, attributeSet, i, i4);
        init(context, attributeSet, i, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i4, int i6) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i4, i6);
    }
}
