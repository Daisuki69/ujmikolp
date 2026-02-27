package p3;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f19044b;

    public /* synthetic */ n(Runnable runnable, int i) {
        this.f19043a = i;
        this.f19044b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19043a) {
            case 0:
                Deque deque = (Deque) h.f19030b.get();
                Preconditions.checkNotNull(deque);
                Runnable runnable = this.f19044b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                h.f19030b.set(new ArrayDeque());
                this.f19044b.run();
                break;
        }
    }
}
