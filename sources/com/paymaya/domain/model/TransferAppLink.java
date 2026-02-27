package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.core.processing.util.GLUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TransferAppLink;
import com.paymaya.domain.model.C$AutoValue_TransferAppLink;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransferAppLink implements Parcelable {

    public static abstract class Builder {
        public abstract TransferAppLink build();

        public abstract Builder mAccountType(String str);

        public abstract Builder mAmount(String str);

        public abstract Builder mCurrency(String str);

        public abstract Builder mMessage(@Nullable String str);

        public abstract Builder mRecipient(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TransferAppLink.Builder().mAccountType("PAYMAYA").mAmount(GLUtils.VERSION_UNKNOWN).mCurrency("PHP").mRecipient("");
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TransferAppLink.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("t")
    public abstract String mAccountType();

    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    public abstract String mAmount();

    @InterfaceC1498b("c")
    public abstract String mCurrency();

    @Nullable
    @InterfaceC1498b("m")
    public abstract String mMessage();

    @InterfaceC1498b("r")
    public abstract String mRecipient();

    public abstract Builder toBuilder();
}
