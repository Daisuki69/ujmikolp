package androidx.camera.core.internal.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
        void onRemove(@NonNull T t5);
    }

    @NonNull
    T dequeue();

    void enqueue(@NonNull T t5);

    int getMaxCapacity();

    boolean isEmpty();
}
