package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f8255b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f8256d;

    public /* synthetic */ b(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl, int i) {
        this.f8254a = i;
        this.f8255b = workDatabase;
        this.c = str;
        this.f8256d = workManagerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8254a) {
            case 0:
                CancelWorkRunnable.C08341.invoke$lambda$0(this.f8255b, this.c, this.f8256d);
                break;
            default:
                CancelWorkRunnable.forNameInline$lambda$0(this.f8255b, this.c, this.f8256d);
                break;
        }
    }
}
