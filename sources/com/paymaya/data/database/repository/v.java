package com.paymaya.data.database.repository;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MaintenanceDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11324a;

    public static List a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (!cursor2.moveToFirst()) {
            cursor.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursor2.getCount());
        int columnIndex = cursor2.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor2.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnIndex3 = cursor2.getColumnIndex("subtitle");
        int columnIndex4 = cursor2.getColumnIndex(SessionDescription.ATTR_TYPE);
        int columnIndex5 = cursor2.getColumnIndex("limit_min_currency");
        int columnIndex6 = cursor2.getColumnIndex("limit_min_value");
        int columnIndex7 = cursor2.getColumnIndex("limit_max_currency");
        int columnIndex8 = cursor2.getColumnIndex("limit_max_value");
        int columnIndex9 = cursor2.getColumnIndex("maintenance_start");
        int columnIndex10 = cursor2.getColumnIndex("maintenance_end");
        int columnIndex11 = cursor2.getColumnIndex("maintenance_message");
        int columnIndex12 = cursor2.getColumnIndex("icon_url_xhdpi");
        int columnIndex13 = cursor2.getColumnIndex("icon_url_hdpi");
        int columnIndex14 = cursor2.getColumnIndex("icon_url_mdpi");
        ArrayList arrayList2 = arrayList;
        int columnIndex15 = cursor2.getColumnIndex("steps");
        int columnIndex16 = cursor2.getColumnIndex(AppsFlyerProperties.CHANNEL);
        int columnIndex17 = cursor2.getColumnIndex("slug");
        int columnIndex18 = cursor2.getColumnIndex("no_fee_display");
        while (true) {
            int i = columnIndex4;
            Amount amountBuild = Amount.sBuilder().mCurrency(cursor2.getString(columnIndex5)).mValue(cursor2.getString(columnIndex6)).build();
            int i4 = columnIndex5;
            int i6 = columnIndex6;
            int i10 = columnIndex7;
            int i11 = columnIndex8;
            int i12 = columnIndex;
            LoadUpPartner.Builder builderMIconUrl = LoadUpPartner.sBuilder().mId(cursor2.getString(columnIndex)).mName(cursor2.getString(columnIndex2)).mSubtitle(cursor2.getString(columnIndex3)).mType(cursor2.getString(i)).mLimitMin(amountBuild).mLimitMax(Amount.sBuilder().mCurrency(cursor2.getString(columnIndex7)).mValue(cursor2.getString(columnIndex8)).build()).mMaintenance(MaintenanceDate.sBuilder().mStart(cursor2.getString(columnIndex9)).mEnd(cursor2.getString(columnIndex10)).mMessage(cursor2.getString(columnIndex11)).build()).mIconUrl(ImageUrl.sBuilder().mXhdpi(cursor2.getString(columnIndex12)).mHdpi(cursor2.getString(columnIndex13)).mMdpi(cursor2.getString(columnIndex14)).build());
            int i13 = columnIndex15;
            int i14 = columnIndex16;
            int i15 = columnIndex17;
            int i16 = columnIndex18;
            LoadUpPartner loadUpPartnerBuild = builderMIconUrl.mSteps(cursor2.getString(i13)).mChannel(cursor2.getString(i14)).mSlug(cursor2.getString(i15)).mNoFeeDisplay(cursor2.getInt(i16) == 1).build();
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(loadUpPartnerBuild);
            if (!cursor.moveToNext()) {
                cursor.close();
                return Collections.unmodifiableList(arrayList3);
            }
            cursor2 = cursor;
            arrayList2 = arrayList3;
            columnIndex15 = i13;
            columnIndex16 = i14;
            columnIndex17 = i15;
            columnIndex18 = i16;
            columnIndex4 = i;
            columnIndex = i12;
            columnIndex5 = i4;
            columnIndex6 = i6;
            columnIndex7 = i10;
            columnIndex8 = i11;
        }
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoadUpPartner loadUpPartner = (LoadUpPartner) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, loadUpPartner.mId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, loadUpPartner.mName());
            contentValues.put("slug", loadUpPartner.mSlug());
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mSubtitle())) {
                contentValues.put("subtitle", loadUpPartner.mSubtitle());
            }
            contentValues.put(SessionDescription.ATTR_TYPE, loadUpPartner.mType());
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mLimitMin())) {
                contentValues.put("limit_min_currency", loadUpPartner.mLimitMin().mCurrency());
                contentValues.put("limit_min_value", loadUpPartner.mLimitMin().mValue());
            }
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mLimitMax())) {
                contentValues.put("limit_max_currency", loadUpPartner.mLimitMax().mCurrency());
                contentValues.put("limit_max_value", loadUpPartner.mLimitMax().mValue());
            }
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mMaintenance())) {
                contentValues.put("maintenance_start", loadUpPartner.mMaintenance().mStart());
                contentValues.put("maintenance_end", loadUpPartner.mMaintenance().mEnd());
                contentValues.put("maintenance_message", loadUpPartner.mMaintenance().mMessage());
            }
            contentValues.put("icon_url_xhdpi", loadUpPartner.mIconUrl().mXhdpi());
            contentValues.put("icon_url_hdpi", loadUpPartner.mIconUrl().mHdpi());
            contentValues.put("icon_url_mdpi", loadUpPartner.mIconUrl().mMdpi());
            contentValues.put("no_fee_display", Integer.valueOf(loadUpPartner.mNoFeeDisplay() ? 1 : 0));
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mSteps())) {
                contentValues.put("steps", loadUpPartner.mSteps());
            }
            if (!com.paymaya.common.utility.C.e(loadUpPartner.mChannel())) {
                contentValues.put(AppsFlyerProperties.CHANNEL, loadUpPartner.mChannel());
            }
            arrayList.add(contentValues);
        }
        this.f11324a.c("load_up_partner", Collections.unmodifiableList(arrayList));
    }
}
