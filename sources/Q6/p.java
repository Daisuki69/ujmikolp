package Q6;

import D.CallableC0183p;
import G6.u;
import Kh.J;
import N5.k1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.paymaya.domain.store.K0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractC2509a implements P6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K0 f5287d;

    public p(K0 k02) {
        this.f5287d = k02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 0;
        super.j();
        V6.f fVar = (V6.f) this.c.get();
        Bundle arguments = ((MayaShareSaveDialogFragment) ((V6.f) this.c.get())).getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        k1 k1Var = ((MayaShareSaveDialogFragment) fVar).f11886T;
        kotlin.jvm.internal.j.d(k1Var);
        ((TextView) k1Var.f4139d).setText(string);
        Intent intent = ((MayaShareSaveDialogFragment) ((V6.f) this.c.get())).f11889W;
        if (intent == null) {
            kotlin.jvm.internal.j.n("intent");
            throw null;
        }
        String type = intent.getType();
        Intent intent2 = ((MayaShareSaveDialogFragment) ((V6.f) this.c.get())).f11889W;
        if (intent2 == null) {
            kotlin.jvm.internal.j.n("intent");
            throw null;
        }
        String stringExtra = intent2.getStringExtra("android.intent.extra.TEXT");
        String strS1 = ((MayaShareSaveDialogFragment) ((V6.f) this.c.get())).s1();
        K0 k02 = this.f5287d;
        k02.getClass();
        e(new Lh.d(new Lh.d(new Lh.h(new J(new CallableC0183p(type, stringExtra, strS1, k02), 3).h(Th.e.c), zh.b.a(), 0), new G6.r(this, 29), 2), new u(this, 28), i).e());
    }
}
