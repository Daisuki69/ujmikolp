package com.paymaya.data.database.repository;

import D.S;
import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.VoucherReminder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11301a;

    public final List a(S s9) {
        Cursor cursorQuery = this.f11301a.f2811a.query(s9.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursorQuery.getColumnIndex("has_reminder");
        do {
            arrayList.add(VoucherReminder.sBuilder().mVoucherId(cursorQuery.getInt(columnIndex)).mHasReminder(cursorQuery.getInt(columnIndex2) == 1).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
