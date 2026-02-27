package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaEKycV6Config;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaEKycV6Config<T extends MayaEKycV6Config> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaEKycV6Config(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mKycCmsV7InjectTofuFields() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "kyc_cmsv7_inject_tofu_fields");
    }

    public String mKycForcePhNationalId() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "force_ph_national_id_v2_android");
    }

    public String mKycImageQuality() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "kyc_id_image_quality_v4_android");
    }

    public String mKycMaintenance() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "kyc_maintenance_android");
    }

    public String mKycUxTofuRedesign() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "kyc_ux_tofu_redesign_v1");
    }

    public String mOnboardingAndKycFlow() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "onboarding_and_kyc_flow_android");
    }

    public String mOnboardingAndKycFlowV2() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "onboarding_and_kyc_flow_v2_android");
    }

    public String mPartnerOnboarding() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "partner_onboarding_android");
    }

    public String mShortenedFlowAddressDropdown() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_address_dropdown_android");
    }

    public String mShortenedFlowBackIdCapture() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_back_id_capture_android");
    }

    public String mShortenedFlowBlurDetection() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_blur_detection_android");
    }

    public String mShortenedFlowExpandedReKyc() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_expanded_rekyc_android");
    }

    public String mShortenedFlowForeignAddressCompliance() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_foreign_address_compliance_android");
    }

    public String mShortenedFlowIdCaptureV2() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v2_android");
    }

    public String mShortenedFlowIdCaptureV21080p() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v2_1080p_android");
    }

    public String mShortenedFlowIdCaptureV3() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v3_android");
    }

    public String mShortenedFlowPhilsys() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_philsys_v2_android");
    }

    public String mShortenedFlowReKyc() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_rekyc_android");
    }

    public String mShortenedFlowSecondaryIdCapture() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_secondary_id_capture_android");
    }

    public String mShortenedFlowShowOtherId() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_show_other_id_android");
    }

    public String mShortenedFlowUpgrade() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_upgrade_android");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_upgrade_android"), this.mTarget.mShortenedFlowUpgrade());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_rekyc_android"), this.mTarget.mShortenedFlowReKyc());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_show_other_id_android"), this.mTarget.mShortenedFlowShowOtherId());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v2_android"), this.mTarget.mShortenedFlowIdCaptureV2());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v2_1080p_android"), this.mTarget.mShortenedFlowIdCaptureV21080p());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_id_capture_v3_android"), this.mTarget.mShortenedFlowIdCaptureV3());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_expanded_rekyc_android"), this.mTarget.mShortenedFlowExpandedReKyc());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_blur_detection_android"), this.mTarget.mShortenedFlowBlurDetection());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_back_id_capture_android"), this.mTarget.mShortenedFlowBackIdCapture());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_secondary_id_capture_android"), this.mTarget.mShortenedFlowSecondaryIdCapture());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "partner_onboarding_android"), this.mTarget.mPartnerOnboarding());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "onboarding_and_kyc_flow_android"), this.mTarget.mOnboardingAndKycFlow());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "onboarding_and_kyc_flow_v2_android"), this.mTarget.mOnboardingAndKycFlowV2());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "kyc_maintenance_android"), this.mTarget.mKycMaintenance());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_address_dropdown_android"), this.mTarget.mShortenedFlowAddressDropdown());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_foreign_address_compliance_android"), this.mTarget.mShortenedFlowForeignAddressCompliance());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shortened_flow_philsys_v2_android"), this.mTarget.mShortenedFlowPhilsys());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "force_ph_national_id_v2_android"), this.mTarget.mKycForcePhNationalId());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "kyc_id_image_quality_v4_android"), this.mTarget.mKycImageQuality());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "kyc_cmsv7_inject_tofu_fields"), this.mTarget.mKycCmsV7InjectTofuFields());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "kyc_ux_tofu_redesign_v1"), this.mTarget.mKycUxTofuRedesign());
    }

    public void updateConfig() {
        MayaEKycV6Config.Builder builder = this.mTarget.toBuilder();
        builder.mShortenedFlowUpgrade(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowUpgrade())));
        builder.mShortenedFlowReKyc(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowReKyc())));
        builder.mShortenedFlowShowOtherId(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowShowOtherId())));
        builder.mShortenedFlowIdCaptureV2(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowIdCaptureV2())));
        builder.mShortenedFlowIdCaptureV21080p(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowIdCaptureV21080p())));
        builder.mShortenedFlowIdCaptureV3(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowIdCaptureV3())));
        builder.mShortenedFlowExpandedReKyc(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowExpandedReKyc())));
        builder.mShortenedFlowBlurDetection(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowBlurDetection())));
        builder.mShortenedFlowBackIdCapture(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowBackIdCapture())));
        builder.mShortenedFlowSecondaryIdCapture(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowSecondaryIdCapture())));
        builder.mPartnerOnboarding(Boolean.valueOf(this.mRemoteConfig.c(mPartnerOnboarding())));
        builder.mOnboardingAndKycFlow(Boolean.valueOf(this.mRemoteConfig.c(mOnboardingAndKycFlow())));
        builder.mOnboardingAndKycFlowV2(Boolean.valueOf(this.mRemoteConfig.c(mOnboardingAndKycFlowV2())));
        builder.mKycMaintenance(Boolean.valueOf(this.mRemoteConfig.c(mKycMaintenance())));
        builder.mShortenedFlowAddressDropdown(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowAddressDropdown())));
        builder.mShortenedFlowForeignAddressCompliance(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowForeignAddressCompliance())));
        builder.mShortenedFlowPhilsys(Boolean.valueOf(this.mRemoteConfig.c(mShortenedFlowPhilsys())));
        builder.mKycForcePhNationalId(Boolean.valueOf(this.mRemoteConfig.c(mKycForcePhNationalId())));
        builder.mKycImageQuality(Boolean.valueOf(this.mRemoteConfig.c(mKycImageQuality())));
        builder.mKycCmsV7InjectTofuFields(Boolean.valueOf(this.mRemoteConfig.c(mKycCmsV7InjectTofuFields())));
        builder.mKycUxTofuRedesign(Boolean.valueOf(this.mRemoteConfig.c(mKycUxTofuRedesign())));
        this.mTarget = (T) builder.build();
    }
}
