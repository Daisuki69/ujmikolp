package androidx.camera.core.impl.utils.futures;

import E8.RunnableC0220c;
import E8.l;
import S1.y;
import X2.g;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e) {
                e = e;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e7) {
                e = e7;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e10);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        @NonNull
        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(@NonNull y yVar, @NonNull FutureCallback<? super V> futureCallback, @NonNull Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        yVar.addListener(new CallbackListener(yVar, futureCallback), executor);
    }

    @NonNull
    public static <V> y allAsList(@NonNull Collection<? extends y> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    @Nullable
    public static <V> V getDone(@NonNull Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    @Nullable
    public static <V> V getUninterruptibly(@NonNull Future<V> future) throws ExecutionException {
        V v7;
        boolean z4 = false;
        while (true) {
            try {
                v7 = future.get();
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
        return v7;
    }

    @NonNull
    public static <V> y immediateFailedFuture(@NonNull Throwable th2) {
        return new ImmediateFuture.ImmediateFailedFuture(th2);
    }

    @NonNull
    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(@NonNull Throwable th2) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th2);
    }

    @NonNull
    public static <V> y immediateFuture(@Nullable V v7) {
        return v7 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$makeTimeoutFuture$1(CallbackToFutureAdapter.Completer completer, y yVar, long j) throws Exception {
        return Boolean.valueOf(completer.setException(new TimeoutException("Future[" + yVar + "] is not done within " + j + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$3(final y yVar, ScheduledExecutorService scheduledExecutorService, final long j, final CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(yVar, completer);
        if (!yVar.isDone()) {
            yVar.addListener(new c(scheduledExecutorService.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Futures.lambda$makeTimeoutFuture$1(completer, yVar, j);
                }
            }, j, TimeUnit.MILLISECONDS), 1), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + yVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeTimeoutFuture$4(CallbackToFutureAdapter.Completer completer, Object obj, boolean z4, y yVar) {
        completer.set(obj);
        if (z4) {
            yVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$6(y yVar, ScheduledExecutorService scheduledExecutorService, Object obj, boolean z4, long j, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagate(yVar, completer);
        if (!yVar.isDone()) {
            yVar.addListener(new c(scheduledExecutorService.schedule(new RunnableC0220c(completer, obj, z4, yVar), j, TimeUnit.MILLISECONDS), 0), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + yVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$nonCancellationPropagating$0(y yVar, CallbackToFutureAdapter.Completer completer) throws Exception {
        propagateTransform(false, yVar, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + yVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$transformAsyncOnCompletion$8(y yVar, CallbackToFutureAdapter.Completer completer) throws Exception {
        yVar.addListener(new l(completer, 16), CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + yVar + "]";
    }

    @NonNull
    public static <V> y makeTimeoutFuture(long j, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull y yVar) {
        return CallbackToFutureAdapter.getFuture(new g(yVar, scheduledExecutorService, j));
    }

    @NonNull
    public static <V> y nonCancellationPropagating(@NonNull y yVar) {
        Preconditions.checkNotNull(yVar);
        return yVar.isDone() ? yVar : CallbackToFutureAdapter.getFuture(new a(1, yVar));
    }

    public static <V> void propagate(@NonNull y yVar, @NonNull CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(yVar, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(@NonNull y yVar, @NonNull Function<? super I, ? extends O> function, @NonNull CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        propagateTransform(true, yVar, function, completer, executor);
    }

    @NonNull
    public static <V> y successfulAsList(@NonNull Collection<? extends y> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    @NonNull
    public static <I, O> y transform(@NonNull y yVar, @NonNull final Function<? super I, ? extends O> function, @NonNull Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(yVar, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            @NonNull
            public y apply(I i) {
                return Futures.immediateFuture(function.apply(i));
            }
        }, executor);
    }

    @NonNull
    public static <I, O> y transformAsync(@NonNull y yVar, @NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, yVar);
        yVar.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    @NonNull
    public static <V> y transformAsyncOnCompletion(@NonNull y yVar) {
        return CallbackToFutureAdapter.getFuture(new a(0, yVar));
    }

    @NonNull
    public static <V> y makeTimeoutFuture(final long j, @NonNull final ScheduledExecutorService scheduledExecutorService, @Nullable final V v7, final boolean z4, @NonNull final y yVar) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.lambda$makeTimeoutFuture$6(yVar, scheduledExecutorService, v7, z4, j, completer);
            }
        });
    }

    private static <I, O> void propagateTransform(boolean z4, @NonNull final y yVar, @NonNull final Function<? super I, ? extends O> function, @NonNull final CallbackToFutureAdapter.Completer<O> completer, @NonNull Executor executor) {
        Preconditions.checkNotNull(yVar);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(yVar, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                completer.setException(th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable I i) {
                try {
                    completer.set(function.apply(i));
                } catch (Throwable th2) {
                    completer.setException(th2);
                }
            }
        }, executor);
        if (z4) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    yVar.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }
}
