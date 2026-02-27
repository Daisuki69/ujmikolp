package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.BackUpIdentity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1241e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11307a;

    public final List a(N4.d dVar) {
        Cursor cursorQuery = this.f11307a.f2811a.query(dVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex2 = cursorQuery.getColumnIndex("value");
        int columnIndex3 = cursorQuery.getColumnIndex("is_verified");
        do {
            arrayList.add(BackUpIdentity.sBuilder().mType(cursorQuery.getString(columnIndex)).mValue(cursorQuery.getString(columnIndex2)).mIsVerified(Boolean.valueOf(cursorQuery.getInt(columnIndex3) == 1)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
