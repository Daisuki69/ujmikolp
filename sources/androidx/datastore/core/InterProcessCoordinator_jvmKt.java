package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        j.g(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        j.f(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
