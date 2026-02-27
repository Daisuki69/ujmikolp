package androidx.camera.core.impl.utils.futures;

import S1.y;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    @Nullable
    private AsyncFunction<? super I, ? extends O> mFunction;

    @Nullable
    private y mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);

    @Nullable
    volatile y mOutputFuture;

    public ChainingListenableFuture(@NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull y yVar) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (y) Preconditions.checkNotNull(yVar);
    }

    private <E> void putUninterruptibly(@NonNull BlockingQueue<E> blockingQueue, @NonNull E e) {
        boolean z4 = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E takeUninterruptibly(@NonNull BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z4 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        if (!super.cancel(z4)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z4));
        cancel(this.mInputFuture, z4);
        cancel(this.mOutputFuture, z4);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            y yVar = this.mInputFuture;
            if (yVar != null) {
                yVar.get();
            }
            this.mOutputCreated.await();
            y yVar2 = this.mOutputFuture;
            if (yVar2 != null) {
                yVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S1.y, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [S1.y, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [S1.y, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r02;
        ?? r03 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            final y yVarApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = yVarApply;
                            if (isCancelled()) {
                                yVarApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                yVarApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                try {
                                                    ChainingListenableFuture.this.set(Futures.getUninterruptibly(yVarApply));
                                                } catch (CancellationException unused) {
                                                    ChainingListenableFuture.this.cancel(false);
                                                }
                                                ChainingListenableFuture.this.mOutputFuture = null;
                                            } catch (ExecutionException e) {
                                                ChainingListenableFuture.this.setException(e.getCause());
                                                ChainingListenableFuture.this.mOutputFuture = null;
                                            }
                                        } catch (Throwable th2) {
                                            ChainingListenableFuture.this.mOutputFuture = null;
                                            throw th2;
                                        }
                                    }
                                }, CameraXExecutors.directExecutor());
                            }
                        } catch (Exception e) {
                            setException(e);
                            r02 = r03;
                        }
                    } catch (Error e7) {
                        setException(e7);
                        r02 = r03;
                    }
                } finally {
                    this.mFunction = (AsyncFunction<? super I, ? extends O>) r03;
                    this.mInputFuture = (y) r03;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e10) {
                setException(e10.getCause());
            }
        } catch (UndeclaredThrowableException e11) {
            setException(e11.getCause());
            r02 = r03;
        }
    }

    private void cancel(@Nullable Future<?> future, boolean z4) {
        if (future != null) {
            future.cancel(z4);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            y yVar = this.mInputFuture;
            if (yVar != null) {
                long jNanoTime = System.nanoTime();
                yVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                y yVar2 = this.mOutputFuture;
                if (yVar2 != null) {
                    yVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
