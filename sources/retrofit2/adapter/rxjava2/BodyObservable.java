package retrofit2.adapter.rxjava2;

import S1.s;
import ch.l;
import ch.r;
import fh.InterfaceC1486b;
import io.reactivex.exceptions.CompositeException;
import of.p;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
final class BodyObservable<T> extends l {
    private final l upstream;

    public static class BodyObserver<R> implements r {
        private final r observer;
        private boolean terminated;

        public BodyObserver(r rVar) {
            this.observer = rVar;
        }

        @Override // ch.r
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // ch.r
        public void onError(Throwable th2) {
            if (!this.terminated) {
                this.observer.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            s.r(assertionError);
        }

        @Override // ch.r
        public void onSubscribe(InterfaceC1486b interfaceC1486b) {
            this.observer.onSubscribe(interfaceC1486b);
        }

        @Override // ch.r
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th2) {
                p.F(th2);
                s.r(new CompositeException(httpException, th2));
            }
        }
    }

    public BodyObservable(l lVar) {
        this.upstream = lVar;
    }

    @Override // ch.l
    public void subscribeActual(r rVar) {
        this.upstream.subscribe(new BodyObserver(rVar));
    }
}
