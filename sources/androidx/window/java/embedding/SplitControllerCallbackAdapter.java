package androidx.window.java.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.SplitController;
import androidx.window.embedding.SplitInfo;
import androidx.window.java.core.CallbackToFlowAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class SplitControllerCallbackAdapter {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final SplitController controller;

    private SplitControllerCallbackAdapter(SplitController splitController, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.controller = splitController;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addSplitListener(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(consumer, "consumer");
        this.callbackToFlowAdapter.connect(executor, consumer, this.controller.splitInfoList(activity));
    }

    public final void removeSplitListener(Consumer<List<SplitInfo>> consumer) {
        j.g(consumer, "consumer");
        this.callbackToFlowAdapter.disconnect(consumer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitControllerCallbackAdapter(SplitController controller) {
        this(controller, new CallbackToFlowAdapter());
        j.g(controller, "controller");
    }
}
