package kotlin.jvm.internal;

import java.util.List;
import xj.InterfaceC2489e;

/* JADX INFO: loaded from: classes4.dex */
public final class A {
    public static String a(InterfaceC1792g interfaceC1792g) {
        String string = interfaceC1792g.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static F b(InterfaceC2489e interfaceC2489e, List arguments, boolean z4) {
        j.g(arguments, "arguments");
        return new F(interfaceC2489e, arguments, z4 ? 1 : 0);
    }
}
