package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
public final class ConcurrentIOException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentIOException(String taskName, Throwable th2) {
        super("Concurrent " + taskName + " attempts", th2);
        kotlin.jvm.internal.j.g(taskName, "taskName");
    }
}
