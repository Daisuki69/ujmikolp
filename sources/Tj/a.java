package Tj;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Pj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5853a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f5854b = new p("kotlin.Boolean", Rj.b.c);

    @Override // Pj.a
    public final Object a(N.e eVar) {
        boolean z4;
        boolean z5;
        N.e eVar2 = (N.e) eVar.e;
        int iC = eVar2.C();
        String str = (String) eVar2.f;
        if (iC == str.length()) {
            N.e.x(eVar2, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iC) == '\"') {
            iC++;
            z4 = true;
        } else {
            z4 = false;
        }
        int iB = eVar2.B(iC);
        if (iB >= str.length() || iB == -1) {
            N.e.x(eVar2, "EOF", 0, 6);
            throw null;
        }
        int i = iB + 1;
        int iCharAt = str.charAt(iB) | ' ';
        if (iCharAt == 102) {
            eVar2.d(i, "alse");
            z5 = false;
        } else {
            if (iCharAt != 116) {
                N.e.x(eVar2, "Expected valid boolean literal prefix, but had '" + eVar2.i() + '\'', 0, 6);
                throw null;
            }
            eVar2.d(i, "rue");
            z5 = true;
        }
        if (z4) {
            if (eVar2.f3460b == str.length()) {
                N.e.x(eVar2, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(eVar2.f3460b) != '\"') {
                N.e.x(eVar2, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            eVar2.f3460b++;
        }
        return Boolean.valueOf(z5);
    }

    @Override // Pj.a
    public final void c(Vj.h hVar, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (hVar.f) {
            hVar.k(String.valueOf(zBooleanValue));
        } else {
            ((Ri.a) hVar.f6143a.c).r(String.valueOf(zBooleanValue));
        }
    }

    @Override // Pj.a
    public final Rj.d d() {
        return f5854b;
    }
}
