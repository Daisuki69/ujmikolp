package com.paymaya.domain.model;

import We.s;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.DashboardSettingsTab;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_DashboardSettingsTab extends C$AutoValue_DashboardSettingsTab {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(DashboardSettingsTab)";
        }

        @Override // com.google.gson.y
        public DashboardSettingsTab read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            DashboardSettingsTab.Builder builderSBuilder = DashboardSettingsTab.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() == 9) {
                    aVar.G();
                } else {
                    strE.getClass();
                    if (strE.equals(TtmlNode.ATTR_ID)) {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        builderSBuilder.mId((String) yVarH.read(aVar));
                    } else if (strE.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        builderSBuilder.mName((String) yVarH2.read(aVar));
                    } else {
                        aVar.Q();
                    }
                }
            }
            aVar.k();
            return builderSBuilder.build();
        }

        @Override // com.google.gson.y
        public void write(b bVar, DashboardSettingsTab dashboardSettingsTab) throws IOException {
            if (dashboardSettingsTab == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (dashboardSettingsTab.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, dashboardSettingsTab.mId());
            }
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (dashboardSettingsTab.mName() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, dashboardSettingsTab.mName());
            }
            bVar.k();
        }
    }

    public AutoValue_DashboardSettingsTab(final String str, final String str2) {
        new DashboardSettingsTab(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_DashboardSettingsTab
            private final String mId;
            private final String mName;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_DashboardSettingsTab$Builder */
            public static class Builder extends DashboardSettingsTab.Builder {
                private String mId;
                private String mName;

                public /* synthetic */ Builder(DashboardSettingsTab dashboardSettingsTab, int i) {
                    this(dashboardSettingsTab);
                }

                @Override // com.paymaya.domain.model.DashboardSettingsTab.Builder
                public DashboardSettingsTab build() {
                    String strI = this.mId == null ? " mId" : "";
                    if (this.mName == null) {
                        strI = s.i(strI, " mName");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_DashboardSettingsTab(this.mId, this.mName);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.DashboardSettingsTab.Builder
                public DashboardSettingsTab.Builder mId(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mId");
                    }
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.DashboardSettingsTab.Builder
                public DashboardSettingsTab.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }

                public Builder() {
                }

                private Builder(DashboardSettingsTab dashboardSettingsTab) {
                    this.mId = dashboardSettingsTab.mId();
                    this.mName = dashboardSettingsTab.mName();
                }
            }

            {
                if (str == null) {
                    throw new NullPointerException("Null mId");
                }
                this.mId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof DashboardSettingsTab) {
                    DashboardSettingsTab dashboardSettingsTab = (DashboardSettingsTab) obj;
                    if (this.mId.equals(dashboardSettingsTab.mId()) && this.mName.equals(dashboardSettingsTab.mName())) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.mId.hashCode() ^ 1000003) * 1000003) ^ this.mName.hashCode();
            }

            @Override // com.paymaya.domain.model.DashboardSettingsTab
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.DashboardSettingsTab
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            @Override // com.paymaya.domain.model.DashboardSettingsTab
            public DashboardSettingsTab.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("DashboardSettingsTab{mId=");
                sb2.append(this.mId);
                sb2.append(", mName=");
                return s.p(sb2, this.mName, "}");
            }
        };
    }
}
