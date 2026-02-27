package Q4;

import com.paymaya.PayMayaApplication;

/* JADX INFO: renamed from: Q4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0570n extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5248d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5249g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570n(PayMayaApplication context, String str, String str2, String str3, String str4, String str5) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5248d = str;
        this.e = str2;
        this.f = str3;
        this.f5249g = str4;
        this.h = str5;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new C0569m(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "collector_detail";
    }
}
