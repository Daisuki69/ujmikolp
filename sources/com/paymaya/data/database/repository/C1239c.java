package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.Recommendation;
import com.paymaya.utilities.ImageUrlUnfiltered;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.a f11305a;

    public C1239c(L5.a database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11305a = database;
    }

    public static ArrayList a(Cursor cursor) {
        com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
        ArrayList arrayList = new ArrayList();
        int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor.getColumnIndex("title");
        int columnIndex3 = cursor.getColumnIndex("subtitle");
        int columnIndex4 = cursor.getColumnIndex("color");
        int columnIndex5 = cursor.getColumnIndex("application_uri");
        int columnIndex6 = cursor.getColumnIndex("media");
        while (cursor.moveToNext()) {
            String string = cursor.isNull(columnIndex6) ? null : cursor.getString(columnIndex6);
            ImageUrlUnfiltered imageUrlUnfiltered = string != null ? (ImageUrlUnfiltered) jVar.e(string, ImageUrlUnfiltered.class) : null;
            arrayList.add(new Recommendation(cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex), cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4), cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2), cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3), cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5), imageUrlUnfiltered));
        }
        cursor.close();
        return arrayList;
    }
}
