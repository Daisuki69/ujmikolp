package z;

import We.C0600d;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.io.Closeable;
import n.AbstractC1876c;

/* JADX INFO: renamed from: z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2544f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0600d f21341a = new C0600d(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0600d f21342b = new C0600d(4);
    public static final C0600d c = new C0600d(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0600d f21343d = new C0600d(6);
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);
    public static float f = -1.0f;

    public static void a(Path path, float f3, float f7, float f10) {
        PathMeasure pathMeasure = (PathMeasure) f21341a.get();
        Path path2 = (Path) f21342b.get();
        Path path3 = (Path) c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f3 == 1.0f && f7 == 0.0f) {
            AbstractC1876c.a();
            return;
        }
        if (length < 1.0f || Math.abs((f7 - f3) - 1.0f) < 0.01d) {
            AbstractC1876c.a();
            return;
        }
        float f11 = f3 * length;
        float f12 = f7 * length;
        float f13 = f10 * length;
        float fMin = Math.min(f11, f12) + f13;
        float fMax = Math.max(f11, f12) + f13;
        if (fMin >= length && fMax >= length) {
            fMin = AbstractC2543e.c(fMin, length);
            fMax = AbstractC2543e.c(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = AbstractC2543e.c(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = AbstractC2543e.c(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            AbstractC1876c.a();
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        AbstractC1876c.a();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f21343d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f3 = e;
        fArr[2] = f3;
        fArr[3] = f3;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        AbstractC1876c.a();
    }
}
