package Ij;

import Gj.u;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f2370b;
    public static final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2371d;
    public static final long e;
    public static final g f;

    static {
        String property;
        int i = u.f2033a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f2369a = property;
        f2370b = Gj.a.h(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i4 = u.f2033a;
        if (i4 < 2) {
            i4 = 2;
        }
        c = Gj.a.i(i4, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f2371d = Gj.a.i(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(Gj.a.h(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = g.f2365a;
    }
}
