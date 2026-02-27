package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MayaEKycV6Config;
import g3.InterfaceC1498b;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_MayaEKycV6Config extends C$AutoValue_MayaEKycV6Config {

    public static final class GsonTypeAdapter extends y {
        private volatile y boolean__adapter;
        private final j gson;

        public GsonTypeAdapter(j jVar) {
            this.gson = jVar;
        }

        public String toString() {
            return "TypeAdapter(MayaEKycV6Config)";
        }

        @Override // com.google.gson.y
        public MayaEKycV6Config read(a aVar) throws IOException {
            if (aVar.peek() == 9) {
                aVar.G();
                return null;
            }
            aVar.c();
            MayaEKycV6Config.Builder builderSBuilder = MayaEKycV6Config.sBuilder();
            while (aVar.t()) {
                String strE = aVar.E();
                if (aVar.peek() != 9) {
                    strE.getClass();
                    switch (strE) {
                        case "shortened_flow_rekyc_android":
                            y yVarH = this.boolean__adapter;
                            if (yVarH == null) {
                                yVarH = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH;
                            }
                            builderSBuilder.mShortenedFlowReKyc((Boolean) yVarH.read(aVar));
                            break;
                        case "kyc_cmsv7_inject_tofu_fields":
                            y yVarH2 = this.boolean__adapter;
                            if (yVarH2 == null) {
                                yVarH2 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH2;
                            }
                            builderSBuilder.mKycCmsV7InjectTofuFields((Boolean) yVarH2.read(aVar));
                            break;
                        case "shortened_flow_back_id_capture_android":
                            y yVarH3 = this.boolean__adapter;
                            if (yVarH3 == null) {
                                yVarH3 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH3;
                            }
                            builderSBuilder.mShortenedFlowBackIdCapture((Boolean) yVarH3.read(aVar));
                            break;
                        case "kyc_ux_tofu_redesign_v1":
                            y yVarH4 = this.boolean__adapter;
                            if (yVarH4 == null) {
                                yVarH4 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH4;
                            }
                            builderSBuilder.mKycUxTofuRedesign((Boolean) yVarH4.read(aVar));
                            break;
                        case "shortened_flow_expanded_rekyc_android":
                            y yVarH5 = this.boolean__adapter;
                            if (yVarH5 == null) {
                                yVarH5 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH5;
                            }
                            builderSBuilder.mShortenedFlowExpandedReKyc((Boolean) yVarH5.read(aVar));
                            break;
                        case "shortened_flow_id_capture_v3_android":
                            y yVarH6 = this.boolean__adapter;
                            if (yVarH6 == null) {
                                yVarH6 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH6;
                            }
                            builderSBuilder.mShortenedFlowIdCaptureV3((Boolean) yVarH6.read(aVar));
                            break;
                        case "shortened_flow_secondary_id_capture_android":
                            y yVarH7 = this.boolean__adapter;
                            if (yVarH7 == null) {
                                yVarH7 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH7;
                            }
                            builderSBuilder.mShortenedFlowSecondaryIdCapture((Boolean) yVarH7.read(aVar));
                            break;
                        case "kyc_maintenance_android":
                            y yVarH8 = this.boolean__adapter;
                            if (yVarH8 == null) {
                                yVarH8 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH8;
                            }
                            builderSBuilder.mKycMaintenance((Boolean) yVarH8.read(aVar));
                            break;
                        case "shortened_flow_id_capture_v2_1080p_android":
                            y yVarH9 = this.boolean__adapter;
                            if (yVarH9 == null) {
                                yVarH9 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH9;
                            }
                            builderSBuilder.mShortenedFlowIdCaptureV21080p((Boolean) yVarH9.read(aVar));
                            break;
                        case "partner_onboarding_android":
                            y yVarH10 = this.boolean__adapter;
                            if (yVarH10 == null) {
                                yVarH10 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH10;
                            }
                            builderSBuilder.mPartnerOnboarding((Boolean) yVarH10.read(aVar));
                            break;
                        case "kyc_id_image_quality_v4_android":
                            y yVarH11 = this.boolean__adapter;
                            if (yVarH11 == null) {
                                yVarH11 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH11;
                            }
                            builderSBuilder.mKycImageQuality((Boolean) yVarH11.read(aVar));
                            break;
                        case "shortened_flow_address_dropdown_android":
                            y yVarH12 = this.boolean__adapter;
                            if (yVarH12 == null) {
                                yVarH12 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH12;
                            }
                            builderSBuilder.mShortenedFlowAddressDropdown((Boolean) yVarH12.read(aVar));
                            break;
                        case "force_ph_national_id_v2_android":
                            y yVarH13 = this.boolean__adapter;
                            if (yVarH13 == null) {
                                yVarH13 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH13;
                            }
                            builderSBuilder.mKycForcePhNationalId((Boolean) yVarH13.read(aVar));
                            break;
                        case "shortened_flow_id_capture_v2_android":
                            y yVarH14 = this.boolean__adapter;
                            if (yVarH14 == null) {
                                yVarH14 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH14;
                            }
                            builderSBuilder.mShortenedFlowIdCaptureV2((Boolean) yVarH14.read(aVar));
                            break;
                        case "shortened_flow_philsys_v2_android":
                            y yVarH15 = this.boolean__adapter;
                            if (yVarH15 == null) {
                                yVarH15 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH15;
                            }
                            builderSBuilder.mShortenedFlowPhilsys((Boolean) yVarH15.read(aVar));
                            break;
                        case "shortened_flow_upgrade_android":
                            y yVarH16 = this.boolean__adapter;
                            if (yVarH16 == null) {
                                yVarH16 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH16;
                            }
                            builderSBuilder.mShortenedFlowUpgrade((Boolean) yVarH16.read(aVar));
                            break;
                        case "shortened_flow_blur_detection_android":
                            y yVarH17 = this.boolean__adapter;
                            if (yVarH17 == null) {
                                yVarH17 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH17;
                            }
                            builderSBuilder.mShortenedFlowBlurDetection((Boolean) yVarH17.read(aVar));
                            break;
                        case "onboarding_and_kyc_flow_v2_android":
                            y yVarH18 = this.boolean__adapter;
                            if (yVarH18 == null) {
                                yVarH18 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH18;
                            }
                            builderSBuilder.mOnboardingAndKycFlowV2((Boolean) yVarH18.read(aVar));
                            break;
                        case "onboarding_and_kyc_flow_android":
                            y yVarH19 = this.boolean__adapter;
                            if (yVarH19 == null) {
                                yVarH19 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH19;
                            }
                            builderSBuilder.mOnboardingAndKycFlow((Boolean) yVarH19.read(aVar));
                            break;
                        case "shortened_flow_foreign_address_compliance_android":
                            y yVarH20 = this.boolean__adapter;
                            if (yVarH20 == null) {
                                yVarH20 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH20;
                            }
                            builderSBuilder.mShortenedFlowForeignAddressCompliance((Boolean) yVarH20.read(aVar));
                            break;
                        case "shortened_flow_show_other_id_android":
                            y yVarH21 = this.boolean__adapter;
                            if (yVarH21 == null) {
                                yVarH21 = this.gson.h(Boolean.class);
                                this.boolean__adapter = yVarH21;
                            }
                            builderSBuilder.mShortenedFlowShowOtherId((Boolean) yVarH21.read(aVar));
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
        public void write(b bVar, MayaEKycV6Config mayaEKycV6Config) throws IOException {
            if (mayaEKycV6Config == null) {
                bVar.r();
                return;
            }
            bVar.f();
            bVar.m("shortened_flow_upgrade_android");
            if (mayaEKycV6Config.mShortenedFlowUpgrade() == null) {
                bVar.r();
            } else {
                y yVarH = this.boolean__adapter;
                if (yVarH == null) {
                    yVarH = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH;
                }
                yVarH.write(bVar, mayaEKycV6Config.mShortenedFlowUpgrade());
            }
            bVar.m("shortened_flow_rekyc_android");
            if (mayaEKycV6Config.mShortenedFlowReKyc() == null) {
                bVar.r();
            } else {
                y yVarH2 = this.boolean__adapter;
                if (yVarH2 == null) {
                    yVarH2 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH2;
                }
                yVarH2.write(bVar, mayaEKycV6Config.mShortenedFlowReKyc());
            }
            bVar.m("shortened_flow_show_other_id_android");
            if (mayaEKycV6Config.mShortenedFlowShowOtherId() == null) {
                bVar.r();
            } else {
                y yVarH3 = this.boolean__adapter;
                if (yVarH3 == null) {
                    yVarH3 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH3;
                }
                yVarH3.write(bVar, mayaEKycV6Config.mShortenedFlowShowOtherId());
            }
            bVar.m("shortened_flow_id_capture_v2_android");
            if (mayaEKycV6Config.mShortenedFlowIdCaptureV2() == null) {
                bVar.r();
            } else {
                y yVarH4 = this.boolean__adapter;
                if (yVarH4 == null) {
                    yVarH4 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH4;
                }
                yVarH4.write(bVar, mayaEKycV6Config.mShortenedFlowIdCaptureV2());
            }
            bVar.m("shortened_flow_id_capture_v2_1080p_android");
            if (mayaEKycV6Config.mShortenedFlowIdCaptureV21080p() == null) {
                bVar.r();
            } else {
                y yVarH5 = this.boolean__adapter;
                if (yVarH5 == null) {
                    yVarH5 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH5;
                }
                yVarH5.write(bVar, mayaEKycV6Config.mShortenedFlowIdCaptureV21080p());
            }
            bVar.m("shortened_flow_id_capture_v3_android");
            if (mayaEKycV6Config.mShortenedFlowIdCaptureV3() == null) {
                bVar.r();
            } else {
                y yVarH6 = this.boolean__adapter;
                if (yVarH6 == null) {
                    yVarH6 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH6;
                }
                yVarH6.write(bVar, mayaEKycV6Config.mShortenedFlowIdCaptureV3());
            }
            bVar.m("shortened_flow_expanded_rekyc_android");
            if (mayaEKycV6Config.mShortenedFlowExpandedReKyc() == null) {
                bVar.r();
            } else {
                y yVarH7 = this.boolean__adapter;
                if (yVarH7 == null) {
                    yVarH7 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH7;
                }
                yVarH7.write(bVar, mayaEKycV6Config.mShortenedFlowExpandedReKyc());
            }
            bVar.m("shortened_flow_blur_detection_android");
            if (mayaEKycV6Config.mShortenedFlowBlurDetection() == null) {
                bVar.r();
            } else {
                y yVarH8 = this.boolean__adapter;
                if (yVarH8 == null) {
                    yVarH8 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH8;
                }
                yVarH8.write(bVar, mayaEKycV6Config.mShortenedFlowBlurDetection());
            }
            bVar.m("shortened_flow_back_id_capture_android");
            if (mayaEKycV6Config.mShortenedFlowBackIdCapture() == null) {
                bVar.r();
            } else {
                y yVarH9 = this.boolean__adapter;
                if (yVarH9 == null) {
                    yVarH9 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH9;
                }
                yVarH9.write(bVar, mayaEKycV6Config.mShortenedFlowBackIdCapture());
            }
            bVar.m("shortened_flow_secondary_id_capture_android");
            if (mayaEKycV6Config.mShortenedFlowSecondaryIdCapture() == null) {
                bVar.r();
            } else {
                y yVarH10 = this.boolean__adapter;
                if (yVarH10 == null) {
                    yVarH10 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH10;
                }
                yVarH10.write(bVar, mayaEKycV6Config.mShortenedFlowSecondaryIdCapture());
            }
            bVar.m("partner_onboarding_android");
            if (mayaEKycV6Config.mPartnerOnboarding() == null) {
                bVar.r();
            } else {
                y yVarH11 = this.boolean__adapter;
                if (yVarH11 == null) {
                    yVarH11 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH11;
                }
                yVarH11.write(bVar, mayaEKycV6Config.mPartnerOnboarding());
            }
            bVar.m("onboarding_and_kyc_flow_android");
            if (mayaEKycV6Config.mOnboardingAndKycFlow() == null) {
                bVar.r();
            } else {
                y yVarH12 = this.boolean__adapter;
                if (yVarH12 == null) {
                    yVarH12 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH12;
                }
                yVarH12.write(bVar, mayaEKycV6Config.mOnboardingAndKycFlow());
            }
            bVar.m("onboarding_and_kyc_flow_v2_android");
            if (mayaEKycV6Config.mOnboardingAndKycFlowV2() == null) {
                bVar.r();
            } else {
                y yVarH13 = this.boolean__adapter;
                if (yVarH13 == null) {
                    yVarH13 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH13;
                }
                yVarH13.write(bVar, mayaEKycV6Config.mOnboardingAndKycFlowV2());
            }
            bVar.m("kyc_maintenance_android");
            if (mayaEKycV6Config.mKycMaintenance() == null) {
                bVar.r();
            } else {
                y yVarH14 = this.boolean__adapter;
                if (yVarH14 == null) {
                    yVarH14 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH14;
                }
                yVarH14.write(bVar, mayaEKycV6Config.mKycMaintenance());
            }
            bVar.m("shortened_flow_address_dropdown_android");
            if (mayaEKycV6Config.mShortenedFlowAddressDropdown() == null) {
                bVar.r();
            } else {
                y yVarH15 = this.boolean__adapter;
                if (yVarH15 == null) {
                    yVarH15 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH15;
                }
                yVarH15.write(bVar, mayaEKycV6Config.mShortenedFlowAddressDropdown());
            }
            bVar.m("shortened_flow_foreign_address_compliance_android");
            if (mayaEKycV6Config.mShortenedFlowForeignAddressCompliance() == null) {
                bVar.r();
            } else {
                y yVarH16 = this.boolean__adapter;
                if (yVarH16 == null) {
                    yVarH16 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH16;
                }
                yVarH16.write(bVar, mayaEKycV6Config.mShortenedFlowForeignAddressCompliance());
            }
            bVar.m("shortened_flow_philsys_v2_android");
            if (mayaEKycV6Config.mShortenedFlowPhilsys() == null) {
                bVar.r();
            } else {
                y yVarH17 = this.boolean__adapter;
                if (yVarH17 == null) {
                    yVarH17 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH17;
                }
                yVarH17.write(bVar, mayaEKycV6Config.mShortenedFlowPhilsys());
            }
            bVar.m("force_ph_national_id_v2_android");
            if (mayaEKycV6Config.mKycForcePhNationalId() == null) {
                bVar.r();
            } else {
                y yVarH18 = this.boolean__adapter;
                if (yVarH18 == null) {
                    yVarH18 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH18;
                }
                yVarH18.write(bVar, mayaEKycV6Config.mKycForcePhNationalId());
            }
            bVar.m("kyc_id_image_quality_v4_android");
            if (mayaEKycV6Config.mKycImageQuality() == null) {
                bVar.r();
            } else {
                y yVarH19 = this.boolean__adapter;
                if (yVarH19 == null) {
                    yVarH19 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH19;
                }
                yVarH19.write(bVar, mayaEKycV6Config.mKycImageQuality());
            }
            bVar.m("kyc_cmsv7_inject_tofu_fields");
            if (mayaEKycV6Config.mKycCmsV7InjectTofuFields() == null) {
                bVar.r();
            } else {
                y yVarH20 = this.boolean__adapter;
                if (yVarH20 == null) {
                    yVarH20 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH20;
                }
                yVarH20.write(bVar, mayaEKycV6Config.mKycCmsV7InjectTofuFields());
            }
            bVar.m("kyc_ux_tofu_redesign_v1");
            if (mayaEKycV6Config.mKycUxTofuRedesign() == null) {
                bVar.r();
            } else {
                y yVarH21 = this.boolean__adapter;
                if (yVarH21 == null) {
                    yVarH21 = this.gson.h(Boolean.class);
                    this.boolean__adapter = yVarH21;
                }
                yVarH21.write(bVar, mayaEKycV6Config.mKycUxTofuRedesign());
            }
            bVar.k();
        }
    }

    public AutoValue_MayaEKycV6Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21) {
        new MayaEKycV6Config(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21) { // from class: com.paymaya.domain.model.$AutoValue_MayaEKycV6Config
            private final Boolean mKycCmsV7InjectTofuFields;
            private final Boolean mKycForcePhNationalId;
            private final Boolean mKycImageQuality;
            private final Boolean mKycMaintenance;
            private final Boolean mKycUxTofuRedesign;
            private final Boolean mOnboardingAndKycFlow;
            private final Boolean mOnboardingAndKycFlowV2;
            private final Boolean mPartnerOnboarding;
            private final Boolean mShortenedFlowAddressDropdown;
            private final Boolean mShortenedFlowBackIdCapture;
            private final Boolean mShortenedFlowBlurDetection;
            private final Boolean mShortenedFlowExpandedReKyc;
            private final Boolean mShortenedFlowForeignAddressCompliance;
            private final Boolean mShortenedFlowIdCaptureV2;
            private final Boolean mShortenedFlowIdCaptureV21080p;
            private final Boolean mShortenedFlowIdCaptureV3;
            private final Boolean mShortenedFlowPhilsys;
            private final Boolean mShortenedFlowReKyc;
            private final Boolean mShortenedFlowSecondaryIdCapture;
            private final Boolean mShortenedFlowShowOtherId;
            private final Boolean mShortenedFlowUpgrade;

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_MayaEKycV6Config$Builder */
            public static class Builder extends MayaEKycV6Config.Builder {
                private Boolean mKycCmsV7InjectTofuFields;
                private Boolean mKycForcePhNationalId;
                private Boolean mKycImageQuality;
                private Boolean mKycMaintenance;
                private Boolean mKycUxTofuRedesign;
                private Boolean mOnboardingAndKycFlow;
                private Boolean mOnboardingAndKycFlowV2;
                private Boolean mPartnerOnboarding;
                private Boolean mShortenedFlowAddressDropdown;
                private Boolean mShortenedFlowBackIdCapture;
                private Boolean mShortenedFlowBlurDetection;
                private Boolean mShortenedFlowExpandedReKyc;
                private Boolean mShortenedFlowForeignAddressCompliance;
                private Boolean mShortenedFlowIdCaptureV2;
                private Boolean mShortenedFlowIdCaptureV21080p;
                private Boolean mShortenedFlowIdCaptureV3;
                private Boolean mShortenedFlowPhilsys;
                private Boolean mShortenedFlowReKyc;
                private Boolean mShortenedFlowSecondaryIdCapture;
                private Boolean mShortenedFlowShowOtherId;
                private Boolean mShortenedFlowUpgrade;

                public /* synthetic */ Builder(MayaEKycV6Config mayaEKycV6Config, int i) {
                    this(mayaEKycV6Config);
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config build() {
                    return new AutoValue_MayaEKycV6Config(this.mShortenedFlowUpgrade, this.mShortenedFlowReKyc, this.mShortenedFlowShowOtherId, this.mShortenedFlowIdCaptureV2, this.mShortenedFlowIdCaptureV21080p, this.mShortenedFlowIdCaptureV3, this.mShortenedFlowExpandedReKyc, this.mShortenedFlowBlurDetection, this.mShortenedFlowBackIdCapture, this.mShortenedFlowSecondaryIdCapture, this.mPartnerOnboarding, this.mOnboardingAndKycFlow, this.mOnboardingAndKycFlowV2, this.mKycMaintenance, this.mShortenedFlowAddressDropdown, this.mShortenedFlowForeignAddressCompliance, this.mShortenedFlowPhilsys, this.mKycForcePhNationalId, this.mKycImageQuality, this.mKycCmsV7InjectTofuFields, this.mKycUxTofuRedesign);
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mKycCmsV7InjectTofuFields(Boolean bool) {
                    this.mKycCmsV7InjectTofuFields = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mKycForcePhNationalId(Boolean bool) {
                    this.mKycForcePhNationalId = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mKycImageQuality(Boolean bool) {
                    this.mKycImageQuality = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mKycMaintenance(Boolean bool) {
                    this.mKycMaintenance = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mKycUxTofuRedesign(Boolean bool) {
                    this.mKycUxTofuRedesign = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mOnboardingAndKycFlow(Boolean bool) {
                    this.mOnboardingAndKycFlow = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mOnboardingAndKycFlowV2(Boolean bool) {
                    this.mOnboardingAndKycFlowV2 = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mPartnerOnboarding(Boolean bool) {
                    this.mPartnerOnboarding = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowAddressDropdown(Boolean bool) {
                    this.mShortenedFlowAddressDropdown = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowBackIdCapture(Boolean bool) {
                    this.mShortenedFlowBackIdCapture = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowBlurDetection(Boolean bool) {
                    this.mShortenedFlowBlurDetection = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowExpandedReKyc(Boolean bool) {
                    this.mShortenedFlowExpandedReKyc = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowForeignAddressCompliance(Boolean bool) {
                    this.mShortenedFlowForeignAddressCompliance = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowIdCaptureV2(Boolean bool) {
                    this.mShortenedFlowIdCaptureV2 = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowIdCaptureV21080p(Boolean bool) {
                    this.mShortenedFlowIdCaptureV21080p = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowIdCaptureV3(Boolean bool) {
                    this.mShortenedFlowIdCaptureV3 = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowPhilsys(Boolean bool) {
                    this.mShortenedFlowPhilsys = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowReKyc(Boolean bool) {
                    this.mShortenedFlowReKyc = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowSecondaryIdCapture(Boolean bool) {
                    this.mShortenedFlowSecondaryIdCapture = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowShowOtherId(Boolean bool) {
                    this.mShortenedFlowShowOtherId = bool;
                    return this;
                }

                @Override // com.paymaya.domain.model.MayaEKycV6Config.Builder
                public MayaEKycV6Config.Builder mShortenedFlowUpgrade(Boolean bool) {
                    this.mShortenedFlowUpgrade = bool;
                    return this;
                }

                public Builder() {
                }

                private Builder(MayaEKycV6Config mayaEKycV6Config) {
                    this.mShortenedFlowUpgrade = mayaEKycV6Config.mShortenedFlowUpgrade();
                    this.mShortenedFlowReKyc = mayaEKycV6Config.mShortenedFlowReKyc();
                    this.mShortenedFlowShowOtherId = mayaEKycV6Config.mShortenedFlowShowOtherId();
                    this.mShortenedFlowIdCaptureV2 = mayaEKycV6Config.mShortenedFlowIdCaptureV2();
                    this.mShortenedFlowIdCaptureV21080p = mayaEKycV6Config.mShortenedFlowIdCaptureV21080p();
                    this.mShortenedFlowIdCaptureV3 = mayaEKycV6Config.mShortenedFlowIdCaptureV3();
                    this.mShortenedFlowExpandedReKyc = mayaEKycV6Config.mShortenedFlowExpandedReKyc();
                    this.mShortenedFlowBlurDetection = mayaEKycV6Config.mShortenedFlowBlurDetection();
                    this.mShortenedFlowBackIdCapture = mayaEKycV6Config.mShortenedFlowBackIdCapture();
                    this.mShortenedFlowSecondaryIdCapture = mayaEKycV6Config.mShortenedFlowSecondaryIdCapture();
                    this.mPartnerOnboarding = mayaEKycV6Config.mPartnerOnboarding();
                    this.mOnboardingAndKycFlow = mayaEKycV6Config.mOnboardingAndKycFlow();
                    this.mOnboardingAndKycFlowV2 = mayaEKycV6Config.mOnboardingAndKycFlowV2();
                    this.mKycMaintenance = mayaEKycV6Config.mKycMaintenance();
                    this.mShortenedFlowAddressDropdown = mayaEKycV6Config.mShortenedFlowAddressDropdown();
                    this.mShortenedFlowForeignAddressCompliance = mayaEKycV6Config.mShortenedFlowForeignAddressCompliance();
                    this.mShortenedFlowPhilsys = mayaEKycV6Config.mShortenedFlowPhilsys();
                    this.mKycForcePhNationalId = mayaEKycV6Config.mKycForcePhNationalId();
                    this.mKycImageQuality = mayaEKycV6Config.mKycImageQuality();
                    this.mKycCmsV7InjectTofuFields = mayaEKycV6Config.mKycCmsV7InjectTofuFields();
                    this.mKycUxTofuRedesign = mayaEKycV6Config.mKycUxTofuRedesign();
                }
            }

            {
                this.mShortenedFlowUpgrade = bool;
                this.mShortenedFlowReKyc = bool2;
                this.mShortenedFlowShowOtherId = bool3;
                this.mShortenedFlowIdCaptureV2 = bool4;
                this.mShortenedFlowIdCaptureV21080p = bool5;
                this.mShortenedFlowIdCaptureV3 = bool6;
                this.mShortenedFlowExpandedReKyc = bool7;
                this.mShortenedFlowBlurDetection = bool8;
                this.mShortenedFlowBackIdCapture = bool9;
                this.mShortenedFlowSecondaryIdCapture = bool10;
                this.mPartnerOnboarding = bool11;
                this.mOnboardingAndKycFlow = bool12;
                this.mOnboardingAndKycFlowV2 = bool13;
                this.mKycMaintenance = bool14;
                this.mShortenedFlowAddressDropdown = bool15;
                this.mShortenedFlowForeignAddressCompliance = bool16;
                this.mShortenedFlowPhilsys = bool17;
                this.mKycForcePhNationalId = bool18;
                this.mKycImageQuality = bool19;
                this.mKycCmsV7InjectTofuFields = bool20;
                this.mKycUxTofuRedesign = bool21;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof MayaEKycV6Config) {
                    MayaEKycV6Config mayaEKycV6Config = (MayaEKycV6Config) obj;
                    Boolean bool22 = this.mShortenedFlowUpgrade;
                    if (bool22 != null ? bool22.equals(mayaEKycV6Config.mShortenedFlowUpgrade()) : mayaEKycV6Config.mShortenedFlowUpgrade() == null) {
                        Boolean bool23 = this.mShortenedFlowReKyc;
                        if (bool23 != null ? bool23.equals(mayaEKycV6Config.mShortenedFlowReKyc()) : mayaEKycV6Config.mShortenedFlowReKyc() == null) {
                            Boolean bool24 = this.mShortenedFlowShowOtherId;
                            if (bool24 != null ? bool24.equals(mayaEKycV6Config.mShortenedFlowShowOtherId()) : mayaEKycV6Config.mShortenedFlowShowOtherId() == null) {
                                Boolean bool25 = this.mShortenedFlowIdCaptureV2;
                                if (bool25 != null ? bool25.equals(mayaEKycV6Config.mShortenedFlowIdCaptureV2()) : mayaEKycV6Config.mShortenedFlowIdCaptureV2() == null) {
                                    Boolean bool26 = this.mShortenedFlowIdCaptureV21080p;
                                    if (bool26 != null ? bool26.equals(mayaEKycV6Config.mShortenedFlowIdCaptureV21080p()) : mayaEKycV6Config.mShortenedFlowIdCaptureV21080p() == null) {
                                        Boolean bool27 = this.mShortenedFlowIdCaptureV3;
                                        if (bool27 != null ? bool27.equals(mayaEKycV6Config.mShortenedFlowIdCaptureV3()) : mayaEKycV6Config.mShortenedFlowIdCaptureV3() == null) {
                                            Boolean bool28 = this.mShortenedFlowExpandedReKyc;
                                            if (bool28 != null ? bool28.equals(mayaEKycV6Config.mShortenedFlowExpandedReKyc()) : mayaEKycV6Config.mShortenedFlowExpandedReKyc() == null) {
                                                Boolean bool29 = this.mShortenedFlowBlurDetection;
                                                if (bool29 != null ? bool29.equals(mayaEKycV6Config.mShortenedFlowBlurDetection()) : mayaEKycV6Config.mShortenedFlowBlurDetection() == null) {
                                                    Boolean bool30 = this.mShortenedFlowBackIdCapture;
                                                    if (bool30 != null ? bool30.equals(mayaEKycV6Config.mShortenedFlowBackIdCapture()) : mayaEKycV6Config.mShortenedFlowBackIdCapture() == null) {
                                                        Boolean bool31 = this.mShortenedFlowSecondaryIdCapture;
                                                        if (bool31 != null ? bool31.equals(mayaEKycV6Config.mShortenedFlowSecondaryIdCapture()) : mayaEKycV6Config.mShortenedFlowSecondaryIdCapture() == null) {
                                                            Boolean bool32 = this.mPartnerOnboarding;
                                                            if (bool32 != null ? bool32.equals(mayaEKycV6Config.mPartnerOnboarding()) : mayaEKycV6Config.mPartnerOnboarding() == null) {
                                                                Boolean bool33 = this.mOnboardingAndKycFlow;
                                                                if (bool33 != null ? bool33.equals(mayaEKycV6Config.mOnboardingAndKycFlow()) : mayaEKycV6Config.mOnboardingAndKycFlow() == null) {
                                                                    Boolean bool34 = this.mOnboardingAndKycFlowV2;
                                                                    if (bool34 != null ? bool34.equals(mayaEKycV6Config.mOnboardingAndKycFlowV2()) : mayaEKycV6Config.mOnboardingAndKycFlowV2() == null) {
                                                                        Boolean bool35 = this.mKycMaintenance;
                                                                        if (bool35 != null ? bool35.equals(mayaEKycV6Config.mKycMaintenance()) : mayaEKycV6Config.mKycMaintenance() == null) {
                                                                            Boolean bool36 = this.mShortenedFlowAddressDropdown;
                                                                            if (bool36 != null ? bool36.equals(mayaEKycV6Config.mShortenedFlowAddressDropdown()) : mayaEKycV6Config.mShortenedFlowAddressDropdown() == null) {
                                                                                Boolean bool37 = this.mShortenedFlowForeignAddressCompliance;
                                                                                if (bool37 != null ? bool37.equals(mayaEKycV6Config.mShortenedFlowForeignAddressCompliance()) : mayaEKycV6Config.mShortenedFlowForeignAddressCompliance() == null) {
                                                                                    Boolean bool38 = this.mShortenedFlowPhilsys;
                                                                                    if (bool38 != null ? bool38.equals(mayaEKycV6Config.mShortenedFlowPhilsys()) : mayaEKycV6Config.mShortenedFlowPhilsys() == null) {
                                                                                        Boolean bool39 = this.mKycForcePhNationalId;
                                                                                        if (bool39 != null ? bool39.equals(mayaEKycV6Config.mKycForcePhNationalId()) : mayaEKycV6Config.mKycForcePhNationalId() == null) {
                                                                                            Boolean bool40 = this.mKycImageQuality;
                                                                                            if (bool40 != null ? bool40.equals(mayaEKycV6Config.mKycImageQuality()) : mayaEKycV6Config.mKycImageQuality() == null) {
                                                                                                Boolean bool41 = this.mKycCmsV7InjectTofuFields;
                                                                                                if (bool41 != null ? bool41.equals(mayaEKycV6Config.mKycCmsV7InjectTofuFields()) : mayaEKycV6Config.mKycCmsV7InjectTofuFields() == null) {
                                                                                                    Boolean bool42 = this.mKycUxTofuRedesign;
                                                                                                    if (bool42 != null ? bool42.equals(mayaEKycV6Config.mKycUxTofuRedesign()) : mayaEKycV6Config.mKycUxTofuRedesign() == null) {
                                                                                                        return true;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                Boolean bool22 = this.mShortenedFlowUpgrade;
                int iHashCode = ((bool22 == null ? 0 : bool22.hashCode()) ^ 1000003) * 1000003;
                Boolean bool23 = this.mShortenedFlowReKyc;
                int iHashCode2 = (iHashCode ^ (bool23 == null ? 0 : bool23.hashCode())) * 1000003;
                Boolean bool24 = this.mShortenedFlowShowOtherId;
                int iHashCode3 = (iHashCode2 ^ (bool24 == null ? 0 : bool24.hashCode())) * 1000003;
                Boolean bool25 = this.mShortenedFlowIdCaptureV2;
                int iHashCode4 = (iHashCode3 ^ (bool25 == null ? 0 : bool25.hashCode())) * 1000003;
                Boolean bool26 = this.mShortenedFlowIdCaptureV21080p;
                int iHashCode5 = (iHashCode4 ^ (bool26 == null ? 0 : bool26.hashCode())) * 1000003;
                Boolean bool27 = this.mShortenedFlowIdCaptureV3;
                int iHashCode6 = (iHashCode5 ^ (bool27 == null ? 0 : bool27.hashCode())) * 1000003;
                Boolean bool28 = this.mShortenedFlowExpandedReKyc;
                int iHashCode7 = (iHashCode6 ^ (bool28 == null ? 0 : bool28.hashCode())) * 1000003;
                Boolean bool29 = this.mShortenedFlowBlurDetection;
                int iHashCode8 = (iHashCode7 ^ (bool29 == null ? 0 : bool29.hashCode())) * 1000003;
                Boolean bool30 = this.mShortenedFlowBackIdCapture;
                int iHashCode9 = (iHashCode8 ^ (bool30 == null ? 0 : bool30.hashCode())) * 1000003;
                Boolean bool31 = this.mShortenedFlowSecondaryIdCapture;
                int iHashCode10 = (iHashCode9 ^ (bool31 == null ? 0 : bool31.hashCode())) * 1000003;
                Boolean bool32 = this.mPartnerOnboarding;
                int iHashCode11 = (iHashCode10 ^ (bool32 == null ? 0 : bool32.hashCode())) * 1000003;
                Boolean bool33 = this.mOnboardingAndKycFlow;
                int iHashCode12 = (iHashCode11 ^ (bool33 == null ? 0 : bool33.hashCode())) * 1000003;
                Boolean bool34 = this.mOnboardingAndKycFlowV2;
                int iHashCode13 = (iHashCode12 ^ (bool34 == null ? 0 : bool34.hashCode())) * 1000003;
                Boolean bool35 = this.mKycMaintenance;
                int iHashCode14 = (iHashCode13 ^ (bool35 == null ? 0 : bool35.hashCode())) * 1000003;
                Boolean bool36 = this.mShortenedFlowAddressDropdown;
                int iHashCode15 = (iHashCode14 ^ (bool36 == null ? 0 : bool36.hashCode())) * 1000003;
                Boolean bool37 = this.mShortenedFlowForeignAddressCompliance;
                int iHashCode16 = (iHashCode15 ^ (bool37 == null ? 0 : bool37.hashCode())) * 1000003;
                Boolean bool38 = this.mShortenedFlowPhilsys;
                int iHashCode17 = (iHashCode16 ^ (bool38 == null ? 0 : bool38.hashCode())) * 1000003;
                Boolean bool39 = this.mKycForcePhNationalId;
                int iHashCode18 = (iHashCode17 ^ (bool39 == null ? 0 : bool39.hashCode())) * 1000003;
                Boolean bool40 = this.mKycImageQuality;
                int iHashCode19 = (iHashCode18 ^ (bool40 == null ? 0 : bool40.hashCode())) * 1000003;
                Boolean bool41 = this.mKycCmsV7InjectTofuFields;
                int iHashCode20 = (iHashCode19 ^ (bool41 == null ? 0 : bool41.hashCode())) * 1000003;
                Boolean bool42 = this.mKycUxTofuRedesign;
                return iHashCode20 ^ (bool42 != null ? bool42.hashCode() : 0);
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("kyc_cmsv7_inject_tofu_fields")
            public Boolean mKycCmsV7InjectTofuFields() {
                return this.mKycCmsV7InjectTofuFields;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("force_ph_national_id_v2_android")
            public Boolean mKycForcePhNationalId() {
                return this.mKycForcePhNationalId;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("kyc_id_image_quality_v4_android")
            public Boolean mKycImageQuality() {
                return this.mKycImageQuality;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("kyc_maintenance_android")
            public Boolean mKycMaintenance() {
                return this.mKycMaintenance;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("kyc_ux_tofu_redesign_v1")
            public Boolean mKycUxTofuRedesign() {
                return this.mKycUxTofuRedesign;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("onboarding_and_kyc_flow_android")
            public Boolean mOnboardingAndKycFlow() {
                return this.mOnboardingAndKycFlow;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("onboarding_and_kyc_flow_v2_android")
            public Boolean mOnboardingAndKycFlowV2() {
                return this.mOnboardingAndKycFlowV2;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("partner_onboarding_android")
            public Boolean mPartnerOnboarding() {
                return this.mPartnerOnboarding;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_address_dropdown_android")
            public Boolean mShortenedFlowAddressDropdown() {
                return this.mShortenedFlowAddressDropdown;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_back_id_capture_android")
            public Boolean mShortenedFlowBackIdCapture() {
                return this.mShortenedFlowBackIdCapture;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_blur_detection_android")
            public Boolean mShortenedFlowBlurDetection() {
                return this.mShortenedFlowBlurDetection;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_expanded_rekyc_android")
            public Boolean mShortenedFlowExpandedReKyc() {
                return this.mShortenedFlowExpandedReKyc;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_foreign_address_compliance_android")
            public Boolean mShortenedFlowForeignAddressCompliance() {
                return this.mShortenedFlowForeignAddressCompliance;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_id_capture_v2_android")
            public Boolean mShortenedFlowIdCaptureV2() {
                return this.mShortenedFlowIdCaptureV2;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_id_capture_v2_1080p_android")
            public Boolean mShortenedFlowIdCaptureV21080p() {
                return this.mShortenedFlowIdCaptureV21080p;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_id_capture_v3_android")
            public Boolean mShortenedFlowIdCaptureV3() {
                return this.mShortenedFlowIdCaptureV3;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_philsys_v2_android")
            public Boolean mShortenedFlowPhilsys() {
                return this.mShortenedFlowPhilsys;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_rekyc_android")
            public Boolean mShortenedFlowReKyc() {
                return this.mShortenedFlowReKyc;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_secondary_id_capture_android")
            public Boolean mShortenedFlowSecondaryIdCapture() {
                return this.mShortenedFlowSecondaryIdCapture;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_show_other_id_android")
            public Boolean mShortenedFlowShowOtherId() {
                return this.mShortenedFlowShowOtherId;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            @InterfaceC1498b("shortened_flow_upgrade_android")
            public Boolean mShortenedFlowUpgrade() {
                return this.mShortenedFlowUpgrade;
            }

            @Override // com.paymaya.domain.model.MayaEKycV6Config
            public MayaEKycV6Config.Builder toBuilder() {
                return new Builder(this, 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("MayaEKycV6Config{mShortenedFlowUpgrade=");
                sb2.append(this.mShortenedFlowUpgrade);
                sb2.append(", mShortenedFlowReKyc=");
                sb2.append(this.mShortenedFlowReKyc);
                sb2.append(", mShortenedFlowShowOtherId=");
                sb2.append(this.mShortenedFlowShowOtherId);
                sb2.append(", mShortenedFlowIdCaptureV2=");
                sb2.append(this.mShortenedFlowIdCaptureV2);
                sb2.append(", mShortenedFlowIdCaptureV21080p=");
                sb2.append(this.mShortenedFlowIdCaptureV21080p);
                sb2.append(", mShortenedFlowIdCaptureV3=");
                sb2.append(this.mShortenedFlowIdCaptureV3);
                sb2.append(", mShortenedFlowExpandedReKyc=");
                sb2.append(this.mShortenedFlowExpandedReKyc);
                sb2.append(", mShortenedFlowBlurDetection=");
                sb2.append(this.mShortenedFlowBlurDetection);
                sb2.append(", mShortenedFlowBackIdCapture=");
                sb2.append(this.mShortenedFlowBackIdCapture);
                sb2.append(", mShortenedFlowSecondaryIdCapture=");
                sb2.append(this.mShortenedFlowSecondaryIdCapture);
                sb2.append(", mPartnerOnboarding=");
                sb2.append(this.mPartnerOnboarding);
                sb2.append(", mOnboardingAndKycFlow=");
                sb2.append(this.mOnboardingAndKycFlow);
                sb2.append(", mOnboardingAndKycFlowV2=");
                sb2.append(this.mOnboardingAndKycFlowV2);
                sb2.append(", mKycMaintenance=");
                sb2.append(this.mKycMaintenance);
                sb2.append(", mShortenedFlowAddressDropdown=");
                sb2.append(this.mShortenedFlowAddressDropdown);
                sb2.append(", mShortenedFlowForeignAddressCompliance=");
                sb2.append(this.mShortenedFlowForeignAddressCompliance);
                sb2.append(", mShortenedFlowPhilsys=");
                sb2.append(this.mShortenedFlowPhilsys);
                sb2.append(", mKycForcePhNationalId=");
                sb2.append(this.mKycForcePhNationalId);
                sb2.append(", mKycImageQuality=");
                sb2.append(this.mKycImageQuality);
                sb2.append(", mKycCmsV7InjectTofuFields=");
                sb2.append(this.mKycCmsV7InjectTofuFields);
                sb2.append(", mKycUxTofuRedesign=");
                return AbstractC1213b.N(sb2, this.mKycUxTofuRedesign, "}");
            }
        };
    }
}
