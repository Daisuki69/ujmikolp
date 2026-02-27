package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.BillerCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1243g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11309a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex2 = cursor.getColumnIndex("slug");
        int columnIndex3 = cursor.getColumnIndex("listUrl");
        do {
            arrayList.add(BillerCategory.sBuilder().mName(cursor.getString(columnIndex)).mSlug(cursor.getString(columnIndex2)).mListUrl(cursor.getString(columnIndex3)).build());
        } while (cursor.moveToNext());
        cursor.close();
        return Collections.unmodifiableList(arrayList);
    }
}
