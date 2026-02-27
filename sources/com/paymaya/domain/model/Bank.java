package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Bank;
import com.paymaya.domain.model.C$AutoValue_Bank;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Bank implements Parcelable {

    public static abstract class Builder {
        public abstract Bank build();

        public abstract Builder mBankCode(String str);

        public abstract Builder mBankIC(String str);

        public abstract Builder mBankName(String str);

        public abstract Builder mFee(String str);

        public abstract Builder mIsActive(Boolean bool);

        public abstract Builder mIsMaintenance(Boolean bool);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Bank.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Bank.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("bank_code")
    public abstract String mBankCode();

    @Nullable
    @InterfaceC1498b("bank_ic")
    public abstract String mBankIC();

    @Nullable
    @InterfaceC1498b("bank_name")
    public abstract String mBankName();

    @Nullable
    @InterfaceC1498b("fee")
    public abstract String mFee();

    @Nullable
    @InterfaceC1498b("is_active")
    public abstract Boolean mIsActive();

    @Nullable
    @InterfaceC1498b("is_maintenance")
    public abstract Boolean mIsMaintenance();
}
