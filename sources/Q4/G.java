package Q4;

import M8.A0;
import android.telephony.TelephonyManager;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import bj.C1038i;
import com.paymaya.PayMayaApplication;
import defpackage.Network;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends F4.a {
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5226d = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new F(this, null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "network";
    }

    public final void e() {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        try {
            C1037h.a aVar = C1037h.f9166b;
            Object systemService = this.c.getSystemService("phone");
            Object obj = null;
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null) {
                try {
                    objA2 = telephonyManager.getSimCountryIso();
                } catch (Throwable th2) {
                    C1037h.a aVar2 = C1037h.f9166b;
                    objA2 = AbstractC1039j.a(th2);
                }
            } else {
                objA2 = null;
            }
            Throwable thA = C1037h.a(objA2);
            if (thA != null) {
                String strB = C1030a.b(thA);
                String strC = kotlin.jvm.internal.z.a(G.class).c();
                if (strC == null) {
                    strC = "CoroutineScopedExtractor";
                }
                A0.w(2, strB, strC);
                G4.b bVar = this.f1548b;
                if (bVar != null) {
                    bVar.a(thA);
                }
            }
            if (objA2 instanceof C1038i) {
                objA2 = null;
            }
            String str = (String) objA2;
            if (telephonyManager != null) {
                try {
                    objA3 = telephonyManager.getSimOperatorName();
                } catch (Throwable th3) {
                    C1037h.a aVar3 = C1037h.f9166b;
                    objA3 = AbstractC1039j.a(th3);
                }
            } else {
                objA3 = null;
            }
            Throwable thA2 = C1037h.a(objA3);
            if (thA2 != null) {
                String strB2 = C1030a.b(thA2);
                String strC2 = kotlin.jvm.internal.z.a(G.class).c();
                if (strC2 == null) {
                    strC2 = "CoroutineScopedExtractor";
                }
                A0.w(2, strB2, strC2);
                G4.b bVar2 = this.f1548b;
                if (bVar2 != null) {
                    bVar2.a(thA2);
                }
            }
            if (objA3 instanceof C1038i) {
                objA3 = null;
            }
            String str2 = (String) objA3;
            if (telephonyManager != null) {
                try {
                    objA4 = Integer.valueOf(telephonyManager.getNetworkType()).toString();
                } catch (Throwable th4) {
                    C1037h.a aVar4 = C1037h.f9166b;
                    objA4 = AbstractC1039j.a(th4);
                }
            } else {
                objA4 = null;
            }
            Throwable thA3 = C1037h.a(objA4);
            if (thA3 != null) {
                String strB3 = C1030a.b(thA3);
                String strC3 = kotlin.jvm.internal.z.a(G.class).c();
                if (strC3 == null) {
                    strC3 = "CoroutineScopedExtractor";
                }
                A0.w(2, strB3, strC3);
                G4.b bVar3 = this.f1548b;
                if (bVar3 != null) {
                    bVar3.a(thA3);
                }
            }
            if (!(objA4 instanceof C1038i)) {
                obj = objA4;
            }
            this.f5226d.add(new Network((String) obj, str2, str, null, null, 24, null));
            objA = Unit.f18162a;
        } catch (Throwable th5) {
            C1037h.a aVar5 = C1037h.f9166b;
            objA = AbstractC1039j.a(th5);
        }
        Throwable thA4 = C1037h.a(objA);
        if (thA4 != null) {
            String strB4 = C1030a.b(thA4);
            String strC4 = kotlin.jvm.internal.z.a(G.class).c();
            A0.w(2, strB4, strC4 != null ? strC4 : "CoroutineScopedExtractor");
            G4.b bVar4 = this.f1548b;
            if (bVar4 != null) {
                bVar4.a(thA4);
            }
        }
    }
}
