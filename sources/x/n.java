package x;

import android.graphics.Color;
import android.graphics.PointF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import pg.C2038a;
import s.AbstractC2217b;
import v.AbstractC2329d;
import y.AbstractC2494a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2038a f20834a = C2038a.h("x", "y");

    public static int a(AbstractC2494a abstractC2494a) {
        abstractC2494a.b();
        int iM = (int) (abstractC2494a.m() * 255.0d);
        int iM2 = (int) (abstractC2494a.m() * 255.0d);
        int iM3 = (int) (abstractC2494a.m() * 255.0d);
        while (abstractC2494a.i()) {
            abstractC2494a.z();
        }
        abstractC2494a.f();
        return Color.argb(255, iM, iM2, iM3);
    }

    public static PointF b(AbstractC2494a abstractC2494a, float f) {
        int iC = AbstractC2217b.c(abstractC2494a.peek());
        if (iC == 0) {
            abstractC2494a.b();
            float fM = (float) abstractC2494a.m();
            float fM2 = (float) abstractC2494a.m();
            while (abstractC2494a.peek() != 2) {
                abstractC2494a.z();
            }
            abstractC2494a.f();
            return new PointF(fM * f, fM2 * f);
        }
        if (iC != 2) {
            if (iC != 6) {
                throw new IllegalArgumentException(numX49.tnTj78("bbNG").concat(AbstractC2329d.k(abstractC2494a.peek())));
            }
            float fM3 = (float) abstractC2494a.m();
            float fM4 = (float) abstractC2494a.m();
            while (abstractC2494a.i()) {
                abstractC2494a.z();
            }
            return new PointF(fM3 * f, fM4 * f);
        }
        abstractC2494a.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (abstractC2494a.i()) {
            int iW = abstractC2494a.w(f20834a);
            if (iW == 0) {
                fD = d(abstractC2494a);
            } else if (iW != 1) {
                abstractC2494a.y();
                abstractC2494a.z();
            } else {
                fD2 = d(abstractC2494a);
            }
        }
        abstractC2494a.g();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(AbstractC2494a abstractC2494a, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC2494a.b();
        while (abstractC2494a.peek() == 1) {
            abstractC2494a.b();
            arrayList.add(b(abstractC2494a, f));
            abstractC2494a.f();
        }
        abstractC2494a.f();
        return arrayList;
    }

    public static float d(AbstractC2494a abstractC2494a) {
        int iPeek = abstractC2494a.peek();
        int iC = AbstractC2217b.c(iPeek);
        if (iC != 0) {
            if (iC == 6) {
                return (float) abstractC2494a.m();
            }
            throw new IllegalArgumentException(numX49.tnTj78("bbN3").concat(AbstractC2329d.k(iPeek)));
        }
        abstractC2494a.b();
        float fM = (float) abstractC2494a.m();
        while (abstractC2494a.i()) {
            abstractC2494a.z();
        }
        abstractC2494a.f();
        return fM;
    }
}
