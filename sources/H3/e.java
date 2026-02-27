package H3;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f2089a = Pattern.compile(",");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2090b;

    static {
        EnumSet enumSetOf = EnumSet.of(C3.a.f694l);
        EnumSet enumSetOf2 = EnumSet.of(C3.a.f);
        EnumSet enumSetOf3 = EnumSet.of(C3.a.f689a);
        EnumSet enumSetOf4 = EnumSet.of(C3.a.f693k);
        EnumSet enumSetOf5 = EnumSet.of(C3.a.f696o, C3.a.f697p, C3.a.h, C3.a.f692g, C3.a.m, C3.a.f695n);
        EnumSet enumSetOf6 = EnumSet.of(C3.a.c, C3.a.f691d, C3.a.e, C3.a.i, C3.a.f690b);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f2090b = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
