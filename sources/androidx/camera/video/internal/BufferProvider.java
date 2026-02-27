package androidx.camera.video.internal;

import S1.y;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Observable;

/* JADX INFO: loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    y acquireBuffer();
}
