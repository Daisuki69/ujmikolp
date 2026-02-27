package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ShopPurchaseHistory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11296a;

    public final List a(M5.f fVar) {
        int i;
        int i4;
        int i6;
        List<OrderProviderField> list;
        Cursor cursorQuery = this.f11296a.f2811a.query(fVar.d());
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("product_id");
        int columnIndex2 = cursorQuery.getColumnIndex("product_name");
        int columnIndex3 = cursorQuery.getColumnIndex("product_description");
        int columnIndex4 = cursorQuery.getColumnIndex("image_url");
        int columnIndex5 = cursorQuery.getColumnIndex("recipient");
        int columnIndex6 = cursorQuery.getColumnIndex("status");
        int columnIndex7 = cursorQuery.getColumnIndex(MPDbAdapter.KEY_CREATED_AT);
        int columnIndex8 = cursorQuery.getColumnIndex("updated_at");
        int columnIndex9 = cursorQuery.getColumnIndex("icon_url");
        int columnIndex10 = cursorQuery.getColumnIndex("page");
        int columnIndex11 = cursorQuery.getColumnIndex("payment_trn");
        int columnIndex12 = cursorQuery.getColumnIndex("order_reference_number");
        int columnIndex13 = cursorQuery.getColumnIndex("price");
        int columnIndex14 = cursorQuery.getColumnIndex("code");
        ArrayList arrayList2 = arrayList;
        int columnIndex15 = cursorQuery.getColumnIndex("network");
        int columnIndex16 = cursorQuery.getColumnIndex("other_fields");
        int columnIndex17 = cursorQuery.getColumnIndex("gifted");
        int columnIndex18 = cursorQuery.getColumnIndex("with_receipt");
        int columnIndex19 = cursorQuery.getColumnIndex("available_receipt");
        while (true) {
            if (com.paymaya.common.utility.C.e(cursorQuery.getString(columnIndex15))) {
                i = columnIndex16;
                i4 = columnIndex15;
                i6 = columnIndex19;
                list = null;
            } else {
                i6 = columnIndex19;
                i4 = columnIndex15;
                i = columnIndex16;
                list = (List) com.paymaya.common.utility.A.f10366a.f(cursorQuery.getString(columnIndex16), new ShopPurchaseHistoryRepository$1().getType());
            }
            int i10 = columnIndex;
            int i11 = columnIndex2;
            ShopPurchaseHistory.Builder builderMCode = ShopPurchaseHistory.sBuilder().mProductId(cursorQuery.getString(columnIndex)).mProductName(cursorQuery.getString(columnIndex2)).mProductDescription(cursorQuery.getString(columnIndex3)).mImageUrl(cursorQuery.getString(columnIndex4)).mRecipient(cursorQuery.getString(columnIndex5)).mStatus(cursorQuery.getString(columnIndex6)).mCreatedAt(cursorQuery.getString(columnIndex7)).mUpdatedAt(cursorQuery.getString(columnIndex8)).mIconUrl(cursorQuery.getString(columnIndex9)).mPaymentTrn(cursorQuery.getString(columnIndex11)).mOrderReferenceNumber(cursorQuery.getString(columnIndex12)).mPrice(cursorQuery.getDouble(columnIndex13)).mPage(cursorQuery.getInt(columnIndex10)).mCode(cursorQuery.getString(columnIndex14));
            int i12 = i4;
            ShopPurchaseHistory.Builder builderMOtherFields = builderMCode.mNetwork(cursorQuery.getString(i12)).mOtherFields(list);
            int i13 = columnIndex17;
            int i14 = columnIndex18;
            int i15 = i6;
            ShopPurchaseHistory shopPurchaseHistoryBuild = builderMOtherFields.mIsGifted(cursorQuery.getInt(i13) == 1).mWithReceipt(cursorQuery.getInt(i14) == 1).mAvailableReceipt(cursorQuery.getInt(i15) == 1).build();
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(shopPurchaseHistoryBuild);
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return Collections.unmodifiableList(arrayList3);
            }
            columnIndex19 = i15;
            columnIndex = i10;
            arrayList2 = arrayList3;
            columnIndex15 = i12;
            columnIndex18 = i14;
            columnIndex17 = i13;
            columnIndex2 = i11;
            columnIndex16 = i;
        }
    }
}
