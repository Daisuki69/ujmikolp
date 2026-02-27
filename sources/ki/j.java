package ki;

import bi.C1023a;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f18148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18149b;
    public final /* synthetic */ AtomicLong c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f18150d;
    public final /* synthetic */ C1023a e;

    public j(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, C1023a c1023a) {
        this.f18148a = threadFactory;
        this.f18149b = str;
        this.c = atomicLong;
        this.f18150d = bool;
        this.e = c1023a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f18148a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f18149b;
        AtomicLong atomicLong = this.c;
        Objects.requireNonNull(atomicLong);
        threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.f18150d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        C1023a c1023a = this.e;
        if (c1023a != null) {
            threadNewThread.setUncaughtExceptionHandler(c1023a);
        }
        return threadNewThread;
    }
}
