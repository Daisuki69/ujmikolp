package Q4;

import com.paymaya.PayMayaApplication;
import defpackage.Hardware;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Hardware f5256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5256d = new Hardware(null, null, null, null, 15, null);
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new v(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "hardware";
    }
}
