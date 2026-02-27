package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1244h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11310a;

    public final void a(Biller biller) {
        List<Biller> listSingletonList = Collections.singletonList(biller);
        ArrayList arrayList = new ArrayList(listSingletonList.size());
        com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
        for (Biller biller2 : listSingletonList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, biller2.mName());
            contentValues.put("slug", biller2.mSlug());
            contentValues.put("category", biller2.mCategory());
            contentValues.put("categorySlug", biller2.mCategorySlug());
            String strK = jVar.k(biller2.mListUrl());
            String strK2 = jVar.k(biller2.mConfirmationUrl());
            String strK3 = jVar.k(biller2.mIconUrl());
            contentValues.put("listUrl", strK);
            contentValues.put("iconUrl", strK3);
            contentValues.put("confirmationUrl", strK2);
            if (biller2.mMetadata() != null && biller2.mMetadata().mAccountNumberPlaceHolder() != null) {
                contentValues.put("accountNumberPlaceholder", biller2.mMetadata().mAccountNumberPlaceHolder());
            }
            if (biller2.mMetadata() != null && biller2.mMetadata().mAmountPlaceHolder() != null) {
                contentValues.put("amountPlaceholder", biller2.mMetadata().mAmountPlaceHolder());
            }
            arrayList.add(contentValues);
        }
        this.f11310a.c("biller", Collections.unmodifiableList(arrayList));
    }

    public final List b(M5.a aVar) {
        Cursor cursorQuery = this.f11310a.f2811a.query(aVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex2 = cursorQuery.getColumnIndex("slug");
        int columnIndex3 = cursorQuery.getColumnIndex("category");
        int columnIndex4 = cursorQuery.getColumnIndex("categorySlug");
        int columnIndex5 = cursorQuery.getColumnIndex("listUrl");
        int columnIndex6 = cursorQuery.getColumnIndex("confirmationUrl");
        int columnIndex7 = cursorQuery.getColumnIndex("iconUrl");
        int columnIndex8 = cursorQuery.getColumnIndex("accountNumberPlaceholder");
        int columnIndex9 = cursorQuery.getColumnIndex("amountPlaceholder");
        while (true) {
            String string = cursorQuery.getString(columnIndex5);
            com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
            ImageUrl imageUrl = (ImageUrl) jVar.e(string, ImageUrl.class);
            ImageUrl imageUrl2 = (ImageUrl) jVar.e(cursorQuery.getString(columnIndex6), ImageUrl.class);
            ImageUrl imageUrl3 = (ImageUrl) jVar.e(cursorQuery.getString(columnIndex7), ImageUrl.class);
            int i = columnIndex5;
            arrayList.add(Biller.sBuilder().mName(cursorQuery.getString(columnIndex)).mSlug(cursorQuery.getString(columnIndex2)).mCategory(cursorQuery.getString(columnIndex3)).mCategorySlug(cursorQuery.getString(columnIndex4)).mListUrl(imageUrl).mIconUrl(imageUrl3).mConfirmationUrl(imageUrl2).mMetadata(BillerMetadata.sBuilder().mAccountNumberPlaceHolder(cursorQuery.getString(columnIndex8)).mAmountPlaceHolder(cursorQuery.getString(columnIndex9)).build()).build());
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return Collections.unmodifiableList(arrayList);
            }
            columnIndex5 = i;
        }
    }
}
