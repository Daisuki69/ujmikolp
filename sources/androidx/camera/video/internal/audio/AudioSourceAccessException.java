package androidx.camera.video.internal.audio;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class AudioSourceAccessException extends Exception {
    public AudioSourceAccessException(@Nullable String str) {
        super(str);
    }

    public AudioSourceAccessException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public AudioSourceAccessException(@Nullable Throwable th2) {
        super(th2);
    }
}
