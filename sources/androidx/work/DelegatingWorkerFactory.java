package androidx.work;

import android.content.Context;
import androidx.media3.datasource.cache.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    private final List<WorkerFactory> factories = new CopyOnWriteArrayList();

    public final void addFactory(WorkerFactory workerFactory) {
        j.g(workerFactory, "workerFactory");
        this.factories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        j.g(appContext, "appContext");
        j.g(workerClassName, "workerClassName");
        j.g(workerParameters, "workerParameters");
        Iterator<T> it = this.factories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = ((WorkerFactory) it.next()).createWorker(appContext, workerClassName, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th2) {
                Logger.get().error(DelegatingWorkerFactoryKt.TAG, c.g(')', "Unable to instantiate a ListenableWorker (", workerClassName), th2);
                throw th2;
            }
        }
        return null;
    }
}
