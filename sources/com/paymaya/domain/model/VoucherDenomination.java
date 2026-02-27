package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_VoucherDenomination;
import com.paymaya.domain.model.C$AutoValue_VoucherDenomination;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VoucherDenomination implements Parcelable {

    public static abstract class Builder {
        public abstract VoucherDenomination build();

        public abstract Builder mStringValue(@Nullable String str);

        public abstract Builder mType(String str);

        public abstract Builder mValue(double d10);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_VoucherDenomination.Builder().mValue(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_VoucherDenomination.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b(alternate = {"stringValue"}, value = "string_value")
    public abstract String mStringValue();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @InterfaceC1498b("value")
    public abstract double mValue();
}
