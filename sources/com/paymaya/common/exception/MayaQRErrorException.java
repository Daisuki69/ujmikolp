package com.paymaya.common.exception;

import We.s;
import com.paymaya.common.utility.T;

/* JADX INFO: loaded from: classes3.dex */
public class MayaQRErrorException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10361b;
    public final T c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10362d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MayaQRErrorException(T t5, String str, String str2, String str3) {
        StringBuilder sbX = s.x("ErrorType: ", str, ", Value: ", str2, ", Tag: ");
        sbX.append(t5);
        sbX.append(", BIC: ");
        sbX.append(str3);
        super(sbX.toString());
        this.f10360a = str;
        this.f10361b = str2;
        this.c = t5;
        this.f10362d = str3;
    }
}
