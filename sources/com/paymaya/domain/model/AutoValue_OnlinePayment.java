package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.OnlinePayment;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_OnlinePayment extends C$AutoValue_OnlinePayment {

    public static final class GsonTypeAdapter extends y {
        private final j gson;
        private volatile y int__adapter;
        private volatile y list__string_adapter;
        private volatile y maintenanceDate_adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(OnlinePayment)";
        }

        @Override // com.google.gson.y
        public OnlinePayment read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            OnlinePayment.Builder builderSBuilder = OnlinePayment.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "priority":
                            y yVarH = this.int__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Integer.class);
                                this.int__adapter = yVarH;
                            }
                            builderSBuilder.mPriority(((Integer) yVarH.read(aVar)).intValue());
                            break;
                        case "icon_url":
                            y yVarH2 = this.string_adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(String.class);
                                this.string_adapter = yVarH2;
                            }
                            builderSBuilder.mIconUrl((String) yVarH2.read(aVar));
                            break;
                        case "id":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mId((String) yVarH3.read(aVar));
                            break;
                        case "code":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mCode((String) yVarH4.read(aVar));
                            break;
                        case "link":
                            y yVarH5 = this.string_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(String.class);
                                this.string_adapter = yVarH5;
                            }
                            builderSBuilder.mExternalLink((String) yVarH5.read(aVar));
                            break;
                        case "name":
                            y yVarH6 = this.string_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(String.class);
                                this.string_adapter = yVarH6;
                            }
                            builderSBuilder.mName((String) yVarH6.read(aVar));
                            break;
                        case "tags":
                            y yVarG = this.list__string_adapter;
                            if (yVarG == null) {
                                yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = yVarG;
                            }
                            builderSBuilder.mTags((List) yVarG.read(aVar));
                            break;
                        case "category":
                            y yVarH7 = this.string_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(String.class);
                                this.string_adapter = yVarH7;
                            }
                            builderSBuilder.mCategory((String) yVarH7.read(aVar));
                            break;
                        case "maintenance":
                            y yVarH8 = this.maintenanceDate_adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(MaintenanceDate.class);
                                this.maintenanceDate_adapter = yVarH8;
                            }
                            builderSBuilder.mMaintenance((MaintenanceDate) yVarH8.read(aVar));
                            break;
                        case "background_url":
                            y yVarH9 = this.string_adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(String.class);
                                this.string_adapter = yVarH9;
                            }
                            builderSBuilder.mBackgroundUrl((String) yVarH9.read(aVar));
                            break;
                        case "logo_url":
                            y yVarH10 = this.string_adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(String.class);
                                this.string_adapter = yVarH10;
                            }
                            builderSBuilder.mLogoUrl((String) yVarH10.read(aVar));
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
        public void write(b bVar, OnlinePayment onlinePayment) throws IOException {
            if (onlinePayment == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (onlinePayment.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, onlinePayment.mId());
            }
            bVar.m("code");
            if (onlinePayment.mCode() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, onlinePayment.mCode());
            }
            bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (onlinePayment.mName() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, onlinePayment.mName());
            }
            bVar.m("link");
            if (onlinePayment.mExternalLink() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.string_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(String.class);
                    this.string_adapter = yVarH4;
                }
                yVarH4.write(bVar, onlinePayment.mExternalLink());
            }
            bVar.m("category");
            if (onlinePayment.mCategory() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, onlinePayment.mCategory());
            }
            bVar.m("maintenance");
            if (onlinePayment.mMaintenance() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.maintenanceDate_adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(MaintenanceDate.class);
                    this.maintenanceDate_adapter = yVarH6;
                }
                yVarH6.write(bVar, onlinePayment.mMaintenance());
            }
            bVar.m("icon_url");
            if (onlinePayment.mIconUrl() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.string_adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(String.class);
                    this.string_adapter = yVarH7;
                }
                yVarH7.write(bVar, onlinePayment.mIconUrl());
            }
            bVar.m("background_url");
            if (onlinePayment.mBackgroundUrl() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.string_adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(String.class);
                    this.string_adapter = yVarH8;
                }
                yVarH8.write(bVar, onlinePayment.mBackgroundUrl());
            }
            bVar.m("logo_url");
            if (onlinePayment.mLogoUrl() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.string_adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(String.class);
                    this.string_adapter = yVarH9;
                }
                yVarH9.write(bVar, onlinePayment.mLogoUrl());
            }
            bVar.m("priority");
            y yVarH10 = this.int__adapter;
            if (yVarH10 == null) {
                yVarH10 = this.gson.h(Integer.class);
                this.int__adapter = yVarH10;
            }
            yVarH10.write(bVar, Integer.valueOf(onlinePayment.mPriority()));
            bVar.m("tags");
            if (onlinePayment.mTags() == null) {
                bVar.r();
            } else {
                y yVarG = this.list__string_adapter;
                if (yVarG == null) {
                    yVarG = this.gson.g(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = yVarG;
                }
                yVarG.write(bVar, onlinePayment.mTags());
            }
            bVar.k();
        }
    }

    public AutoValue_OnlinePayment(@Nullable final String str, @Nullable final String str2, final String str3, final String str4, final String str5, @Nullable final MaintenanceDate maintenanceDate, @Nullable final String str6, @Nullable final String str7, @Nullable final String str8, final int i, @Nullable final List<String> list) {
        new OnlinePayment(str, str2, str3, str4, str5, maintenanceDate, str6, str7, str8, i, list) { // from class: com.paymaya.domain.model.$AutoValue_OnlinePayment
            private final String mBackgroundUrl;
            private final String mCategory;
            private final String mCode;
            private final String mExternalLink;
            private final String mIconUrl;
            private final String mId;
            private final String mLogoUrl;
            private final MaintenanceDate mMaintenance;
            private final String mName;
            private final int mPriority;
            private final List<String> mTags;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_OnlinePayment$Builder */
            public static class Builder extends OnlinePayment.Builder {
                private String mBackgroundUrl;
                private String mCategory;
                private String mCode;
                private String mExternalLink;
                private String mIconUrl;
                private String mId;
                private String mLogoUrl;
                private MaintenanceDate mMaintenance;
                private String mName;
                private Integer mPriority;
                private List<String> mTags;

                public /* synthetic */ Builder(OnlinePayment onlinePayment, int i) {
                    this(onlinePayment);
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment build() {
                    String strI = this.mName == null ? " mName" : "";
                    if (this.mExternalLink == null) {
                        strI = s.i(strI, " mExternalLink");
                    }
                    if (this.mCategory == null) {
                        strI = s.i(strI, " mCategory");
                    }
                    if (this.mPriority == null) {
                        strI = s.i(strI, " mPriority");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_OnlinePayment(this.mId, this.mCode, this.mName, this.mExternalLink, this.mCategory, this.mMaintenance, this.mIconUrl, this.mBackgroundUrl, this.mLogoUrl, this.mPriority.intValue(), this.mTags);
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mBackgroundUrl(String str) {
                    this.mBackgroundUrl = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mCategory(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mCategory");
                    }
                    this.mCategory = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mCode(String str) {
                    this.mCode = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mExternalLink(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mExternalLink");
                    }
                    this.mExternalLink = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mIconUrl(String str) {
                    this.mIconUrl = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mId(String str) {
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mLogoUrl(String str) {
                    this.mLogoUrl = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mMaintenance(MaintenanceDate maintenanceDate) {
                    this.mMaintenance = maintenanceDate;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mName(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mName");
                    }
                    this.mName = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mPriority(int i) {
                    this.mPriority = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.OnlinePayment.Builder
                public OnlinePayment.Builder mTags(List<String> list) {
                    this.mTags = list;
                    return this;
                }

                public Builder() {
                }

                private Builder(OnlinePayment onlinePayment) {
                    this.mId = onlinePayment.mId();
                    this.mCode = onlinePayment.mCode();
                    this.mName = onlinePayment.mName();
                    this.mExternalLink = onlinePayment.mExternalLink();
                    this.mCategory = onlinePayment.mCategory();
                    this.mMaintenance = onlinePayment.mMaintenance();
                    this.mIconUrl = onlinePayment.mIconUrl();
                    this.mBackgroundUrl = onlinePayment.mBackgroundUrl();
                    this.mLogoUrl = onlinePayment.mLogoUrl();
                    this.mPriority = Integer.valueOf(onlinePayment.mPriority());
                    this.mTags = onlinePayment.mTags();
                }
            }

            {
                this.mId = str;
                this.mCode = str2;
                if (str3 == null) {
                    throw new NullPointerException("Null mName");
                }
                this.mName = str3;
                if (str4 == null) {
                    throw new NullPointerException("Null mExternalLink");
                }
                this.mExternalLink = str4;
                if (str5 == null) {
                    throw new NullPointerException("Null mCategory");
                }
                this.mCategory = str5;
                this.mMaintenance = maintenanceDate;
                this.mIconUrl = str6;
                this.mBackgroundUrl = str7;
                this.mLogoUrl = str8;
                this.mPriority = i;
                this.mTags = list;
            }

            public boolean equals(Object obj) {
                MaintenanceDate maintenanceDate2;
                String str9;
                String str10;
                String str11;
                List<String> list2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof OnlinePayment) {
                    OnlinePayment onlinePayment = (OnlinePayment) obj;
                    String str12 = this.mId;
                    if (str12 != null ? str12.equals(onlinePayment.mId()) : onlinePayment.mId() == null) {
                        String str13 = this.mCode;
                        if (str13 != null ? str13.equals(onlinePayment.mCode()) : onlinePayment.mCode() == null) {
                            if (this.mName.equals(onlinePayment.mName()) && this.mExternalLink.equals(onlinePayment.mExternalLink()) && this.mCategory.equals(onlinePayment.mCategory()) && ((maintenanceDate2 = this.mMaintenance) != null ? maintenanceDate2.equals(onlinePayment.mMaintenance()) : onlinePayment.mMaintenance() == null) && ((str9 = this.mIconUrl) != null ? str9.equals(onlinePayment.mIconUrl()) : onlinePayment.mIconUrl() == null) && ((str10 = this.mBackgroundUrl) != null ? str10.equals(onlinePayment.mBackgroundUrl()) : onlinePayment.mBackgroundUrl() == null) && ((str11 = this.mLogoUrl) != null ? str11.equals(onlinePayment.mLogoUrl()) : onlinePayment.mLogoUrl() == null) && this.mPriority == onlinePayment.mPriority() && ((list2 = this.mTags) != null ? list2.equals(onlinePayment.mTags()) : onlinePayment.mTags() == null)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                String str9 = this.mId;
                int iHashCode = ((str9 == null ? 0 : str9.hashCode()) ^ 1000003) * 1000003;
                String str10 = this.mCode;
                int iHashCode2 = (((((((iHashCode ^ (str10 == null ? 0 : str10.hashCode())) * 1000003) ^ this.mName.hashCode()) * 1000003) ^ this.mExternalLink.hashCode()) * 1000003) ^ this.mCategory.hashCode()) * 1000003;
                MaintenanceDate maintenanceDate2 = this.mMaintenance;
                int iHashCode3 = (iHashCode2 ^ (maintenanceDate2 == null ? 0 : maintenanceDate2.hashCode())) * 1000003;
                String str11 = this.mIconUrl;
                int iHashCode4 = (iHashCode3 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.mBackgroundUrl;
                int iHashCode5 = (iHashCode4 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.mLogoUrl;
                int iHashCode6 = (((iHashCode5 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003) ^ this.mPriority) * 1000003;
                List<String> list2 = this.mTags;
                return iHashCode6 ^ (list2 != null ? list2.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("background_url")
            public String mBackgroundUrl() {
                return this.mBackgroundUrl;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @InterfaceC1498b("category")
            public String mCategory() {
                return this.mCategory;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("code")
            public String mCode() {
                return this.mCode;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @InterfaceC1498b("link")
            public String mExternalLink() {
                return this.mExternalLink;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("icon_url")
            public String mIconUrl() {
                return this.mIconUrl;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("logo_url")
            public String mLogoUrl() {
                return this.mLogoUrl;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("maintenance")
            public MaintenanceDate mMaintenance() {
                return this.mMaintenance;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
            public String mName() {
                return this.mName;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @InterfaceC1498b("priority")
            public int mPriority() {
                return this.mPriority;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            @Nullable
            @InterfaceC1498b("tags")
            public List<String> mTags() {
                return this.mTags;
            }

            @Override // com.paymaya.domain.model.OnlinePayment
            public OnlinePayment.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("OnlinePayment{mId=");
                sb2.append(this.mId);
                sb2.append(", mCode=");
                sb2.append(this.mCode);
                sb2.append(", mName=");
                sb2.append(this.mName);
                sb2.append(", mExternalLink=");
                sb2.append(this.mExternalLink);
                sb2.append(", mCategory=");
                sb2.append(this.mCategory);
                sb2.append(", mMaintenance=");
                sb2.append(this.mMaintenance);
                sb2.append(", mIconUrl=");
                sb2.append(this.mIconUrl);
                sb2.append(", mBackgroundUrl=");
                sb2.append(this.mBackgroundUrl);
                sb2.append(", mLogoUrl=");
                sb2.append(this.mLogoUrl);
                sb2.append(", mPriority=");
                sb2.append(this.mPriority);
                sb2.append(", mTags=");
                return s.r(sb2, this.mTags, "}");
            }
        };
    }
}
