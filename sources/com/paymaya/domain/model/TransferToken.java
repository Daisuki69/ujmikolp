package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_TransferToken;
import com.paymaya.domain.model.C$AutoValue_TransferToken;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TransferToken implements Parcelable {

    public static abstract class Builder {
        public abstract TransferToken build();

        public abstract Builder mId(String str);

        public abstract Builder mStatus(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_TransferToken.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_TransferToken.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("status")
    public abstract String mStatus();
}
