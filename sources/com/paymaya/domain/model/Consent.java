package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_Consent;
import com.paymaya.domain.model.C$AutoValue_Consent;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Consent implements Parcelable {
    public static final String ID_ADVERTISING = "advertising";
    public static final String ID_PROFILE_SHARING = "profile_sharing";
    public static final String ID_PROFILING = "profiling";

    public static abstract class Builder {
        public abstract Consent build();

        public abstract Builder isEnabled(boolean z4);

        public abstract Builder mDescription(String str);

        public abstract Builder mID(String str);

        public abstract Builder mName(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_Consent.Builder().isEnabled(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_Consent.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b(Constants.ENABLED)
    public abstract boolean isEnabled();

    @InterfaceC1498b("description")
    public abstract String mDescription();

    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public abstract String mID();

    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public abstract String mName();

    public abstract Builder toBuilder();
}
