package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.SubmitEkycReference;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SubmitEkycReference extends C$AutoValue_SubmitEkycReference {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(SubmitEkycReference)";
        }

        @Override // com.google.gson.y
        public SubmitEkycReference read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            SubmitEkycReference.Builder builderSBuilder = SubmitEkycReference.sBuilder();
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
        public void write(b bVar, SubmitEkycReference submitEkycReference) throws IOException {
            if (submitEkycReference == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("reference_id");
            if (submitEkycReference.mReferenceId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, submitEkycReference.mReferenceId());
            }
            bVar.m(TtmlNode.ATTR_ID);
            if (submitEkycReference.mId() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, submitEkycReference.mId());
            }
            bVar.k();
        }
    }

    public AutoValue_SubmitEkycReference(final String str, final String str2) {
        new SubmitEkycReference(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_SubmitEkycReference
            private final String mId;
            private final String mReferenceId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_SubmitEkycReference$Builder */
            public static class Builder extends SubmitEkycReference.Builder {
                private String mId;
                private String mReferenceId;

                @Override // com.paymaya.domain.model.SubmitEkycReference.Builder
                public SubmitEkycReference build() {
                    String strI = this.mReferenceId == null ? " mReferenceId" : "";
                    if (this.mId == null) {
                        strI = s.i(strI, " mId");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_SubmitEkycReference(this.mReferenceId, this.mId);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.SubmitEkycReference.Builder
                public SubmitEkycReference.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.SubmitEkycReference.Builder
                public SubmitEkycReference.Builder mReferenceId(String str) {
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
                if (obj instanceof SubmitEkycReference) {
                    SubmitEkycReference submitEkycReference = (SubmitEkycReference) obj;
                    if (this.mReferenceId.equals(submitEkycReference.mReferenceId()) && this.mId.equals(submitEkycReference.mId())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mReferenceId.hashCode() ^ 1000003) * 1000003) ^ this.mId.hashCode();
            }

            @Override // com.paymaya.domain.model.SubmitEkycReference
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.SubmitEkycReference
            @InterfaceC1498b("reference_id")
            public String mReferenceId() {
                return this.mReferenceId;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SubmitEkycReference{mReferenceId=");
                sb2.append(this.mReferenceId);
                sb2.append(", mId=");
                return s.p(sb2, this.mId, "}");
            }
        };
    }
}
