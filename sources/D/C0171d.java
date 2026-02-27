package D;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: D.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0171d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0176i f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0176i f903b;
    public final CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f904d;
    public final B e;
    public final N.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.g f905g;
    public final a0 h;
    public final l0.c i;

    public C0171d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C0176i c0176i, B b8, a0 a0Var, g0.g gVar, r rVar, N.k kVar, C0176i c0176i2, l0.c cVar) {
        this.f904d = context;
        this.c = cleverTapInstanceConfig;
        this.f902a = c0176i;
        this.e = b8;
        this.h = a0Var;
        this.f905g = gVar;
        this.f = kVar;
        this.f903b = c0176i2;
        this.i = cVar;
    }

    public static void a(C0171d c0171d) {
        CleverTapInstanceConfig cleverTapInstanceConfig = c0171d.c;
        S sC = cleverTapInstanceConfig.c();
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str, numX49.tnTj78("PekR"));
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(c0171d.f904d).build();
            installReferrerClientBuild.startConnection(new A7.f(7, c0171d, installReferrerClientBuild, false));
        } catch (Throwable th2) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = numX49.tnTj78("Pekp") + th2.getLocalizedMessage() + numX49.tnTj78("Pek0");
            sC2.getClass();
            S.s(str, str2);
        }
    }

    public final void b() {
        B.f798v = false;
        this.h.c = System.currentTimeMillis();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        S sC = cleverTapInstanceConfig.c();
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str, numX49.tnTj78("Pekg"));
        this.i.b().k(numX49.tnTj78("Pekf"), new CallableC0169b(this, 0));
    }

    public final void c() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        S sC = cleverTapInstanceConfig.c();
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.s(str, numX49.tnTj78("Pek1"));
        a0 a0Var = this.h;
        if (a0Var.c > 0 && System.currentTimeMillis() - a0Var.c > 1200000) {
            CleverTapInstanceConfig cleverTapInstanceConfig2 = a0Var.e;
            S sC2 = cleverTapInstanceConfig2.c();
            String str2 = cleverTapInstanceConfig2.f9439a;
            sC2.getClass();
            S.s(str2, numX49.tnTj78("Pekn"));
            a0Var.b();
        }
        if (!this.e.i()) {
            C0176i c0176i = this.f902a;
            c0176i.o();
            c0176i.h();
            g0.g gVar = this.f905g;
            l0.b.a(gVar.f).c(numX49.tnTj78("Pekx")).k(numX49.tnTj78("Peks"), new g0.f(gVar, 2));
            l0.c cVar = this.i;
            cVar.b().k(numX49.tnTj78("Pek5"), new CallableC0169b(this, 1));
            cVar.a().k(numX49.tnTj78("PekJ"), new CallableC0168a(this, 0));
        }
        this.f903b.t();
        this.f.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0004, B:10:0x0014, B:12:0x001a, B:14:0x0023, B:6:0x0008), top: B:25:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.os.Bundle r3, android.net.Uri r4, java.lang.String r5) {
        /*
            r2 = this;
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r2.c
            if (r5 != 0) goto L8
            boolean r1 = r0.f9447p     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L10
        L8:
            java.lang.String r0 = r0.f9439a     // Catch: java.lang.Throwable -> L27
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L49
        L10:
            D.i r5 = r2.f902a
            if (r3 == 0) goto L29
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            java.lang.String r0 = "wzrk_pn"
            boolean r0 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            r5.v(r3)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r3 = move-exception
            goto L30
        L29:
            if (r4 == 0) goto L49
            r3 = 0
            r5.q(r4, r3)     // Catch: java.lang.Throwable -> L49
            goto L49
        L30:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "PekI"
            java.lang.String r5 = dOYHB6.tiZVw8.numX49.tnTj78(r5)
            r4.<init>(r5)
            java.lang.String r3 = r3.getLocalizedMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            D.S.l(r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0171d.d(android.os.Bundle, android.net.Uri, java.lang.String):void");
    }
}
