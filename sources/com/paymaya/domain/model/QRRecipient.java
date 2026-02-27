package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_QRRecipient;
import com.paymaya.domain.model.C$AutoValue_QRRecipient;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QRRecipient implements Parcelable {

    public static abstract class Builder {
        public abstract QRRecipient build();

        public abstract Builder mAmount(@Nullable String str);

        public abstract Builder mMessage(@Nullable String str);

        public abstract Builder mType(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_QRRecipient.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_QRRecipient.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    public abstract String mAmount();

    @Nullable
    @InterfaceC1498b("m")
    public abstract String mMessage();

    @InterfaceC1498b("t")
    public abstract String mType();

    @InterfaceC1498b("v")
    public abstract String mValue();
}
