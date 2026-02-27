package c2;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC1058a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f9251a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9252b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f9253d;

    public ThreadFactoryC1058a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f9252b = str;
        this.c = i;
        this.f9253d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = e.newThread(new androidx.media3.common.util.g(14, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f9252b + " Thread #" + this.f9251a.getAndIncrement());
        return threadNewThread;
    }
}
