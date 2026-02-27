package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AvailabilityConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AvailabilityConfig extends C$AutoValue_AvailabilityConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(AvailabilityConfig)";
        }

        @Override // com.google.gson.y
        public AvailabilityConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            AvailabilityConfig.Builder builderSBuilder = AvailabilityConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "end":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mEnd((String) yVarH.read(aVar));
                            break;
                        case "start":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mStart((String) yVarH2.read(aVar));
                            break;
                        case "message":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mMessage((String) yVarH3.read(aVar));
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
        public void write(b bVar, AvailabilityConfig availabilityConfig) throws IOException {
            if (availabilityConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.START);
            if (availabilityConfig.mStart() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, availabilityConfig.mStart());
            }
            bVar.m(TtmlNode.END);
            if (availabilityConfig.mEnd() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, availabilityConfig.mEnd());
            }
            bVar.m("message");
            if (availabilityConfig.mMessage() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, availabilityConfig.mMessage());
            }
            bVar.k();
        }
    }

    public AutoValue_AvailabilityConfig(String str, String str2, String str3) {
        new AvailabilityConfig(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_AvailabilityConfig
            private final String mEnd;
            private final String mMessage;
            private final String mStart;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AvailabilityConfig$Builder */
            public static class Builder extends AvailabilityConfig.Builder {
                private String mEnd;
                private String mMessage;
                private String mStart;

                public /* synthetic */ Builder(AvailabilityConfig availabilityConfig, int i) {
                    this(availabilityConfig);
                }

                @Override // com.paymaya.domain.model.AvailabilityConfig.Builder
                public AvailabilityConfig build() {
                    String strI = this.mStart == null ? " mStart" : "";
                    if (this.mEnd == null) {
                        strI = s.i(strI, " mEnd");
                    }
                    if (this.mMessage == null) {
                        strI = s.i(strI, " mMessage");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_AvailabilityConfig(this.mStart, this.mEnd, this.mMessage);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.AvailabilityConfig.Builder
                public AvailabilityConfig.Builder mEnd(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mEnd");
                    }
                    this.mEnd = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AvailabilityConfig.Builder
                public AvailabilityConfig.Builder mMessage(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMessage");
                    }
                    this.mMessage = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.AvailabilityConfig.Builder
                public AvailabilityConfig.Builder mStart(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStart");
                    }
                    this.mStart = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(AvailabilityConfig availabilityConfig) {
                    this.mStart = availabilityConfig.mStart();
                    this.mEnd = availabilityConfig.mEnd();
                    this.mMessage = availabilityConfig.mMessage();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mStart");
                }
                this.mStart = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mEnd");
                }
                this.mEnd = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mMessage");
                }
                this.mMessage = str3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AvailabilityConfig) {
                    AvailabilityConfig availabilityConfig = (AvailabilityConfig) obj;
                    if (this.mStart.equals(availabilityConfig.mStart()) && this.mEnd.equals(availabilityConfig.mEnd()) && this.mMessage.equals(availabilityConfig.mMessage())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((this.mStart.hashCode() ^ 1000003) * 1000003) ^ this.mEnd.hashCode()) * 1000003) ^ this.mMessage.hashCode();
            }

            @Override // com.paymaya.domain.model.AvailabilityConfig
            @InterfaceC1498b(TtmlNode.END)
            public String mEnd() {
                return this.mEnd;
            }

            @Override // com.paymaya.domain.model.AvailabilityConfig
            @InterfaceC1498b("message")
            public String mMessage() {
                return this.mMessage;
            }

            @Override // com.paymaya.domain.model.AvailabilityConfig
            @InterfaceC1498b(TtmlNode.START)
            public String mStart() {
                return this.mStart;
            }

            @Override // com.paymaya.domain.model.AvailabilityConfig
            public AvailabilityConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AvailabilityConfig{mStart=");
                sb2.append(this.mStart);
                sb2.append(", mEnd=");
                sb2.append(this.mEnd);
                sb2.append(", mMessage=");
                return s.p(sb2, this.mMessage, "}");
            }
        };
    }
}
