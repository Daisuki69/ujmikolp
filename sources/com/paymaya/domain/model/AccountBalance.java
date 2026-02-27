package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_AccountBalance;
import com.paymaya.domain.model.C$AutoValue_AccountBalance;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AccountBalance implements Parcelable {

    public static abstract class Builder {
        public abstract AccountBalance build();

        public abstract Builder mAvailableBalance(Amount amount);

        public abstract Builder mCurrentBalance(Amount amount);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_AccountBalance.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_AccountBalance.GsonTypeAdapter(jVar);
    }

    public boolean isValueLessThanThreshold() {
        return BigDecimal.valueOf(Double.parseDouble(mAvailableBalance().mValue())).compareTo(BigDecimal.valueOf(100L)) < 0;
    }

    @InterfaceC1498b("available_balance")
    public abstract Amount mAvailableBalance();

    @InterfaceC1498b("current_balance")
    public abstract Amount mCurrentBalance();
}
