package xj;

import cj.C1110A;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.F;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y {
    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence sequenceE = yj.n.e(x.f21021a, type);
        return ((Class) yj.q.m(sequenceE)).getName() + zj.z.r(yj.q.g(sequenceE), "[]");
    }

    public static final Type b(o oVar, boolean z4) {
        F f = (F) oVar;
        InterfaceC2489e interfaceC2489e = f.f18179a;
        if (interfaceC2489e instanceof p) {
            return new v((p) interfaceC2489e);
        }
        if (!(interfaceC2489e instanceof InterfaceC2488d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + oVar);
        }
        InterfaceC2488d interfaceC2488d = (InterfaceC2488d) interfaceC2489e;
        Class clsO = z4 ? X5.f.o(interfaceC2488d) : X5.f.n(interfaceC2488d);
        List list = f.f18180b;
        if (list.isEmpty()) {
            return clsO;
        }
        if (!clsO.isArray()) {
            return c(clsO, list);
        }
        if (clsO.getComponentType().isPrimitive()) {
            return clsO;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) C1110A.P(list);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + oVar);
        }
        r rVar = kTypeProjection.f18204a;
        int i = rVar == null ? -1 : w.f21020a[rVar.ordinal()];
        if (i == -1 || i == 1) {
            return clsO;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        F f3 = kTypeProjection.f18205b;
        kotlin.jvm.internal.j.d(f3);
        Type typeB = b(f3, false);
        return typeB instanceof Class ? clsO : new C2485a(typeB);
    }

    public static final u c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(cj.t.l(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((KTypeProjection) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(cj.t.l(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((KTypeProjection) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        u uVarC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(cj.t.l(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(d((KTypeProjection) it3.next()));
        }
        return new u(cls, uVarC, arrayList3);
    }

    public static final Type d(KTypeProjection kTypeProjection) {
        r rVar = kTypeProjection.f18204a;
        if (rVar == null) {
            z.c.getClass();
            return z.f21022d;
        }
        F f = kTypeProjection.f18205b;
        kotlin.jvm.internal.j.d(f);
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 0) {
            return b(f, true);
        }
        if (iOrdinal == 1) {
            return new z(null, b(f, true));
        }
        if (iOrdinal == 2) {
            return new z(b(f, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
