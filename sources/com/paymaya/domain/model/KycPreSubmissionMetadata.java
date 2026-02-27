package com.paymaya.domain.model;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPreSubmissionMetadata {

    @InterfaceC1497a
    @InterfaceC1498b("app")
    private final KycPreSubmissionApp app;

    @InterfaceC1497a
    @InterfaceC1498b("device")
    private final KycPreSubmissionDevice device;

    public KycPreSubmissionMetadata(KycPreSubmissionApp app, KycPreSubmissionDevice device) {
        j.g(app, "app");
        j.g(device, "device");
        this.app = app;
        this.device = device;
    }

    public static /* synthetic */ KycPreSubmissionMetadata copy$default(KycPreSubmissionMetadata kycPreSubmissionMetadata, KycPreSubmissionApp kycPreSubmissionApp, KycPreSubmissionDevice kycPreSubmissionDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            kycPreSubmissionApp = kycPreSubmissionMetadata.app;
        }
        if ((i & 2) != 0) {
            kycPreSubmissionDevice = kycPreSubmissionMetadata.device;
        }
        return kycPreSubmissionMetadata.copy(kycPreSubmissionApp, kycPreSubmissionDevice);
    }

    public final KycPreSubmissionApp component1() {
        return this.app;
    }

    public final KycPreSubmissionDevice component2() {
        return this.device;
    }

    public final KycPreSubmissionMetadata copy(KycPreSubmissionApp app, KycPreSubmissionDevice device) {
        j.g(app, "app");
        j.g(device, "device");
        return new KycPreSubmissionMetadata(app, device);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPreSubmissionMetadata)) {
            return false;
        }
        KycPreSubmissionMetadata kycPreSubmissionMetadata = (KycPreSubmissionMetadata) obj;
        return j.b(this.app, kycPreSubmissionMetadata.app) && j.b(this.device, kycPreSubmissionMetadata.device);
    }

    public final KycPreSubmissionApp getApp() {
        return this.app;
    }

    public final KycPreSubmissionDevice getDevice() {
        return this.device;
    }

    public int hashCode() {
        return this.device.hashCode() + (this.app.hashCode() * 31);
    }

    public String toString() {
        return "KycPreSubmissionMetadata(app=" + this.app + ", device=" + this.device + ")";
    }
}
