package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import cj.C1112C;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import l.AbstractC1794a;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionWindowBackendApi0 implements WindowBackend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLayoutChangeCallback$lambda$0(Consumer callback) {
        j.g(callback, "$callback");
        callback.accept(new WindowLayoutInfo(C1112C.f9377a));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final /* synthetic */ boolean hasRegisteredListeners() {
        return AbstractC1794a.a(this);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> callback) {
        j.g(context, "context");
        j.g(executor, "executor");
        j.g(callback, "callback");
        executor.execute(new a(callback, 0));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        j.g(callback, "callback");
    }
}
