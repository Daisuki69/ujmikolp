package o2;

import Z0.e;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.core.impl.l;
import androidx.media3.exoplayer.ExoPlayer;
import c1.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.C1421c;
import h2.C1531a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.C2007c;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1957b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f18763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f18764b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18765d;
    public final int e;
    public final ArrayBlockingQueue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f18766g;
    public final r h;
    public final C1421c i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18767k;

    public C1957b(r rVar, C2007c c2007c, C1421c c1421c) {
        double d10 = c2007c.f19019d;
        long j = ((long) c2007c.f) * 1000;
        this.f18763a = d10;
        this.f18764b = c2007c.e;
        this.c = j;
        this.h = rVar;
        this.i = c1421c;
        this.f18765d = SystemClock.elapsedRealtime();
        int i = (int) d10;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.f18766g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f18767k = 0L;
    }

    public final int a() {
        if (this.f18767k == 0) {
            this.f18767k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f18767k) / this.c);
        int iMin = this.f.size() == this.e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f18767k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(C1531a c1531a, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + c1531a.f16854b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new Z0.a(c1531a.f16853a, e.c, null), new l(SystemClock.elapsedRealtime() - this.f18765d < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this, taskCompletionSource, c1531a));
    }
}
