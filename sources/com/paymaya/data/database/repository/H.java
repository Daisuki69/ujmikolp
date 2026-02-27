package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.paymaya.domain.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11300a;

    public final List a(z2.d dVar) {
        Cursor cursorQuery = this.f11300a.f2811a.query(dVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("first_name");
        int columnIndex2 = cursorQuery.getColumnIndex("middle_name");
        int columnIndex3 = cursorQuery.getColumnIndex("last_name");
        int columnIndex4 = cursorQuery.getColumnIndex("birth_date");
        do {
            arrayList.add(User.sBuilder().mFirstName(cursorQuery.getString(columnIndex)).mMiddleName(cursorQuery.getString(columnIndex2)).mLastName(cursorQuery.getString(columnIndex3)).mBirthDate(cursorQuery.getString(columnIndex4)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
