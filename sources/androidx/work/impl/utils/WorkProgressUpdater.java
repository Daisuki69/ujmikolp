package androidx.work.impl.utils;

import S1.y;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkProgressUpdater implements ProgressUpdater {
    static final String TAG = Logger.tagWithPrefix("WorkProgressUpdater");
    final TaskExecutor mTaskExecutor;
    final WorkDatabase mWorkDatabase;

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase, @NonNull TaskExecutor taskExecutor) {
        this.mWorkDatabase = workDatabase;
        this.mTaskExecutor = taskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$updateProgress$0(UUID uuid, Data data) {
        String string = uuid.toString();
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Updating progress for " + uuid + " (" + data + ")");
        this.mWorkDatabase.beginTransaction();
        try {
            WorkSpec workSpec = this.mWorkDatabase.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpec.state == WorkInfo.State.RUNNING) {
                this.mWorkDatabase.workProgressDao().insert(new WorkProgress(string, data));
            } else {
                Logger.get().warning(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            this.mWorkDatabase.setTransactionSuccessful();
            this.mWorkDatabase.endTransaction();
            return null;
        } catch (Throwable th2) {
            try {
                Logger.get().error(TAG, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                this.mWorkDatabase.endTransaction();
                throw th3;
            }
        }
    }

    @Override // androidx.work.ProgressUpdater
    @NonNull
    public y updateProgress(@NonNull Context context, @NonNull final UUID uuid, @NonNull final Data data) {
        return ListenableFutureKt.executeAsync(this.mTaskExecutor.getSerialTaskExecutor(), "updateProgress", new Function0() { // from class: androidx.work.impl.utils.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f8259a.lambda$updateProgress$0(uuid, data);
            }
        });
    }
}
