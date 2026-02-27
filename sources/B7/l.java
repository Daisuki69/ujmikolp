package b7;

import android.view.View;
import c7.C1080d;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1080d f8553b;

    public /* synthetic */ l(C1080d c1080d, int i) {
        this.f8552a = i;
        this.f8553b = c1080d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8552a) {
            case 0:
                C1080d c1080d = this.f8553b;
                Callback.onClick_enter(view);
                try {
                    c1080d.f9305d.invoke();
                    return;
                } finally {
                }
            default:
                C1080d c1080d2 = this.f8553b;
                Callback.onClick_enter(view);
                try {
                    c1080d2.f9305d.invoke();
                    return;
                } finally {
                }
        }
    }
}
