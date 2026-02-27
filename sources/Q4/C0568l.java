package Q4;

import com.paymaya.PayMayaApplication;
import defpackage.CollectorDetails;

/* JADX INFO: renamed from: Q4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0568l extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5245d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5246g;
    public final String h;
    public CollectorDetails i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568l(PayMayaApplication context, String str, String str2, String str3, String str4, String str5) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5245d = str;
        this.e = str2;
        this.f = str3;
        this.f5246g = str4;
        this.h = str5;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new C0567k(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "collector_detail_mini";
    }
}
