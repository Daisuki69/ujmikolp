package X2;

import S1.y;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e2.C1419a;
import f1.EnumC1457c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j1.C1659g;
import j1.InterfaceC1657e;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import k1.InterfaceC1690a;
import k2.C1739m0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Continuation, CallbackToFutureAdapter.Resolver, ListenerSet.Event, B2.a, InterfaceC1690a, InterfaceC1657e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6488b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, long j, Object obj2) {
        this.f6488b = obj;
        this.f6487a = j;
        this.c = obj2;
    }

    @Override // j1.InterfaceC1657e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC1457c) this.c).f16694a;
        String string = Integer.toString(i);
        String str = (String) this.f6488b;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z4 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f6487a;
            if (z4) {
                sQLiteDatabase.execSQL(androidx.media3.datasource.cache.c.i(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(Constants.REASON, Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return Futures.lambda$makeTimeoutFuture$3((y) this.f6488b, (ScheduledExecutorService) this.c, this.f6487a, completer);
    }

    @Override // B2.a
    public void d(B2.b bVar) {
        ((C1419a) bVar.get()).d((String) this.f6488b, this.f6487a, (C1739m0) this.c);
    }

    @Override // k1.InterfaceC1690a
    public Object execute() {
        i1.f fVar = (i1.f) this.f6488b;
        long jF = fVar.f17081g.f() + this.f6487a;
        C1659g c1659g = (C1659g) fVar.c;
        c1.i iVar = (c1.i) this.c;
        c1659g.getClass();
        c1659g.f(new androidx.media3.exoplayer.upstream.experimental.a(jF, iVar));
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onRenderedFirstFrame((AnalyticsListener.EventTime) this.f6488b, this.c, this.f6487a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((j) this.f6488b).c(task, this.f6487a, (HashMap) this.c);
    }

    public /* synthetic */ g(Object obj, Object obj2, long j) {
        this.f6488b = obj;
        this.c = obj2;
        this.f6487a = j;
    }
}
