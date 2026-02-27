package u4;

import cj.C1132s;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2299a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f20260a = C1132s.g("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20261b;
    public static final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f20262d;
    public static final long e;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f20261b = timeUnit.toMillis(1L);
        c = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f20262d = timeUnit2.toMillis(6L);
        e = timeUnit2.toMillis(5L);
    }
}
