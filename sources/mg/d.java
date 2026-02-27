package mg;

import Nh.j;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements CallAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f18417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f18418b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18419d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18420g;
    public final boolean h;

    public d(Type type, j jVar, boolean z4, boolean z5, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f18417a = type;
        this.f18418b = jVar;
        this.c = z4;
        this.f18419d = z5;
        this.e = z8;
        this.f = z9;
        this.f18420g = z10;
        this.h = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object adapt(retrofit2.Call r4) {
        /*
            r3 = this;
            Kh.f r0 = new Kh.f
            r1 = 3
            r0.<init>(r4, r1)
            boolean r4 = r3.c
            if (r4 == 0) goto L12
            mg.a r4 = new mg.a
            r1 = 1
            r4.<init>(r0, r1)
        L10:
            r0 = r4
            goto L1d
        L12:
            boolean r4 = r3.f18419d
            if (r4 == 0) goto L1d
            mg.a r4 = new mg.a
            r1 = 0
            r4.<init>(r0, r1)
            goto L10
        L1d:
            Nh.j r4 = r3.f18418b
            if (r4 == 0) goto L28
            Kh.j r1 = new Kh.j
            r2 = 4
            r1.<init>(r0, r4, r2)
            r0 = r1
        L28:
            boolean r4 = r3.e
            if (r4 == 0) goto L38
            Ih.q r4 = new Ih.q
            r1 = 0
            r4.<init>(r0, r1)
            Ih.x r0 = new Ih.x
            r0.<init>(r4)
            return r0
        L38:
            boolean r4 = r3.f
            if (r4 == 0) goto L43
            Kh.J r4 = new Kh.J
            r1 = 0
            r4.<init>(r0, r1)
            return r4
        L43:
            boolean r4 = r3.f18420g
            if (r4 == 0) goto L4d
            Kh.I r4 = new Kh.I
            r4.<init>(r0)
            return r4
        L4d:
            boolean r4 = r3.h
            if (r4 == 0) goto L58
            Hh.c r4 = new Hh.c
            r1 = 3
            r4.<init>(r0, r1)
            return r4
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.f18417a;
    }
}
