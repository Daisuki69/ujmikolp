package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsn {

    @Nullable
    private static zzsn zza;

    private zzsn() {
    }

    public static synchronized zzsn zza() {
        try {
            if (zza == null) {
                zza = new zzsn();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
