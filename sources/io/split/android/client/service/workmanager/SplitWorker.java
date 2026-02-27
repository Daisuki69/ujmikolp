package io.split.android.client.service.workmanager;

import androidx.work.ListenableWorker;
import androidx.work.Worker;
import io.split.android.client.network.d;
import io.split.android.client.storage.db.SplitRoomDatabase;
import ki.InterfaceC1782c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SplitWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitRoomDatabase f17612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f17613b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1782c f17614d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SplitWorker(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull androidx.work.WorkerParameters r9) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.split.android.client.service.workmanager.SplitWorker.<init>(android.content.Context, androidx.work.WorkerParameters):void");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        InterfaceC1782c interfaceC1782c = this.f17614d;
        if (interfaceC1782c == null) {
            return ListenableWorker.Result.failure();
        }
        interfaceC1782c.execute();
        return ListenableWorker.Result.success();
    }
}
