package retrofit2.adapter.rxjava2;

import S1.s;
import ch.l;
import ch.r;
import fh.InterfaceC1486b;
import io.reactivex.exceptions.CompositeException;
import of.p;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
final class CallEnqueueObservable<T> extends l {
    private final Call<T> originalCall;

    public static final class CallCallback<T> implements InterfaceC1486b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final r observer;
        boolean terminated = false;

        public CallCallback(Call<?> call, r rVar) {
            this.call = call;
            this.observer = rVar;
        }

        @Override // fh.InterfaceC1486b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th2) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th2);
            } catch (Throwable th3) {
                p.F(th3);
                s.r(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th2) {
                p.F(th2);
                if (this.terminated) {
                    s.r(th2);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    p.F(th3);
                    s.r(new CompositeException(th2, th3));
                }
            }
        }
    }

    public CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // ch.l
    public void subscribeActual(r rVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, rVar);
        rVar.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        callClone.enqueue(callCallback);
    }
}
