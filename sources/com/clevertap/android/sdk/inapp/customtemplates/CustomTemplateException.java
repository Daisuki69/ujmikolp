package com.clevertap.android.sdk.inapp.customtemplates;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTemplateException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTemplateException(String message) {
        super(message, null);
        j.g(message, "message");
    }
}
