package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MoneyInCode;
import com.paymaya.domain.model.C$AutoValue_MoneyInCode;
import g3.InterfaceC1498b;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MoneyInCode implements Parcelable {

    public static abstract class Builder {
        public abstract MoneyInCode build();

        public abstract Builder mAmount(BigDecimal bigDecimal);

        public abstract Builder mCode(String str);

        public abstract Builder mExpiryDate(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MoneyInCode.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MoneyInCode.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("amount")
    public abstract BigDecimal mAmount();

    @InterfaceC1498b("code")
    public abstract String mCode();

    @InterfaceC1498b("expiry_date")
    public abstract String mExpiryDate();

    public abstract Builder toBuilder();
}
