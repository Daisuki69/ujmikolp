package n1;

import java.util.Locale;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: n1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1910p {
    public static final C1910p c = new C1910p(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18580b;

    public C1910p(float f, float f3) {
        Xh.i.e(f > 0.0f);
        Xh.i.e(f3 > 0.0f);
        this.f18579a = f;
        this.f18580b = f3;
        Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1910p.class == obj.getClass()) {
            C1910p c1910p = (C1910p) obj;
            if (this.f18579a == c1910p.f18579a && this.f18580b == c1910p.f18580b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18580b) + ((Float.floatToRawIntBits(this.f18579a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f18579a), Float.valueOf(this.f18580b)};
        int i = AbstractC2550e.f21351a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
