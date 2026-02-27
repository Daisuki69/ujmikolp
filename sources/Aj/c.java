package Aj;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static final double a(double d10, b sourceUnit, b targetUnit) {
        j.g(sourceUnit, "sourceUnit");
        j.g(targetUnit, "targetUnit");
        long jConvert = targetUnit.f333a.convert(1L, sourceUnit.f333a);
        return jConvert > 0 ? d10 * jConvert : d10 / r8.convert(1L, r9);
    }

    public static final long b(long j, b sourceUnit, b targetUnit) {
        j.g(sourceUnit, "sourceUnit");
        j.g(targetUnit, "targetUnit");
        return targetUnit.f333a.convert(j, sourceUnit.f333a);
    }
}
