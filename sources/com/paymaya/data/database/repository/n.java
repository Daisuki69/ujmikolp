package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.paymaya.domain.model.Decoration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.a f11316a;

    public n(L5.a database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11316a = database;
    }

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex(MPDbAdapter.KEY_CREATED_AT);
        int columnIndex2 = cursor.getColumnIndex("updated_at");
        int columnIndex3 = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex4 = cursor.getColumnIndex("category");
        int columnIndex5 = cursor.getColumnIndex("label");
        int columnIndex6 = cursor.getColumnIndex("description");
        int columnIndex7 = cursor.getColumnIndex("iconUrl");
        int columnIndex8 = cursor.getColumnIndex("imageUrl");
        int columnIndex9 = cursor.getColumnIndex("priority");
        int columnIndex10 = cursor.getColumnIndex("hidden");
        while (true) {
            Integer numValueOf = cursor.isNull(columnIndex9) ? null : Integer.valueOf(cursor.getInt(columnIndex9));
            boolean z4 = cursor.getInt(columnIndex10) == 1;
            String string = cursor.getString(columnIndex);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = cursor.getString(columnIndex2);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            int i = columnIndex;
            String string3 = cursor.getString(columnIndex3);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            String string4 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            String string5 = cursor.getString(columnIndex5);
            kotlin.jvm.internal.j.f(string5, "getString(...)");
            arrayList.add(new Decoration(string, string2, string3, string4, string5, cursor.getString(columnIndex6), cursor.getString(columnIndex7), cursor.getString(columnIndex8), numValueOf, z4));
            if (!cursor.moveToNext()) {
                cursor.close();
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.j.d(listUnmodifiableList);
                return listUnmodifiableList;
            }
            columnIndex = i;
        }
    }

    public final List b(M5.f fVar) {
        Cursor cursorQuery = this.f11316a.f2811a.query(fVar.d());
        kotlin.jvm.internal.j.d(cursorQuery);
        return a(cursorQuery);
    }
}
