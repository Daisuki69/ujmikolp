package androidx.window.layout.adapter;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface WindowBackend {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    boolean hasRegisteredListeners();

    void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer);

    void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer);
}
