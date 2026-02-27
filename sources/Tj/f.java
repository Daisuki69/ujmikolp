package Tj;

import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1129o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rj.h f5862l;
    public final InterfaceC1033d m;

    public f(final String str, final int i) {
        super(str, null, i);
        this.f5862l = Rj.h.f5571d;
        this.m = C1034e.b(new Function0() { // from class: Tj.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                Rj.d[] dVarArr = new Rj.d[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    String serialName = str + '.' + this.e[i6];
                    Rj.i iVar = Rj.i.f;
                    Rj.d[] dVarArr2 = new Rj.d[0];
                    kotlin.jvm.internal.j.g(serialName, "serialName");
                    if (C2576A.H(serialName)) {
                        throw new IllegalArgumentException("Blank serial names are prohibited");
                    }
                    if (iVar.equals(Rj.i.c)) {
                        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    }
                    Ci.b bVar = new Ci.b(serialName);
                    Unit unit = Unit.f18162a;
                    dVarArr[i6] = new Rj.e(serialName, iVar, ((ArrayList) bVar.c).size(), C1129o.z(dVarArr2), bVar);
                }
                return dVarArr;
            }
        });
    }

    @Override // Tj.o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Rj.d)) {
            return false;
        }
        Rj.d dVar = (Rj.d) obj;
        if (dVar.getKind() != Rj.h.f5571d) {
            return false;
        }
        return this.f5877a.equals(dVar.h()) && kotlin.jvm.internal.j.b(m.a(this), m.a(dVar));
    }

    @Override // Tj.o, Rj.d
    public final Rj.d g(int i) {
        return ((Rj.d[]) this.m.getValue())[i];
    }

    @Override // Tj.o, Rj.d
    public final AbstractC1955a getKind() {
        return this.f5862l;
    }

    @Override // Tj.o
    public final int hashCode() {
        int iHashCode = this.f5877a.hashCode();
        Rj.f fVar = new Rj.f(this);
        int iHashCode2 = 1;
        while (fVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) fVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Tj.o
    public final String toString() {
        return C1110A.F(new Rj.g(this, 0), ", ", this.f5877a.concat("("), ")", null, 56);
    }
}
