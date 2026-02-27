package androidx.camera.core.impl.utils.futures;

import S1.y;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class ListFuture<V> implements y {
    private final boolean mAllMustSucceed;

    @Nullable
    List<? extends y> mFutures;

    @NonNull
    private final AtomicInteger mRemaining;

    @NonNull
    private final y mResult = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<List<V>> completer) {
            Preconditions.checkState(ListFuture.this.mResultNotifier == null, "The result can only set once!");
            ListFuture.this.mResultNotifier = completer;
            return "ListFuture[" + this + "]";
        }
    });
    CallbackToFutureAdapter.Completer<List<V>> mResultNotifier;

    @Nullable
    List<V> mValues;

    public ListFuture(@NonNull List<? extends y> list, boolean z4, @NonNull Executor executor) {
        this.mFutures = (List) Preconditions.checkNotNull(list);
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z4;
        this.mRemaining = new AtomicInteger(list.size());
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends y> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (y yVar : list) {
            while (!yVar.isDone()) {
                try {
                    yVar.get();
                } catch (Error e) {
                    throw e;
                } catch (InterruptedException e7) {
                    throw e7;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(@NonNull Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add(null);
        }
        List<? extends y> list = this.mFutures;
        for (final int i4 = 0; i4 < list.size(); i4++) {
            final y yVar = list.get(i4);
            yVar.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i4, yVar);
                }
            }, executor);
        }
    }

    @Override // S1.y
    public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        List<? extends y> list = this.mFutures;
        if (list != null) {
            Iterator<? extends y> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z4);
            }
        }
        return this.mResult.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i, @NonNull Future<? extends V> future) {
        CallbackToFutureAdapter.Completer<List<V>> completer;
        ArrayList arrayList;
        List<V> list = this.mValues;
        if (isDone() || list == null) {
            Preconditions.checkState(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i, (V) Futures.getUninterruptibly(future));
                            int iDecrementAndGet = this.mRemaining.decrementAndGet();
                            Preconditions.checkState(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.mValues;
                                if (list2 != null) {
                                    this.mResultNotifier.set(new ArrayList(list2));
                                } else {
                                    Preconditions.checkState(isDone());
                                }
                            }
                        } catch (ExecutionException e) {
                            if (this.mAllMustSucceed) {
                                this.mResultNotifier.setException(e.getCause());
                            }
                            int iDecrementAndGet2 = this.mRemaining.decrementAndGet();
                            Preconditions.checkState(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.mValues;
                                if (list3 != null) {
                                    completer = this.mResultNotifier;
                                    arrayList = new ArrayList(list3);
                                    completer.set(arrayList);
                                    return;
                                }
                                Preconditions.checkState(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.mAllMustSucceed) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.mRemaining.decrementAndGet();
                        Preconditions.checkState(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.mValues;
                            if (list4 != null) {
                                completer = this.mResultNotifier;
                                arrayList = new ArrayList(list4);
                                completer.set(arrayList);
                                return;
                            }
                            Preconditions.checkState(isDone());
                        }
                    }
                } catch (Error e7) {
                    this.mResultNotifier.setException(e7);
                    int iDecrementAndGet4 = this.mRemaining.decrementAndGet();
                    Preconditions.checkState(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.mValues;
                        if (list5 != null) {
                            completer = this.mResultNotifier;
                            arrayList = new ArrayList(list5);
                            completer.set(arrayList);
                            return;
                        }
                        Preconditions.checkState(isDone());
                    }
                }
            } catch (RuntimeException e10) {
                if (this.mAllMustSucceed) {
                    this.mResultNotifier.setException(e10);
                }
                int iDecrementAndGet5 = this.mRemaining.decrementAndGet();
                Preconditions.checkState(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.mValues;
                    if (list6 != null) {
                        completer = this.mResultNotifier;
                        arrayList = new ArrayList(list6);
                        completer.set(arrayList);
                        return;
                    }
                    Preconditions.checkState(isDone());
                }
            }
        } catch (Throwable th2) {
            int iDecrementAndGet6 = this.mRemaining.decrementAndGet();
            Preconditions.checkState(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.set(new ArrayList(list7));
                } else {
                    Preconditions.checkState(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public List<V> get() throws ExecutionException, InterruptedException {
        callAllGets();
        return (List) this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.mResult.get(j, timeUnit);
    }
}
