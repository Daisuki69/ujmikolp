package io.flutter.plugins.webviewflutter;

import bj.C1037h;
import bj.C1038i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultCompat<T> {
    public static final Companion Companion = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    private final Object result;
    private final T value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit asCompatCallback$lambda$0(Function1 function1, C1037h c1037h) {
            function1.invoke(new ResultCompat(c1037h.f9167a));
            return Unit.f18162a;
        }

        public final <T> Function1<C1037h<? extends T>, Unit> asCompatCallback(Function1<? super ResultCompat<T>, Unit> result) {
            kotlin.jvm.internal.j.g(result, "result");
            return new l(result, 2);
        }

        public final <T> void success(T t5, Object callback) {
            kotlin.jvm.internal.j.g(callback, "callback");
            kotlin.jvm.internal.D.d(1, callback);
            ((Function1) callback).invoke(new C1037h(t5));
        }

        private Companion() {
        }
    }

    public ResultCompat(Object obj) {
        this.result = obj;
        C1037h.a aVar = C1037h.f9166b;
        this.value = obj instanceof C1038i ? null : (T) obj;
        this.exception = C1037h.a(obj);
        this.isSuccess = !(obj instanceof C1038i);
        this.isFailure = obj instanceof C1038i;
    }

    public static final <T> Function1<C1037h<? extends T>, Unit> asCompatCallback(Function1<? super ResultCompat<T>, Unit> function1) {
        return Companion.asCompatCallback(function1);
    }

    public static final <T> void success(T t5, Object obj) {
        Companion.success(t5, obj);
    }

    public final Throwable exceptionOrNull() {
        return this.exception;
    }

    public final T getOrNull() {
        return this.value;
    }

    /* JADX INFO: renamed from: getResult-d1pmJ48, reason: not valid java name */
    public final Object m255getResultd1pmJ48() {
        return this.result;
    }

    public final boolean isFailure() {
        return this.isFailure;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
