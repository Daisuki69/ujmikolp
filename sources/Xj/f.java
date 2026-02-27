package Xj;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Camera f6695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6696b;

    public f(Camera camera, int i) {
        if (camera == null) {
            throw new NullPointerException("Camera cannot be null");
        }
        this.f6695a = camera;
        this.f6696b = i;
    }
}
