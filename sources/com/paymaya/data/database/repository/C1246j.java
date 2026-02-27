package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1246j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11312a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex2 = cursor.getColumnIndex("slug");
        int columnIndex3 = cursor.getColumnIndex("category");
        int columnIndex4 = cursor.getColumnIndex("categorySlug");
        int columnIndex5 = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        int columnIndex6 = cursor.getColumnIndex("listUrl");
        int columnIndex7 = cursor.getColumnIndex("confirmationUrl");
        int columnIndex8 = cursor.getColumnIndex("iconUrl");
        int columnIndex9 = cursor.getColumnIndex("hasOtherCharges");
        int columnIndex10 = cursor.getColumnIndex("paymentMethods");
        while (true) {
            String string = cursor.getString(columnIndex6);
            com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
            ImageUrl imageUrl = (ImageUrl) jVar.e(string, ImageUrl.class);
            int i = columnIndex6;
            int i4 = columnIndex7;
            int i6 = columnIndex8;
            int i10 = columnIndex;
            arrayList.add(Biller.sBuilder().mName(cursor.getString(columnIndex)).mSlug(cursor.getString(columnIndex2)).mCategory(cursor.getString(columnIndex3)).mCategorySlug(cursor.getString(columnIndex4)).mActive(Boolean.valueOf(cursor.isNull(columnIndex5) || cursor.getInt(columnIndex5) == 1)).mHasOtherCharges(Boolean.valueOf(cursor.getInt(columnIndex9) == 1)).mListUrl(imageUrl).mIconUrl((ImageUrl) jVar.e(cursor.getString(columnIndex8), ImageUrl.class)).mConfirmationUrl((ImageUrl) jVar.e(cursor.getString(columnIndex7), ImageUrl.class)).mMetadata(BillerMetadata.sBuilder().build()).mPaymentMethod((List) jVar.e(cursor.getString(columnIndex10), List.class)).build());
            if (!cursor.moveToNext()) {
                cursor.close();
                return Collections.unmodifiableList(arrayList);
            }
            columnIndex6 = i;
            columnIndex7 = i4;
            columnIndex8 = i6;
            columnIndex = i10;
        }
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Biller biller = (Biller) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, biller.mName());
            contentValues.put("slug", biller.mSlug());
            contentValues.put("category", biller.mCategory());
            contentValues.put("categorySlug", biller.mCategorySlug());
            if (biller.mActive() != null) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Integer.valueOf(biller.mActive().booleanValue() ? 1 : 0));
            }
            contentValues.put("categorySlug", biller.mCategorySlug());
            contentValues.put("hasOtherCharges", Integer.valueOf((biller.mHasOtherCharges() == null || !biller.mHasOtherCharges().booleanValue()) ? 0 : 1));
            String strK = jVar.k(biller.mListUrl());
            String strK2 = jVar.k(biller.mConfirmationUrl());
            String strK3 = jVar.k(biller.mIconUrl());
            contentValues.put("listUrl", strK);
            contentValues.put("iconUrl", strK3);
            contentValues.put("confirmationUrl", strK2);
            if (biller.mPaymentMethod() != null) {
                contentValues.put("paymentMethods", jVar.k(biller.mPaymentMethod()));
            }
            arrayList.add(contentValues);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
