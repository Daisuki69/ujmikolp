package ee;

import android.hardware.Camera;
import com.google.android.gms.common.images.Size;

/* JADX INFO: renamed from: ee.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1437a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f16649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f16650b;

    public C1437a(Camera.Size size, Camera.Size size2) {
        this.f16649a = new Size(size.width, size.height);
        this.f16650b = size2 != null ? new Size(size2.width, size2.height) : null;
    }
}
