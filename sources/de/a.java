package de;

import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f16359b;

    public /* synthetic */ a(AlertDialog alertDialog, int i) {
        this.f16358a = i;
        this.f16359b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16358a;
        Callback.onClick_enter(view);
        switch (i) {
            case 0:
                try {
                    this.f16359b.dismiss();
                    return;
                } finally {
                }
            case 1:
                try {
                    this.f16359b.dismiss();
                    return;
                } finally {
                }
            case 2:
                try {
                    this.f16359b.dismiss();
                    return;
                } finally {
                }
            default:
                try {
                    this.f16359b.dismiss();
                    return;
                } finally {
                }
        }
    }
}
