package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.domain.model.TicketPurchaseIssuer;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseIssuer, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_TicketPurchaseIssuer extends TicketPurchaseIssuer {
    private final String mId;
    private final ImageUrlUnfiltered mImageUrl;
    private final String mName;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_TicketPurchaseIssuer$Builder */
    public static class Builder extends TicketPurchaseIssuer.Builder {
        private String mId;
        private ImageUrlUnfiltered mImageUrl;
        private String mName;

        public /* synthetic */ Builder(TicketPurchaseIssuer ticketPurchaseIssuer, int i) {
            this(ticketPurchaseIssuer);
        }

        @Override // com.paymaya.domain.model.TicketPurchaseIssuer.Builder
        public TicketPurchaseIssuer build() {
            String str = this.mName == null ? " mName" : "";
            if (str.isEmpty()) {
                return new AutoValue_TicketPurchaseIssuer(this.mId, this.mName, this.mImageUrl);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.paymaya.domain.model.TicketPurchaseIssuer.Builder
        public TicketPurchaseIssuer.Builder mId(String str) {
            this.mId = str;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseIssuer.Builder
        public TicketPurchaseIssuer.Builder mImageUrl(ImageUrlUnfiltered imageUrlUnfiltered) {
            this.mImageUrl = imageUrlUnfiltered;
            return this;
        }

        @Override // com.paymaya.domain.model.TicketPurchaseIssuer.Builder
        public TicketPurchaseIssuer.Builder mName(String str) {
            if (str == null) {
                throw new NullPointerException("Null mName");
            }
            this.mName = str;
            return this;
        }

        public Builder() {
        }

        private Builder(TicketPurchaseIssuer ticketPurchaseIssuer) {
            this.mId = ticketPurchaseIssuer.mId();
            this.mName = ticketPurchaseIssuer.mName();
            this.mImageUrl = ticketPurchaseIssuer.mImageUrl();
        }
    }

    public C$$AutoValue_TicketPurchaseIssuer(@Nullable String str, String str2, @Nullable ImageUrlUnfiltered imageUrlUnfiltered) {
        this.mId = str;
        if (str2 == null) {
            throw new NullPointerException("Null mName");
        }
        this.mName = str2;
        this.mImageUrl = imageUrlUnfiltered;
    }

    public boolean equals(Object obj) {
        ImageUrlUnfiltered imageUrlUnfiltered;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TicketPurchaseIssuer) {
            TicketPurchaseIssuer ticketPurchaseIssuer = (TicketPurchaseIssuer) obj;
            String str = this.mId;
            if (str != null ? str.equals(ticketPurchaseIssuer.mId()) : ticketPurchaseIssuer.mId() == null) {
                if (this.mName.equals(ticketPurchaseIssuer.mName()) && ((imageUrlUnfiltered = this.mImageUrl) != null ? imageUrlUnfiltered.equals(ticketPurchaseIssuer.mImageUrl()) : ticketPurchaseIssuer.mImageUrl() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.mId;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.mName.hashCode()) * 1000003;
        ImageUrlUnfiltered imageUrlUnfiltered = this.mImageUrl;
        return iHashCode ^ (imageUrlUnfiltered != null ? imageUrlUnfiltered.hashCode() : 0);
    }

    @Override // com.paymaya.domain.model.TicketPurchaseIssuer
    @Nullable
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    public String mId() {
        return this.mId;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseIssuer
    @Nullable
    @InterfaceC1498b("confirmation_url")
    public ImageUrlUnfiltered mImageUrl() {
        return this.mImageUrl;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseIssuer
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    public String mName() {
        return this.mName;
    }

    @Override // com.paymaya.domain.model.TicketPurchaseIssuer
    public TicketPurchaseIssuer.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "TicketPurchaseIssuer{mId=" + this.mId + ", mName=" + this.mName + ", mImageUrl=" + this.mImageUrl + "}";
    }
}
