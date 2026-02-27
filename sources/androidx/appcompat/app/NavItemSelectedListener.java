package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes.dex */
class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {
    private final ActionBar.OnNavigationListener mListener;

    public NavItemSelectedListener(ActionBar.OnNavigationListener onNavigationListener) {
        this.mListener = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Callback.onItemSelected_enter(view, i);
        try {
            ActionBar.OnNavigationListener onNavigationListener = this.mListener;
            if (onNavigationListener != null) {
                onNavigationListener.onNavigationItemSelected(i, j);
            }
            Callback.onItemSelected_exit();
        } catch (Throwable th2) {
            Callback.onItemSelected_exit();
            throw th2;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
