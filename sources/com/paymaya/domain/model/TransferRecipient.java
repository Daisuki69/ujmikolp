package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.C$$AutoValue_TransferRecipient;
import com.paymaya.domain.model.C$AutoValue_TransferRecipient;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransferRecipient implements Parcelable {

    public static abstract class Builder {
        public abstract TransferRecipient build();

        public abstract Builder mRecipientName(String str);

        public abstract Builder mType(String str);

        public abstract Builder mUnformattedValue(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TransferRecipient.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TransferRecipient.GsonTypeAdapter(jVar);
    }

    public String getRecipientNameAndMobileNumber() {
        if (mRecipientName() == null) {
            return "";
        }
        return mRecipientName() + Global.NEWLINE + mValue();
    }

    public boolean isAccountTypePadala() {
        return mType().equalsIgnoreCase("PADALA");
    }

    public boolean isAccountTypeSmartMoney() {
        return mType().equalsIgnoreCase("SMARTMONEY");
    }

    public boolean isAccountValueSmartMoney() {
        return C.a0(mValue());
    }

    @Nullable
    public abstract String mRecipientName();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @Nullable
    public abstract String mUnformattedValue();

    @InterfaceC1498b("value")
    public abstract String mValue();

    public abstract Builder toBuilder();
}
