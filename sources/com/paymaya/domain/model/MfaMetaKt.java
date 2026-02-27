package com.paymaya.domain.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MfaMetaKt {
    public static final String getMfaPurposeType(MfaMeta mfaMeta) {
        j.g(mfaMeta, "<this>");
        return j.b(mfaMeta.getTransactionType(), "reset password") ? "forgot_password" : mfaMeta.getHasChangedMin() ? "change_min" : "login";
    }
}
