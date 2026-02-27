package Q4;

import com.paymaya.PayMayaApplication;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends F4.a {
    public final A5.j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(PayMayaApplication context, A5.j jVar) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = jVar;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new J(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "threats";
    }
}
