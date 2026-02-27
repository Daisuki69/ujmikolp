package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.ShopProviderCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.b f11298a;

    public F(L5.b database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11298a = database;
    }

    public final List a(M5.f fVar) {
        Cursor cursorQuery = this.f11298a.f2812a.query(fVar.d());
        kotlin.jvm.internal.j.d(cursorQuery);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex3 = cursorQuery.getColumnIndex("code");
        int columnIndex4 = cursorQuery.getColumnIndex("priority");
        do {
            arrayList.add(new ShopProviderCategory(Integer.valueOf(cursorQuery.getInt(columnIndex)), cursorQuery.getString(columnIndex2), cursorQuery.getString(columnIndex3), Integer.valueOf(cursorQuery.getInt(columnIndex4))));
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.d(listUnmodifiableList);
        return listUnmodifiableList;
    }
}
