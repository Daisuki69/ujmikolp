package We;

import android.os.Message;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: We.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0608l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Message f6410b;

    public /* synthetic */ RunnableC0608l(Message message, int i) {
        this.f6409a = i;
        this.f6410b = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6409a) {
            case 0:
                throw new AssertionError(numX49.tnTj78("bkRPf") + this.f6410b.what);
            default:
                throw new AssertionError(numX49.tnTj78("bkRPg") + this.f6410b.what);
        }
    }
}
