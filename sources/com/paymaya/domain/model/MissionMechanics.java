package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionMechanics;
import com.paymaya.domain.model.C$AutoValue_MissionMechanics;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionMechanics implements Parcelable {

    public static abstract class Builder {
        public abstract MissionMechanics build();

        public abstract Builder mButtonLink(@Nullable String str);

        public abstract Builder mButtonTitle(@Nullable String str);

        public abstract Builder mDescription(@Nullable String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionMechanics.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionMechanics.GsonTypeAdapter(jVar);
    }

    @Nullable
    @InterfaceC1498b("button_link")
    public abstract String mButtonLink();

    @Nullable
    @InterfaceC1498b("button_title")
    public abstract String mButtonTitle();

    @Nullable
    @InterfaceC1498b("description")
    public abstract String mDescription();
}
