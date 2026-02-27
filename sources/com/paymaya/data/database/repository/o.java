package com.paymaya.data.database.repository;

import android.database.Cursor;
import cj.C1112C;
import com.paymaya.domain.model.EDDSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.b f11317a;

    public o(L5.b database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11317a = database;
    }

    public final List a(M2.b bVar) {
        Cursor cursorQuery = this.f11317a.f2812a.query(bVar.d());
        kotlin.jvm.internal.j.d(cursorQuery);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("max_banks");
        int columnIndex2 = cursorQuery.getColumnIndex("max_alternative_income_sources");
        int columnIndex3 = cursorQuery.getColumnIndex("max_related_companies");
        int columnIndex4 = cursorQuery.getColumnIndex("max_financial_docs");
        do {
            arrayList.add(new EDDSettings(cursorQuery.getInt(columnIndex), cursorQuery.getInt(columnIndex2), cursorQuery.getInt(columnIndex3), cursorQuery.getInt(columnIndex4)));
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.d(listUnmodifiableList);
        return listUnmodifiableList;
    }
}
