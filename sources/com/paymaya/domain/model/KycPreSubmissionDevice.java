package com.paymaya.domain.model;

import We.s;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPreSubmissionDevice {

    @InterfaceC1497a
    @InterfaceC1498b("model")
    private final String model;

    @InterfaceC1497a
    @InterfaceC1498b("platform")
    private final String platform;

    @InterfaceC1497a
    @InterfaceC1498b("version")
    private final String version;

    public KycPreSubmissionDevice(String platform, String version, String model) {
        j.g(platform, "platform");
        j.g(version, "version");
        j.g(model, "model");
        this.platform = platform;
        this.version = version;
        this.model = model;
    }

    public static /* synthetic */ KycPreSubmissionDevice copy$default(KycPreSubmissionDevice kycPreSubmissionDevice, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycPreSubmissionDevice.platform;
        }
        if ((i & 2) != 0) {
            str2 = kycPreSubmissionDevice.version;
        }
        if ((i & 4) != 0) {
            str3 = kycPreSubmissionDevice.model;
        }
        return kycPreSubmissionDevice.copy(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.model;
    }

    public final KycPreSubmissionDevice copy(String platform, String version, String model) {
        j.g(platform, "platform");
        j.g(version, "version");
        j.g(model, "model");
        return new KycPreSubmissionDevice(platform, version, model);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPreSubmissionDevice)) {
            return false;
        }
        KycPreSubmissionDevice kycPreSubmissionDevice = (KycPreSubmissionDevice) obj;
        return j.b(this.platform, kycPreSubmissionDevice.platform) && j.b(this.version, kycPreSubmissionDevice.version) && j.b(this.model, kycPreSubmissionDevice.model);
    }

    public final String getModel() {
        return this.model;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.model.hashCode() + AbstractC1414e.c(this.platform.hashCode() * 31, 31, this.version);
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.version;
        return s.p(s.x("KycPreSubmissionDevice(platform=", str, ", version=", str2, ", model="), this.model, ")");
    }
}
