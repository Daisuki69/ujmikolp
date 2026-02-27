package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class VideoUsageControl {
    private final Executor executor;
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(Executor executor) {
        kotlin.jvm.internal.j.g(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl this$0) {
        kotlin.jvm.internal.j.g(this$0, "this$0");
        int iDecrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
        } else {
            Logger.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl this$0) {
        kotlin.jvm.internal.j.g(this$0, "this$0");
        Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl this$0) {
        kotlin.jvm.internal.j.g(this$0, "this$0");
        this$0.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new Y(this, 0));
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new Y(this, 2));
    }

    public final void reset() {
        this.executor.execute(new Y(this, 1));
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
