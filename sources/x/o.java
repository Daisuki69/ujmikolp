package x;

import We.C0600d;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.WeakReference;
import pg.C2038a;
import z.AbstractC2543e;
import z.AbstractC2544f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArrayCompat f20836b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f20835a = new LinearInterpolator();
    public static final C2038a c = C2038a.h("t", numX49.tnTj78("bbN2L"), numX49.tnTj78("bbN2r"), numX49.tnTj78("bbN2Z"), numX49.tnTj78("bbN2b"), numX49.tnTj78("bbN22"), TypedValues.TransitionType.S_TO, "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2038a f20837d = C2038a.h("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolatorCreate;
        pointF.x = AbstractC2543e.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC2543e.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC2543e.b(pointF2.x, -1.0f, 1.0f);
        float fB = AbstractC2543e.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f3 = pointF.y;
        float f7 = pointF2.x;
        C0600d c0600d = AbstractC2544f.f21341a;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f7 != 0.0f) {
            i = (int) (i * 31 * f7);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (o.class) {
            if (f20836b == null) {
                f20836b = new SparseArrayCompat();
            }
            weakReference = (WeakReference) f20836b.get(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            interpolatorCreate = numX49.tnTj78("bbN2k").equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            c(i, new WeakReference(interpolatorCreate));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return interpolatorCreate;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A.a b(y.AbstractC2494a r26, n.C1880g r27, float r28, x.InterfaceC2445C r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.o.b(y.a, n.g, float, x.C, boolean, boolean):A.a");
    }

    public static void c(int i, WeakReference weakReference) {
        synchronized (o.class) {
            f20836b.put(i, weakReference);
        }
    }
}
