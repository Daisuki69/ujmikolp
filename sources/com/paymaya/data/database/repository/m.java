package com.paymaya.data.database.repository;

import android.content.ContentValues;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.domain.model.CreditTransactionItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L5.a f11315a;

    public m(L5.a database) {
        kotlin.jvm.internal.j.g(database, "database");
        this.f11315a = database;
    }

    public final void a(List items) {
        kotlin.jvm.internal.j.g(items, "items");
        ArrayList arrayList = new ArrayList(items.size());
        Iterator it = items.iterator();
        while (it.hasNext()) {
            CreditTransactionItem creditTransactionItem = (CreditTransactionItem) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("accountId", creditTransactionItem.getAccountId());
            contentValues.put("transactionId", creditTransactionItem.getTransactionId());
            contentValues.put("transactionReference", creditTransactionItem.getTransactionReference());
            contentValues.put("totalAmount", creditTransactionItem.getTotalAmount());
            contentValues.put("currency", creditTransactionItem.getCurrency());
            contentValues.put("transactionType", creditTransactionItem.getTransactionType());
            contentValues.put("action", creditTransactionItem.getAction());
            contentValues.put(TypedValues.AttributesType.S_TARGET, creditTransactionItem.getTarget());
            contentValues.put("dateTime", creditTransactionItem.getDateTime());
            arrayList.add(contentValues);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.j.f(listUnmodifiableList, "unmodifiableList(...)");
        this.f11315a.c("credit_transaction", listUnmodifiableList);
    }
}
