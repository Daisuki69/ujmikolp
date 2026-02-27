package androidx.core.view.animation;

import We.s;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i4 = i + 1;
        this.mX = new float[i4];
        this.mY = new float[i4];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i4; i6++) {
            pathMeasure.getPosTan((i6 * length) / i, fArr, null);
            this.mX[i6] = fArr[0];
            this.mY[i6] = fArr[1];
        }
    }

    private static Path createCubic(float f, float f3, float f7, float f10) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f3, f7, f10, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f3, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i4 = (i + length) / 2;
            if (f < this.mX[i4]) {
                length = i4;
            } else {
                i = i4;
            }
        }
        float[] fArr = this.mX;
        float f3 = fArr[length];
        float f7 = fArr[i];
        float f10 = f3 - f7;
        if (f10 == 0.0f) {
            return this.mY[i];
        }
        float f11 = (f - f7) / f10;
        float[] fArr2 = this.mY;
        float f12 = fArr2[i];
        return s.a(fArr2[length], f12, f11, f12);
    }

    public PathInterpolatorApi14(float f, float f3) {
        this(createQuad(f, f3));
    }

    public PathInterpolatorApi14(float f, float f3, float f7, float f10) {
        this(createCubic(f, f3, f7, f10));
    }
}
