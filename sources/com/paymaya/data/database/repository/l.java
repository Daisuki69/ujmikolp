package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.b f11314a;

    public final List a(F1.k kVar) {
        Cursor cursorQuery = this.f11314a.f2812a.query(kVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex2 = cursorQuery.getColumnIndex("code");
        do {
            arrayList.add(Country.sBuilder().mName(cursorQuery.getString(columnIndex)).mCode(cursorQuery.getString(columnIndex2)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
