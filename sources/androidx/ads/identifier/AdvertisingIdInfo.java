package androidx.ads.identifier;

import androidx.ads.identifier.AutoValue_AdvertisingIdInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdvertisingIdInfo {

    public static abstract class Builder {
        public abstract AdvertisingIdInfo build();

        public abstract Builder setId(String str);

        public abstract Builder setLimitAdTrackingEnabled(boolean z4);

        public abstract Builder setProviderPackageName(String str);
    }

    public static Builder builder() {
        return new AutoValue_AdvertisingIdInfo.Builder();
    }

    @NonNull
    public abstract String getId();

    @NonNull
    public abstract String getProviderPackageName();

    public abstract boolean isLimitAdTrackingEnabled();
}
