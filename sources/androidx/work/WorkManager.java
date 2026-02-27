package androidx.work;

import Ej.InterfaceC0230h;
import S1.y;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import cj.r;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        public void initialize(Context context, Configuration configuration) {
            j.g(context, "context");
            j.g(configuration, "configuration");
            WorkManagerImpl.initialize(context, configuration);
        }

        public boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        private Companion() {
        }

        public WorkManager getInstance(Context context) {
            j.g(context, "context");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
            j.f(workManagerImpl, "getInstance(context)");
            return workManagerImpl;
        }
    }

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public static WorkManager getInstance() {
        return Companion.getInstance();
    }

    public static void initialize(Context context, Configuration configuration) {
        Companion.initialize(context, configuration);
    }

    public static boolean isInitialized() {
        return Companion.isInitialized();
    }

    public final WorkContinuation beginUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        j.g(uniqueWorkName, "uniqueWorkName");
        j.g(existingWorkPolicy, "existingWorkPolicy");
        j.g(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, r.c(request));
    }

    public abstract WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public final WorkContinuation beginWith(OneTimeWorkRequest request) {
        j.g(request, "request");
        return beginWith(r.c(request));
    }

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation cancelUniqueWork(String str);

    public abstract Operation cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    public final Operation enqueue(WorkRequest request) {
        j.g(request, "request");
        return enqueue(r.c(request));
    }

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    public Operation enqueueUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        j.g(uniqueWorkName, "uniqueWorkName");
        j.g(existingWorkPolicy, "existingWorkPolicy");
        j.g(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, r.c(request));
    }

    public abstract Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract Configuration getConfiguration();

    public abstract y getLastCancelAllTimeMillis();

    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    public abstract y getWorkInfoById(UUID uuid);

    public abstract InterfaceC0230h getWorkInfoByIdFlow(UUID uuid);

    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID uuid);

    public abstract y getWorkInfos(WorkQuery workQuery);

    public abstract y getWorkInfosByTag(String str);

    public abstract InterfaceC0230h getWorkInfosByTagFlow(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String str);

    public abstract InterfaceC0230h getWorkInfosFlow(WorkQuery workQuery);

    public abstract y getWorkInfosForUniqueWork(String str);

    public abstract InterfaceC0230h getWorkInfosForUniqueWorkFlow(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String str);

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery workQuery);

    public abstract Operation pruneWork();

    public abstract y updateWork(WorkRequest workRequest);

    public static WorkManager getInstance(Context context) {
        return Companion.getInstance(context);
    }
}
