package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_WesternUnionTransaction;
import com.paymaya.domain.model.C$AutoValue_WesternUnionTransaction;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WesternUnionTransaction implements Parcelable {

    public static abstract class Builder {
        public abstract WesternUnionTransaction build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mBalance(Amount amount);

        public abstract Builder mMtcn(String str);

        public abstract Builder mReferenceId(String str);

        public abstract Builder mRrn(String str);

        public abstract Builder mSender(String str);

        public abstract Builder mTrn(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_WesternUnionTransaction.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_WesternUnionTransaction.GsonTypeAdapter(jVar);
    }

    public String getAmountFormattedValue() {
        return mAmount().getFormattedValue();
    }

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("balance")
    public abstract Amount mBalance();

    @InterfaceC1498b("mtcn")
    public abstract String mMtcn();

    @Nullable
    @InterfaceC1498b("reference_id")
    public abstract String mReferenceId();

    @InterfaceC1498b("rrn")
    public abstract String mRrn();

    @InterfaceC1498b("sender")
    public abstract String mSender();

    @InterfaceC1498b("trn")
    public abstract String mTrn();
}
