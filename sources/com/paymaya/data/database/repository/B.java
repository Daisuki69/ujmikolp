package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.reflect.TypeToken;
import com.paymaya.domain.model.Details;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.a f11294a;

    public B(L5.a database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11294a = database;
    }

    public static List a(List listItems) {
        kotlin.jvm.internal.j.g(listItems, "listItems");
        ArrayList arrayList = new ArrayList(listItems.size());
        Iterator it = listItems.iterator();
        while (it.hasNext()) {
            ShopProvider shopProvider = (ShopProvider) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, shopProvider.getId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, shopProvider.getName());
            contentValues.put("display_name", shopProvider.getDisplayName());
            contentValues.put("description", shopProvider.getDescription());
            contentValues.put("priority", shopProvider.getPriority());
            contentValues.put(MPDbAdapter.KEY_CREATED_AT, shopProvider.getCreatedAt());
            contentValues.put("updated_at", shopProvider.getUpdatedAt());
            contentValues.put("logo_url", shopProvider.getLogoUrl());
            contentValues.put("icon_url", shopProvider.getIconUrl());
            contentValues.put("background_url", shopProvider.getBackgroundUrl());
            Details details = shopProvider.getDetails();
            if (details != null) {
                contentValues.put("network", details.mNetwork());
            }
            List<ShopProviderCategory> categories = shopProvider.getCategories();
            if (categories != null && !categories.isEmpty()) {
                contentValues.put("categories", com.paymaya.common.utility.A.f10366a.k(shopProvider.getCategories()));
            }
            arrayList.add(contentValues);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public final List b(M5.f fVar) {
        int i;
        Cursor cursorQuery = this.f11294a.f2811a.query(fVar.d());
        if (cursorQuery == null) {
            return C1112C.f9377a;
        }
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return C1112C.f9377a;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex3 = cursorQuery.getColumnIndex("display_name");
        int columnIndex4 = cursorQuery.getColumnIndex("description");
        int columnIndex5 = cursorQuery.getColumnIndex("network");
        int columnIndex6 = cursorQuery.getColumnIndex("priority");
        int columnIndex7 = cursorQuery.getColumnIndex("categories");
        int columnIndex8 = cursorQuery.getColumnIndex(MPDbAdapter.KEY_CREATED_AT);
        int columnIndex9 = cursorQuery.getColumnIndex("updated_at");
        int columnIndex10 = cursorQuery.getColumnIndex("logo_url");
        int columnIndex11 = cursorQuery.getColumnIndex("icon_url");
        int columnIndex12 = cursorQuery.getColumnIndex("background_url");
        while (true) {
            String string = cursorQuery.getString(columnIndex5);
            List list = null;
            Details detailsBuild = (string == null || string.length() == 0) ? null : Details.sBuilder().mNetwork(string).build();
            String string2 = cursorQuery.getString(columnIndex7);
            if (string2 == null || C2576A.H(string2)) {
                i = columnIndex5;
            } else {
                i = columnIndex5;
                list = (List) com.paymaya.common.utility.A.f10366a.f(cursorQuery.getString(columnIndex7), new TypeToken<List<? extends ShopProviderCategory>>() { // from class: com.paymaya.data.database.repository.ShopProviderRepository$cursorToListObject$1
                }.getType());
            }
            List list2 = list;
            String string3 = cursorQuery.getString(columnIndex);
            String str = string3 == null ? "" : string3;
            String string4 = cursorQuery.getString(columnIndex2);
            String str2 = string4 == null ? "" : string4;
            String string5 = cursorQuery.getString(columnIndex3);
            String str3 = string5 == null ? "" : string5;
            String string6 = cursorQuery.getString(columnIndex4);
            String str4 = string6 == null ? "" : string6;
            Integer numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndex6));
            String string7 = cursorQuery.getString(columnIndex8);
            String str5 = string7 == null ? "" : string7;
            String string8 = cursorQuery.getString(columnIndex9);
            arrayList.add(new ShopProvider(str, str2, str3, str4, detailsBuild, numValueOf, list2, str5, string8 == null ? "" : string8, cursorQuery.getString(columnIndex10), cursorQuery.getString(columnIndex11), cursorQuery.getString(columnIndex12)));
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.j.d(listUnmodifiableList);
                return listUnmodifiableList;
            }
            columnIndex5 = i;
        }
    }
}
