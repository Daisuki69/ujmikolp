package com.google.protobuf;

import androidx.camera.video.AudioStats;
import java.io.Serializable;

/* JADX INFO: renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1208w {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1192f.class, C1192f.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    EnumC1208w(Class cls, Serializable serializable) {
    }
}
