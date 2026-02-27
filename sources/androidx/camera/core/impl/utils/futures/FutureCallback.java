package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface FutureCallback<V> {
    void onFailure(@NonNull Throwable th2);

    void onSuccess(@Nullable V v7);
}
