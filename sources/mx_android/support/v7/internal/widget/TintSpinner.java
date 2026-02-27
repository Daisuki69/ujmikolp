package mx_android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class TintSpinner extends Spinner {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.popupBackground};

    public TintSpinner(Context context) {
        this(context, null);
    }

    public TintSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public TintSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(1);
            if (Build.VERSION.SDK_INT >= 16) {
                setPopupBackgroundDrawable(drawable);
            } else if (Build.VERSION.SDK_INT >= 11) {
                setPopupBackgroundDrawableV11(this, drawable);
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private static void setPopupBackgroundDrawableV11(Spinner spinner, Drawable drawable) {
        try {
            Field declaredField = Spinner.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(spinner);
            if (obj instanceof ListPopupWindow) {
                ((ListPopupWindow) obj).setBackgroundDrawable(drawable);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
    }
}
