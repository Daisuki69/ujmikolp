package mx_android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class NativeActionModeAwareLayout extends ContentFrameLayout {
    private OnActionModeForChildListener mActionModeForChildListener;

    public interface OnActionModeForChildListener {
        ActionMode startActionModeForChild(View view, ActionMode.Callback callback);
    }

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setActionModeForChildListener(OnActionModeForChildListener onActionModeForChildListener) {
        this.mActionModeForChildListener = onActionModeForChildListener;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        OnActionModeForChildListener onActionModeForChildListener = this.mActionModeForChildListener;
        if (onActionModeForChildListener != null) {
            return onActionModeForChildListener.startActionModeForChild(view, callback);
        }
        return super.startActionModeForChild(view, callback);
    }
}
