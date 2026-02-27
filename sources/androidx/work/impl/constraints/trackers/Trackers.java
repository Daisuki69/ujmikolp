package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Trackers {
    private final ConstraintTracker<Boolean> batteryChargingTracker;
    private final BatteryNotLowTracker batteryNotLowTracker;
    private final Context context;
    private final ConstraintTracker<NetworkState> networkStateTracker;
    private final ConstraintTracker<Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        j.g(context, "context");
        j.g(taskExecutor, "taskExecutor");
    }

    public final ConstraintTracker<Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ConstraintTracker<NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    public final ConstraintTracker<Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        j.g(context, "context");
        j.g(taskExecutor, "taskExecutor");
        j.g(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        j.g(context, "context");
        j.g(taskExecutor, "taskExecutor");
        j.g(batteryChargingTracker, "batteryChargingTracker");
        j.g(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        j.g(context, "context");
        j.g(taskExecutor, "taskExecutor");
        j.g(batteryChargingTracker, "batteryChargingTracker");
        j.g(batteryNotLowTracker, "batteryNotLowTracker");
        j.g(networkStateTracker, "networkStateTracker");
    }

    public Trackers(Context context, TaskExecutor taskExecutor, ConstraintTracker<Boolean> batteryChargingTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker<NetworkState> networkStateTracker, ConstraintTracker<Boolean> storageNotLowTracker) {
        j.g(context, "context");
        j.g(taskExecutor, "taskExecutor");
        j.g(batteryChargingTracker, "batteryChargingTracker");
        j.g(batteryNotLowTracker, "batteryNotLowTracker");
        j.g(networkStateTracker, "networkStateTracker");
        j.g(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Trackers(android.content.Context r8, androidx.work.impl.utils.taskexecutor.TaskExecutor r9, androidx.work.impl.constraints.trackers.ConstraintTracker r10, androidx.work.impl.constraints.trackers.BatteryNotLowTracker r11, androidx.work.impl.constraints.trackers.ConstraintTracker r12, androidx.work.impl.constraints.trackers.ConstraintTracker r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            androidx.work.impl.constraints.trackers.BatteryChargingTracker r0 = new androidx.work.impl.constraints.trackers.BatteryChargingTracker
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.j.f(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r0 = new androidx.work.impl.constraints.trackers.BatteryNotLowTracker
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.j.f(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.j.f(r0, r1)
            androidx.work.impl.constraints.trackers.ConstraintTracker r0 = androidx.work.impl.constraints.trackers.NetworkStateTrackerKt.NetworkStateTracker(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            androidx.work.impl.constraints.trackers.StorageNotLowTracker r0 = new androidx.work.impl.constraints.trackers.StorageNotLowTracker
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.j.f(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.Trackers.<init>(android.content.Context, androidx.work.impl.utils.taskexecutor.TaskExecutor, androidx.work.impl.constraints.trackers.ConstraintTracker, androidx.work.impl.constraints.trackers.BatteryNotLowTracker, androidx.work.impl.constraints.trackers.ConstraintTracker, androidx.work.impl.constraints.trackers.ConstraintTracker, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
