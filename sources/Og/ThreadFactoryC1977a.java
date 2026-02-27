package og;

import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: og.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC1977a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18846a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bQVP"));
        int i = this.f18846a;
        this.f18846a = i + 1;
        sb2.append(i);
        thread.setName(sb2.toString());
        return thread;
    }
}
