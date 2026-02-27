package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.Profile;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
@Profile.ExperimentalUrlPrefetch
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    void onError(@NonNull E e);

    void onResult(T t5);
}
