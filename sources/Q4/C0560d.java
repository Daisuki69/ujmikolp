package Q4;

import com.paymaya.PayMayaApplication;
import defpackage.Bluetooth;

/* JADX INFO: renamed from: Q4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0560d extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bluetooth f5237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560d(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new C0559c(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "bluetooth";
    }
}
