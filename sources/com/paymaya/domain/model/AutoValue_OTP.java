package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.OTP;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_OTP extends C$AutoValue_OTP {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(OTP)";
        }

        @Override // com.google.gson.y
        public OTP read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            OTP.Builder builderSBuilder = OTP.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("otp_id")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mOtpId((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, OTP otp) throws IOException {
            if (otp == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("otp_id");
            if (otp.mOtpId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, otp.mOtpId());
            }
            bVar.k();
        }
    }

    public AutoValue_OTP(final String str) {
        new OTP(str) { // from class: com.paymaya.domain.model.$AutoValue_OTP
            private final String mOtpId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_OTP$Builder */
            public static class Builder extends OTP.Builder {
                private String mOtpId;

                @Override // com.paymaya.domain.model.OTP.Builder
                public OTP build() {
                    String str = this.mOtpId == null ? " mOtpId" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_OTP(this.mOtpId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.OTP.Builder
                public OTP.Builder mOtpId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mOtpId");
                    }
                    this.mOtpId = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mOtpId");
                }
                this.mOtpId = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof OTP) {
                    return this.mOtpId.equals(((OTP) obj).mOtpId());
                }
                return false;
            }

            public int hashCode() {
                return this.mOtpId.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.OTP
            @InterfaceC1498b("otp_id")
            public String mOtpId() {
                return this.mOtpId;
            }

            public String toString() {
                return s.p(new StringBuilder("OTP{mOtpId="), this.mOtpId, "}");
            }
        };
    }
}
