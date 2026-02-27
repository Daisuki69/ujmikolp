package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.OnlinePayment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11328a;

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        com.google.gson.j jVar = com.paymaya.common.utility.A.f10366a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OnlinePayment onlinePayment = (OnlinePayment) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, onlinePayment.mId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, onlinePayment.mName());
            contentValues.put("code", onlinePayment.mCode());
            contentValues.put("category", onlinePayment.mCategory());
            contentValues.put("link", onlinePayment.mExternalLink());
            contentValues.put("background_url", onlinePayment.mBackgroundUrl());
            contentValues.put("icon_url", onlinePayment.mIconUrl());
            contentValues.put("logo_url", onlinePayment.mLogoUrl());
            contentValues.put("maintenance", jVar.k(onlinePayment.mMaintenance()));
            contentValues.put("tags", jVar.k(onlinePayment.mTags()));
            arrayList.add(contentValues);
        }
        this.f11328a.c("online_payment", Collections.unmodifiableList(arrayList));
    }

    public final int b(String str) {
        Cursor cursorQuery = this.f11328a.f2811a.query(String.format("SELECT COUNT(*) FROM %1$s WHERE %2$s = \"%3$s\"", "online_payment", "category", str));
        int i = cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        cursorQuery.close();
        return i;
    }
}
