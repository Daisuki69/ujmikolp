package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import com.paymaya.domain.model.FormSeries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11319a;

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormSeries formSeries = (FormSeries) it.next();
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it2 = formSeries.mTaxTypeList().iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next());
                sb2.append(",");
            }
            String strSubstring = sb2.toString().substring(0, sb2.length() - 1);
            ContentValues contentValues = new ContentValues();
            contentValues.put("form_type", formSeries.mFormType());
            contentValues.put("form_series", formSeries.mFormSeries());
            contentValues.put("tax_type", strSubstring);
            arrayList.add(contentValues);
        }
        this.f11319a.c("form_series_bir", Collections.unmodifiableList(arrayList));
    }

    public final List b(M5.f fVar) {
        Cursor cursorQuery = this.f11319a.f2811a.query(fVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("form_type");
        int columnIndex2 = cursorQuery.getColumnIndex("form_series");
        int columnIndex3 = cursorQuery.getColumnIndex("tax_type");
        do {
            arrayList.add(FormSeries.sBuilder().mFormType(cursorQuery.getString(columnIndex)).mFormSeries(cursorQuery.getString(columnIndex2)).mTaxTypeList(new ArrayList(Arrays.asList(cursorQuery.getString(columnIndex3).split(",")))).build());
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
