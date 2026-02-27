package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Nationality;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.b f11325a;

    public final List a(M5.b bVar) {
        Cursor cursorQuery = this.f11325a.f2812a.query(bVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex2 = cursorQuery.getColumnIndex("code");
        do {
            arrayList.add(Nationality.sBuilder().mName(cursorQuery.getString(columnIndex)).mCode(cursorQuery.getString(columnIndex2)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
