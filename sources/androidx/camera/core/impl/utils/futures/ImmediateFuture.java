package androidx.camera.core.impl.utils.futures;

import S1.y;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
abstract class ImmediateFuture<V> implements y {
    private static final String TAG = "ImmediateFuture";

    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {

        @NonNull
        private final Throwable mCause;

        public ImmediateFailedFuture(@NonNull Throwable th2) {
            this.mCause = th2;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        @Nullable
        public V get() throws ExecutionException {
            throw new ExecutionException(this.mCause);
        }

        @NonNull
        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(@NonNull Throwable th2) {
            super(th2);
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(@NonNull TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture(null);

        @Nullable
        private final V mValue;

        public ImmediateSuccessfulFuture(@Nullable V v7) {
            this.mValue = v7;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        @Nullable
        public V get() {
            return this.mValue;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append("[status=SUCCESS, result=[");
            return androidx.camera.core.impl.a.m(sb2, this.mValue, "]]");
        }
    }

    public static <V> y nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    @Override // S1.y
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
