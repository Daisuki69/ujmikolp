package com.paymaya.domain.model;

import We.s;
import com.paymaya.domain.model.CardProfile;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_CardProfile, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
abstract class C$$AutoValue_CardProfile extends CardProfile {
    private final String mBrand;
    private final String mScheme;

    /* JADX INFO: renamed from: com.paymaya.domain.model.$$AutoValue_CardProfile$Builder */
    public static class Builder extends CardProfile.Builder {
        private String mBrand;
        private String mScheme;

        @Override // com.paymaya.domain.model.CardProfile.Builder
        public CardProfile build() {
            String strI = this.mScheme == null ? " mScheme" : "";
            if (this.mBrand == null) {
                strI = s.i(strI, " mBrand");
            }
            if (strI.isEmpty()) {
                return new AutoValue_CardProfile(this.mScheme, this.mBrand);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // com.paymaya.domain.model.CardProfile.Builder
        public CardProfile.Builder mBrand(String str) {
            if (str == null) {
                throw new NullPointerException("Null mBrand");
            }
            this.mBrand = str;
            return this;
        }

        @Override // com.paymaya.domain.model.CardProfile.Builder
        public CardProfile.Builder mScheme(String str) {
            if (str == null) {
                throw new NullPointerException("Null mScheme");
            }
            this.mScheme = str;
            return this;
        }
    }

    public C$$AutoValue_CardProfile(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null mScheme");
        }
        this.mScheme = str;
        if (str2 == null) {
            throw new NullPointerException("Null mBrand");
        }
        this.mBrand = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CardProfile) {
            CardProfile cardProfile = (CardProfile) obj;
            if (this.mScheme.equals(cardProfile.mScheme()) && this.mBrand.equals(cardProfile.mBrand())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.mScheme.hashCode() ^ 1000003) * 1000003) ^ this.mBrand.hashCode();
    }

    @Override // com.paymaya.domain.model.CardProfile
    @InterfaceC1498b("brand")
    public String mBrand() {
        return this.mBrand;
    }

    @Override // com.paymaya.domain.model.CardProfile
    @InterfaceC1498b("scheme")
    public String mScheme() {
        return this.mScheme;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardProfile{mScheme=");
        sb2.append(this.mScheme);
        sb2.append(", mBrand=");
        return s.p(sb2, this.mBrand, "}");
    }
}
