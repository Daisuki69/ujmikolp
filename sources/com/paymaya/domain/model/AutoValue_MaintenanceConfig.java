package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.MaintenanceConfig;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MaintenanceConfig extends C$AutoValue_MaintenanceConfig {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y serviceAvailabilityConfig_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MaintenanceConfig)";
        }

        @Override // com.google.gson.y
        public MaintenanceConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MaintenanceConfig.Builder builderSBuilder = MaintenanceConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "message_v2":
                            y yVarH = this.string_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(String.class);
                                this.string_adapter = yVarH;
                            }
                            builderSBuilder.mMessageV2((String) yVarH.read(aVar));
                            break;
                        case "end":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mEnd((String) yVarH2.read(aVar));
                            break;
                        case "start":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mStart((String) yVarH3.read(aVar));
                            break;
                        case "message":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mMessage((String) yVarH4.read(aVar));
                            break;
                        case "service_availability":
                            y yVarH5 = this.serviceAvailabilityConfig_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(ServiceAvailabilityConfig.class);
                                this.serviceAvailabilityConfig_adapter = yVarH5;
                            }
                            builderSBuilder.mServiceAvailabilityConfig((ServiceAvailabilityConfig) yVarH5.read(aVar));
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
        public void write(b bVar, MaintenanceConfig maintenanceConfig) throws IOException {
            if (maintenanceConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.START);
            if (maintenanceConfig.mStart() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, maintenanceConfig.mStart());
            }
            bVar.m(TtmlNode.END);
            if (maintenanceConfig.mEnd() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, maintenanceConfig.mEnd());
            }
            bVar.m("message");
            if (maintenanceConfig.mMessage() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, maintenanceConfig.mMessage());
            }
            bVar.m("message_v2");
            if (maintenanceConfig.mMessageV2() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, maintenanceConfig.mMessageV2());
            }
            bVar.m("service_availability");
            if (maintenanceConfig.mServiceAvailabilityConfig() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.serviceAvailabilityConfig_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(ServiceAvailabilityConfig.class);
                    this.serviceAvailabilityConfig_adapter = yVarH5;
                }
                yVarH5.write(bVar, maintenanceConfig.mServiceAvailabilityConfig());
            }
            bVar.k();
        }
    }

    public AutoValue_MaintenanceConfig(String str, String str2, String str3, String str4, ServiceAvailabilityConfig serviceAvailabilityConfig) {
        new MaintenanceConfig(str, str2, str3, str4, serviceAvailabilityConfig) { // from class: com.paymaya.domain.model.$AutoValue_MaintenanceConfig
            private final String mEnd;
            private final String mMessage;
            private final String mMessageV2;
            private final ServiceAvailabilityConfig mServiceAvailabilityConfig;
            private final String mStart;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MaintenanceConfig$Builder */
            public static class Builder extends MaintenanceConfig.Builder {
                private String mEnd;
                private String mMessage;
                private String mMessageV2;
                private ServiceAvailabilityConfig mServiceAvailabilityConfig;
                private String mStart;

                public /* synthetic */ Builder(MaintenanceConfig maintenanceConfig, int i) {
                    this(maintenanceConfig);
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig build() {
                    String strI = this.mStart == null ? " mStart" : "";
                    if (this.mEnd == null) {
                        strI = s.i(strI, " mEnd");
                    }
                    if (this.mMessage == null) {
                        strI = s.i(strI, " mMessage");
                    }
                    if (this.mMessageV2 == null) {
                        strI = s.i(strI, " mMessageV2");
                    }
                    if (this.mServiceAvailabilityConfig == null) {
                        strI = s.i(strI, " mServiceAvailabilityConfig");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_MaintenanceConfig(this.mStart, this.mEnd, this.mMessage, this.mMessageV2, this.mServiceAvailabilityConfig);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig.Builder mEnd(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mEnd");
                    }
                    this.mEnd = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig.Builder mMessage(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMessage");
                    }
                    this.mMessage = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig.Builder mMessageV2(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mMessageV2");
                    }
                    this.mMessageV2 = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig.Builder mServiceAvailabilityConfig(ServiceAvailabilityConfig serviceAvailabilityConfig) {
                    if (serviceAvailabilityConfig == null) {
                        throw new NullPointerException("Null mServiceAvailabilityConfig");
                    }
                    this.mServiceAvailabilityConfig = serviceAvailabilityConfig;
                    return this;
                }

                @Override // com.paymaya.domain.model.MaintenanceConfig.Builder
                public MaintenanceConfig.Builder mStart(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mStart");
                    }
                    this.mStart = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(MaintenanceConfig maintenanceConfig) {
                    this.mStart = maintenanceConfig.mStart();
                    this.mEnd = maintenanceConfig.mEnd();
                    this.mMessage = maintenanceConfig.mMessage();
                    this.mMessageV2 = maintenanceConfig.mMessageV2();
                    this.mServiceAvailabilityConfig = maintenanceConfig.mServiceAvailabilityConfig();
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
                if (str4 == null) {
                    throw new NullPointerException("Null mMessageV2");
                }
                this.mMessageV2 = str4;
                if (serviceAvailabilityConfig == null) {
                    throw new NullPointerException("Null mServiceAvailabilityConfig");
                }
                this.mServiceAvailabilityConfig = serviceAvailabilityConfig;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MaintenanceConfig) {
                    MaintenanceConfig maintenanceConfig = (MaintenanceConfig) obj;
                    if (this.mStart.equals(maintenanceConfig.mStart()) && this.mEnd.equals(maintenanceConfig.mEnd()) && this.mMessage.equals(maintenanceConfig.mMessage()) && this.mMessageV2.equals(maintenanceConfig.mMessageV2()) && this.mServiceAvailabilityConfig.equals(maintenanceConfig.mServiceAvailabilityConfig())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((((((((this.mStart.hashCode() ^ 1000003) * 1000003) ^ this.mEnd.hashCode()) * 1000003) ^ this.mMessage.hashCode()) * 1000003) ^ this.mMessageV2.hashCode()) * 1000003) ^ this.mServiceAvailabilityConfig.hashCode();
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            @InterfaceC1498b(TtmlNode.END)
            public String mEnd() {
                return this.mEnd;
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            @InterfaceC1498b("message")
            public String mMessage() {
                return this.mMessage;
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            @InterfaceC1498b("message_v2")
            public String mMessageV2() {
                return this.mMessageV2;
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            @InterfaceC1498b("service_availability")
            public ServiceAvailabilityConfig mServiceAvailabilityConfig() {
                return this.mServiceAvailabilityConfig;
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            @InterfaceC1498b(TtmlNode.START)
            public String mStart() {
                return this.mStart;
            }

            @Override // com.paymaya.domain.model.MaintenanceConfig
            public MaintenanceConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return "MaintenanceConfig{mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mMessage=" + this.mMessage + ", mMessageV2=" + this.mMessageV2 + ", mServiceAvailabilityConfig=" + this.mServiceAvailabilityConfig + "}";
            }
        };
    }
}
