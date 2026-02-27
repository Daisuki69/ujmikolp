package com.paymaya.domain.model;

import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.AutoValue_PullFundsPartner;
import com.paymaya.domain.model.C$AutoValue_PullFundsPartner;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PullFundsPartner {

    public static abstract class Builder {
        public abstract PullFundsPartner build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mIsEnabled(boolean z4);

        public abstract Builder mLimitMax(int i);

        public abstract Builder mLimitMin(int i);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_PullFundsPartner.Builder().mIsEnabled(false).mCurrency("PHP").mLimitMax(Integer.MAX_VALUE).mLimitMin(0);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_PullFundsPartner.GsonTypeAdapter(jVar);
    }

    public String getFormattedMaxValue() {
        return mCurrency() + Global.BLANK + C.v(String.valueOf(mLimitMax()));
    }

    public String getFormattedMinValue() {
        return mCurrency() + Global.BLANK + C.v(String.valueOf(mLimitMin()));
    }

    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @InterfaceC1498b(Constants.ENABLED)
    public abstract boolean mIsEnabled();

    @InterfaceC1498b("limit_max")
    public abstract int mLimitMax();

    @InterfaceC1498b("limit_min")
    public abstract int mLimitMin();

    public abstract Builder toBuilder();
}
