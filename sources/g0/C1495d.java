package g0;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1495d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16772b;

    public C1495d(boolean z4, boolean z5) {
        this.f16771a = z4;
        this.f16772b = z5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationInfo{fromCleverTap=");
        sb2.append(this.f16771a);
        sb2.append(", shouldRender=");
        return androidx.camera.core.impl.a.q(sb2, this.f16772b, '}');
    }
}
