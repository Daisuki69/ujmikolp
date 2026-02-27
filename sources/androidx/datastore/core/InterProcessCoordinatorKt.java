package androidx.datastore.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinatorKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final InterProcessCoordinator createSingleProcessCoordinator(String filePath) {
        j.g(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
