package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7911b;

    public /* synthetic */ f(String str, int i) {
        this.f7910a = i;
        this.f7911b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7910a) {
            case 0:
                return Util.lambda$newSingleThreadExecutor$3(this.f7911b, runnable);
            default:
                return Util.lambda$newSingleThreadScheduledExecutor$4(this.f7911b, runnable);
        }
    }
}
