package ef;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16662b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(int i, String str, boolean z4) {
        this.f16661a = i;
        this.f16662b = str;
        this.c = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f16661a) {
            case 0:
                Thread thread = new Thread(runnable, this.f16662b);
                thread.setDaemon(this.c);
                return thread;
            default:
                return Util.threadFactory$lambda$1(this.f16662b, this.c, runnable);
        }
    }
}
