package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.reflect.TypeToken;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Details;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.a f11293a;

    public A(L5.a database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11293a = database;
    }

    public static List a(Cursor cursor) {
        int i;
        List list;
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursor.getCount());
                int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
                int columnIndex2 = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex3 = cursor.getColumnIndex("logo_url");
                int columnIndex4 = cursor.getColumnIndex("icon_url");
                int columnIndex5 = cursor.getColumnIndex("description");
                int columnIndex6 = cursor.getColumnIndex("product_code");
                int columnIndex7 = cursor.getColumnIndex("product_type");
                int columnIndex8 = cursor.getColumnIndex("provider");
                int columnIndex9 = cursor.getColumnIndex("shop_categories");
                int columnIndex10 = cursor.getColumnIndex("original_currency");
                int columnIndex11 = cursor.getColumnIndex("original_value");
                int columnIndex12 = cursor.getColumnIndex("discounted_currency");
                int columnIndex13 = cursor.getColumnIndex("discounted_value");
                int columnIndex14 = cursor.getColumnIndex("promo");
                ArrayList arrayList2 = arrayList;
                int columnIndex15 = cursor.getColumnIndex("category");
                int i4 = columnIndex14;
                int columnIndex16 = cursor.getColumnIndex("disabled");
                int columnIndex17 = cursor.getColumnIndex("network");
                int columnIndex18 = cursor.getColumnIndex("priority");
                int columnIndex19 = cursor.getColumnIndex("page");
                int columnIndex20 = cursor.getColumnIndex("provider_display_name");
                int columnIndex21 = cursor.getColumnIndex("provider_details");
                int i6 = columnIndex5;
                while (true) {
                    int i10 = columnIndex11;
                    Amount amountBuild = Amount.sBuilder().mValue(String.valueOf(cursor.getDouble(columnIndex11))).mCurrency(cursor.getString(columnIndex10)).build();
                    Amount amountBuild2 = Amount.sBuilder().mValue(String.valueOf(cursor.getDouble(columnIndex13))).mCurrency(cursor.getString(columnIndex12)).build();
                    Details detailsBuild = Details.sBuilder().mNetwork(cursor.getString(columnIndex17)).build();
                    String string = cursor.getString(columnIndex9);
                    if (string == null || C2576A.H(string)) {
                        i = columnIndex9;
                        list = null;
                    } else {
                        i = columnIndex9;
                        list = (List) com.paymaya.common.utility.A.f10366a.f(cursor.getString(columnIndex9), new TypeToken<List<? extends ShopCategory>>() { // from class: com.paymaya.data.database.repository.ProductV3Repository$cursorToListObject$1
                        }.getType());
                    }
                    String string2 = cursor.getString(columnIndex21);
                    ProductProviderDetails productProviderDetails = (string2 == null || C2576A.H(string2)) ? null : (ProductProviderDetails) com.paymaya.common.utility.A.f10366a.f(cursor.getString(columnIndex21), new TypeToken<ProductProviderDetails>() { // from class: com.paymaya.data.database.repository.ProductV3Repository$cursorToListObject$2
                    }.getType());
                    String string3 = cursor.getString(columnIndex);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    String string4 = cursor.getString(columnIndex2);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    kotlin.jvm.internal.j.d(amountBuild);
                    String string5 = cursor.getString(columnIndex7);
                    String string6 = cursor.getString(columnIndex8);
                    String string7 = cursor.getString(columnIndex15);
                    String string8 = cursor.getString(columnIndex3);
                    String string9 = cursor.getString(columnIndex4);
                    int i11 = i6;
                    String string10 = cursor.getString(i11);
                    int i12 = columnIndex15;
                    String string11 = cursor.getString(columnIndex6);
                    int i13 = i4;
                    int i14 = columnIndex;
                    boolean z4 = cursor.getInt(i13) == 1;
                    int i15 = columnIndex16;
                    int i16 = columnIndex2;
                    boolean z5 = cursor.getInt(i15) == 1;
                    int i17 = columnIndex18;
                    Integer numValueOf = Integer.valueOf(cursor.getInt(i17));
                    int i18 = columnIndex20;
                    columnIndex18 = i17;
                    int i19 = columnIndex19;
                    ProductV3 productV3 = new ProductV3(string3, string4, amountBuild, string5, string6, list, string7, string8, string9, string10, string11, amountBuild2, z4, z5, detailsBuild, numValueOf, productProviderDetails, cursor.getString(i18), cursor.getInt(i19), false);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(productV3);
                    if (!cursor.moveToNext()) {
                        cursor.close();
                        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                        kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
                        return listUnmodifiableList;
                    }
                    columnIndex19 = i19;
                    columnIndex20 = i18;
                    arrayList2 = arrayList3;
                    columnIndex2 = i16;
                    columnIndex15 = i12;
                    columnIndex11 = i10;
                    columnIndex16 = i15;
                    i6 = i11;
                    columnIndex = i14;
                    i4 = i13;
                    columnIndex9 = i;
                }
            } else {
                cursor.close();
            }
        }
        return C1112C.f9377a;
    }

    public static List b(List productV3List) {
        kotlin.jvm.internal.j.g(productV3List, "productV3List");
        ArrayList arrayList = new ArrayList(productV3List.size());
        Iterator it = productV3List.iterator();
        while (it.hasNext()) {
            ProductV3 productV3 = (ProductV3) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, productV3.getId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, productV3.getName());
            contentValues.put("product_type", productV3.getProductType());
            contentValues.put("provider", productV3.getProvider());
            List<ShopCategory> shopCategories = productV3.getShopCategories();
            if (shopCategories != null && !shopCategories.isEmpty()) {
                contentValues.put("shop_categories", com.paymaya.common.utility.A.f10366a.k(productV3.getShopCategories()));
            }
            contentValues.put("logo_url", productV3.getLogoUrl());
            contentValues.put("icon_url", productV3.getIconUrl());
            contentValues.put("description", productV3.getDescription());
            contentValues.put("product_code", productV3.getProductCode());
            contentValues.put("original_currency", productV3.getAmountOriginal().mCurrency());
            contentValues.put("original_value", com.paymaya.common.utility.C.q0(productV3.getAmountOriginal().mValue()));
            Amount amountDiscounted = productV3.getAmountDiscounted();
            if (amountDiscounted != null) {
                contentValues.put("discounted_currency", amountDiscounted.mCurrency());
                contentValues.put("discounted_value", com.paymaya.common.utility.C.q0(amountDiscounted.mValue()));
            }
            contentValues.put("promo", Integer.valueOf(productV3.isPromo() ? 1 : 0));
            contentValues.put("category", productV3.getCategory());
            Details details = productV3.getDetails();
            if (details != null) {
                contentValues.put("network", details.mNetwork());
            }
            Integer priority = productV3.getPriority();
            contentValues.put("priority", Integer.valueOf(priority != null ? priority.intValue() : Integer.MAX_VALUE));
            contentValues.put("page", Integer.valueOf(productV3.getPage()));
            contentValues.put("disabled", Integer.valueOf(productV3.isDisabled() ? 1 : 0));
            if (productV3.getProductProviderDetails() != null) {
                contentValues.put("provider_details", com.paymaya.common.utility.A.f10366a.k(productV3.getProductProviderDetails()));
            }
            contentValues.put("provider_display_name", productV3.getProviderDisplayName());
            arrayList.add(contentValues);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
