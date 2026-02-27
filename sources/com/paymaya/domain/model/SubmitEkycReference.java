package com.paymaya.domain.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_SubmitEkycReference;
import com.paymaya.domain.model.C$AutoValue_SubmitEkycReference;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SubmitEkycReference {

    public static abstract class Builder {
        public abstract SubmitEkycReference build();

        public abstract Builder mId(String str);

        public abstract Builder mReferenceId(String str);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_SubmitEkycReference.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_SubmitEkycReference.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @InterfaceC1498b("reference_id")
    public abstract String mReferenceId();
}
