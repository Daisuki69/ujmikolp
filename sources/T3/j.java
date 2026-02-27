package T3;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k[] f5784b;

    public j(EnumMap enumMap, int i) {
        this.f5783a = i;
        switch (i) {
            case 1:
                Collection collection = enumMap == null ? null : (Collection) enumMap.get(C3.b.POSSIBLE_FORMATS);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(C3.a.h)) {
                        arrayList.add(new f(0));
                    } else if (collection.contains(C3.a.f696o)) {
                        arrayList.add(new f(3));
                    }
                    if (collection.contains(C3.a.f692g)) {
                        arrayList.add(new f(2));
                    }
                    if (collection.contains(C3.a.f697p)) {
                        arrayList.add(new f(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new f(0));
                    arrayList.add(new f(2));
                    arrayList.add(new f(1));
                }
                this.f5784b = (o[]) arrayList.toArray(new o[arrayList.size()]);
                break;
            default:
                Collection collection2 = enumMap == null ? null : (Collection) enumMap.get(C3.b.POSSIBLE_FORMATS);
                boolean z4 = (enumMap == null || enumMap.get(C3.b.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(C3.a.h) || collection2.contains(C3.a.f696o) || collection2.contains(C3.a.f692g) || collection2.contains(C3.a.f697p)) {
                        arrayList2.add(new j(enumMap, 1));
                    }
                    if (collection2.contains(C3.a.c)) {
                        arrayList2.add(new d(z4));
                    }
                    if (collection2.contains(C3.a.f691d)) {
                        arrayList2.add(new e());
                    }
                    if (collection2.contains(C3.a.e)) {
                        arrayList2.add(new c());
                    }
                    if (collection2.contains(C3.a.i)) {
                        arrayList2.add(new h());
                    }
                    if (collection2.contains(C3.a.f690b)) {
                        arrayList2.add(new a());
                    }
                    if (collection2.contains(C3.a.m)) {
                        arrayList2.add(new U3.e());
                    }
                    if (collection2.contains(C3.a.f695n)) {
                        arrayList2.add(new V3.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new j(enumMap, 1));
                    arrayList2.add(new d(false));
                    arrayList2.add(new a());
                    arrayList2.add(new e());
                    arrayList2.add(new c());
                    arrayList2.add(new h());
                    arrayList2.add(new U3.e());
                    arrayList2.add(new V3.c());
                }
                this.f5784b = (k[]) arrayList2.toArray(new k[arrayList2.size()]);
                break;
        }
    }

    @Override // T3.k
    public final C3.j b(int i, K3.a aVar, EnumMap enumMap) throws NotFoundException {
        switch (this.f5783a) {
            case 0:
                for (k kVar : this.f5784b) {
                    try {
                        return kVar.b(i, aVar, enumMap);
                    } catch (ReaderException unused) {
                    }
                }
                throw NotFoundException.c;
            default:
                int[] iArrN = o.n(aVar);
                for (o oVar : (o[]) this.f5784b) {
                    try {
                        C3.j jVarL = oVar.l(i, aVar, iArrN, enumMap);
                        C3.a aVar2 = jVarL.f721d;
                        C3.a aVar3 = C3.a.h;
                        String str = jVarL.f719a;
                        boolean z4 = aVar2 == aVar3 && str.charAt(0) == '0';
                        Collection collection = enumMap == null ? null : (Collection) enumMap.get(C3.b.POSSIBLE_FORMATS);
                        C3.a aVar4 = C3.a.f696o;
                        boolean z5 = collection == null || collection.contains(aVar4);
                        if (!z4 || !z5) {
                            return jVarL;
                        }
                        C3.j jVar = new C3.j(str.substring(1), jVarL.f720b, jVarL.c, aVar4);
                        EnumMap enumMap2 = jVarL.e;
                        if (enumMap2 != null) {
                            jVar.e = enumMap2;
                        }
                        return jVar;
                    } catch (ReaderException unused2) {
                    }
                }
                throw NotFoundException.c;
        }
    }

    @Override // T3.k, C3.i
    public final void reset() {
        switch (this.f5783a) {
            case 0:
                for (k kVar : this.f5784b) {
                    kVar.reset();
                }
                break;
            default:
                for (o oVar : (o[]) this.f5784b) {
                    oVar.getClass();
                }
                break;
        }
    }
}
