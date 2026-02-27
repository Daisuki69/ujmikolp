package c2;

import D.J;
import Q6.n;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.android.agent.CrashReporter;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.data.Session;
import f1.EnumC1457c;
import j1.C1659g;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k1.InterfaceC1690a;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1059b implements InterfaceC1064g, GuardedEventDispatcher.GuardedOperation, InterfaceC1690a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9255b;
    public final /* synthetic */ long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9256d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1059b(ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f9254a = i;
        this.f9255b = scheduledExecutorServiceC1063f;
        this.e = obj;
        this.c = j;
        this.f9256d = timeUnit;
    }

    @Override // c2.InterfaceC1064g
    public ScheduledFuture a(n nVar) {
        switch (this.f9254a) {
            case 0:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f = (ScheduledExecutorServiceC1063f) this.f9255b;
                return scheduledExecutorServiceC1063f.f9266b.schedule(new RunnableC1062e(scheduledExecutorServiceC1063f, (Runnable) this.e, nVar, 1), this.c, (TimeUnit) this.f9256d);
            default:
                ScheduledExecutorServiceC1063f scheduledExecutorServiceC1063f2 = (ScheduledExecutorServiceC1063f) this.f9255b;
                return scheduledExecutorServiceC1063f2.f9266b.schedule(new J(4, scheduledExecutorServiceC1063f2, (Callable) this.e, nVar), this.c, (TimeUnit) this.f9256d);
        }
    }

    @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
    public void execute(RumEventDispatcher rumEventDispatcher) {
        CrashReporter.lambda$reportCrash$0((Throwable) this.f9255b, (Thread) this.e, (Session) this.f9256d, this.c, rumEventDispatcher);
    }

    public /* synthetic */ C1059b(Object obj, Object obj2, Object obj3, long j, int i) {
        this.f9254a = i;
        this.f9255b = obj;
        this.e = obj2;
        this.f9256d = obj3;
        this.c = j;
    }

    @Override // k1.InterfaceC1690a
    public Object execute() {
        i1.f fVar = (i1.f) this.f9255b;
        C1659g c1659g = (C1659g) fVar.c;
        c1659g.getClass();
        Iterable iterable = (Iterable) this.e;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C1659g.m(iterable);
            SQLiteDatabase sQLiteDatabaseB = c1659g.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c1659g.i(cursorRawQuery.getInt(0), EnumC1457c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
        c1659g.f(new androidx.media3.exoplayer.upstream.experimental.a(fVar.f17081g.f() + this.c, (c1.i) this.f9256d));
        return null;
    }
}
