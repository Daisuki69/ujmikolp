package Pc;

import D.CallableC0183p;
import G6.v;
import Kh.J;
import Lh.h;
import N5.k1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.paymaya.domain.store.K0;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a implements Oc.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K0 f5153d;

    public d(K0 k02) {
        this.f5153d = k02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        Tc.c cVar = (Tc.c) this.c.get();
        Bundle arguments = ((ShareSaveDialogFragment) ((Tc.c) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        k1 k1Var = ((ShareSaveDialogFragment) cVar).f14390R;
        j.d(k1Var);
        ((TextView) k1Var.f4139d).setText(string);
        Intent intent = ((ShareSaveDialogFragment) ((Tc.c) this.c.get())).f14393U;
        if (intent == null) {
            j.n("intent");
            throw null;
        }
        String type = intent.getType();
        Intent intent2 = ((ShareSaveDialogFragment) ((Tc.c) this.c.get())).f14393U;
        if (intent2 == null) {
            j.n("intent");
            throw null;
        }
        String stringExtra = intent2.getStringExtra("android.intent.extra.TEXT");
        String strO1 = ((ShareSaveDialogFragment) ((Tc.c) this.c.get())).o1();
        K0 k02 = this.f5153d;
        k02.getClass();
        e(new Lh.d(new Lh.d(new h(new J(new CallableC0183p(type, stringExtra, strO1, k02), 3).h(Th.e.c), zh.b.a(), 0), new Gb.d(this, 23), 2), new v(this, 27), 0).e());
    }
}
