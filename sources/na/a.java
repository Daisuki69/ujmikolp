package Na;

import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f4352b;

    public /* synthetic */ a(AlertDialog alertDialog, int i) {
        this.f4351a = i;
        this.f4352b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4351a) {
            case 0:
                AlertDialog alertDialog = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog.dismiss();
                    return;
                } finally {
                }
            case 1:
                AlertDialog alertDialog2 = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog2.dismiss();
                    return;
                } finally {
                }
            case 2:
                AlertDialog alertDialog3 = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog3.dismiss();
                    return;
                } finally {
                }
            case 3:
                AlertDialog alertDialog4 = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog4.dismiss();
                    return;
                } finally {
                }
            case 4:
                AlertDialog alertDialog5 = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog5.dismiss();
                    return;
                } finally {
                }
            default:
                AlertDialog alertDialog6 = this.f4352b;
                Callback.onClick_enter(view);
                try {
                    alertDialog6.dismiss();
                    return;
                } finally {
                }
        }
    }
}
