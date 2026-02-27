package p3;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends zzav {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f19030b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f19031a;

    public h() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: p3.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new n(runnable, 1));
            }
        });
        this.f19031a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f19030b.get();
        if (deque == null || deque.size() > 1) {
            this.f19031a.execute(new n(runnable, 0));
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ Object zza() {
        return this.f19031a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final ExecutorService zzb() {
        return this.f19031a;
    }
}
