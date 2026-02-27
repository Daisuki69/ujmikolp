package mx_android.support.v7.widget;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import mx_android.support.v7.internal.app.WindowCallback;
import mx_android.support.v7.view.ActionMode;

/* JADX INFO: loaded from: classes7.dex */
public class WindowCallbackWrapper implements WindowCallback {
    private WindowCallback mWrapped;

    public WindowCallbackWrapper(WindowCallback windowCallback) {
        if (windowCallback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.mWrapped = windowCallback;
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.mWrapped.onMenuItemSelected(i, menuItem);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.mWrapped.onCreatePanelMenu(i, menu);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.mWrapped.onPreparePanel(i, view, menu);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public void onPanelClosed(int i, Menu menu) {
        this.mWrapped.onPanelClosed(i, menu);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.mWrapped.onMenuOpened(i, menu);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return this.mWrapped.startActionMode(callback);
    }

    @Override // mx_android.support.v7.internal.app.WindowCallback
    public View onCreatePanelView(int i) {
        return this.mWrapped.onCreatePanelView(i);
    }
}
