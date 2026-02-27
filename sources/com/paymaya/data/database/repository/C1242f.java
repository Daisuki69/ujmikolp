package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import com.paymaya.domain.model.Bank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1242f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11308a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex("bank_code");
        int columnIndex2 = cursor.getColumnIndex("bank_name");
        int columnIndex3 = cursor.getColumnIndex("is_active");
        int columnIndex4 = cursor.getColumnIndex("is_maintenance");
        int columnIndex5 = cursor.getColumnIndex("fee");
        int columnIndex6 = cursor.getColumnIndex("bank_ic");
        do {
            arrayList.add(Bank.sBuilder().mBankCode(cursor.getString(columnIndex)).mBankName(cursor.getString(columnIndex2)).mIsActive(Boolean.valueOf(cursor.getInt(columnIndex3) == 1)).mIsMaintenance(Boolean.valueOf(cursor.getInt(columnIndex4) == 1)).mFee(cursor.getString(columnIndex5)).mBankIC(cursor.getString(columnIndex6)).build());
        } while (cursor.moveToNext());
        cursor.close();
        return Collections.unmodifiableList(arrayList);
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bank bank = (Bank) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("bank_code", bank.mBankCode());
            contentValues.put("bank_name", bank.mBankName());
            int i = 0;
            contentValues.put("is_active", Integer.valueOf((bank.mIsActive() == null || !bank.mIsActive().booleanValue()) ? 0 : 1));
            if (bank.mIsMaintenance() != null && bank.mIsMaintenance().booleanValue()) {
                i = 1;
            }
            contentValues.put("is_maintenance", Integer.valueOf(i));
            contentValues.put("fee", bank.mFee());
            contentValues.put("bank_ic", bank.mBankIC());
            arrayList.add(contentValues);
        }
        this.f11308a.c("bank", Collections.unmodifiableList(arrayList));
    }

    public final Bank c(M5.f fVar) {
        if (a(this.f11308a.f2811a.query(fVar.d())).isEmpty()) {
            return null;
        }
        return (Bank) a(this.f11308a.f2811a.query(fVar.d())).get(0);
    }
}
