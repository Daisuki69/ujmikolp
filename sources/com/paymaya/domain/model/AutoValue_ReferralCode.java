package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ReferralCode;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ReferralCode extends C$AutoValue_ReferralCode {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ReferralCode)";
        }

        @Override // com.google.gson.y
        public ReferralCode read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ReferralCode.Builder builderSBuilder = ReferralCode.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("referral_code")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mReferralCode((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, ReferralCode referralCode) throws IOException {
            if (referralCode == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("referral_code");
            if (referralCode.mReferralCode() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, referralCode.mReferralCode());
            }
            bVar.k();
        }
    }

    public AutoValue_ReferralCode(final String str) {
        new ReferralCode(str) { // from class: com.paymaya.domain.model.$AutoValue_ReferralCode
            private final String mReferralCode;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ReferralCode$Builder */
            public static class Builder extends ReferralCode.Builder {
                private String mReferralCode;

                @Override // com.paymaya.domain.model.ReferralCode.Builder
                public ReferralCode build() {
                    String str = this.mReferralCode == null ? " mReferralCode" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_ReferralCode(this.mReferralCode);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.ReferralCode.Builder
                public ReferralCode.Builder mReferralCode(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mReferralCode");
                    }
                    this.mReferralCode = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mReferralCode");
                }
                this.mReferralCode = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ReferralCode) {
                    return this.mReferralCode.equals(((ReferralCode) obj).mReferralCode());
                }
                return false;
            }

            public int hashCode() {
                return this.mReferralCode.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.ReferralCode
            @InterfaceC1498b("referral_code")
            public String mReferralCode() {
                return this.mReferralCode;
            }

            public String toString() {
                return s.p(new StringBuilder("ReferralCode{mReferralCode="), this.mReferralCode, "}");
            }
        };
    }
}
