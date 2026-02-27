package com.paymaya.data.database.repository;

import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.CardProfile;
import com.paymaya.domain.model.FundSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A7.l f11320b = new A7.l(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11321a;

    public static List a(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor.getCount());
        int columnIndex = cursor.getColumnIndex("value");
        int columnIndex2 = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex3 = cursor.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex4 = cursor.getColumnIndex("status");
        int columnIndex5 = cursor.getColumnIndex("transaction_enabled");
        int columnIndex6 = cursor.getColumnIndex("scheme");
        int columnIndex7 = cursor.getColumnIndex("brand");
        do {
            arrayList.add(FundSource.sBuilder().mId(cursor.getString(columnIndex)).mName(cursor.getString(columnIndex2)).mType(cursor.getString(columnIndex3)).mStatus(cursor.getString(columnIndex4)).mTransactionEnabled(Boolean.valueOf(cursor.getInt(columnIndex5) == 1)).mCardProfile(CardProfile.sBuilder().mScheme(cursor.getString(columnIndex6)).mBrand(cursor.getString(columnIndex7)).build()).build());
        } while (cursor.moveToNext());
        cursor.close();
        return Collections.unmodifiableList(arrayList);
    }
}
