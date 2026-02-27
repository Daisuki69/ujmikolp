package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.PayMayaError;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PayMayaError, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_PayMayaError extends PayMayaError {
    private final boolean isDefault;
    private final boolean isNetworkError;
    private final PayMayaErrorAction mAction;
    private final String mDetails;
    private final int mErrorCode;
    private final String mJsonObject;
    private final String mMessage;
    private final String mMeta;
    private final String mSpiel;
    private final int mStatusCode;
    private final String mThrowableMessage;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_PayMayaError$Builder */
    public static class Builder extends PayMayaError.Builder {
        private Boolean isDefault;
        private Boolean isNetworkError;
        private PayMayaErrorAction mAction;
        private String mDetails;
        private Integer mErrorCode;
        private String mJsonObject;
        private String mMessage;
        private String mMeta;
        private String mSpiel;
        private Integer mStatusCode;
        private String mThrowableMessage;

        public /* synthetic */ Builder(PayMayaError payMayaError, int i) {
            this(payMayaError);
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError build() {
            String strI = this.mErrorCode == null ? " mErrorCode" : "";
            if (this.mMessage == null) {
                strI = s.i(strI, " mMessage");
            }
            if (this.mSpiel == null) {
                strI = s.i(strI, " mSpiel");
            }
            if (this.mStatusCode == null) {
                strI = s.i(strI, " mStatusCode");
            }
            if (this.isNetworkError == null) {
                strI = s.i(strI, " isNetworkError");
            }
            if (this.isDefault == null) {
                strI = s.i(strI, " isDefault");
            }
            if (strI.isEmpty()) {
                return new AutoValue_PayMayaError(this.mErrorCode.intValue(), this.mMessage, this.mSpiel, this.mAction, this.mStatusCode.intValue(), this.isNetworkError.booleanValue(), this.isDefault.booleanValue(), this.mJsonObject, this.mThrowableMessage, this.mDetails, this.mMeta);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder isDefault(boolean z4) {
            this.isDefault = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder isNetworkError(boolean z4) {
            this.isNetworkError = Boolean.valueOf(z4);
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mAction(PayMayaErrorAction payMayaErrorAction) {
            this.mAction = payMayaErrorAction;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mDetails(String str) {
            this.mDetails = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mErrorCode(int i) {
            this.mErrorCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mJsonObject(String str) {
            this.mJsonObject = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mMessage(String str) {
            if (str == null) {
                throw new NullPointerException("Null mMessage");
            }
            this.mMessage = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mMeta(String str) {
            this.mMeta = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mSpiel(String str) {
            if (str == null) {
                throw new NullPointerException("Null mSpiel");
            }
            this.mSpiel = str;
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mStatusCode(int i) {
            this.mStatusCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.paymaya.domain.model.PayMayaError.Builder
        public PayMayaError.Builder mThrowableMessage(String str) {
            this.mThrowableMessage = str;
            return this;
        }

        public Builder() {
        }

        private Builder(PayMayaError payMayaError) {
            this.mErrorCode = Integer.valueOf(payMayaError.mErrorCode());
            this.mMessage = payMayaError.mMessage();
            this.mSpiel = payMayaError.mSpiel();
            this.mAction = payMayaError.mAction();
            this.mStatusCode = Integer.valueOf(payMayaError.mStatusCode());
            this.isNetworkError = Boolean.valueOf(payMayaError.isNetworkError());
            this.isDefault = Boolean.valueOf(payMayaError.isDefault());
            this.mJsonObject = payMayaError.mJsonObject();
            this.mThrowableMessage = payMayaError.mThrowableMessage();
            this.mDetails = payMayaError.mDetails();
            this.mMeta = payMayaError.mMeta();
        }
    }

    public C$$AutoValue_PayMayaError(int i, String str, String str2, @Nullable PayMayaErrorAction payMayaErrorAction, int i4, boolean z4, boolean z5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.mErrorCode = i;
        if (str == null) {
            throw new NullPointerException("Null mMessage");
        }
        this.mMessage = str;
        if (str2 == null) {
            throw new NullPointerException("Null mSpiel");
        }
        this.mSpiel = str2;
        this.mAction = payMayaErrorAction;
        this.mStatusCode = i4;
        this.isNetworkError = z4;
        this.isDefault = z5;
        this.mJsonObject = str3;
        this.mThrowableMessage = str4;
        this.mDetails = str5;
        this.mMeta = str6;
    }

    public boolean equals(Object obj) {
        PayMayaErrorAction payMayaErrorAction;
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PayMayaError) {
            PayMayaError payMayaError = (PayMayaError) obj;
            if (this.mErrorCode == payMayaError.mErrorCode() && this.mMessage.equals(payMayaError.mMessage()) && this.mSpiel.equals(payMayaError.mSpiel()) && ((payMayaErrorAction = this.mAction) != null ? payMayaErrorAction.equals(payMayaError.mAction()) : payMayaError.mAction() == null) && this.mStatusCode == payMayaError.mStatusCode() && this.isNetworkError == payMayaError.isNetworkError() && this.isDefault == payMayaError.isDefault() && ((str = this.mJsonObject) != null ? str.equals(payMayaError.mJsonObject()) : payMayaError.mJsonObject() == null) && ((str2 = this.mThrowableMessage) != null ? str2.equals(payMayaError.mThrowableMessage()) : payMayaError.mThrowableMessage() == null) && ((str3 = this.mDetails) != null ? str3.equals(payMayaError.mDetails()) : payMayaError.mDetails() == null) && ((str4 = this.mMeta) != null ? str4.equals(payMayaError.mMeta()) : payMayaError.mMeta() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.mErrorCode ^ 1000003) * 1000003) ^ this.mMessage.hashCode()) * 1000003) ^ this.mSpiel.hashCode()) * 1000003;
        PayMayaErrorAction payMayaErrorAction = this.mAction;
        int iHashCode2 = (((((((iHashCode ^ (payMayaErrorAction == null ? 0 : payMayaErrorAction.hashCode())) * 1000003) ^ this.mStatusCode) * 1000003) ^ (this.isNetworkError ? 1231 : 1237)) * 1000003) ^ (this.isDefault ? 1231 : 1237)) * 1000003;
        String str = this.mJsonObject;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.mThrowableMessage;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mDetails;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mMeta;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.PayMayaError
    public boolean isDefault() {
        return this.isDefault;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    public boolean isNetworkError() {
        return this.isNetworkError;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @Nullable
    @InterfaceC1498b("action")
    public PayMayaErrorAction mAction() {
        return this.mAction;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @Nullable
    @InterfaceC1498b("details")
    public String mDetails() {
        return this.mDetails;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @InterfaceC1498b("code")
    public int mErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @Nullable
    public String mJsonObject() {
        return this.mJsonObject;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @InterfaceC1498b("msg")
    public String mMessage() {
        return this.mMessage;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @Nullable
    public String mMeta() {
        return this.mMeta;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @InterfaceC1498b("spiel")
    public String mSpiel() {
        return this.mSpiel;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    public int mStatusCode() {
        return this.mStatusCode;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    @Nullable
    public String mThrowableMessage() {
        return this.mThrowableMessage;
    }

    @Override // com.paymaya.domain.model.PayMayaError
    public PayMayaError.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PayMayaError{mErrorCode=");
        sb2.append(this.mErrorCode);
        sb2.append(", mMessage=");
        sb2.append(this.mMessage);
        sb2.append(", mSpiel=");
        sb2.append(this.mSpiel);
        sb2.append(", mAction=");
        sb2.append(this.mAction);
        sb2.append(", mStatusCode=");
        sb2.append(this.mStatusCode);
        sb2.append(", isNetworkError=");
        sb2.append(this.isNetworkError);
        sb2.append(", isDefault=");
        sb2.append(this.isDefault);
        sb2.append(", mJsonObject=");
        sb2.append(this.mJsonObject);
        sb2.append(", mThrowableMessage=");
        sb2.append(this.mThrowableMessage);
        sb2.append(", mDetails=");
        sb2.append(this.mDetails);
        sb2.append(", mMeta=");
        return s.p(sb2, this.mMeta, "}");
    }
}
