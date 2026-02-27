package Q4;

import com.paymaya.PayMayaApplication;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0564h extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5241d;
    public final ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0564h(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5241d = new ArrayList();
        this.e = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new C0563g(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "calendar_reminder";
    }
}
