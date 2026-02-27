package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ChangeMin;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ChangeMin extends C$AutoValue_ChangeMin {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y identity_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(ChangeMin)";
        }

        @Override // com.google.gson.y
        public ChangeMin read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            ChangeMin.Builder builderSBuilder = ChangeMin.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals("new_identity")) {
                        y yVarH = this.identity_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Identity.class);
                            this.identity_adapter = yVarH;
                        }
                        builderSBuilder.mIdentity((Identity) yVarH.read(aVar));
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
        public void write(b bVar, ChangeMin changeMin) throws IOException {
            if (changeMin == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (changeMin.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, changeMin.mId());
            }
            bVar.m("new_identity");
            if (changeMin.mIdentity() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.identity_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Identity.class);
                    this.identity_adapter = yVarH2;
                }
                yVarH2.write(bVar, changeMin.mIdentity());
            }
            bVar.k();
        }
    }

    public AutoValue_ChangeMin(final String str, @Nullable final Identity identity) {
        new ChangeMin(str, identity) { // from class: com.paymaya.domain.model.$AutoValue_ChangeMin
            private final String mId;
            private final Identity mIdentity;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ChangeMin$Builder */
            public static class Builder extends ChangeMin.Builder {
                private String mId;
                private Identity mIdentity;

                @Override // com.paymaya.domain.model.ChangeMin.Builder
                public ChangeMin build() {
                    String str = this.mId == null ? " mId" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_ChangeMin(this.mId, this.mIdentity);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.ChangeMin.Builder
                public ChangeMin.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.ChangeMin.Builder
                public ChangeMin.Builder mIdentity(Identity identity) {
                    this.mIdentity = identity;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str;
                this.mIdentity = identity;
            }

            public boolean equals(Object obj) {
                Identity identity2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof ChangeMin) {
                    ChangeMin changeMin = (ChangeMin) obj;
                    if (this.mId.equals(changeMin.mId()) && ((identity2 = this.mIdentity) != null ? identity2.equals(changeMin.mIdentity()) : changeMin.mIdentity() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (this.mId.hashCode() ^ 1000003) * 1000003;
                Identity identity2 = this.mIdentity;
                return iHashCode ^ (identity2 == null ? 0 : identity2.hashCode());
            }

            @Override // com.paymaya.domain.model.ChangeMin
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.ChangeMin
            @Nullable
            @InterfaceC1498b("new_identity")
            public Identity mIdentity() {
                return this.mIdentity;
            }

            public String toString() {
                return "ChangeMin{mId=" + this.mId + ", mIdentity=" + this.mIdentity + "}";
            }
        };
    }
}
