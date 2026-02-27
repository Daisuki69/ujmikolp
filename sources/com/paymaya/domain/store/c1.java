package com.paymaya.domain.store;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.VoucherDenomination;
import com.paymaya.domain.model.VoucherNotificationSettings;
import com.paymaya.domain.model.VoucherReminder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11431b;
    public com.paymaya.data.database.repository.J c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.database.repository.I f11432d;

    public final void a(int i) {
        VoucherReminder voucherReminderBuild = VoucherReminder.sBuilder().mVoucherId(i).mHasReminder(false).build();
        com.paymaya.data.database.repository.I i4 = this.f11432d;
        i4.getClass();
        List<VoucherReminder> listSingletonList = Collections.singletonList(voucherReminderBuild);
        ArrayList arrayList = new ArrayList(listSingletonList.size());
        for (VoucherReminder voucherReminder : listSingletonList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(TtmlNode.ATTR_ID, Integer.valueOf(voucherReminder.mVoucherId()));
            contentValues.put("has_reminder", Boolean.valueOf(voucherReminder.mHasReminder()));
            arrayList.add(contentValues);
        }
        i4.f11301a.c("voucher_reminder", Collections.unmodifiableList(arrayList));
    }

    public final Lh.d b(int i, String str) {
        String str2 = com.paymaya.common.utility.C.f10391a;
        HashMap mapP = androidx.media3.datasource.cache.c.p("status", str);
        mapP.put("page", String.valueOf(i));
        mapP.put("device_type", "android");
        mapP.put("device_resolution", str2);
        Ah.p<VoucherBase> vouchers = this.f11431b.getVouchers(mapP);
        G6.b bVar = new G6.b(this, str, i, 9);
        vouchers.getClass();
        return new Lh.d(vouchers, bVar, 2);
    }

    public final VoucherReminder c(Voucher voucher) {
        int iMAssignmentId = voucher.mAssignmentId();
        D.S s9 = new D.S();
        s9.f865a = iMAssignmentId;
        com.paymaya.data.database.repository.I i = this.f11432d;
        if (i.a(s9).isEmpty()) {
            return null;
        }
        return (VoucherReminder) i.a(s9).get(0);
    }

    public final List d(String str) {
        int i;
        List<String> listAsList;
        Cursor cursorQuery = this.c.f11302a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", Arrays.copyOf(new Object[]{"voucher", "status", str}, 3)));
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        int columnIndex = cursorQuery.getColumnIndex("assignment_id");
        int columnIndex2 = cursorQuery.getColumnIndex("account_name");
        int columnIndex3 = cursorQuery.getColumnIndex("campaign_name");
        int columnIndex4 = cursorQuery.getColumnIndex("code");
        int columnIndex5 = cursorQuery.getColumnIndex("sender");
        int columnIndex6 = cursorQuery.getColumnIndex("recipient");
        int columnIndex7 = cursorQuery.getColumnIndex("status");
        int columnIndex8 = cursorQuery.getColumnIndex("start_date");
        int columnIndex9 = cursorQuery.getColumnIndex("end_date");
        int columnIndex10 = cursorQuery.getColumnIndex("icon_url");
        int columnIndex11 = cursorQuery.getColumnIndex("banner_url");
        int columnIndex12 = cursorQuery.getColumnIndex("external_partner_code");
        int columnIndex13 = cursorQuery.getColumnIndex("denomination_type");
        int columnIndex14 = cursorQuery.getColumnIndex("denomination_value");
        ArrayList arrayList2 = arrayList;
        int columnIndex15 = cursorQuery.getColumnIndex("page");
        int columnIndex16 = cursorQuery.getColumnIndex("notification_dates_expiry");
        int i4 = columnIndex12;
        int columnIndex17 = cursorQuery.getColumnIndex("notification_type");
        int i6 = columnIndex11;
        int columnIndex18 = cursorQuery.getColumnIndex("notification_spiel");
        int i10 = columnIndex10;
        int columnIndex19 = cursorQuery.getColumnIndex("has_reminder");
        int columnIndex20 = cursorQuery.getColumnIndex("redeemed_date");
        while (true) {
            VoucherNotificationSettings.Builder builderSBuilder = VoucherNotificationSettings.sBuilder();
            int i11 = columnIndex9;
            if (cursorQuery.getString(columnIndex16) != null) {
                i = columnIndex8;
                listAsList = Arrays.asList(cursorQuery.getString(columnIndex16).split("__,__"));
            } else {
                i = columnIndex8;
                listAsList = null;
            }
            VoucherNotificationSettings voucherNotificationSettingsBuild = builderSBuilder.mNotifyDatesBeforeExpiry(listAsList).mType(cursorQuery.getString(columnIndex17) != null ? Arrays.asList(cursorQuery.getString(columnIndex17).split("__,__")) : null).mNotificationSpiel(cursorQuery.getString(columnIndex18)).build();
            int i12 = columnIndex13;
            int i13 = columnIndex17;
            VoucherDenomination voucherDenominationBuild = VoucherDenomination.sBuilder().mType(cursorQuery.getString(columnIndex13)).mValue(cursorQuery.getDouble(columnIndex14)).build();
            int i14 = i;
            int i15 = columnIndex14;
            int i16 = columnIndex16;
            int i17 = i10;
            int i18 = i6;
            Voucher.Builder builderMBannerUrl = Voucher.sBuilder().mAssignmentId(cursorQuery.getInt(columnIndex)).mAccountName(cursorQuery.getString(columnIndex2)).mCampaignName(cursorQuery.getString(columnIndex3)).mCode(cursorQuery.getString(columnIndex4)).mSender(cursorQuery.getString(columnIndex5)).mRecipient(cursorQuery.getString(columnIndex6)).mStatus(cursorQuery.getString(columnIndex7)).mStartDate(cursorQuery.getString(i14)).mEndDate(cursorQuery.getString(i11)).mIconUrl(cursorQuery.getString(i17)).mBannerUrl(cursorQuery.getString(i18));
            int i19 = i4;
            int i20 = columnIndex15;
            Voucher.Builder builderMPage = builderMBannerUrl.mExternalPartnerCode(cursorQuery.getString(i19)).mPage(cursorQuery.getInt(i20));
            int i21 = columnIndex19;
            Voucher.Builder builderMNotificationSettings = builderMPage.mHasReminder(cursorQuery.getInt(i21) == 1).mDenomination(voucherDenominationBuild).mNotificationSettings(voucherNotificationSettingsBuild);
            int i22 = columnIndex20;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(builderMNotificationSettings.mRedeemedDate(cursorQuery.getString(i22)).build());
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return Collections.unmodifiableList(arrayList3);
            }
            columnIndex20 = i22;
            arrayList2 = arrayList3;
            columnIndex8 = i14;
            columnIndex13 = i12;
            columnIndex9 = i11;
            columnIndex14 = i15;
            columnIndex16 = i16;
            columnIndex17 = i13;
            i10 = i17;
            i6 = i18;
            i4 = i19;
            columnIndex15 = i20;
            columnIndex19 = i21;
        }
    }

    public final void e(int i, boolean z4) {
        com.paymaya.data.database.repository.I i4 = this.f11432d;
        i4.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("has_reminder", Integer.valueOf(z4 ? 1 : 0));
        i4.f11301a.e("voucher_reminder", contentValues, "id = ?", new String[]{String.valueOf(i)});
    }
}
