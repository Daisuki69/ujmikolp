package androidx.datastore.core;

import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(CoroutineContext context, File file) {
        j.g(context, "context");
        j.g(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
