package com.google.mlkit.common;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10040a;

    public MlKitException(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f10040a = i;
    }

    public MlKitException(int i, String str, Exception exc) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), exc);
        this.f10040a = i;
    }
}
