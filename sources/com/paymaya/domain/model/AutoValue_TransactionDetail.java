package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TransactionDetail;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransactionDetail extends C$AutoValue_TransactionDetail {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(TransactionDetail)";
        }

        @Override // com.google.gson.y
        public TransactionDetail read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            TransactionDetail.Builder builderSBuilder = TransactionDetail.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("account_description")) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mAccountDescription((String) yVarH.read(aVar));
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
        public void write(b bVar, TransactionDetail transactionDetail) throws IOException {
            if (transactionDetail == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (transactionDetail.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, transactionDetail.mId());
            }
            bVar.m("account_description");
            if (transactionDetail.mAccountDescription() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, transactionDetail.mAccountDescription());
            }
            bVar.k();
        }
    }

    public AutoValue_TransactionDetail(final String str, final String str2) {
        new TransactionDetail(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_TransactionDetail
            private final String mAccountDescription;
            private final String mId;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TransactionDetail$Builder */
            public static class Builder extends TransactionDetail.Builder {
                private String mAccountDescription;
                private String mId;

                @Override // com.paymaya.domain.model.TransactionDetail.Builder
                public TransactionDetail build() {
                    String strI = this.mId == null ? " mId" : "";
                    if (this.mAccountDescription == null) {
                        strI = s.i(strI, " mAccountDescription");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_TransactionDetail(this.mId, this.mAccountDescription);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.TransactionDetail.Builder
                public TransactionDetail.Builder mAccountDescription(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mAccountDescription");
                    }
                    this.mAccountDescription = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.TransactionDetail.Builder
                public TransactionDetail.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mAccountDescription");
                }
                this.mAccountDescription = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof TransactionDetail) {
                    TransactionDetail transactionDetail = (TransactionDetail) obj;
                    if (this.mId.equals(transactionDetail.mId()) && this.mAccountDescription.equals(transactionDetail.mAccountDescription())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mAccountDescription.hashCode();
            }

            @Override // com.paymaya.domain.model.TransactionDetail
            @InterfaceC1498b("account_description")
            public String mAccountDescription() {
                return this.mAccountDescription;
            }

            @Override // com.paymaya.domain.model.TransactionDetail
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("TransactionDetail{mId=");
                sb2.append(this.mId);
                sb2.append(", mAccountDescription=");
                return s.p(sb2, this.mAccountDescription, "}");
            }
        };
    }
}
