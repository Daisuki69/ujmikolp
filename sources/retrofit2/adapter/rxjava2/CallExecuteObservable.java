package retrofit2.adapter.rxjava2;

import S1.s;
import ch.l;
import ch.r;
import fh.InterfaceC1486b;
import io.reactivex.exceptions.CompositeException;
import of.p;
import retrofit2.Call;

/* JADX INFO: loaded from: classes5.dex */
final class CallExecuteObservable<T> extends l {
    private final Call<T> originalCall;

    public static final class CallDisposable implements InterfaceC1486b {
        private final Call<?> call;
        private volatile boolean disposed;

        public CallDisposable(Call<?> call) {
            this.call = call;
        }

        @Override // fh.InterfaceC1486b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // ch.l
    public void subscribeActual(r rVar) {
        boolean z4;
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        rVar.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        try {
            Object objExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                rVar.onNext(objExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                rVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z4 = true;
                p.F(th);
                if (z4) {
                    s.r(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    rVar.onError(th);
                } catch (Throwable th3) {
                    p.F(th3);
                    s.r(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z4 = false;
        }
    }
}
