package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(@Nullable Object obj, boolean z4) {
        super(obj, z4);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialError(@NonNull Throwable th2) {
        return new MutableStateObservable<>(th2, true);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialState(@Nullable T t5) {
        return new MutableStateObservable<>(t5, false);
    }

    public void setError(@NonNull Throwable th2) {
        updateStateAsError(th2);
    }

    public void setState(@Nullable T t5) {
        updateState(t5);
    }
}
