package com.paymaya.data.database.repository;

import android.database.Cursor;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11303a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex("current_currency");
        int columnIndex2 = cursor.getColumnIndex("current_value");
        int columnIndex3 = cursor.getColumnIndex("available_currency");
        int columnIndex4 = cursor.getColumnIndex("available_value");
        do {
            Amount amountBuild = Amount.sBuilder().mCurrency(cursor.getString(columnIndex)).mValue(cursor.getString(columnIndex2)).build();
            arrayList.add(AccountBalance.sBuilder().mCurrentBalance(amountBuild).mAvailableBalance(Amount.sBuilder().mCurrency(cursor.getString(columnIndex3)).mValue(cursor.getString(columnIndex4)).build()).build());
        } while (cursor.moveToNext());
        cursor.close();
        return Collections.unmodifiableList(arrayList);
    }
}
