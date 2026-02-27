package io.reactivex.rxjava3.exceptions;

/* JADX INFO: loaded from: classes4.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th2) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2 == null ? new NullPointerException() : th2);
    }
}
