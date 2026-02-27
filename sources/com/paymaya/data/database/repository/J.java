package com.paymaya.data.database.repository;

import android.content.ContentValues;
import com.paymaya.domain.model.Voucher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L5.a f11302a;

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Voucher voucher = (Voucher) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("assignment_id", Integer.valueOf(voucher.mAssignmentId()));
            contentValues.put("account_name", voucher.mAccountName());
            contentValues.put("campaign_name", voucher.mCampaignName());
            contentValues.put("code", voucher.mCode());
            contentValues.put("sender", voucher.mSender());
            contentValues.put("recipient", voucher.mRecipient());
            contentValues.put("status", voucher.mStatus());
            contentValues.put("start_date", voucher.mStartDate());
            contentValues.put("end_date", voucher.mEndDate());
            contentValues.put("icon_url", voucher.mIconUrl());
            contentValues.put("banner_url", voucher.mBannerUrl());
            contentValues.put("external_partner_code", voucher.mExternalPartnerCode());
            contentValues.put("page", Integer.valueOf(voucher.mPage()));
            contentValues.put("has_reminder", Boolean.valueOf(voucher.mHasReminder()));
            contentValues.put("redeemed_date", voucher.mRedeemedDate());
            if (voucher.mNotificationSettings() != null) {
                if (voucher.mNotificationSettings().mType() != null) {
                    contentValues.put("notification_type", com.paymaya.common.utility.C.f(voucher.mNotificationSettings().mType()));
                }
                if (voucher.mNotificationSettings().mNotifyDatesBeforeExpiry() != null) {
                    contentValues.put("notification_dates_expiry", com.paymaya.common.utility.C.f(voucher.mNotificationSettings().mNotifyDatesBeforeExpiry()));
                }
                contentValues.put("notification_spiel", voucher.mNotificationSettings().mNotificationSpiel());
            }
            if (voucher.mDenomination() != null) {
                contentValues.put("denomination_type", voucher.mDenomination().mType());
                contentValues.put("denomination_value", Double.valueOf(voucher.mDenomination().mValue()));
            }
            arrayList2.add(contentValues);
        }
        this.f11302a.c("voucher", Collections.unmodifiableList(arrayList2));
    }
}
