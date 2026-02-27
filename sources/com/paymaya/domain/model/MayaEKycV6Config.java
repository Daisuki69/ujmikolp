package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaEKycV6Config;
import com.paymaya.domain.model.C$AutoValue_MayaEKycV6Config;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaEKycV6Config {
    public static final Companion Companion = new Companion(null);

    public static abstract class Builder {
        public abstract MayaEKycV6Config build();

        public abstract Builder mKycCmsV7InjectTofuFields(Boolean bool);

        public abstract Builder mKycForcePhNationalId(Boolean bool);

        public abstract Builder mKycImageQuality(Boolean bool);

        public abstract Builder mKycMaintenance(Boolean bool);

        public abstract Builder mKycUxTofuRedesign(Boolean bool);

        public abstract Builder mOnboardingAndKycFlow(Boolean bool);

        public abstract Builder mOnboardingAndKycFlowV2(Boolean bool);

        public abstract Builder mPartnerOnboarding(Boolean bool);

        public abstract Builder mShortenedFlowAddressDropdown(Boolean bool);

        public abstract Builder mShortenedFlowBackIdCapture(Boolean bool);

        public abstract Builder mShortenedFlowBlurDetection(Boolean bool);

        public abstract Builder mShortenedFlowExpandedReKyc(Boolean bool);

        public abstract Builder mShortenedFlowForeignAddressCompliance(Boolean bool);

        public abstract Builder mShortenedFlowIdCaptureV2(Boolean bool);

        public abstract Builder mShortenedFlowIdCaptureV21080p(Boolean bool);

        public abstract Builder mShortenedFlowIdCaptureV3(Boolean bool);

        public abstract Builder mShortenedFlowPhilsys(Boolean bool);

        public abstract Builder mShortenedFlowReKyc(Boolean bool);

        public abstract Builder mShortenedFlowSecondaryIdCapture(Boolean bool);

        public abstract Builder mShortenedFlowShowOtherId(Boolean bool);

        public abstract Builder mShortenedFlowUpgrade(Boolean bool);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder sBuilder() {
            C$AutoValue_MayaEKycV6Config.Builder builder = new C$AutoValue_MayaEKycV6Config.Builder();
            Boolean bool = Boolean.FALSE;
            return builder.mShortenedFlowUpgrade(bool).mShortenedFlowReKyc(bool).mShortenedFlowShowOtherId(bool).mShortenedFlowIdCaptureV2(bool).mShortenedFlowIdCaptureV21080p(bool).mShortenedFlowIdCaptureV3(bool).mShortenedFlowExpandedReKyc(bool).mShortenedFlowBlurDetection(bool).mShortenedFlowBackIdCapture(bool).mShortenedFlowSecondaryIdCapture(bool).mPartnerOnboarding(bool).mOnboardingAndKycFlow(bool).mOnboardingAndKycFlowV2(bool).mKycMaintenance(bool).mShortenedFlowAddressDropdown(bool).mShortenedFlowForeignAddressCompliance(bool).mShortenedFlowPhilsys(bool).mKycForcePhNationalId(bool).mKycImageQuality(bool).mKycCmsV7InjectTofuFields(bool).mKycUxTofuRedesign(bool);
        }

        public final y typeAdapter(j gson) {
            kotlin.jvm.internal.j.g(gson, "gson");
            return new AutoValue_MayaEKycV6Config.GsonTypeAdapter(gson);
        }

        private Companion() {
        }
    }

    public static final Builder sBuilder() {
        return Companion.sBuilder();
    }

    public static final y typeAdapter(j jVar) {
        return Companion.typeAdapter(jVar);
    }

    @InterfaceC1498b("kyc_cmsv7_inject_tofu_fields")
    public abstract Boolean mKycCmsV7InjectTofuFields();

    @InterfaceC1498b("force_ph_national_id_v2_android")
    public abstract Boolean mKycForcePhNationalId();

    @InterfaceC1498b("kyc_id_image_quality_v4_android")
    public abstract Boolean mKycImageQuality();

    @InterfaceC1498b("kyc_maintenance_android")
    public abstract Boolean mKycMaintenance();

    @InterfaceC1498b("kyc_ux_tofu_redesign_v1")
    public abstract Boolean mKycUxTofuRedesign();

    @InterfaceC1498b("onboarding_and_kyc_flow_android")
    public abstract Boolean mOnboardingAndKycFlow();

    @InterfaceC1498b("onboarding_and_kyc_flow_v2_android")
    public abstract Boolean mOnboardingAndKycFlowV2();

    @InterfaceC1498b("partner_onboarding_android")
    public abstract Boolean mPartnerOnboarding();

    @InterfaceC1498b("shortened_flow_address_dropdown_android")
    public abstract Boolean mShortenedFlowAddressDropdown();

    @InterfaceC1498b("shortened_flow_back_id_capture_android")
    public abstract Boolean mShortenedFlowBackIdCapture();

    @InterfaceC1498b("shortened_flow_blur_detection_android")
    public abstract Boolean mShortenedFlowBlurDetection();

    @InterfaceC1498b("shortened_flow_expanded_rekyc_android")
    public abstract Boolean mShortenedFlowExpandedReKyc();

    @InterfaceC1498b("shortened_flow_foreign_address_compliance_android")
    public abstract Boolean mShortenedFlowForeignAddressCompliance();

    @InterfaceC1498b("shortened_flow_id_capture_v2_android")
    public abstract Boolean mShortenedFlowIdCaptureV2();

    @InterfaceC1498b("shortened_flow_id_capture_v2_1080p_android")
    public abstract Boolean mShortenedFlowIdCaptureV21080p();

    @InterfaceC1498b("shortened_flow_id_capture_v3_android")
    public abstract Boolean mShortenedFlowIdCaptureV3();

    @InterfaceC1498b("shortened_flow_philsys_v2_android")
    public abstract Boolean mShortenedFlowPhilsys();

    @InterfaceC1498b("shortened_flow_rekyc_android")
    public abstract Boolean mShortenedFlowReKyc();

    @InterfaceC1498b("shortened_flow_secondary_id_capture_android")
    public abstract Boolean mShortenedFlowSecondaryIdCapture();

    @InterfaceC1498b("shortened_flow_show_other_id_android")
    public abstract Boolean mShortenedFlowShowOtherId();

    @InterfaceC1498b("shortened_flow_upgrade_android")
    public abstract Boolean mShortenedFlowUpgrade();

    public abstract Builder toBuilder();
}
