package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ChangeMin;
import com.paymaya.domain.model.C$AutoValue_ChangeMin;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ChangeMin {

    public static abstract class Builder {
        public abstract ChangeMin build();

        public abstract Builder mId(String str);

        public abstract Builder mIdentity(Identity identity);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ChangeMin.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ChangeMin.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mId();

    @Nullable
    @InterfaceC1498b("new_identity")
    public abstract Identity mIdentity();
}
