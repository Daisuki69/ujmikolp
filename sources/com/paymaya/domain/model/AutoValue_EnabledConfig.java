package com.paymaya.domain.model;

import We.s;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.EnabledConfig;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EnabledConfig extends C$AutoValue_EnabledConfig {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(EnabledConfig)";
        }

        @Override // com.google.gson.y
        public EnabledConfig read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            EnabledConfig.Builder builderSBuilder = EnabledConfig.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals(Constants.ENABLED)) {
                        y yVarH = this.boolean__adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH;
                        }
                        builderSBuilder.mIsEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, EnabledConfig enabledConfig) throws IOException {
            if (enabledConfig == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(Constants.ENABLED);
            y yVarH = this.boolean__adapter;
            if (yVarH == null) {
                yVarH = this.gson.h(Boolean.class);
                this.boolean__adapter = yVarH;
            }
            yVarH.write(bVar, Boolean.valueOf(enabledConfig.mIsEnabled()));
            bVar.k();
        }
    }

    public AutoValue_EnabledConfig(boolean z4) {
        new EnabledConfig(z4) { // from class: com.paymaya.domain.model.$AutoValue_EnabledConfig
            private final boolean mIsEnabled;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_EnabledConfig$Builder */
            public static class Builder extends EnabledConfig.Builder {
                private Boolean mIsEnabled;

                public /* synthetic */ Builder(EnabledConfig enabledConfig, int i) {
                    this(enabledConfig);
                }

                @Override // com.paymaya.domain.model.EnabledConfig.Builder
                public EnabledConfig build() {
                    String str = this.mIsEnabled == null ? " mIsEnabled" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_EnabledConfig(this.mIsEnabled.booleanValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }

                @Override // com.paymaya.domain.model.EnabledConfig.Builder
                public EnabledConfig.Builder mIsEnabled(boolean z4) {
                    this.mIsEnabled = Boolean.valueOf(z4);
                    return this;
                }

                public Builder() {
                }

                private Builder(EnabledConfig enabledConfig) {
                    this.mIsEnabled = Boolean.valueOf(enabledConfig.mIsEnabled());
                }
            }

            {
                this.mIsEnabled = z4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof EnabledConfig) && this.mIsEnabled == ((EnabledConfig) obj).mIsEnabled();
            }

            public int hashCode() {
                return (this.mIsEnabled ? 1231 : 1237) ^ 1000003;
            }

            @Override // com.paymaya.domain.model.EnabledConfig
            @InterfaceC1498b(Constants.ENABLED)
            public boolean mIsEnabled() {
                return this.mIsEnabled;
            }

            @Override // com.paymaya.domain.model.EnabledConfig
            public EnabledConfig.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                return s.s(new StringBuilder("EnabledConfig{mIsEnabled="), this.mIsEnabled, "}");
            }
        };
    }
}
