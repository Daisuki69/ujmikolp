package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {
    public static String a(zzfqn zzfqnVar, File file, String str) {
        return b(file, str, zzfqr.zza);
    }

    public static String b(File file, String str, zzfqr zzfqrVar) {
        return new File(file, str).getPath();
    }
}
