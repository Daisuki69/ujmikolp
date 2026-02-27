package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.Identity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11322a;

    public final List a(M5.f fVar) {
        Cursor cursorQuery = this.f11322a.f2811a.query(fVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex2 = cursorQuery.getColumnIndex("value");
        int columnIndex3 = cursorQuery.getColumnIndex("verified");
        do {
            arrayList.add(Identity.sBuilder().mType(cursorQuery.getString(columnIndex)).mValue(cursorQuery.getString(columnIndex2)).mVerified(Boolean.valueOf(cursorQuery.getInt(columnIndex3) == 1)).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }

    public final Identity b(M5.f fVar) {
        if (a(fVar).isEmpty()) {
            return null;
        }
        return (Identity) a(fVar).get(0);
    }
}
