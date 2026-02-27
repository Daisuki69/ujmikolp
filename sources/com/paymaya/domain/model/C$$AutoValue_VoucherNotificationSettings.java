package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.domain.model.VoucherNotificationSettings;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherNotificationSettings, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_VoucherNotificationSettings extends VoucherNotificationSettings {
    private final String mNotificationSpiel;
    private final List<String> mNotifyDatesBeforeExpiry;
    private final List<String> mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_VoucherNotificationSettings$Builder */
    public static class Builder extends VoucherNotificationSettings.Builder {
        private String mNotificationSpiel;
        private List<String> mNotifyDatesBeforeExpiry;
        private List<String> mType;

        public /* synthetic */ Builder(VoucherNotificationSettings voucherNotificationSettings, int i) {
            this(voucherNotificationSettings);
        }

        @Override // com.paymaya.domain.model.VoucherNotificationSettings.Builder
        public VoucherNotificationSettings build() {
            return new AutoValue_VoucherNotificationSettings(this.mType, this.mNotifyDatesBeforeExpiry, this.mNotificationSpiel);
        }

        @Override // com.paymaya.domain.model.VoucherNotificationSettings.Builder
        public VoucherNotificationSettings.Builder mNotificationSpiel(@Nullable String str) {
            this.mNotificationSpiel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherNotificationSettings.Builder
        public VoucherNotificationSettings.Builder mNotifyDatesBeforeExpiry(@Nullable List<String> list) {
            this.mNotifyDatesBeforeExpiry = list;
            return this;
        }

        @Override // com.paymaya.domain.model.VoucherNotificationSettings.Builder
        public VoucherNotificationSettings.Builder mType(@Nullable List<String> list) {
            this.mType = list;
            return this;
        }

        public Builder() {
        }

        private Builder(VoucherNotificationSettings voucherNotificationSettings) {
            this.mType = voucherNotificationSettings.mType();
            this.mNotifyDatesBeforeExpiry = voucherNotificationSettings.mNotifyDatesBeforeExpiry();
            this.mNotificationSpiel = voucherNotificationSettings.mNotificationSpiel();
        }
    }

    public C$$AutoValue_VoucherNotificationSettings(@Nullable List<String> list, @Nullable List<String> list2, @Nullable String str) {
        this.mType = list;
        this.mNotifyDatesBeforeExpiry = list2;
        this.mNotificationSpiel = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoucherNotificationSettings) {
            VoucherNotificationSettings voucherNotificationSettings = (VoucherNotificationSettings) obj;
            List<String> list = this.mType;
            if (list != null ? list.equals(voucherNotificationSettings.mType()) : voucherNotificationSettings.mType() == null) {
                List<String> list2 = this.mNotifyDatesBeforeExpiry;
                if (list2 != null ? list2.equals(voucherNotificationSettings.mNotifyDatesBeforeExpiry()) : voucherNotificationSettings.mNotifyDatesBeforeExpiry() == null) {
                    String str = this.mNotificationSpiel;
                    if (str != null ? str.equals(voucherNotificationSettings.mNotificationSpiel()) : voucherNotificationSettings.mNotificationSpiel() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.mType;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<String> list2 = this.mNotifyDatesBeforeExpiry;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str = this.mNotificationSpiel;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.VoucherNotificationSettings
    @Nullable
    @InterfaceC1498b("spiel")
    public String mNotificationSpiel() {
        return this.mNotificationSpiel;
    }

    @Override // com.paymaya.domain.model.VoucherNotificationSettings
    @Nullable
    @InterfaceC1498b(alternate = {"notifyDatesBeforeExpiry"}, value = "notify_dates_before_expiry")
    public List<String> mNotifyDatesBeforeExpiry() {
        return this.mNotifyDatesBeforeExpiry;
    }

    @Override // com.paymaya.domain.model.VoucherNotificationSettings
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public List<String> mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.VoucherNotificationSettings
    public VoucherNotificationSettings.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VoucherNotificationSettings{mType=");
        sb2.append(this.mType);
        sb2.append(", mNotifyDatesBeforeExpiry=");
        sb2.append(this.mNotifyDatesBeforeExpiry);
        sb2.append(", mNotificationSpiel=");
        return s.p(sb2, this.mNotificationSpiel, "}");
    }
}
