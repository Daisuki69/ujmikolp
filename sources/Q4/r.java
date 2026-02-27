package Q4;

import com.paymaya.PayMayaApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends F4.a {
    public final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new q(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "device_font";
    }
}
