package androidx.camera.core.impl.utils.futures;

import S1.y;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface AsyncFunction<I, O> {
    @NonNull
    y apply(@Nullable I i) throws Exception;
}
