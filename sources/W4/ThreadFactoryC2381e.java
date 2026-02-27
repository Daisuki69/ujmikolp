package w4;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: w4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC2381e implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadFactoryC2381e f20693a = new ThreadFactoryC2381e();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
