package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPreSubmissionApp {

    @InterfaceC1497a
    @InterfaceC1498b("version")
    private final String version;

    public KycPreSubmissionApp(String version) {
        j.g(version, "version");
        this.version = version;
    }

    public static /* synthetic */ KycPreSubmissionApp copy$default(KycPreSubmissionApp kycPreSubmissionApp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycPreSubmissionApp.version;
        }
        return kycPreSubmissionApp.copy(str);
    }

    public final String component1() {
        return this.version;
    }

    public final KycPreSubmissionApp copy(String version) {
        j.g(version, "version");
        return new KycPreSubmissionApp(version);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycPreSubmissionApp) && j.b(this.version, ((KycPreSubmissionApp) obj).version);
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    public String toString() {
        return s.j("KycPreSubmissionApp(version=", this.version, ")");
    }
}
