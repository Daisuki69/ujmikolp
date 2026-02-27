package com.paymaya.domain.model;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_BlockReason;
import com.paymaya.domain.model.C$AutoValue_BlockReason;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BlockReason {

    public static abstract class Builder {
        public abstract BlockReason build();

        public abstract Builder mDescription(String str);

        public abstract Builder mReasonCode(String str);

        public abstract Builder mReasonID(String str);

        public abstract Builder mType(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_BlockReason.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_BlockReason.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b("reason_code")
    public abstract String mReasonCode();

    @InterfaceC1498b("reason_id")
    public abstract String mReasonID();

    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public abstract String mType();
}
