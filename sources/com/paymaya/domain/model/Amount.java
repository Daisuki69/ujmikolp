package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_Amount;
import com.paymaya.domain.model.C$AutoValue_Amount;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Amount implements Parcelable {

    public static abstract class Builder {
        public abstract Amount build();

        public abstract Builder mCurrency(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Amount.Builder().mCurrency("PHP").mValue("0.00");
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Amount.GsonTypeAdapter(jVar);
    }

    public String getCurrencyFormattedValue() {
        return mCurrency() + Global.BLANK + C.v(mValue());
    }

    public String getFormattedValue() {
        return C.v(mValue());
    }

    public String getPesoSignFormattedValue() {
        return "₱" + C.u(getValueAsDouble());
    }

    public BigDecimal getValueAsBigDecimal() {
        return mValue() != null ? new BigDecimal(mValue()) : BigDecimal.ZERO;
    }

    public Double getValueAsDouble() {
        return Double.valueOf(mValue() != null ? Double.parseDouble(mValue()) : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @Nullable
    @InterfaceC1498b("currency")
    public abstract String mCurrency();

    @Nullable
    @InterfaceC1498b("value")
    public abstract String mValue();
}
