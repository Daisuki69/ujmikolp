package com.paymaya.domain.model;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.BlockReason;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_BlockReason extends C$AutoValue_BlockReason {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(BlockReason)";
        }

        @Override // com.google.gson.y
        public BlockReason read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            BlockReason.Builder builderSBuilder = BlockReason.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "description":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mDescription((String) yVarH.read(aVar));
                            break;
                        case "reason_id":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mReasonID((String) yVarH2.read(aVar));
                            break;
                        case "type":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mType((String) yVarH3.read(aVar));
                            break;
                        case "reason_code":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mReasonCode((String) yVarH4.read(aVar));
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
        public void write(b bVar, BlockReason blockReason) throws IOException {
            if (blockReason == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("reason_id");
            if (blockReason.mReasonID() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, blockReason.mReasonID());
            }
            bVar.m(SessionDescription.ATTR_TYPE);
            if (blockReason.mType() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, blockReason.mType());
            }
            bVar.m("reason_code");
            if (blockReason.mReasonCode() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, blockReason.mReasonCode());
            }
            bVar.m("description");
            if (blockReason.mDescription() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, blockReason.mDescription());
            }
            bVar.k();
        }
    }

    public AutoValue_BlockReason(final String str, final String str2, final String str3, final String str4) {
        new BlockReason(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_BlockReason
            private final String mDescription;
            private final String mReasonCode;
            private final String mReasonID;
            private final String mType;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_BlockReason$Builder */
            public static class Builder extends BlockReason.Builder {
                private String mDescription;
                private String mReasonCode;
                private String mReasonID;
                private String mType;

                @Override // com.paymaya.domain.model.BlockReason.Builder
                public BlockReason build() {
                    String strI = this.mReasonID == null ? " mReasonID" : "";
                    if (this.mType == null) {
                        strI = s.i(strI, " mType");
                    }
                    if (this.mReasonCode == null) {
                        strI = s.i(strI, " mReasonCode");
                    }
                    if (this.mDescription == null) {
                        strI = s.i(strI, " mDescription");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_BlockReason(this.mReasonID, this.mType, this.mReasonCode, this.mDescription);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.BlockReason.Builder
                public BlockReason.Builder mDescription(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mDescription");
                    }
                    this.mDescription = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.BlockReason.Builder
                public BlockReason.Builder mReasonCode(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mReasonCode");
                    }
                    this.mReasonCode = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.BlockReason.Builder
                public BlockReason.Builder mReasonID(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mReasonID");
                    }
                    this.mReasonID = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.BlockReason.Builder
                public BlockReason.Builder mType(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mType");
                    }
                    this.mType = str;
                    return this;
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mReasonID");
                }
                this.mReasonID = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mType");
                }
                this.mType = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mReasonCode");
                }
                this.mReasonCode = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null mDescription");
                }
                this.mDescription = str4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BlockReason) {
                    BlockReason blockReason = (BlockReason) obj;
                    if (this.mReasonID.equals(blockReason.mReasonID()) && this.mType.equals(blockReason.mType()) && this.mReasonCode.equals(blockReason.mReasonCode()) && this.mDescription.equals(blockReason.mDescription())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((this.mReasonID.hashCode() ^ 1000003) * 1000003) ^ this.mType.hashCode()) * 1000003) ^ this.mReasonCode.hashCode()) * 1000003) ^ this.mDescription.hashCode();
            }

            @Override // com.paymaya.domain.model.BlockReason
            @InterfaceC1498b("description")
            public String mDescription() {
                return this.mDescription;
            }

            @Override // com.paymaya.domain.model.BlockReason
            @InterfaceC1498b("reason_code")
            public String mReasonCode() {
                return this.mReasonCode;
            }

            @Override // com.paymaya.domain.model.BlockReason
            @InterfaceC1498b("reason_id")
            public String mReasonID() {
                return this.mReasonID;
            }

            @Override // com.paymaya.domain.model.BlockReason
            @InterfaceC1498b(SessionDescription.ATTR_TYPE)
            public String mType() {
                return this.mType;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("BlockReason{mReasonID=");
                sb2.append(this.mReasonID);
                sb2.append(", mType=");
                sb2.append(this.mType);
                sb2.append(", mReasonCode=");
                sb2.append(this.mReasonCode);
                sb2.append(", mDescription=");
                return s.p(sb2, this.mDescription, "}");
            }
        };
    }
}
