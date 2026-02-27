package androidx.camera.core.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static Executor a(ThreadConfig threadConfig) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR);
    }

    public static Executor b(ThreadConfig threadConfig, Executor executor) {
        return (Executor) threadConfig.retrieveOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
    }
}
