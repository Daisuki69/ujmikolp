package Tj;

import M8.T;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final long[] e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rj.d f5857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f5858b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f5859d;

    public d(Rj.d descriptor, T t5) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        this.f5857a = descriptor;
        this.f5858b = t5;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.f5859d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.f5859d = jArr;
    }
}
