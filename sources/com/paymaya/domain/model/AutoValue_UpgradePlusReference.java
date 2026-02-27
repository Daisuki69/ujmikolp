package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.UpgradePlusReference;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UpgradePlusReference extends C$AutoValue_UpgradePlusReference {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(UpgradePlusReference)";
        }

        @Override // com.google.gson.y
        public UpgradePlusReference read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            UpgradePlusReference.Builder builderSBuilder = UpgradePlusReference.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("reference_id")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mReferenceId((String) yVarH.read(aVar));
                    } else if (strE.equals(TtmlNode.ATTR_ID)) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mId((String) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, UpgradePlusReference upgradePlusReference) throws IOException {
            if (upgradePlusReference == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("reference_id");
            if (upgradePlusReference.mReferenceId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, upgradePlusReference.mReferenceId());
            }
            bVar.m(TtmlNode.ATTR_ID);
            if (upgradePlusReference.mId() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, upgradePlusReference.mId());
            }
            bVar.k();
        }
    }

    public AutoValue_UpgradePlusReference(final String str, final String str2) {
        new UpgradePlusReference(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_UpgradePlusReference
            private final String mId;
            private final String mReferenceId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UpgradePlusReference$Builder */
            public static class Builder extends UpgradePlusReference.Builder {
                private String mId;
                private String mReferenceId;

                @Override // com.paymaya.domain.model.UpgradePlusReference.Builder
                public UpgradePlusReference build() {
                    String strI = this.mReferenceId == null ? " mReferenceId" : "";
                    if (this.mId == null) {
                        strI = s.i(strI, " mId");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_UpgradePlusReference(this.mReferenceId, this.mId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.UpgradePlusReference.Builder
                public UpgradePlusReference.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.UpgradePlusReference.Builder
                public UpgradePlusReference.Builder mReferenceId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mReferenceId");
                    }
                    this.mReferenceId = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mReferenceId");
                }
                this.mReferenceId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UpgradePlusReference) {
                    UpgradePlusReference upgradePlusReference = (UpgradePlusReference) obj;
                    if (this.mReferenceId.equals(upgradePlusReference.mReferenceId()) && this.mId.equals(upgradePlusReference.mId())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mReferenceId.hashCode() ^ 1000003) * 1000003) ^ this.mId.hashCode();
            }

            @Override // com.paymaya.domain.model.UpgradePlusReference
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.UpgradePlusReference
            @InterfaceC1498b("reference_id")
            public String mReferenceId() {
                return this.mReferenceId;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("UpgradePlusReference{mReferenceId=");
                sb2.append(this.mReferenceId);
                sb2.append(", mId=");
                return s.p(sb2, this.mId, "}");
            }
        };
    }
}
