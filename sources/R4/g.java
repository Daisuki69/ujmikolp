package R4;

import bg.C1003i;
import com.paymaya.PayMayaApplication;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5465a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5466b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(j jVar, Gj.c cVar, Function2 function2, PayMayaApplication payMayaApplication) {
        super(1);
        this.f5466b = jVar;
        this.c = cVar;
        this.e = (k) function2;
        this.f = payMayaApplication;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.k] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f5465a
            switch(r0) {
                case 0: goto L2a;
                default: goto L5;
            }
        L5:
            java.util.List r13 = (java.util.List) r13
            java.lang.String r0 = "filteredConfigurations"
            kotlin.jvm.internal.j.h(r13, r0)
            Z.n r0 = new Z.n
            r1 = 2
            r2 = 0
            r0.<init>(r1, r12, r13, r2)
            java.lang.Object r13 = r12.e
            java.util.concurrent.ExecutorService r13 = (java.util.concurrent.ExecutorService) r13
            java.util.concurrent.Future r13 = r13.submit(r0)
            java.lang.String r0 = "executorService.submit(C…asInternal\n            })"
            kotlin.jvm.internal.j.c(r13, r0)
            java.lang.Object r0 = r12.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r13)
            kotlin.Unit r13 = kotlin.Unit.f18162a
            return r13
        L2a:
            android.location.Location r13 = (android.location.Location) r13
            r0 = 3
            java.lang.Object r1 = r12.c
            Gj.c r1 = (Gj.c) r1
            java.lang.Object r2 = r12.f
            com.paymaya.PayMayaApplication r2 = (com.paymaya.PayMayaApplication) r2
            java.lang.Object r3 = r12.e
            kotlin.jvm.internal.k r3 = (kotlin.jvm.internal.k) r3
            r4 = 0
            if (r13 == 0) goto Lae
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r13.getElapsedRealtimeNanos()
            long r5 = r5 - r7
            double r5 = (double) r5
            r7 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r5 = r5 / r7
            long r5 = (long) r5
            java.lang.String r7 = "Cache validity: "
            java.lang.String r7 = androidx.camera.core.impl.a.f(r5, r7)
            java.lang.Object r8 = r12.f5466b
            R4.j r8 = (R4.j) r8
            java.lang.Class r8 = r8.getClass()
            kotlin.jvm.internal.e r8 = kotlin.jvm.internal.z.a(r8)
            java.lang.String r8 = r8.c()
            if (r8 != 0) goto L67
            java.lang.String r8 = "LocationUtility"
        L67:
            r9 = 2
            M8.A0.w(r9, r7, r8)
            r7 = 300(0x12c, double:1.48E-321)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L7b
            R4.e r13 = new R4.e
            r13.<init>(r2, r3, r4)
            Bj.B0 r13 = Bj.H.w(r1, r4, r4, r13, r0)
            goto Lac
        L7b:
            Location r5 = new Location
            double r6 = r13.getLatitude()
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            double r7 = r13.getLongitude()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r8 < r9) goto L98
            boolean r13 = Je.a.y(r13)
            goto L9c
        L98:
            boolean r13 = r13.isFromMockProvider()
        L9c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r9 = 0
            r10 = 8
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.invoke(r5, r4)
            kotlin.Unit r13 = kotlin.Unit.f18162a
        Lac:
            if (r13 != 0) goto Lb6
        Lae:
            R4.f r13 = new R4.f
            r13.<init>(r2, r3, r4)
            Bj.H.w(r1, r4, r4, r13, r0)
        Lb6:
            kotlin.Unit r13 = kotlin.Unit.f18162a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.g.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C1003i c1003i, ArrayList arrayList, ExecutorService executorService, M5.c cVar) {
        super(1);
        this.f5466b = c1003i;
        this.c = arrayList;
        this.e = executorService;
        this.f = cVar;
    }
}
