package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f10073b;
    public static final g0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        e0 e0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f10072a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f10073b = e0Var;
        c = new g0();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r)) {
            int iF = 0;
            while (i < size) {
                iF += C1193g.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        r rVar = (r) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += C1193g.f(rVar.getInt(i));
            i++;
        }
        return iF2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1193g.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1193g.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r)) {
            int iF = 0;
            while (i < size) {
                iF += C1193g.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        r rVar = (r) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += C1193g.f(rVar.getInt(i));
            i++;
        }
        return iF2;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += C1193g.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r)) {
            int i4 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                i4 += C1193g.i((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return i4;
        }
        r rVar = (r) list;
        int i6 = 0;
        while (i < size) {
            int i10 = rVar.getInt(i);
            i6 += C1193g.i((i10 >> 31) ^ (i10 << 1));
            i++;
        }
        return i6;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof C)) {
                int iJ = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iJ += C1193g.j((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iJ;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r)) {
            int i4 = 0;
            while (i < size) {
                i4 += C1193g.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i4;
        }
        r rVar = (r) list;
        int i6 = 0;
        while (i < size) {
            i6 += C1193g.i(rVar.getInt(i));
            i++;
        }
        return i6;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += C1193g.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void j(e0 e0Var, Object obj, Object obj2) {
        ((g0) e0Var).getClass();
        AbstractC1203q abstractC1203q = (AbstractC1203q) obj;
        f0 f0Var = abstractC1203q.unknownFields;
        f0 f0Var2 = ((AbstractC1203q) obj2).unknownFields;
        f0 f0Var3 = f0.f;
        if (!f0Var3.equals(f0Var2)) {
            if (f0Var3.equals(f0Var)) {
                int i = f0Var.f10093a + f0Var2.f10093a;
                int[] iArrCopyOf = Arrays.copyOf(f0Var.f10094b, i);
                System.arraycopy(f0Var2.f10094b, 0, iArrCopyOf, f0Var.f10093a, f0Var2.f10093a);
                Object[] objArrCopyOf = Arrays.copyOf(f0Var.c, i);
                System.arraycopy(f0Var2.c, 0, objArrCopyOf, f0Var.f10093a, f0Var2.f10093a);
                f0Var = new f0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                f0Var.getClass();
                if (!f0Var2.equals(f0Var3)) {
                    if (!f0Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = f0Var.f10093a;
                    int i6 = f0Var2.f10093a + i4;
                    int[] iArr = f0Var.f10094b;
                    if (i6 > iArr.length) {
                        int i10 = (i4 / 2) + i4;
                        if (i10 < i6) {
                            i10 = i6;
                        }
                        if (i10 < 8) {
                            i10 = 8;
                        }
                        f0Var.f10094b = Arrays.copyOf(iArr, i10);
                        f0Var.c = Arrays.copyOf(f0Var.c, i10);
                    }
                    System.arraycopy(f0Var2.f10094b, 0, f0Var.f10094b, f0Var.f10093a, f0Var2.f10093a);
                    System.arraycopy(f0Var2.c, 0, f0Var.c, f0Var.f10093a, f0Var2.f10093a);
                    f0Var.f10093a = i6;
                }
            }
        }
        abstractC1203q.unknownFields = f0Var;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void l(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        if (!z4) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                boolean zBooleanValue = ((Boolean) list.get(i4)).booleanValue();
                c1193g.t(i, 0);
                c1193g.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6++;
        }
        c1193g.u(i6);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1193g.k(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void m(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                double dDoubleValue = ((Double) list.get(i4)).doubleValue();
                c1193g.getClass();
                c1193g.p(i, Double.doubleToRawLongBits(dDoubleValue));
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 8;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.q(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void n(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        if (!z4) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1193g.t(i, 0);
                c1193g.r(iIntValue);
            }
            return;
        }
        c1193g.t(i, 2);
        int iF = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iF += C1193g.f(((Integer) list.get(i6)).intValue());
        }
        c1193g.u(iF);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1193g.r(((Integer) list.get(i10)).intValue());
        }
    }

    public static void o(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.n(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 4;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.o(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void p(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.p(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 8;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.q(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void q(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                float fFloatValue = ((Float) list.get(i4)).floatValue();
                c1193g.getClass();
                c1193g.n(i, Float.floatToRawIntBits(fFloatValue));
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 4;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.o(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void r(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        if (!z4) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1193g.t(i, 0);
                c1193g.r(iIntValue);
            }
            return;
        }
        c1193g.t(i, 2);
        int iF = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iF += C1193g.f(((Integer) list.get(i6)).intValue());
        }
        c1193g.u(iF);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1193g.r(((Integer) list.get(i10)).intValue());
        }
    }

    public static void s(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.v(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int iJ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iJ += C1193g.j(((Long) list.get(i6)).longValue());
        }
        c1193g.u(iJ);
        while (i4 < list.size()) {
            c1193g.w(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void t(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.n(i, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 4;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.o(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void u(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.p(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C1193g.f10096g;
            i6 += 8;
        }
        c1193g.u(i6);
        while (i4 < list.size()) {
            c1193g.q(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void v(int i, List list, E e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        if (!z4) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1193g.t(i, 0);
                c1193g.u((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue2 = ((Integer) list.get(i10)).intValue();
            i6 += C1193g.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1193g.u(i6);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            c1193g.u((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void w(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                c1193g.v(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int iJ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long jLongValue2 = ((Long) list.get(i6)).longValue();
            iJ += C1193g.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1193g.u(iJ);
        while (i4 < list.size()) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c1193g.w((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i4++;
        }
    }

    public static void x(int i, List list, E e, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        if (!z4) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c1193g.t(i, 0);
                c1193g.u(iIntValue);
            }
            return;
        }
        c1193g.t(i, 2);
        int i6 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i6 += C1193g.i(((Integer) list.get(i10)).intValue());
        }
        c1193g.u(i6);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1193g.u(((Integer) list.get(i11)).intValue());
        }
    }

    public static void y(int i, List list, E e, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1193g c1193g = (C1193g) e.f10045a;
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                c1193g.v(i, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c1193g.t(i, 2);
        int iJ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iJ += C1193g.j(((Long) list.get(i6)).longValue());
        }
        c1193g.u(iJ);
        while (i4 < list.size()) {
            c1193g.w(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}
