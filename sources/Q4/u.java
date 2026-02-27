package Q4;

import M8.A0;
import android.provider.Settings;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import bj.C1038i;
import com.paymaya.PayMayaApplication;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends F4.a {
    public final PayMayaApplication c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new s(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "general_data";
    }

    public final String e(String str) {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = Settings.Global.getString(this.c.getContentResolver(), str);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(u.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = this.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        return (String) objA;
    }
}
