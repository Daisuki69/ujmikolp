package Zj;

import androidx.media3.exoplayer.ExoPlayer;
import ck.d;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.j;
import nl.dionsegijn.konfetti.KonfettiView;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk.a f6968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dk.b f6969b;
    public int[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ck.c[] f6970d;
    public ck.b[] e;
    public final ck.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f6971g;
    public ak.b h;
    public final KonfettiView i;

    public c(KonfettiView konfettiView) {
        j.g(konfettiView, "konfettiView");
        this.i = konfettiView;
        Random random = new Random();
        this.f6968a = new dk.a(random);
        this.f6969b = new dk.b(random);
        this.c = new int[]{-65536};
        this.f6970d = new ck.c[]{new ck.c(16, 5.0f)};
        this.e = new ck.b[]{ck.b.f9398a};
        ck.a aVar = new ck.a();
        aVar.f9396a = false;
        aVar.f9397b = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        aVar.c = 0L;
        this.f = aVar;
        this.f6971g = new d(0.0f, 0.01f);
    }

    public final void a(ck.b... bVarArr) {
        ArrayList arrayList = new ArrayList();
        for (ck.b bVar : bVarArr) {
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        Object[] array = arrayList.toArray(new ck.b[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.e = (ck.b[]) array;
    }

    public final void b(ck.c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        for (ck.c cVar : cVarArr) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        Object[] array = arrayList.toArray(new ck.c[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f6970d = (ck.c[]) array;
    }

    public final void c() {
        dk.b bVar = this.f6969b;
        bVar.getClass();
        float f = 0;
        bVar.c = 12.0f < f ? 0.0f : 12.0f;
        Float fValueOf = Float.valueOf(15.0f);
        if (15.0f < f) {
            fValueOf = Float.valueOf(0.0f);
        }
        bVar.f16543d = fValueOf;
    }

    public final void d() {
        ak.c cVar = new ak.c();
        cVar.f7250d = 1.0f / 70;
        this.h = new ak.b(this.f6968a, this.f6969b, this.f6971g, this.f6970d, this.e, this.c, this.f, cVar);
        KonfettiView konfettiView = this.i;
        konfettiView.getClass();
        konfettiView.f18748a.add(this);
        konfettiView.invalidate();
    }
}
