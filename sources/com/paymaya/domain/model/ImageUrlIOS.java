package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ImageUrlIOS;
import com.paymaya.domain.model.C$AutoValue_ImageUrlIOS;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ImageUrlIOS implements Parcelable {

    public static abstract class Builder {
        public abstract ImageUrlIOS build();

        public abstract Builder m3x(String str);

        public abstract Builder mRetina(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ImageUrlIOS.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ImageUrlIOS.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("3x")
    public abstract String m3x();

    @Nullable
    @InterfaceC1498b("retina")
    public abstract String mRetina();

    public abstract Builder toBuilder();
}
