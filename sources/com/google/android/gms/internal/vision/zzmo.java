package com.google.android.gms.internal.vision;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes3.dex */
public enum zzmo {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzht.zza),
    ENUM(null),
    MESSAGE(null);

    private final Object zzj;

    zzmo(Object obj) {
        this.zzj = obj;
    }
}
