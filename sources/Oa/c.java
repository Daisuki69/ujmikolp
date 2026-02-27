package Oa;

import android.hardware.Camera;
import com.google.android.gms.common.images.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f4777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f4778b;

    public c(Camera.Size size, Camera.Size size2) {
        this.f4777a = new Size(size.width, size.height);
        this.f4778b = size2 != null ? new Size(size2.width, size2.height) : null;
    }
}
