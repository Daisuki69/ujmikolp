package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import mx_android.support.v7.appcompat.R;

/* JADX INFO: loaded from: classes7.dex */
public class AppCompatPopupWindow extends PopupWindow {
    private final boolean mOverlapAnchor;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.PopupWindow, i, 0);
        this.mOverlapAnchor = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i4) {
        if (Build.VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i4, int i6) {
        if (Build.VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i4, i6);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i4, int i6, int i10) {
        if (Build.VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            i4 -= view.getHeight();
        }
        super.update(view, i, i4, i6, i10);
    }
}
