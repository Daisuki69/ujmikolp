package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Details;
import com.paymaya.domain.model.C$AutoValue_Details;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Details implements Parcelable {

    public static abstract class Builder {
        public abstract Details build();

        public abstract Builder mNetwork(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Details.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Details.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("network")
    public abstract String mNetwork();

    public abstract Builder toBuilder();
}
