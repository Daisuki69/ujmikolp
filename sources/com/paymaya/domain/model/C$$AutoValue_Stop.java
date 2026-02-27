package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Stop;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Stop, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Stop extends Stop {
    private final String mId;
    private final String mName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Stop$Builder */
    public static class Builder extends Stop.Builder {
        private String mId;
        private String mName;

        public /* synthetic */ Builder(Stop stop, int i) {
            this(stop);
        }

        @Override // com.paymaya.domain.model.Stop.Builder
        public Stop build() {
            String strI = this.mId == null ? " mId" : "";
            if (this.mName == null) {
                strI = s.i(strI, " mName");
            }
            if (strI.isEmpty()) {
                return new AutoValue_Stop(this.mId, this.mName);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.Stop.Builder
        public Stop.Builder mId(String str) {
            if (str == null) {
                throw new NullPointerException("Null mId");
            }
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Stop.Builder
        public Stop.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Stop stop) {
            this.mId = stop.mId();
            this.mName = stop.mName();
        }
    }

    public C$$AutoValue_Stop(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mId");
        }
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Stop) {
            Stop stop = (Stop) obj;
            if (this.mId.equals(stop.mId()) && this.mName.equals(stop.mName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode();
    }

    @Override // com.paymaya.domain.model.Stop
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Stop
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Stop
    public Stop.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Stop{mId=");
        sb2.append(this.mId);
        sb2.append(", mName=");
        return s.p(sb2, this.mName, "}");
    }
}
