package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_DisplayName;
import com.paymaya.domain.model.C$AutoValue_DisplayName;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DisplayName implements Parcelable {

    public static abstract class Builder {
        public abstract DisplayName build();

        public abstract Builder mFirstName(String str);

        public abstract Builder mLastName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_DisplayName.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_DisplayName.GsonTypeAdapter(jVar);
    }

    public String getFullName() {
        return c.l(mFirstName(), Global.BLANK, mLastName(), ".");
    }

    @InterfaceC1498b("first_name")
    public abstract String mFirstName();

    @InterfaceC1498b("last_name")
    public abstract String mLastName();

    public abstract Builder toBuilder();
}
