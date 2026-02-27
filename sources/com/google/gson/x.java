package com.google.gson;

import com.google.gson.stream.MalformedJsonException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f10036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f10037b;
    public static final /* synthetic */ x[] c;

    static {
        t tVar = new t();
        f10036a = tVar;
        u uVar = new u();
        f10037b = uVar;
        c = new x[]{tVar, uVar, new x() { // from class: com.google.gson.v
            public static Double b(String str, j3.a aVar) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        boolean z4 = true;
                        if (aVar.f17701o != 1) {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.r());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e) {
                    StringBuilder sbW = We.s.w("Cannot parse ", str, "; at path ");
                    sbW.append(aVar.r());
                    throw new JsonParseException(sbW.toString(), e);
                }
            }

            @Override // com.google.gson.x
            public final Number a(j3.a aVar) {
                String strI = aVar.I();
                if (strI.indexOf(46) >= 0) {
                    return b(strI, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strI));
                } catch (NumberFormatException unused) {
                    return b(strI, aVar);
                }
            }
        }, new x() { // from class: com.google.gson.w
            @Override // com.google.gson.x
            public final Number a(j3.a aVar) {
                String strI = aVar.I();
                try {
                    return com.google.gson.internal.e.j(strI);
                } catch (NumberFormatException e) {
                    StringBuilder sbW = We.s.w("Cannot parse ", strI, "; at path ");
                    sbW.append(aVar.r());
                    throw new JsonParseException(sbW.toString(), e);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) c.clone();
    }

    public abstract Number a(j3.a aVar);
}
