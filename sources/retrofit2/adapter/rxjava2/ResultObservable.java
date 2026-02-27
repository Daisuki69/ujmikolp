package retrofit2.adapter.rxjava2;

import S1.s;
import ch.l;
import ch.r;
import fh.InterfaceC1486b;
import io.reactivex.exceptions.CompositeException;
import of.p;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
final class ResultObservable<T> extends l {
    private final l upstream;

    public static class ResultObserver<R> implements r {
        private final r observer;

        public ResultObserver(r rVar) {
            this.observer = rVar;
        }

        @Override // ch.r
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // ch.r
        public void onError(Throwable th2) {
            try {
                this.observer.onNext(Result.error(th2));
                this.observer.onComplete();
            } catch (Throwable th3) {
                try {
                    this.observer.onError(th3);
                } catch (Throwable th4) {
                    p.F(th4);
                    s.r(new CompositeException(th3, th4));
                }
            }
        }

        @Override // ch.r
        public void onSubscribe(InterfaceC1486b interfaceC1486b) {
            this.observer.onSubscribe(interfaceC1486b);
        }

        @Override // ch.r
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    public ResultObservable(l lVar) {
        this.upstream = lVar;
    }

    @Override // ch.l
    public void subscribeActual(r rVar) {
        this.upstream.subscribe(new ResultObserver(rVar));
    }
}
