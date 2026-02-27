package androidx.window.java.layout;

import Ej.InterfaceC0230h;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.java.core.CallbackToFlowAdapter;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final WindowInfoTracker tracker;

    private WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.tracker = windowInfoTracker;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer) {
        j.g(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC0230h windowLayoutInfo(Activity activity) {
        j.g(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }

    public final void addWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        j.g(context, "context");
        j.g(executor, "executor");
        j.g(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.tracker.windowLayoutInfo(context));
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC0230h windowLayoutInfo(Context context) {
        j.g(context, "context");
        return this.tracker.windowLayoutInfo(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker tracker) {
        this(tracker, new CallbackToFlowAdapter());
        j.g(tracker, "tracker");
    }
}
