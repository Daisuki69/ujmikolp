package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.Operator;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Operator, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Operator extends Operator {
    private final String mId;
    private final String mName;
    private final String mType;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Operator$Builder */
    public static class Builder extends Operator.Builder {
        private String mId;
        private String mName;
        private String mType;

        public /* synthetic */ Builder(Operator operator, int i) {
            this(operator);
        }

        @Override // com.paymaya.domain.model.Operator.Builder
        public Operator build() {
            String str = this.mName == null ? " mName" : "";
            if (str.isEmpty()) {
                return new AutoValue_Operator(this.mId, this.mName, this.mType);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.Operator.Builder
        public Operator.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Operator.Builder
        public Operator.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        @Override // com.paymaya.domain.model.Operator.Builder
        public Operator.Builder mType(String str) {
            this.mType = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Operator operator) {
            this.mId = operator.mId();
            this.mName = operator.mName();
            this.mType = operator.mType();
        }
    }

    public C$$AutoValue_Operator(@Nullable String str, String str2, @Nullable String str3) {
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        this.mType = str3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Operator) {
            Operator operator = (Operator) obj;
            String str2 = this.mId;
            if (str2 != null ? str2.equals(operator.mId()) : operator.mId() == null) {
                if (this.mName.equals(operator.mName()) && ((str = this.mType) != null ? str.equals(operator.mType()) : operator.mType() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003;
        String str2 = this.mType;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.Operator
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.Operator
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.Operator
    @Nullable
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    public String mType() {
        return this.mType;
    }

    @Override // com.paymaya.domain.model.Operator
    public Operator.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Operator{mId=");
        sb2.append(this.mId);
        sb2.append(", mName=");
        sb2.append(this.mName);
        sb2.append(", mType=");
        return s.p(sb2, this.mType, "}");
    }
}
