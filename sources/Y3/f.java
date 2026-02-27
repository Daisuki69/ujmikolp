package Y3;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f6747a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i;
        for (int i4 = 0; i4 < 2787; i4++) {
            int i6 = X3.a.f6526b[i4];
            int i10 = i6 & 1;
            int i11 = 0;
            while (i11 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i6 & 1;
                    if (i == i10) {
                        f += 1.0f;
                        i6 >>= 1;
                    }
                }
                f6747a[i4][7 - i11] = f / 17.0f;
                i11++;
                i10 = i;
            }
        }
    }
}
