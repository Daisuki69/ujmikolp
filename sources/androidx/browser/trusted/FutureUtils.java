package androidx.browser.trusted;

import S1.y;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;

/* JADX INFO: loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    public static <T> y immediateFailedFuture(@NonNull Throwable th2) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th2);
        return resolvableFutureCreate;
    }
}
