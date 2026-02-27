package c3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1071c f9280a = new C1071c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f9281b = Collections.synchronizedMap(new LinkedHashMap());

    public static C1069a a(EnumC1072d enumC1072d) {
        Map dependencies = f9281b;
        j.f(dependencies, "dependencies");
        Object obj = dependencies.get(enumC1072d);
        if (obj != null) {
            return (C1069a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC1072d + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: all -> 0x00ca, TRY_ENTER, TryCatch #0 {all -> 0x00ca, blocks: (B:22:0x0099, B:25:0x00b1, B:26:0x00c9), top: B:31:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ij.AbstractC1609c r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C1071c.b(ij.c):java.lang.Object");
    }
}
