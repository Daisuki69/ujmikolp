package Nh;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4476b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4477d;

    public /* synthetic */ n(String str, int i, int i4, boolean z4) {
        this.f4475a = i4;
        this.f4476b = str;
        this.c = i;
        this.f4477d = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4475a) {
            case 0:
                String str = this.f4476b + '-' + incrementAndGet();
                Thread mVar = this.f4477d ? new m(runnable, str, 0) : new Thread(runnable, str);
                mVar.setPriority(this.c);
                mVar.setDaemon(true);
                return mVar;
            default:
                String str2 = this.f4476b + '-' + incrementAndGet();
                Thread mVar2 = this.f4477d ? new m(runnable, str2, 3) : new Thread(runnable, str2);
                mVar2.setPriority(this.c);
                mVar2.setDaemon(true);
                return mVar2;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        switch (this.f4475a) {
        }
        return We.s.p(new StringBuilder("RxThreadFactory["), this.f4476b, "]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, int i) {
        this(str, 5, 0, false);
        this.f4475a = i;
        switch (i) {
            case 1:
                this(str, 5, 1, false);
                break;
            default:
                break;
        }
    }
}
