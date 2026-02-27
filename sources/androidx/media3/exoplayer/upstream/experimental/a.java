package androidx.media3.exoplayer.upstream.experimental;

import Z0.e;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import c1.i;
import j1.InterfaceC1657e;
import java.util.Deque;
import m1.AbstractC1844a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, InterfaceC1657e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8121b;

    public /* synthetic */ a(long j, Object obj) {
        this.f8120a = j;
        this.f8121b = obj;
    }

    @Override // j1.InterfaceC1657e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f8120a));
        i iVar = (i) this.f8121b;
        e eVar = iVar.c;
        String strValueOf = String.valueOf(AbstractC1844a.a(eVar));
        String str = iVar.f9230a;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, strValueOf}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(AbstractC1844a.a(eVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f8120a, (Clock) this.f8121b, deque);
    }
}
