package Q4;

import com.paymaya.PayMayaApplication;
import defpackage.MediaCount;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaCount f5221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new A(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "media_count";
    }
}
