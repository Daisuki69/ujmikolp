package df;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: df.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1356B implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1364f f16392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gf.k f16393b;
    public final C1365g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16394d;

    public C1356B(C1364f c1364f, C1365g c1365g) {
        this.f16392a = c1364f;
        this.c = c1365g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final df.k a() throws java.lang.Throwable {
        /*
            r10 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            df.f r0 = r10.f16392a
            java.util.List r2 = r0.f16424d
            r1.addAll(r2)
            hf.a r2 = new hf.a
            r3 = 1
            r2.<init>(r0, r3)
            r1.add(r2)
            hf.a r2 = new hf.a
            N4.d r3 = r0.h
            r4 = 0
            r2.<init>(r3, r4)
            r1.add(r2)
            ff.a r2 = new ff.a
            r3 = 0
            r2.<init>(r3)
            r1.add(r2)
            ff.a r2 = new ff.a
            r3 = 1
            r2.<init>(r3)
            r1.add(r2)
            java.util.List r2 = r0.e
            r1.addAll(r2)
            ff.a r2 = new ff.a
            r3 = 2
            r2.<init>(r3)
            r1.add(r2)
            r2 = r0
            hf.b r0 = new hf.b
            r3 = r2
            gf.k r2 = r10.f16393b
            r4 = r3
            r3 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            df.g r5 = r10.c
            int r7 = r6.f16436v
            int r8 = r6.f16437w
            int r9 = r6.f16438x
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            df.k r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            gf.k r2 = r6.f16393b     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            boolean r2 = r2.e()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            if (r2 != 0) goto L6a
            gf.k r2 = r6.f16393b
            r2.b(r1)
            return r0
        L6a:
            ef.c.h(r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            throw r0     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
        L75:
            r0 = move-exception
            goto L79
        L77:
            r0 = move-exception
            goto L7b
        L79:
            r2 = 0
            goto L84
        L7b:
            gf.k r2 = r6.f16393b     // Catch: java.lang.Throwable -> L82
            java.io.IOException r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            r2 = 1
        L84:
            if (r2 != 0) goto L8b
            gf.k r2 = r6.f16393b
            r2.b(r1)
        L8b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df.C1356B.a():df.k");
    }

    public final k b() {
        synchronized (this) {
            if (this.f16394d) {
                throw new IllegalStateException("Already Executed");
            }
            this.f16394d = true;
        }
        this.f16393b.e.k();
        gf.k kVar = this.f16393b;
        kVar.getClass();
        kVar.f = kf.f.f18131a.b();
        kVar.f16837d.getClass();
        try {
            com.google.firebase.messaging.r rVar = this.f16392a.f16422a;
            synchronized (rVar) {
                ((ArrayDeque) rVar.f9804d).add(this);
            }
            return a();
        } finally {
            com.google.firebase.messaging.r rVar2 = this.f16392a.f16422a;
            rVar2.g((ArrayDeque) rVar2.f9804d, this);
        }
    }

    public final Object clone() {
        C1364f c1364f = this.f16392a;
        C1356B c1356b = new C1356B(c1364f, this.c);
        c1356b.f16393b = new gf.k(c1364f, c1356b);
        return c1356b;
    }
}
