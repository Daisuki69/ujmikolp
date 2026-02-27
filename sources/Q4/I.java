package Q4;

import com.paymaya.PayMayaApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5228d = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new H(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "sensor";
    }
}
