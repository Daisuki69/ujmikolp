package M6;

import G6.s;
import android.os.Bundle;
import android.view.View;
import androidx.navigation.Navigation;
import com.dynatrace.android.callback.Callback;
import w1.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3103b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Bundle bundle) {
        this.f3102a = 1;
        this.f3103b = i;
        this.c = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3102a) {
            case 0:
                f fVar = (f) this.c;
                Callback.onClick_enter(view);
                try {
                    J6.d dVar = fVar.f3104a;
                    int i = dVar.f2426d;
                    int i4 = this.f3103b;
                    if (i4 != i) {
                        dVar.f2426d = i4;
                        dVar.notifyDataSetChanged();
                        int iIntValue = ((Number) dVar.f2424a.get(dVar.f2426d)).intValue();
                        s sVarH1 = dVar.f2425b.H1();
                        sVarH1.f1814g = iIntValue;
                        sVarH1.k();
                    }
                    return;
                } finally {
                }
            case 1:
                Navigation.m117x54c2312e(this.f3103b, (Bundle) this.c, view);
                return;
            default:
                w1.k kVar = (w1.k) this.c;
                Callback.onClick_enter(view);
                try {
                    int i6 = kVar.c;
                    t tVar = kVar.f20572d;
                    if (this.f3103b != i6) {
                        tVar.setPlaybackSpeed(kVar.f20571b[r2] / 100.0f);
                    }
                    tVar.u0.dismiss();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ e(Object obj, int i, int i4) {
        this.f3102a = i4;
        this.c = obj;
        this.f3103b = i;
    }
}
