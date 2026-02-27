package androidx.work.impl.utils;

import androidx.core.util.Consumer;
import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerExceptionUtilsKt {
    public static final void safeAccept(Consumer<WorkerExceptionInfo> consumer, WorkerExceptionInfo info, String tag) {
        j.g(consumer, "<this>");
        j.g(info, "info");
        j.g(tag, "tag");
        try {
            consumer.accept(info);
        } catch (Throwable th2) {
            Logger.get().error(tag, "Exception handler threw an exception", th2);
        }
    }
}
