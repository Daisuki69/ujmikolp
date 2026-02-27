package h2;

import android.util.Log;
import cj.M;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.C1421c;
import j2.C1664c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f16871b;
    public final /* synthetic */ Thread c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.t f16872d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ l f;

    public j(l lVar, long j, Throwable th2, Thread thread, b1.t tVar, boolean z4) {
        this.f = lVar;
        this.f16870a = j;
        this.f16871b = th2;
        this.c = thread;
        this.f16872d = tVar;
        this.e = z4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f16870a;
        long j6 = j / 1000;
        l lVar = this.f;
        String strE = lVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        lVar.c.d();
        C1915b c1915b = lVar.m;
        c1915b.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c1915b.p(this.f16871b, this.c, AppMeasurement.CRASH_ORIGIN, new C1664c(strE, j6, M.e()), true);
        try {
            C1915b c1915b2 = lVar.f16880g;
            String str = ".ae" + j;
            c1915b2.getClass();
            if (!new File((File) c1915b2.f18588d, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        b1.t tVar = this.f16872d;
        lVar.b(false, tVar, false);
        lVar.c(new C1534d().f16860a, Boolean.valueOf(this.e));
        return !lVar.f16878b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) tVar.i).get()).getTask().onSuccessTask(lVar.e.f17092a, new C1421c(5, this, strE, false));
    }
}
