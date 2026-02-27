package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.MaintenanceDate;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MaintenanceDate, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_MaintenanceDate extends MaintenanceDate {
    private final String mEnd;
    private final String mMessage;
    private final String mStart;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_MaintenanceDate$Builder */
    public static class Builder extends MaintenanceDate.Builder {
        private String mEnd;
        private String mMessage;
        private String mStart;

        public /* synthetic */ Builder(MaintenanceDate maintenanceDate, int i) {
            this(maintenanceDate);
        }

        @Override // com.paymaya.domain.model.MaintenanceDate.Builder
        public MaintenanceDate build() {
            String strI = this.mStart == null ? " mStart" : "";
            if (this.mEnd == null) {
                strI = s.i(strI, " mEnd");
            }
            if (this.mMessage == null) {
                strI = s.i(strI, " mMessage");
            }
            if (strI.isEmpty()) {
                return new AutoValue_MaintenanceDate(this.mStart, this.mEnd, this.mMessage);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.MaintenanceDate.Builder
        public MaintenanceDate.Builder mEnd(String str) {
            if (str == null) {
                throw new NullPointerException("Null mEnd");
            }
            this.mEnd = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MaintenanceDate.Builder
        public MaintenanceDate.Builder mMessage(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMessage");
            }
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.MaintenanceDate.Builder
        public MaintenanceDate.Builder mStart(String str) {
            if (str == null) {
                throw new NullPointerException("Null mStart");
            }
            this.mStart = str;
            return this;
        }

        public Builder() {
        }

        private Builder(MaintenanceDate maintenanceDate) {
            this.mStart = maintenanceDate.mStart();
            this.mEnd = maintenanceDate.mEnd();
            this.mMessage = maintenanceDate.mMessage();
        }
    }

    public C$$AutoValue_MaintenanceDate(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null mStart");
        }
        this.mStart = str;
        if (str2 == null) {
            throw new NullPointerException("Null mEnd");
        }
        this.mEnd = str2;
        if (str3 == null) {
            throw new NullPointerException("Null mMessage");
        }
        this.mMessage = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MaintenanceDate) {
            MaintenanceDate maintenanceDate = (MaintenanceDate) obj;
            if (this.mStart.equals(maintenanceDate.mStart()) && this.mEnd.equals(maintenanceDate.mEnd()) && this.mMessage.equals(maintenanceDate.mMessage())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.mStart.hashCode() ^ 1000003) * 1000003) ^ this.mEnd.hashCode()) * 1000003) ^ this.mMessage.hashCode();
    }

    @Override // com.paymaya.domain.model.MaintenanceDate
    @InterfaceC1498b(TtmlNode.END)
    public String mEnd() {
        return this.mEnd;
    }

    @Override // com.paymaya.domain.model.MaintenanceDate
    @InterfaceC1498b("message")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.MaintenanceDate
    @InterfaceC1498b(TtmlNode.START)
    public String mStart() {
        return this.mStart;
    }

    @Override // com.paymaya.domain.model.MaintenanceDate
    public MaintenanceDate.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaintenanceDate{mStart=");
        sb2.append(this.mStart);
        sb2.append(", mEnd=");
        sb2.append(this.mEnd);
        sb2.append(", mMessage=");
        return s.p(sb2, this.mMessage, "}");
    }
}
