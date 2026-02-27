package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.paymaya.domain.model.Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1240d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11306a;

    public final List a(M2.b bVar) {
        Cursor cursorQuery = this.f11306a.f2811a.query(bVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("line1");
        int columnIndex2 = cursorQuery.getColumnIndex("line2");
        int columnIndex3 = cursorQuery.getColumnIndex("locality");
        int columnIndex4 = cursorQuery.getColumnIndex("city");
        int columnIndex5 = cursorQuery.getColumnIndex("state");
        int columnIndex6 = cursorQuery.getColumnIndex("zip_code");
        int columnIndex7 = cursorQuery.getColumnIndex("country_code");
        do {
            arrayList.add(Address.sBuilder().mLine1(cursorQuery.getString(columnIndex)).mLine2(cursorQuery.getString(columnIndex2)).mLocality(cursorQuery.getString(columnIndex3)).mCity(cursorQuery.getString(columnIndex4)).mState(cursorQuery.getString(columnIndex5)).mZipCode(cursorQuery.getString(columnIndex6)).mCountryCode(cursorQuery.getString(columnIndex7)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
