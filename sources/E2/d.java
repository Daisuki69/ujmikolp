package E2;

import C2.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p3.C2011b;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f1246d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1248b;
    public int c;

    public d() {
        if (C2011b.f19022b == null) {
            Pattern pattern = k.c;
            C2011b.f19022b = new C2011b(3);
        }
        C2011b c2011b = C2011b.f19022b;
        if (k.f687d == null) {
            k.f687d = new k(c2011b);
        }
        this.f1247a = k.f687d;
    }

    public final synchronized long a(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return f1246d;
        }
        double dPow = Math.pow(2.0d, this.c);
        this.f1247a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            C2.k r0 = r4.f1247a     // Catch: java.lang.Throwable -> L19
            p3.b r0 = r0.f688a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f1248b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.d.b():boolean");
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.c++;
        long jA = a(i);
        this.f1247a.f688a.getClass();
        this.f1248b = System.currentTimeMillis() + jA;
    }
}
