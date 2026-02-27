package Q4;

import M8.A0;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import com.paymaya.PayMayaApplication;
import defpackage.Location;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f5258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
    }

    @Override // F4.a
    public final void a() {
        Object objA;
        if (!d(cj.r.c("android.permission.ACCESS_FINE_LOCATION"), false) && !d(cj.r.c("android.permission.ACCESS_COARSE_LOCATION"), false)) {
            G4.b bVar = this.f1548b;
            if (bVar != null) {
                bVar.b(new K4.r(this.f5258d));
                return;
            }
            return;
        }
        try {
            C1037h.a aVar = C1037h.f9166b;
            R4.j.f5471a.c(this.c, new x(this));
            objA = Unit.f18162a;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(y.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar2 = this.f1548b;
            if (bVar2 != null) {
                bVar2.a(thA);
            }
        }
    }

    @Override // F4.a
    public final String b() {
        return "location";
    }
}
