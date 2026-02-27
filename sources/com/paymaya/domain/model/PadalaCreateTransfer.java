package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_PadalaCreateTransfer;
import com.paymaya.domain.model.C$AutoValue_PadalaCreateTransfer;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PadalaCreateTransfer implements Parcelable {

    public static abstract class Builder {
        public abstract PadalaCreateTransfer build();

        public abstract Builder mAmount(Amount amount);

        public abstract Builder mBeneficiary(@Nullable TransferEntity transferEntity);

        public abstract Builder mSender(@Nullable TransferEntity transferEntity);

        public abstract Builder mTarget(TransferTarget transferTarget);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_PadalaCreateTransfer.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_PadalaCreateTransfer.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("amount")
    public abstract Amount mAmount();

    @Nullable
    @InterfaceC1498b("beneficiary")
    public abstract TransferEntity mBeneficiary();

    @Nullable
    @InterfaceC1498b("sender")
    public abstract TransferEntity mSender();

    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public abstract TransferTarget mTarget();

    public abstract Builder toBuilder();
}
