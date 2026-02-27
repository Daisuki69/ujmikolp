package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.SevenElevenPushNotification;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SevenElevenPushNotification extends C$AutoValue_SevenElevenPushNotification {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(SevenElevenPushNotification)";
        }

        @Override // com.google.gson.y
        public SevenElevenPushNotification read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            SevenElevenPushNotification.Builder builderSBuilder = SevenElevenPushNotification.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if ("isSuccess".equals(strE)) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.isSuccess(((Boolean) yVarH.read(aVar)).booleanValue());
                    } else if ("mPayId".equals(strE)) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mPayId((String) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, SevenElevenPushNotification sevenElevenPushNotification) throws IOException {
            if (sevenElevenPushNotification == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("isSuccess");
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(sevenElevenPushNotification.isSuccess()));
            bVar.m("mPayId");
            if (sevenElevenPushNotification.mPayId() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, sevenElevenPushNotification.mPayId());
            }
            bVar.k();
        }
    }

    public AutoValue_SevenElevenPushNotification(boolean z4, String str) {
        new SevenElevenPushNotification(z4, str) { // from class: com.paymaya.domain.model.$AutoValue_SevenElevenPushNotification
            private final boolean isSuccess;
            private final String mPayId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_SevenElevenPushNotification$Builder */
            public static class Builder extends SevenElevenPushNotification.Builder {
                private Boolean isSuccess;
                private String mPayId;

                public /* synthetic */ Builder(SevenElevenPushNotification sevenElevenPushNotification, int i) {
                    this(sevenElevenPushNotification);
                }

                @Override // com.paymaya.domain.model.SevenElevenPushNotification.Builder
                public SevenElevenPushNotification build() {
                    String strI = this.isSuccess == null ? " isSuccess" : "";
                    if (this.mPayId == null) {
                        strI = s.i(strI, " mPayId");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_SevenElevenPushNotification(this.isSuccess.booleanValue(), this.mPayId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.SevenElevenPushNotification.Builder
                public SevenElevenPushNotification.Builder isSuccess(boolean z4) {
                    this.isSuccess = Boolean.valueOf(z4);
                    return this;
                }

                @Override // com.paymaya.domain.model.SevenElevenPushNotification.Builder
                public SevenElevenPushNotification.Builder mPayId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mPayId");
                    }
                    this.mPayId = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(SevenElevenPushNotification sevenElevenPushNotification) {
                    this.isSuccess = Boolean.valueOf(sevenElevenPushNotification.isSuccess());
                    this.mPayId = sevenElevenPushNotification.mPayId();
                }
            }

            {
                this.isSuccess = z4;
                if (str == null) {
                    throw new NullPointerException("Null mPayId");
                }
                this.mPayId = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SevenElevenPushNotification) {
                    SevenElevenPushNotification sevenElevenPushNotification = (SevenElevenPushNotification) obj;
                    if (this.isSuccess == sevenElevenPushNotification.isSuccess() && this.mPayId.equals(sevenElevenPushNotification.mPayId())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return (((this.isSuccess ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.mPayId.hashCode();
            }

            @Override // com.paymaya.domain.model.SevenElevenPushNotification
            public boolean isSuccess() {
                return this.isSuccess;
            }

            @Override // com.paymaya.domain.model.SevenElevenPushNotification
            public String mPayId() {
                return this.mPayId;
            }

            @Override // com.paymaya.domain.model.SevenElevenPushNotification
            public SevenElevenPushNotification.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SevenElevenPushNotification{isSuccess=");
                sb2.append(this.isSuccess);
                sb2.append(", mPayId=");
                return s.p(sb2, this.mPayId, "}");
            }
        };
    }
}
