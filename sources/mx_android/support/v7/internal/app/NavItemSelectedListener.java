package mx_android.support.v7.internal.app;

import android.view.View;
import mx_android.support.v7.app.ActionBar;
import mx_android.support.v7.internal.widget.AdapterViewCompat;

/* JADX INFO: loaded from: classes7.dex */
class NavItemSelectedListener implements AdapterViewCompat.OnItemSelectedListener {
    private final ActionBar.OnNavigationListener mListener;

    @Override // mx_android.support.v7.internal.widget.AdapterViewCompat.OnItemSelectedListener
    public void onNothingSelected(AdapterViewCompat<?> adapterViewCompat) {
    }

    public NavItemSelectedListener(ActionBar.OnNavigationListener onNavigationListener) {
        this.mListener = onNavigationListener;
    }

    @Override // mx_android.support.v7.internal.widget.AdapterViewCompat.OnItemSelectedListener
    public void onItemSelected(AdapterViewCompat<?> adapterViewCompat, View view, int i, long j) {
        ActionBar.OnNavigationListener onNavigationListener = this.mListener;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i, j);
        }
    }
}
