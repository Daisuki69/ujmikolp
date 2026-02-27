package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Consent;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Consent, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Consent extends Consent {
    private final boolean isEnabled;
    private final String mDescription;
    private final String mID;
    private final String mName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Consent$Builder */
    public static class Builder extends Consent.Builder {
        private Boolean isEnabled;
        private String mDescription;
        private String mID;
        private String mName;

        public /* synthetic */ Builder(Consent consent, int i) {
            this(consent);
        }

        @Override // com.paymaya.domain.model.Consent.Builder
        public Consent build() {
            String strI = this.mID == null ? " mID" : "";
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (this.mDescription == null) {
                strI = s.i(strI, " mDescription");
            }
            if (this.isEnabled == null) {
                strI = s.i(strI, " isEnabled");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Consent(this.mID, this.mName, this.mDescription, this.isEnabled.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Consent.Builder
        public Consent.Builder isEnabled(boolean z4) {
            this.isEnabled = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.Consent.Builder
        public Consent.Builder mDescription(String str) {
            if (str == null) {
                throw new NullPointerException("Null mDescription");
            }
            this.mDescription = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Consent.Builder
        public Consent.Builder mID(String str) {
            if (str == null) {
                throw new NullPointerException("Null mID");
            }
            this.mID = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Consent.Builder
        public Consent.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Consent consent) {
            this.mID = consent.mID();
            this.mName = consent.mName();
            this.mDescription = consent.mDescription();
            this.isEnabled = Boolean.valueOf(consent.isEnabled());
        }
    }

    public C$$AutoValue_Consent(String str, String str2, String str3, boolean z4) {
        if (str == null) {
            throw new NullPointerException("Null mID");
        }
        this.mID = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mDescription");
        }
        this.mDescription = str3;
        this.isEnabled = z4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Consent) {
            Consent consent = (Consent) obj;
            if (this.mID.equals(consent.mID()) && this.mName.equals(consent.mName()) && this.mDescription.equals(consent.mDescription()) && this.isEnabled == consent.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.mID.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mDescription.hashCode()) * 1000003) ^ (this.isEnabled ? 1231 : 1237);
    }

    @Override // com.paymaya.domain.model.Consent
    @InterfaceC1498b(Constants.ENABLED)
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.paymaya.domain.model.Consent
    @InterfaceC1498b("description")
    public String mDescription() {
        return this.mDescription;
    }

    @Override // com.paymaya.domain.model.Consent
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mID() {
        return this.mID;
    }

    @Override // com.paymaya.domain.model.Consent
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Consent
    public Consent.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Consent{mID=");
        sb2.append(this.mID);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mDescription=");
        sb2.append(this.mDescription);
        sb2.append(", isEnabled=");
        return s.s(sb2, this.isEnabled, "}");
    }
}
