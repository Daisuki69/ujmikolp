package com.google.protobuf;

import androidx.camera.video.AudioStats;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum x0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1192f.c),
    ENUM(null),
    MESSAGE(null);

    x0(Serializable serializable) {
    }
}
