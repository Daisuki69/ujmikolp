package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.MaintenanceConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MaintenanceConfig<T extends MaintenanceConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MaintenanceConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String mEnd() {
        return s.p(new StringBuilder(), this.mAbsolutePath, TtmlNode.END);
    }

    public String mMessage() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "message");
    }

    public String mMessageV2() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "message_v2");
    }

    public Remote_ServiceAvailabilityConfig mServiceAvailabilityConfig() {
        return new Remote_ServiceAvailabilityConfig(this.mTarget.mServiceAvailabilityConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "service_availability_"));
    }

    public String mStart() {
        return s.p(new StringBuilder(), this.mAbsolutePath, TtmlNode.START);
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, TtmlNode.START), this.mTarget.mStart());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, TtmlNode.END), this.mTarget.mEnd());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "message"), this.mTarget.mMessage());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "message_v2"), this.mTarget.mMessageV2());
        mServiceAvailabilityConfig().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        MaintenanceConfig.Builder builder = this.mTarget.toBuilder();
        builder.mStart(this.mRemoteConfig.g(mStart()));
        builder.mEnd(this.mRemoteConfig.g(mEnd()));
        builder.mMessage(this.mRemoteConfig.g(mMessage()));
        builder.mMessageV2(this.mRemoteConfig.g(mMessageV2()));
        Remote_ServiceAvailabilityConfig remote_ServiceAvailabilityConfigMServiceAvailabilityConfig = mServiceAvailabilityConfig();
        remote_ServiceAvailabilityConfigMServiceAvailabilityConfig.updateConfig();
        builder.mServiceAvailabilityConfig(remote_ServiceAvailabilityConfigMServiceAvailabilityConfig.mTarget);
        this.mTarget = (T) builder.build();
    }
}
