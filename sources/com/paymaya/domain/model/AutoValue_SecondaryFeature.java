package com.paymaya.domain.model;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.store.AbstractC1259g;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SecondaryFeature extends C$AutoValue_SecondaryFeature {

    public static final class GsonTypeAdapter extends y {
        private volatile y ageRestricted_adapter;
        private volatile y boolean__adapter;
        private volatile y featureDynamicStatus_adapter;
        private final j gson;
        private volatile y int__adapter;
        private volatile y string_adapter;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(SecondaryFeature)";
        }

        @Override // com.google.gson.y
        public SecondaryFeature read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            SecondaryFeature.Builder builderSBuilder = SecondaryFeature.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "age_restricted":
                            y yVarH = this.ageRestricted_adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(AbstractC1259g.class);
                                this.ageRestricted_adapter = yVarH;
                            }
                            builderSBuilder.mAgeRestricted((AbstractC1259g) yVarH.read(aVar));
                            break;
                        case "is_kyc_required":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.mIsKycRequired((Boolean) yVarH2.read(aVar));
                            break;
                        case "id":
                            y yVarH3 = this.string_adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(String.class);
                                this.string_adapter = yVarH3;
                            }
                            builderSBuilder.mId((String) yVarH3.read(aVar));
                            break;
                        case "uri":
                            y yVarH4 = this.string_adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(String.class);
                                this.string_adapter = yVarH4;
                            }
                            builderSBuilder.mUri((String) yVarH4.read(aVar));
                            break;
                        case "label":
                            y yVarH5 = this.string_adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(String.class);
                                this.string_adapter = yVarH5;
                            }
                            builderSBuilder.mLabel((String) yVarH5.read(aVar));
                            break;
                        case "dynamic_status":
                            y yVarH6 = this.featureDynamicStatus_adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(FeatureDynamicStatus.class);
                                this.featureDynamicStatus_adapter = yVarH6;
                            }
                            builderSBuilder.mFeatureDynamicStatus((FeatureDynamicStatus) yVarH6.read(aVar));
                            break;
                        case "event_name":
                            y yVarH7 = this.string_adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(String.class);
                                this.string_adapter = yVarH7;
                            }
                            builderSBuilder.mEventName((String) yVarH7.read(aVar));
                            break;
                        default:
                            if (!"mImageResource".equals(strE)) {
                                aVar.Q();
                                break;
                            } else {
                                y yVarH8 = this.int__adapter;
                                if (yVarH8 == null) {
                                    yVarH8 = this.gson.h(Integer.class);
                                    this.int__adapter = yVarH8;
                                }
                                builderSBuilder.mImageResource(((Integer) yVarH8.read(aVar)).intValue());
                                break;
                            }
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
        public void write(b bVar, SecondaryFeature secondaryFeature) throws IOException {
            if (secondaryFeature == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m(TtmlNode.ATTR_ID);
            if (secondaryFeature.mId() == null) {
                bVar.r();
            } else {
                y yVarH = this.string_adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(String.class);
                    this.string_adapter = yVarH;
                }
                yVarH.write(bVar, secondaryFeature.mId());
            }
            bVar.m("label");
            if (secondaryFeature.mLabel() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.string_adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(String.class);
                    this.string_adapter = yVarH2;
                }
                yVarH2.write(bVar, secondaryFeature.mLabel());
            }
            bVar.m("uri");
            if (secondaryFeature.mUri() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.string_adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(String.class);
                    this.string_adapter = yVarH3;
                }
                yVarH3.write(bVar, secondaryFeature.mUri());
            }
            bVar.m("dynamic_status");
            if (secondaryFeature.mFeatureDynamicStatus() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.featureDynamicStatus_adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(FeatureDynamicStatus.class);
                    this.featureDynamicStatus_adapter = yVarH4;
                }
                yVarH4.write(bVar, secondaryFeature.mFeatureDynamicStatus());
            }
            bVar.m("event_name");
            if (secondaryFeature.mEventName() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.string_adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(String.class);
                    this.string_adapter = yVarH5;
                }
                yVarH5.write(bVar, secondaryFeature.mEventName());
            }
            bVar.m("is_kyc_required");
            if (secondaryFeature.mIsKycRequired() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.boolean__adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH6;
                }
                yVarH6.write(bVar, secondaryFeature.mIsKycRequired());
            }
            bVar.m("age_restricted");
            if (secondaryFeature.mAgeRestricted() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.ageRestricted_adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(AbstractC1259g.class);
                    this.ageRestricted_adapter = yVarH7;
                }
                yVarH7.write(bVar, secondaryFeature.mAgeRestricted());
            }
            bVar.m("mImageResource");
            y yVarH8 = this.int__adapter;
            if (yVarH8 == null) {
                yVarH8 = this.gson.h(Integer.class);
                this.int__adapter = yVarH8;
            }
            yVarH8.write(bVar, Integer.valueOf(secondaryFeature.mImageResource()));
            bVar.k();
        }
    }

    public AutoValue_SecondaryFeature(@Nullable String str, String str2, @Nullable String str3, @Nullable FeatureDynamicStatus featureDynamicStatus, @Nullable String str4, @Nullable Boolean bool, @Nullable AbstractC1259g abstractC1259g, int i) {
        new SecondaryFeature(str, str2, str3, featureDynamicStatus, str4, bool, abstractC1259g, i) { // from class: com.paymaya.domain.model.$AutoValue_SecondaryFeature
            private final AbstractC1259g mAgeRestricted;
            private final String mEventName;
            private final FeatureDynamicStatus mFeatureDynamicStatus;
            private final String mId;
            private final int mImageResource;
            private final Boolean mIsKycRequired;
            private final String mLabel;
            private final String mUri;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_SecondaryFeature$Builder */
            public static class Builder extends SecondaryFeature.Builder {
                private AbstractC1259g mAgeRestricted;
                private String mEventName;
                private FeatureDynamicStatus mFeatureDynamicStatus;
                private String mId;
                private Integer mImageResource;
                private Boolean mIsKycRequired;
                private String mLabel;
                private String mUri;

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature build() {
                    String strI = this.mLabel == null ? " mLabel" : "";
                    if (this.mImageResource == null) {
                        strI = s.i(strI, " mImageResource");
                    }
                    if (strI.isEmpty()) {
                        return new AutoValue_SecondaryFeature(this.mId, this.mLabel, this.mUri, this.mFeatureDynamicStatus, this.mEventName, this.mIsKycRequired, this.mAgeRestricted, this.mImageResource.intValue());
                    }
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mAgeRestricted(@Nullable AbstractC1259g abstractC1259g) {
                    this.mAgeRestricted = abstractC1259g;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mEventName(@Nullable String str) {
                    this.mEventName = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mFeatureDynamicStatus(@Nullable FeatureDynamicStatus featureDynamicStatus) {
                    this.mFeatureDynamicStatus = featureDynamicStatus;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mId(@Nullable String str) {
                    this.mId = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mImageResource(int i) {
                    this.mImageResource = Integer.valueOf(i);
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mIsKycRequired(@Nullable Boolean bool) {
                    this.mIsKycRequired = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mLabel(String str) {
                    if (str == null) {
                        throw new NullPointerException("Null mLabel");
                    }
                    this.mLabel = str;
                    return this;
                }

                @Override // com.paymaya.domain.model.SecondaryFeature.Builder
                public SecondaryFeature.Builder mUri(@Nullable String str) {
                    this.mUri = str;
                    return this;
                }
            }

            {
                this.mId = str;
                if (str2 == null) {
                    throw new NullPointerException("Null mLabel");
                }
                this.mLabel = str2;
                this.mUri = str3;
                this.mFeatureDynamicStatus = featureDynamicStatus;
                this.mEventName = str4;
                this.mIsKycRequired = bool;
                this.mAgeRestricted = abstractC1259g;
                this.mImageResource = i;
            }

            public boolean equals(Object obj) {
                String str5;
                FeatureDynamicStatus featureDynamicStatus2;
                String str6;
                Boolean bool2;
                AbstractC1259g abstractC1259g2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SecondaryFeature) {
                    SecondaryFeature secondaryFeature = (SecondaryFeature) obj;
                    String str7 = this.mId;
                    if (str7 != null ? str7.equals(secondaryFeature.mId()) : secondaryFeature.mId() == null) {
                        if (this.mLabel.equals(secondaryFeature.mLabel()) && ((str5 = this.mUri) != null ? str5.equals(secondaryFeature.mUri()) : secondaryFeature.mUri() == null) && ((featureDynamicStatus2 = this.mFeatureDynamicStatus) != null ? featureDynamicStatus2.equals(secondaryFeature.mFeatureDynamicStatus()) : secondaryFeature.mFeatureDynamicStatus() == null) && ((str6 = this.mEventName) != null ? str6.equals(secondaryFeature.mEventName()) : secondaryFeature.mEventName() == null) && ((bool2 = this.mIsKycRequired) != null ? bool2.equals(secondaryFeature.mIsKycRequired()) : secondaryFeature.mIsKycRequired() == null) && ((abstractC1259g2 = this.mAgeRestricted) != null ? abstractC1259g2.equals(secondaryFeature.mAgeRestricted()) : secondaryFeature.mAgeRestricted() == null) && this.mImageResource == secondaryFeature.mImageResource()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                String str5 = this.mId;
                int iHashCode = ((((str5 == null ? 0 : str5.hashCode()) ^ 1000003) * 1000003) ^ this.mLabel.hashCode()) * 1000003;
                String str6 = this.mUri;
                int iHashCode2 = (iHashCode ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                FeatureDynamicStatus featureDynamicStatus2 = this.mFeatureDynamicStatus;
                int iHashCode3 = (iHashCode2 ^ (featureDynamicStatus2 == null ? 0 : featureDynamicStatus2.hashCode())) * 1000003;
                String str7 = this.mEventName;
                int iHashCode4 = (iHashCode3 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                Boolean bool2 = this.mIsKycRequired;
                int iHashCode5 = (iHashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                AbstractC1259g abstractC1259g2 = this.mAgeRestricted;
                return ((iHashCode5 ^ (abstractC1259g2 != null ? abstractC1259g2.hashCode() : 0)) * 1000003) ^ this.mImageResource;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b("age_restricted")
            public AbstractC1259g mAgeRestricted() {
                return this.mAgeRestricted;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b("event_name")
            public String mEventName() {
                return this.mEventName;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b("dynamic_status")
            public FeatureDynamicStatus mFeatureDynamicStatus() {
                return this.mFeatureDynamicStatus;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b(TtmlNode.ATTR_ID)
            public String mId() {
                return this.mId;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            public int mImageResource() {
                return this.mImageResource;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b("is_kyc_required")
            public Boolean mIsKycRequired() {
                return this.mIsKycRequired;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @InterfaceC1498b("label")
            public String mLabel() {
                return this.mLabel;
            }

            @Override // com.paymaya.domain.model.SecondaryFeature
            @Nullable
            @InterfaceC1498b("uri")
            public String mUri() {
                return this.mUri;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SecondaryFeature{mId=");
                sb2.append(this.mId);
                sb2.append(", mLabel=");
                sb2.append(this.mLabel);
                sb2.append(", mUri=");
                sb2.append(this.mUri);
                sb2.append(", mFeatureDynamicStatus=");
                sb2.append(this.mFeatureDynamicStatus);
                sb2.append(", mEventName=");
                sb2.append(this.mEventName);
                sb2.append(", mIsKycRequired=");
                sb2.append(this.mIsKycRequired);
                sb2.append(", mAgeRestricted=");
                sb2.append(this.mAgeRestricted);
                sb2.append(", mImageResource=");
                return s.o(sb2, "}", this.mImageResource);
            }
        };
    }
}
