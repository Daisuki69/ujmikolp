package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cj.C1132s;
import cj.L;
import cj.M;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import qj.InterfaceC2178a;
import xj.InterfaceC2488d;
import zj.C2576A;

/* JADX INFO: renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1790e implements InterfaceC2488d, InterfaceC1789d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18187b = new a(null);
    public static final Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f18188d;
    public static final LinkedHashMap e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18189a;

    /* JADX INFO: renamed from: kotlin.jvm.internal.e$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = 0;
        List listG = C1132s.g(Function0.class, Function1.class, Function2.class, qj.n.class, qj.o.class, qj.p.class, qj.q.class, qj.r.class, qj.s.class, qj.t.class, InterfaceC2178a.class, qj.b.class, qj.c.class, qj.d.class, qj.e.class, qj.f.class, qj.g.class, qj.h.class, qj.i.class, qj.j.class, qj.k.class, qj.l.class, qj.m.class);
        ArrayList arrayList = new ArrayList(cj.t.l(listG, 10));
        for (Object obj : listG) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i4;
        }
        c = M.l(arrayList);
        HashMap mapQ = androidx.media3.datasource.cache.c.q(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean", "char", "kotlin.Char");
        mapQ.put("byte", "kotlin.Byte");
        mapQ.put("short", "kotlin.Short");
        mapQ.put("int", "kotlin.Int");
        mapQ.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        mapQ.put("long", "kotlin.Long");
        mapQ.put("double", "kotlin.Double");
        HashMap map = new HashMap();
        map.put("java.lang.Boolean", "kotlin.Boolean");
        map.put("java.lang.Character", "kotlin.Char");
        map.put("java.lang.Byte", "kotlin.Byte");
        map.put("java.lang.Short", "kotlin.Short");
        map.put("java.lang.Integer", "kotlin.Int");
        map.put("java.lang.Float", "kotlin.Float");
        map.put("java.lang.Long", "kotlin.Long");
        map.put("java.lang.Double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Object", "kotlin.Any");
        map2.put("java.lang.String", "kotlin.String");
        map2.put("java.lang.CharSequence", "kotlin.CharSequence");
        map2.put("java.lang.Throwable", "kotlin.Throwable");
        map2.put("java.lang.Cloneable", "kotlin.Cloneable");
        map2.put("java.lang.Number", "kotlin.Number");
        map2.put("java.lang.Comparable", "kotlin.Comparable");
        map2.put("java.lang.Enum", "kotlin.Enum");
        map2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map2.put("java.util.Iterator", "kotlin.collections.Iterator");
        map2.put("java.util.Collection", "kotlin.collections.Collection");
        map2.put("java.util.List", "kotlin.collections.List");
        map2.put("java.util.Set", "kotlin.collections.Set");
        map2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map2.put("java.util.Map", "kotlin.collections.Map");
        map2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map2.putAll(mapQ);
        map2.putAll(map);
        Collection<String> collectionValues = mapQ.values();
        j.f(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            j.d(str);
            sb2.append(C2576A.W('.', str, (2 & 2) != 0 ? str : null));
            sb2.append("CompanionObject");
            map2.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : c.entrySet()) {
            map2.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f18188d = map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            j.d(str2);
            linkedHashMap.put(key, C2576A.W('.', str2, (2 & 2) != 0 ? str2 : null));
        }
        e = linkedHashMap;
    }

    public C1790e(Class jClass) {
        j.g(jClass, "jClass");
        this.f18189a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC1789d
    public final Class a() {
        return this.f18189a;
    }

    public final String b() {
        String str;
        f18187b.getClass();
        Class jClass = this.f18189a;
        j.g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap map = f18188d;
        if (!zIsArray) {
            String str2 = (String) map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String str;
        f18187b.getClass();
        Class jClass = this.f18189a;
        j.g(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = e;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C2576A.V(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return C2576A.V(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iE = C2576A.E(simpleName, '$', 0, 6);
        if (iE == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iE + 1, simpleName.length());
        j.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        f18187b.getClass();
        Class jClass = this.f18189a;
        j.g(jClass, "jClass");
        Map map = c;
        j.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return D.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = X5.f.o(z.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1790e) && X5.f.o(this).equals(X5.f.o((InterfaceC2488d) obj));
    }

    @Override // xj.InterfaceC2488d
    public final int hashCode() {
        return X5.f.o(this).hashCode();
    }

    public final String toString() {
        return this.f18189a + " (Kotlin reflection is not available)";
    }
}
