package Q4;

import com.paymaya.PayMayaApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5251d;
    public final ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5251d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new o(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "contact";
    }
}
