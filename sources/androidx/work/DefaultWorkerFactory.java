package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DefaultWorkerFactory extends WorkerFactory {
    public static final DefaultWorkerFactory INSTANCE = new DefaultWorkerFactory();

    private DefaultWorkerFactory() {
    }

    /* JADX INFO: renamed from: createWorker, reason: collision with other method in class */
    public Void m137createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        j.g(appContext, "appContext");
        j.g(workerClassName, "workerClassName");
        j.g(workerParameters, "workerParameters");
        return null;
    }

    @Override // androidx.work.WorkerFactory
    public /* bridge */ /* synthetic */ ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        return (ListenableWorker) m137createWorker(context, str, workerParameters);
    }
}
