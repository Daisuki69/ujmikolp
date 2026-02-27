package com.shield.android.u;

import com.google.firebase.messaging.n;
import com.shield.android.u.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    public static final c sl = new n(27);

    /* JADX INFO: renamed from: com.shield.android.u.c$1, reason: invalid class name */
    public class AnonymousClass1 implements c {
        private final int sm = Math.min(32, Runtime.getRuntime().availableProcessors());

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(d dVar, Phaser phaser) {
            dVar.createRunnable().run();
            phaser.arriveAndDeregister();
        }

        @Override // com.shield.android.u.c
        public final void execute(final d dVar) {
            int i = this.sm;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
            final Phaser phaser = new Phaser(1);
            for (int i4 = 0; i4 < this.sm; i4++) {
                Runnable runnable = new Runnable() { // from class: com.shield.android.u.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.AnonymousClass1.a(dVar, phaser);
                    }
                };
                phaser.register();
                threadPoolExecutor.execute(runnable);
            }
            phaser.arriveAndAwaitAdvance();
            threadPoolExecutor.shutdownNow();
        }
    }

    static {
        new AnonymousClass1();
    }

    void execute(d dVar);
}
