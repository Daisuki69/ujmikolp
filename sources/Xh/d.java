package Xh;

import hi.AbstractC1577b;
import java.util.concurrent.TimeUnit;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final long h;
    public static final long i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f6631k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.split.android.client.network.e f6632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6633b;
    public final Ff.f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6634d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1916a f6635g;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        h = timeUnit.toMillis(1L);
        i = timeUnit.toMillis(24L);
        j = AbstractC1577b.c;
    }

    public d(int i4, io.split.android.client.network.e eVar, Ff.f fVar, boolean z4, String str, long j6, C1916a c1916a) {
        this.f6633b = i4;
        this.f6632a = eVar;
        this.c = fVar;
        f6631k = "Android-5.4.1";
        this.f6634d = z4;
        this.e = str;
        this.f = j6;
        this.f6635g = c1916a;
    }
}
