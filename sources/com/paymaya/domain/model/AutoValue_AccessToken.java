package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccessToken;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccessToken extends C$AutoValue_AccessToken {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AccessToken)";
        }

        @Override // com.google.gson.y
        public AccessToken read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AccessToken.Builder builderSBuilder = AccessToken.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("access_token")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mValue((String) yVarH.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, AccessToken accessToken) throws IOException {
            if (accessToken == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("access_token");
            if (accessToken.mValue() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, accessToken.mValue());
            }
            bVar.k();
        }
    }

    public AutoValue_AccessToken(String str) {
        new AccessToken(str) { // from class: com.paymaya.domain.model.$AutoValue_AccessToken
            private final String mValue;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccessToken$Builder */
            public static class Builder extends AccessToken.Builder {
                private String mValue;

                public /* synthetic */ Builder(AccessToken accessToken, int i) {
                    this(accessToken);
                }

                @Override // com.paymaya.domain.model.AccessToken.Builder
                public AccessToken build() {
                    String str = this.mValue == null ? " mValue" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_AccessToken(this.mValue);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.AccessToken.Builder
                public AccessToken.Builder mValue(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mValue");
                    }
                    this.mValue = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(AccessToken accessToken) {
                    this.mValue = accessToken.mValue();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mValue");
                }
                this.mValue = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AccessToken) {
                    return this.mValue.equals(((AccessToken) obj).mValue());
                }
                return false;
            }

            public int hashCode() {
                return this.mValue.hashCode() ^ 1000003;
            }

            @Override // com.paymaya.domain.model.AccessToken
            @InterfaceC1498b("access_token")
            public String mValue() {
                return this.mValue;
            }

            @Override // com.paymaya.domain.model.AccessToken
            public AccessToken.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.p(new StringBuilder("AccessToken{mValue="), this.mValue, "}");
            }
        };
    }
}
