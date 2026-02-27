package m5;

import a.AbstractC0617a;
import androidx.appcompat.app.AlertDialog;
import b5.C0916h;
import c5.C1075a;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import of.p;
import x5.C2467a;

/* JADX INFO: renamed from: m5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1852f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f18383d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f18385b;
    public AlertDialog c;

    public static void a(s5.f fVar, C0916h c0916h, String str) {
        long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - p.c, TimeUnit.NANOSECONDS);
        C2467a c2467a = AbstractC0617a.f6973b;
        if (c2467a != null) {
            c2467a.a("INTERSTITIAL_TAPPED", new C1075a(c0916h.f8526a, fVar, c0916h.e, c0916h.f, c0916h.f8529g, null, null, null, String.valueOf(jConvert), str, null, 1248).a());
        }
    }
}
