package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionWindowBackend implements WindowBackend {
    public static final Companion Companion = new Companion(null);
    private final WindowBackend backend;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WindowBackend newInstance(WindowLayoutComponent component, ConsumerAdapter adapter) {
            j.g(component, "component");
            j.g(adapter, "adapter");
            int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
            return safeVendorApiLevel >= 2 ? new ExtensionWindowBackendApi2(component) : safeVendorApiLevel == 1 ? new ExtensionWindowBackendApi1(component, adapter) : new ExtensionWindowBackendApi0();
        }

        private Companion() {
        }
    }

    public ExtensionWindowBackend(WindowBackend backend) {
        j.g(backend, "backend");
        this.backend = backend;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasRegisteredListeners() {
        return this.backend.hasRegisteredListeners();
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> callback) {
        j.g(context, "context");
        j.g(executor, "executor");
        j.g(callback, "callback");
        this.backend.registerLayoutChangeCallback(context, executor, callback);
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        j.g(callback, "callback");
        this.backend.unregisterLayoutChangeCallback(callback);
    }
}
