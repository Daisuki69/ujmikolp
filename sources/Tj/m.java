package Tj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rj.d[] f5873a = new Rj.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pj.a[] f5874b = new Pj.a[0];

    public static final Set a(Rj.d dVar) {
        kotlin.jvm.internal.j.g(dVar, "<this>");
        if (dVar instanceof b) {
            return ((b) dVar).a();
        }
        HashSet hashSet = new HashSet(dVar.d());
        int iD = dVar.d();
        for (int i = 0; i < iD; i++) {
            hashSet.add(dVar.e(i));
        }
        return hashSet;
    }

    public static final Rj.d[] b(List list) {
        Rj.d[] dVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (dVarArr = (Rj.d[]) list.toArray(new Rj.d[0])) == null) ? f5873a : dVarArr;
    }

    public static final int c(Rj.d dVar, Rj.d[] typeParams) {
        kotlin.jvm.internal.j.g(dVar, "<this>");
        kotlin.jvm.internal.j.g(typeParams, "typeParams");
        int iHashCode = (dVar.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iD = dVar.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i4 = iD - 1;
            int i6 = i * 31;
            String strH = dVar.g(dVar.d() - iD).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i = i6 + iHashCode2;
            iD = i4;
        }
        int iD2 = dVar.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i10 = iD2 - 1;
            int i11 = iHashCode3 * 31;
            AbstractC1955a kind = dVar.g(dVar.d() - iD2).getKind();
            iHashCode3 = i11 + (kind != null ? kind.hashCode() : 0);
            iD2 = i10;
        }
    }

    public static final void d(int i, int i4, Rj.d descriptor) {
        kotlin.jvm.internal.j.g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i6 = (~i) & i4;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i6 & 1) != 0) {
                arrayList.add(descriptor.e(i10));
            }
            i6 >>>= 1;
        }
        String serialName = descriptor.h();
        kotlin.jvm.internal.j.g(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? androidx.camera.core.impl.a.p(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
