package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_SettingsDisplayName;
import com.paymaya.domain.model.C$AutoValue_SettingsDisplayName;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SettingsDisplayName implements Parcelable {

    public static abstract class Builder {
        public abstract SettingsDisplayName build();

        public abstract Builder mDisplayName(DisplayName displayName);

        public abstract Builder mIsEnabled(boolean z4);

        public abstract Builder mUpdatedDate(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_SettingsDisplayName.Builder().mIsEnabled(false);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_SettingsDisplayName.GsonTypeAdapter(jVar);
    }

    public String getDisplayFullName() {
        return mDisplayName().getFullName();
    }

    @InterfaceC1498b("display_name")
    public abstract DisplayName mDisplayName();

    @InterfaceC1498b(Constants.ENABLED)
    public abstract boolean mIsEnabled();

    @InterfaceC1498b("updated_date")
    public abstract String mUpdatedDate();

    public abstract Builder toBuilder();
}
