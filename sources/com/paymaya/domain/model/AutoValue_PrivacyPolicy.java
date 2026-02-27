package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PrivacyPolicy;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PrivacyPolicy extends C$AutoValue_PrivacyPolicy {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(PrivacyPolicy)";
        }

        @Override // com.google.gson.y
        public PrivacyPolicy read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            PrivacyPolicy.Builder builderSBuilder = PrivacyPolicy.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("status")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mStatus((String) yVarH.read(aVar));
                    } else if (strE.equals("version")) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mVersion((String) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, PrivacyPolicy privacyPolicy) throws IOException {
            if (privacyPolicy == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("status");
            if (privacyPolicy.mStatus() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, privacyPolicy.mStatus());
            }
            bVar.m("version");
            if (privacyPolicy.mVersion() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, privacyPolicy.mVersion());
            }
            bVar.k();
        }
    }

    public AutoValue_PrivacyPolicy(final String str, @Nullable final String str2) {
        new PrivacyPolicy(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_PrivacyPolicy
            private final String mStatus;
            private final String mVersion;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PrivacyPolicy$Builder */
            public static class Builder extends PrivacyPolicy.Builder {
                private String mStatus;
                private String mVersion;

                @Override // com.paymaya.domain.model.PrivacyPolicy.Builder
                public PrivacyPolicy build() {
                    String str = this.mStatus == null ? " mStatus" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_PrivacyPolicy(this.mStatus, this.mVersion);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.PrivacyPolicy.Builder
                public PrivacyPolicy.Builder mStatus(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStatus");
                    }
                    this.mStatus = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.PrivacyPolicy.Builder
                public PrivacyPolicy.Builder mVersion(String str) {
                    this.mVersion = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mStatus");
                }
                this.mStatus = str;
                this.mVersion = str2;
            }

            public boolean equals(Object obj) {
                String str3;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof PrivacyPolicy) {
                    PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
                    if (this.mStatus.equals(privacyPolicy.mStatus()) && ((str3 = this.mVersion) != null ? str3.equals(privacyPolicy.mVersion()) : privacyPolicy.mVersion() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (this.mStatus.hashCode() ^ 1000003) * 1000003;
                String str3 = this.mVersion;
                return iHashCode ^ (str3 == null ? 0 : str3.hashCode());
            }

            @Override // com.paymaya.domain.model.PrivacyPolicy
            @InterfaceC1498b("status")
            public String mStatus() {
                return this.mStatus;
            }

            @Override // com.paymaya.domain.model.PrivacyPolicy
            @Nullable
            @InterfaceC1498b("version")
            public String mVersion() {
                return this.mVersion;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("PrivacyPolicy{mStatus=");
                sb2.append(this.mStatus);
                sb2.append(", mVersion=");
                return s.p(sb2, this.mVersion, "}");
            }
        };
    }
}
