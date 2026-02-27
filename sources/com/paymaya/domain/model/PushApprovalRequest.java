package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PushApprovalRequest {

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    public PushApprovalRequest(String method) {
        j.g(method, "method");
        this.method = method;
    }

    public static /* synthetic */ PushApprovalRequest copy$default(PushApprovalRequest pushApprovalRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushApprovalRequest.method;
        }
        return pushApprovalRequest.copy(str);
    }

    public final String component1() {
        return this.method;
    }

    public final PushApprovalRequest copy(String method) {
        j.g(method, "method");
        return new PushApprovalRequest(method);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushApprovalRequest) && j.b(this.method, ((PushApprovalRequest) obj).method);
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public String toString() {
        return s.j("PushApprovalRequest(method=", this.method, ")");
    }
}
