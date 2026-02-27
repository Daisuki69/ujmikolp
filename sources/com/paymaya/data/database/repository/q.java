package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.FinancialDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.b f11318a;

    public q(L5.b database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11318a = database;
    }

    public final List a(M5.f fVar) {
        Cursor cursorQuery = this.f11318a.f2812a.query(fVar.d());
        kotlin.jvm.internal.j.d(cursorQuery);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex2 = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        do {
            String string = cursorQuery.getString(columnIndex);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = cursorQuery.getString(columnIndex2);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            arrayList.add(new FinancialDocument(string, string2));
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.d(listUnmodifiableList);
        return listUnmodifiableList;
    }
}
