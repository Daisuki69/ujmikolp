package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t5) {
        kotlin.jvm.internal.j.e(this.mListener, "Listener is not set.");
        this.mListener.accept(t5);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
