package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_BankTransferBank;
import com.paymaya.domain.model.C$AutoValue_BankTransferBank;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BankTransferBank implements Parcelable {

    public static abstract class Builder {
        public abstract BankTransferBank build();

        public abstract Builder mBankAccount(BankAccount bankAccount);

        public abstract Builder mBankCode(String str);

        public abstract Builder mBankName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_BankTransferBank.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_BankTransferBank.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("account")
    public abstract BankAccount mBankAccount();

    @InterfaceC1498b("code")
    public abstract String mBankCode();

    @Nullable
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mBankName();

    public abstract Builder toBuilder();
}
