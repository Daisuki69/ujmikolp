package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Registration;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Registration extends C$AutoValue_Registration {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y identity_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(Registration)";
        }

        @Override // com.google.gson.y
        public Registration read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            Registration.Builder builderSBuilder = Registration.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("registration_id")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mRegistrationId((String) yVarH.read(aVar));
                    } else if (strE.equals("identity")) {
                        y yVarH2 = this.identity_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(Identity.class);
                            this.identity_adapter = yVarH2;
                        }
                        builderSBuilder.mIdentity((Identity) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, Registration registration) throws IOException {
            if (registration == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("registration_id");
            if (registration.mRegistrationId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, registration.mRegistrationId());
            }
            bVar.m("identity");
            if (registration.mIdentity() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.identity_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Identity.class);
                    this.identity_adapter = yVarH2;
                }
                yVarH2.write(bVar, registration.mIdentity());
            }
            bVar.k();
        }
    }

    public AutoValue_Registration(String str, @Nullable Identity identity) {
        new Registration(str, identity) { // from class: com.paymaya.domain.model.$AutoValue_Registration
            private final Identity mIdentity;
            private final String mRegistrationId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Registration$Builder */
            public static class Builder extends Registration.Builder {
                private Identity mIdentity;
                private String mRegistrationId;

                @Override // com.paymaya.domain.model.Registration.Builder
                public Registration build() {
                    String str = this.mRegistrationId == null ? " mRegistrationId" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_Registration(this.mRegistrationId, this.mIdentity);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.Registration.Builder
                public Registration.Builder mIdentity(@Nullable Identity identity) {
                    this.mIdentity = identity;
                    return this;
                }

                @Override // com.paymaya.domain.model.Registration.Builder
                public Registration.Builder mRegistrationId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mRegistrationId");
                    }
                    this.mRegistrationId = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mRegistrationId");
                }
                this.mRegistrationId = str;
                this.mIdentity = identity;
            }

            public boolean equals(Object obj) {
                Identity identity2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Registration) {
                    Registration registration = (Registration) obj;
                    if (this.mRegistrationId.equals(registration.mRegistrationId()) && ((identity2 = this.mIdentity) != null ? identity2.equals(registration.mIdentity()) : registration.mIdentity() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (this.mRegistrationId.hashCode() ^ 1000003) * 1000003;
                Identity identity2 = this.mIdentity;
                return iHashCode ^ (identity2 == null ? 0 : identity2.hashCode());
            }

            @Override // com.paymaya.domain.model.Registration
            @Nullable
            @InterfaceC1498b("identity")
            public Identity mIdentity() {
                return this.mIdentity;
            }

            @Override // com.paymaya.domain.model.Registration
            @InterfaceC1498b("registration_id")
            public String mRegistrationId() {
                return this.mRegistrationId;
            }

            public String toString() {
                return "Registration{mRegistrationId=" + this.mRegistrationId + ", mIdentity=" + this.mIdentity + "}";
            }
        };
    }
}
