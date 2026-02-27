package Tj;

import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5855a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5856b = new p("kotlin.Double", Rj.b.f5559d);

    @Override // Pj.a
    public final Object a(N.e eVar) {
        N.e eVar2 = (N.e) eVar.e;
        String strI = eVar2.i();
        try {
            double d10 = Double.parseDouble(strI);
            if (((Uj.b) eVar.c).f6006a.f6010d || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return Double.valueOf(d10);
            }
            N.e.x(eVar2, "Unexpected special floating-point value " + Double.valueOf(d10) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            N.e.x(eVar2, androidx.media3.datasource.cache.c.g('\'', "Failed to parse type 'double' for input '", strI), 0, 6);
            throw null;
        }
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z4 = hVar.f;
        A3.i iVar = hVar.f6143a;
        if (z4) {
            hVar.k(String.valueOf(dDoubleValue));
        } else {
            ((Ri.a) iVar.c).r(String.valueOf(dDoubleValue));
        }
        if (hVar.e.f6010d) {
            return;
        }
        if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
            throw new JsonEncodingException("Unexpected special floating-point value " + Double.valueOf(dDoubleValue) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) Vj.f.e(((Ri.a) iVar.c).toString(), -1)));
        }
    }

    @Override // Pj.a
    public final Rj.d d() {
        return f5856b;
    }
}
