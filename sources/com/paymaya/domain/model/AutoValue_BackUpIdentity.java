package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.BackUpIdentity;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BackUpIdentity extends C$AutoValue_BackUpIdentity {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(BackUpIdentity)";
        }

        @Override // com.google.gson.y
        public BackUpIdentity read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            BackUpIdentity.Builder builderSBuilder = BackUpIdentity.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "type":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mType((String) yVarH.read(aVar));
                            break;
                        case "value":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mValue((String) yVarH2.read(aVar));
                            break;
                        case "is_verified":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mIsVerified((Boolean) yVarH3.read(aVar));
                            break;
                        default:
                            aVar.Q();
                            break;
                    }
                } else {
                    aVar.G();
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, BackUpIdentity backUpIdentity) throws IOException {
            if (backUpIdentity == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(SessionDescription.ATTR_TYPE);
            if (backUpIdentity.mType() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, backUpIdentity.mType());
            }
            bVar.m("value");
            if (backUpIdentity.mValue() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, backUpIdentity.mValue());
            }
            bVar.m("is_verified");
            if (backUpIdentity.mIsVerified() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, backUpIdentity.mIsVerified());
            }
            bVar.k();
        }
    }

    public AutoValue_BackUpIdentity(final String str, final String str2, @Nullable final Boolean bool) {
        new BackUpIdentity(str, str2, bool) { // from class: com.paymaya.domain.model.$AutoValue_BackUpIdentity
            private final Boolean mIsVerified;
            private final String mType;
            private final String mValue;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BackUpIdentity$Builder */
            public static class Builder extends BackUpIdentity.Builder {
                private Boolean mIsVerified;
                private String mType;
                private String mValue;

                public /* synthetic */ Builder(BackUpIdentity backUpIdentity, int i) {
                    this(backUpIdentity);
                }

                @Override // com.paymaya.domain.model.BackUpIdentity.Builder
                public BackUpIdentity build() {
                    String strI = this.mType == null ? " mType" : "";
                    if (this.mValue == null) {
                        strI = s.i(strI, " mValue");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_BackUpIdentity(this.mType, this.mValue, this.mIsVerified);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.BackUpIdentity.Builder
                public BackUpIdentity.Builder mIsVerified(@Nullable Boolean bool) {
                    this.mIsVerified = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.BackUpIdentity.Builder
                public BackUpIdentity.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.BackUpIdentity.Builder
                public BackUpIdentity.Builder mValue(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mValue");
                    }
                    this.mValue = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(BackUpIdentity backUpIdentity) {
                    this.mType = backUpIdentity.mType();
                    this.mValue = backUpIdentity.mValue();
                    this.mIsVerified = backUpIdentity.mIsVerified();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mValue");
                }
                this.mValue = str2;
                this.mIsVerified = bool;
            }

            public boolean equals(Object obj) {
                Boolean bool2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BackUpIdentity) {
                    BackUpIdentity backUpIdentity = (BackUpIdentity) obj;
                    if (this.mType.equals(backUpIdentity.mType()) && this.mValue.equals(backUpIdentity.mValue()) && ((bool2 = this.mIsVerified) != null ? bool2.equals(backUpIdentity.mIsVerified()) : backUpIdentity.mIsVerified() == null)) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                int iHashCode = (((this.mType.hashCode() ^ 1000003) * 1000003) ^ this.mValue.hashCode()) * 1000003;
                Boolean bool2 = this.mIsVerified;
                return iHashCode ^ (bool2 == null ? 0 : bool2.hashCode());
            }

            @Override // com.paymaya.domain.model.BackUpIdentity
            @Nullable
            @InterfaceC1498b("is_verified")
            public Boolean mIsVerified() {
                return this.mIsVerified;
            }

            @Override // com.paymaya.domain.model.BackUpIdentity
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public String mType() {
                return this.mType;
            }

            @Override // com.paymaya.domain.model.BackUpIdentity
            @InterfaceC1498b("value")
            public String mValue() {
                return this.mValue;
            }

            @Override // com.paymaya.domain.model.BackUpIdentity
            public BackUpIdentity.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("BackUpIdentity{mType=");
                sb2.append(this.mType);
                sb2.append(", mValue=");
                sb2.append(this.mValue);
                sb2.append(", mIsVerified=");
                return AbstractC1213b.N(sb2, this.mIsVerified, "}");
            }
        };
    }
}
