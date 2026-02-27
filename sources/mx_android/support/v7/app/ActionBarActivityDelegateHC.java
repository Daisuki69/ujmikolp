package mx_android.support.v7.app;

import android.R;
import android.view.ActionMode;
import android.view.View;
import mx_android.support.v7.internal.view.SupportActionModeWrapper;
import mx_android.support.v7.internal.widget.NativeActionModeAwareLayout;

/* JADX INFO: loaded from: classes7.dex */
class ActionBarActivityDelegateHC extends ActionBarActivityDelegateBase implements NativeActionModeAwareLayout.OnActionModeForChildListener {
    private NativeActionModeAwareLayout mNativeActionModeAwareLayout;

    ActionBarActivityDelegateHC(ActionBarActivity actionBarActivity) {
        super(actionBarActivity);
    }

    @Override // mx_android.support.v7.app.ActionBarActivityDelegateBase
    void onSubDecorInstalled() {
        NativeActionModeAwareLayout nativeActionModeAwareLayout = (NativeActionModeAwareLayout) this.mActivity.findViewById(R.id.content);
        this.mNativeActionModeAwareLayout = nativeActionModeAwareLayout;
        if (nativeActionModeAwareLayout != null) {
            nativeActionModeAwareLayout.setActionModeForChildListener(this);
        }
    }

    @Override // mx_android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        mx_android.support.v7.view.ActionMode actionModeStartSupportActionMode = startSupportActionMode(new SupportActionModeWrapper.CallbackWrapper(view.getContext(), callback));
        if (actionModeStartSupportActionMode != null) {
            return new SupportActionModeWrapper(this.mActivity, actionModeStartSupportActionMode);
        }
        return null;
    }
}
