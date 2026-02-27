package C3;

import c4.C1074a;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumMap f714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i[] f715b;

    @Override // C3.i
    public final j a(A7.f fVar, EnumMap enumMap) {
        c(enumMap);
        return b(fVar);
    }

    public final j b(A7.f fVar) throws NotFoundException {
        i[] iVarArr = this.f715b;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                try {
                    return iVar.a(fVar, this.f714a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.c;
    }

    public final void c(EnumMap enumMap) {
        this.f714a = enumMap;
        boolean z4 = enumMap != null && enumMap.containsKey(b.TRY_HARDER);
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(b.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z5 = collection.contains(a.f696o) || collection.contains(a.f697p) || collection.contains(a.h) || collection.contains(a.f692g) || collection.contains(a.f690b) || collection.contains(a.c) || collection.contains(a.f691d) || collection.contains(a.e) || collection.contains(a.i) || collection.contains(a.m) || collection.contains(a.f695n);
            if (z5 && !z4) {
                arrayList.add(new T3.j(enumMap, 0));
            }
            if (collection.contains(a.f694l)) {
                arrayList.add(new C1074a());
            }
            if (collection.contains(a.f)) {
                arrayList.add(new N3.a());
            }
            if (collection.contains(a.f689a)) {
                arrayList.add(new D3.b(0));
            }
            if (collection.contains(a.f693k)) {
                arrayList.add(new D3.b(1));
            }
            if (collection.contains(a.j)) {
                arrayList.add(new R3.a());
            }
            if (z5 && z4) {
                arrayList.add(new T3.j(enumMap, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z4) {
                arrayList.add(new T3.j(enumMap, 0));
            }
            arrayList.add(new C1074a());
            arrayList.add(new N3.a());
            arrayList.add(new D3.b(0));
            arrayList.add(new D3.b(1));
            arrayList.add(new R3.a());
            if (z4) {
                arrayList.add(new T3.j(enumMap, 0));
            }
        }
        this.f715b = (i[]) arrayList.toArray(new i[arrayList.size()]);
    }

    @Override // C3.i
    public final void reset() {
        i[] iVarArr = this.f715b;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                iVar.reset();
            }
        }
    }
}
