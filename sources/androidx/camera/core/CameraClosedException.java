package androidx.camera.core;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
final class CameraClosedException extends RuntimeException {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String str, Throwable th2) {
        super(str, th2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String str) {
        super(str);
    }
}
