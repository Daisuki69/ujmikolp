package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8252a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f8253b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
        this.c = workDatabase;
        this.f8253b = workManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8252a) {
            case 0:
                CancelWorkRunnable.AnonymousClass1.invoke$lambda$0((WorkDatabase) this.c, this.f8253b);
                break;
            default:
                CancelWorkRunnable.C08321.invoke$lambda$0(this.f8253b, (UUID) this.c);
                break;
        }
    }

    public /* synthetic */ a(WorkManagerImpl workManagerImpl, UUID uuid) {
        this.f8253b = workManagerImpl;
        this.c = uuid;
    }
}
