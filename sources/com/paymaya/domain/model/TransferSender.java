package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TransferSender;
import com.paymaya.domain.model.C$AutoValue_TransferSender;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransferSender implements Parcelable {

    public static abstract class Builder {
        public abstract TransferSender build();

        public abstract Builder mType(String str);

        public abstract Builder mValue(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TransferSender.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TransferSender.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();

    @InterfaceC1498b("value")
    public abstract String mValue();
}
