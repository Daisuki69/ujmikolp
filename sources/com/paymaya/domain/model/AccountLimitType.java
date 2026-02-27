package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountLimitsItem;
import com.paymaya.domain.model.AutoValue_AccountLimitType;
import com.paymaya.domain.model.C$AutoValue_AccountLimitType;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountLimitType implements AccountLimitsItem {

    public static abstract class Builder {
        public abstract AccountLimitType build();

        public abstract Builder mAmount(AccountLimitAmount accountLimitAmount);

        public abstract Builder mCount(AccountLimitCount accountLimitCount);

        public abstract Builder mDescription(String str);

        public abstract Builder mName(String str);

        public abstract Builder mOrder(int i);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_AccountLimitType.Builder().mOrder(0);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_AccountLimitType.GsonTypeAdapter(jVar);
    }

    @Override // com.paymaya.domain.model.AccountLimitsItem
    public AccountLimitsItem.VIEW_TYPE getViewType() {
        return AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_ITEM;
    }

    @Nullable
    @InterfaceC1498b("amount")
    public abstract AccountLimitAmount mAmount();

    @Nullable
    @InterfaceC1498b("count")
    public abstract AccountLimitCount mCount();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    @InterfaceC1498b("order")
    public abstract int mOrder();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
