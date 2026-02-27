package hi;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: hi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1577b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17049b;
    public static final long c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f17048a = timeUnit.toSeconds(90L);
        timeUnit.toSeconds(10L);
        f17049b = timeUnit.toSeconds(10L);
        c = TimeUnit.HOURS.toMillis(4L);
    }
}
