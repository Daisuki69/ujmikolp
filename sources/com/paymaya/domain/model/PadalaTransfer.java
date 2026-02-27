package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PadalaTransfer;
import com.paymaya.domain.model.C$AutoValue_PadalaTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PadalaTransfer implements Parcelable {

    public static abstract class Builder {
        public abstract PadalaTransfer build();

        public abstract Builder mAmount(@Nullable Amount amount);

        public abstract Builder mBalance(@Nullable AccountBalance accountBalance);

        public abstract Builder mCommission(@Nullable Amount amount);

        public abstract Builder mFees(Amount amount);

        public abstract Builder mRequestReferenceNo(@Nullable String str);

        public abstract Builder mRevenue(@Nullable Amount amount);

        public abstract Builder mSource(@Nullable TransferSender transferSender);

        public abstract Builder mTarget(@Nullable TransferTarget transferTarget);

        public abstract Builder mTransferToken(TransferToken transferToken);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PadalaTransfer.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PadalaTransfer.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("balance")
    public abstract AccountBalance mBalance();

    @Nullable
    @InterfaceC1498b("commission")
    public abstract Amount mCommission();

    @InterfaceC1498b("fees")
    public abstract Amount mFees();

    @Nullable
    @InterfaceC1498b("request_reference_no")
    public abstract String mRequestReferenceNo();

    @Nullable
    @InterfaceC1498b("revenue")
    public abstract Amount mRevenue();

    @Nullable
    @InterfaceC1498b("source")
    public abstract TransferSender mSource();

    @Nullable
    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public abstract TransferTarget mTarget();

    @InterfaceC1498b("transfer_token")
    public abstract TransferToken mTransferToken();

    public abstract Builder toBuilder();
}
