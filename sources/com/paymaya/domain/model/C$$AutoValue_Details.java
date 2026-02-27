package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.paymaya.domain.model.Details;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Details, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_Details extends Details {
    private final String mNetwork;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_Details$Builder */
    public static class Builder extends Details.Builder {
        private String mNetwork;

        public /* synthetic */ Builder(Details details, int i) {
            this(details);
        }

        @Override // com.paymaya.domain.model.Details.Builder
        public Details build() {
            return new AutoValue_Details(this.mNetwork);
        }

        @Override // com.paymaya.domain.model.Details.Builder
        public Details.Builder mNetwork(String str) {
            this.mNetwork = str;
            return this;
        }

        public Builder() {
        }

        private Builder(Details details) {
            this.mNetwork = details.mNetwork();
        }
    }

    public C$$AutoValue_Details(@Nullable String str) {
        this.mNetwork = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Details)) {
            return false;
        }
        String str = this.mNetwork;
        String strMNetwork = ((Details) obj).mNetwork();
        return str == null ? strMNetwork == null : str.equals(strMNetwork);
    }

    public int hashCode() {
        String str = this.mNetwork;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    @Override // com.paymaya.domain.model.Details
    @Nullable
    @InterfaceC1498b("network")
    public String mNetwork() {
        return this.mNetwork;
    }

    @Override // com.paymaya.domain.model.Details
    public Details.Builder toBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return s.p(new StringBuilder("Details{mNetwork="), this.mNetwork, "}");
    }
}
