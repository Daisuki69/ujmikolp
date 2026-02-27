package bi;

import dOYHB6.tiZVw8.numX49;
import java.lang.Thread;

/* JADX INFO: renamed from: bi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1023a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9145a;

    public /* synthetic */ C1023a(int i) {
        this.f9145a = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        String strTnTj78 = numX49.tnTj78("bu6P");
        switch (this.f9145a) {
            case 0:
                Ri.a.g(strTnTj78 + th2.getLocalizedMessage());
                break;
            case 1:
                Ri.a.g(strTnTj78 + th2.getLocalizedMessage());
                break;
            default:
                Ri.a.i(th2, numX49.tnTj78("bu6b"), thread.getName());
                break;
        }
    }
}
