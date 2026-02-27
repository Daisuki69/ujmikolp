package Z;

import D.S;
import ag.C0703m;
import bg.C0994d0;
import bg.C1003i;
import cj.L;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6844b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f6843a = i;
        this.c = obj;
        this.f6844b = obj2;
    }

    private final Object a() {
        ArrayList arrayList = new ArrayList();
        for (C0703m c0703m : (List) this.c) {
            String areaName = c0703m.a().d();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                arrayList.add(c0703m.a().b());
            } catch (Exception e) {
                String strC = X5.f.c(e);
                kotlin.jvm.internal.j.h(areaName, "areaName");
                arrayList.add(L.c(new Pair(areaName, strC)));
                Xf.b bVar = ((C1003i) ((R4.g) this.f6844b).f5466b).f8919a;
                if (bVar != null) {
                    bVar.b("Core", e, null);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            M5.c cVar = (M5.c) ((R4.g) this.f6844b).f;
            synchronized (cVar) {
                kotlin.jvm.internal.j.h(areaName, "extractorName");
                cVar.f3083a.add(new C0994d0(areaName, jCurrentTimeMillis, jCurrentTimeMillis2));
            }
        }
        return arrayList;
    }

    private final Object b() {
        synchronized (this) {
            try {
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Product_Config_" + ((CleverTapInstanceConfig) rVar.c).f9439a + Global.UNDERSCORE + ((String) rVar.f9803b));
                sb2.append("/config_settings.json");
                String string = sb2.toString();
                ((n0.d) this.f6844b).a(string);
                S sC = ((CleverTapInstanceConfig) ((com.google.firebase.messaging.r) this.c).c).c();
                sC.getClass();
                S.s(jk.b.l((CleverTapInstanceConfig) ((com.google.firebase.messaging.r) this.c).c), "Deleted settings file" + string);
            } catch (Exception e) {
                e.printStackTrace();
                S sC2 = ((CleverTapInstanceConfig) ((com.google.firebase.messaging.r) this.c).c).c();
                String strL = jk.b.l((CleverTapInstanceConfig) ((com.google.firebase.messaging.r) this.c).c);
                String str = "Error while resetting settings" + e.getLocalizedMessage();
                sC2.getClass();
                S.s(strL, str);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:48:0x0134, B:51:0x013c, B:52:0x014d, B:55:0x0155, B:69:0x0184, B:71:0x018a, B:78:0x019d, B:81:0x01a4, B:83:0x01c0, B:84:0x01d1, B:86:0x01d5, B:88:0x01db, B:89:0x0207, B:93:0x0224), top: B:114:0x0134 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.n.call():java.lang.Object");
    }

    public /* synthetic */ n(int i, Object obj, Object obj2, boolean z4) {
        this.f6843a = i;
        this.f6844b = obj;
        this.c = obj2;
    }
}
