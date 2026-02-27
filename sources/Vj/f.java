package Vj;

import Ag.l;
import cj.C1112C;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.JsonEncodingException;
import o1.AbstractC1955a;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6141a = new g();

    public static final Rj.d a(Rj.d dVar, R4.i module) {
        kotlin.jvm.internal.j.g(dVar, "<this>");
        kotlin.jvm.internal.j.g(module, "module");
        if (!kotlin.jvm.internal.j.b(dVar.getKind(), Rj.h.c)) {
            return dVar.isInline() ? a(dVar.g(0), module) : dVar;
        }
        InterfaceC2488d interfaceC2488dJ = jk.b.j(dVar);
        if (interfaceC2488dJ == null) {
            return dVar;
        }
        C1112C typeArgumentsSerializers = C1112C.f9377a;
        kotlin.jvm.internal.j.g(typeArgumentsSerializers, "typeArgumentsSerializers");
        if (((Map) module.f5470b).get(interfaceC2488dJ) == null) {
            return dVar;
        }
        throw new ClassCastException();
    }

    public static final byte b(char c) {
        if (c < '~') {
            return d.f6138b[c];
        }
        return (byte) 0;
    }

    public static final int c(Rj.d descriptor, Uj.b json, String name) {
        kotlin.jvm.internal.j.g(descriptor, "<this>");
        kotlin.jvm.internal.j.g(json, "json");
        kotlin.jvm.internal.j.g(name, "name");
        f(descriptor, json);
        int iC = descriptor.c(name);
        if (iC != -3 || !json.f6006a.e) {
            return iC;
        }
        g gVar = f6141a;
        l lVar = new l(17, descriptor, json);
        Qd.a aVar = json.c;
        aVar.getClass();
        aVar.getClass();
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) aVar.f5354b).get(descriptor);
        Object obj = map != null ? map.get(gVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = lVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.f5354b;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(gVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void d(N.e eVar, String str) {
        eVar.w(eVar.f3460b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence e(CharSequence charSequence, int i) {
        kotlin.jvm.internal.j.g(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i4 = i - 30;
                int i6 = i + 30;
                String str = i4 <= 0 ? "" : ".....";
                String str2 = i6 >= charSequence.length() ? "" : ".....";
                StringBuilder sbW = androidx.camera.core.impl.a.w(str);
                if (i4 < 0) {
                    i4 = 0;
                }
                int length = charSequence.length();
                if (i6 > length) {
                    i6 = length;
                }
                sbW.append(charSequence.subSequence(i4, i6).toString());
                sbW.append(str2);
                return sbW.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void f(Rj.d dVar, Uj.b json) {
        kotlin.jvm.internal.j.g(dVar, "<this>");
        kotlin.jvm.internal.j.g(json, "json");
        kotlin.jvm.internal.j.b(dVar.getKind(), Rj.i.c);
    }

    public static final j g(Rj.d desc, Uj.b bVar) {
        kotlin.jvm.internal.j.g(bVar, "<this>");
        kotlin.jvm.internal.j.g(desc, "desc");
        AbstractC1955a kind = desc.getKind();
        if (kind instanceof Rj.a) {
            return j.f;
        }
        if (kotlin.jvm.internal.j.b(kind, Rj.i.f5572d)) {
            return j.f6149d;
        }
        if (!kotlin.jvm.internal.j.b(kind, Rj.i.e)) {
            return j.c;
        }
        Rj.d dVarA = a(desc.g(0), bVar.f6007b);
        AbstractC1955a kind2 = dVarA.getKind();
        if ((kind2 instanceof Rj.c) || kotlin.jvm.internal.j.b(kind2, Rj.h.f5571d)) {
            return j.e;
        }
        throw new JsonEncodingException("Value of type '" + dVarA.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + dVarA.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
