package ak;

import ck.d;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f7243b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dk.a f7244d;
    public final dk.b e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ck.c[] f7245g;
    public final ck.b[] h;
    public final int[] i;
    public final ck.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f7246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7247l;

    public b(dk.a location, dk.b velocity, d gravity, ck.c[] sizes, ck.b[] shapes, int[] colors, ck.a config, c cVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        j.g(location, "location");
        j.g(velocity, "velocity");
        j.g(gravity, "gravity");
        j.g(sizes, "sizes");
        j.g(shapes, "shapes");
        j.g(colors, "colors");
        j.g(config, "config");
        this.f7244d = location;
        this.e = velocity;
        this.f = gravity;
        this.f7245g = sizes;
        this.h = shapes;
        this.i = colors;
        this.j = config;
        this.f7246k = cVar;
        this.f7247l = jCurrentTimeMillis;
        this.f7242a = true;
        this.f7243b = new Random();
        this.c = new ArrayList();
        cVar.f7248a = new Ta.a(0, this, b.class, "addConfetti", "addConfetti()V", 0, 2);
    }
}
