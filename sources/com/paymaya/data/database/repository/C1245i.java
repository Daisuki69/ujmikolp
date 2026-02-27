package com.paymaya.data.database.repository;

import android.content.ContentValues;
import com.paymaya.domain.model.BillerTransaction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.data.database.repository.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11311a;

    public final void a(BillerTransaction billerTransaction) {
        List<BillerTransaction> listSingletonList = Collections.singletonList(billerTransaction);
        ArrayList arrayList = new ArrayList(listSingletonList.size());
        com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
        for (BillerTransaction billerTransaction2 : listSingletonList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("slug", billerTransaction2.mBiller().mSlug());
            contentValues.put("accountNumber", billerTransaction2.mBiller().mAccountNumber());
            contentValues.put("amountCurrency", billerTransaction2.mAmount().mCurrency());
            contentValues.put("amountValue", billerTransaction2.mAmount().mValue());
            contentValues.put("userNumber", billerTransaction2.mUserMin());
            arrayList.add(contentValues);
        }
        this.f11311a.c("biller_transaction", Collections.unmodifiableList(arrayList));
    }
}
