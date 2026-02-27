package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_Fee;
import com.paymaya.domain.model.C$AutoValue_Fee;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Fee implements Parcelable {

    public static abstract class Builder {
        public abstract Fee build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mDisplay(String str);

        public abstract Builder mLabel(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Fee.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Fee.GsonTypeAdapter(jVar);
    }

    public String getCurrencyFormattedValue() {
        return mCurrency() + Global.BLANK + C.v(mValue());
    }

    public String getFormattedValue() {
        return C.v(mValue());
    }

    @Nullable
    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @Nullable
    @InterfaceC1498b("display")
    public abstract String mDisplay();

    @Nullable
    @InterfaceC1498b("label")
    public abstract String mLabel();

    @Nullable
    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
