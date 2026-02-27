package com.google.gson.internal.bind;

import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import com.google.gson.z;
import d4.AbstractC1331a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends y {
    public static final z c = new AnonymousClass1(x.f10036a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f9907b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f9908a;

        public AnonymousClass1(x xVar) {
            this.f9908a = xVar;
        }

        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(jVar, this.f9908a);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(j jVar, x xVar) {
        this.f9906a = jVar;
        this.f9907b = xVar;
    }

    public static z a(x xVar) {
        return xVar == x.f10036a ? c : new AnonymousClass1(xVar);
    }

    public final Serializable b(j3.a aVar, int i) {
        int iC = AbstractC2217b.c(i);
        if (iC == 5) {
            return aVar.I();
        }
        if (iC == 6) {
            return this.f9907b.a(aVar);
        }
        if (iC == 7) {
            return Boolean.valueOf(aVar.z());
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC1331a.x(i)));
        }
        aVar.G();
        return null;
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iPeek = aVar.peek();
        int iC = AbstractC2217b.c(iPeek);
        if (iC == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iC != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new k(true);
        }
        if (arrayList == null) {
            return b(aVar, iPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.t()) {
                String strE = arrayList instanceof Map ? aVar.E() : null;
                int iPeek2 = aVar.peek();
                int iC2 = AbstractC2217b.c(iPeek2);
                if (iC2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iC2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new k(true);
                }
                boolean z4 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = b(aVar, iPeek2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strE, arrayList2);
                }
                if (z4) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.i();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.r();
            return;
        }
        y yVarH = this.f9906a.h(obj.getClass());
        if (!(yVarH instanceof ObjectTypeAdapter)) {
            yVarH.write(bVar, obj);
        } else {
            bVar.f();
            bVar.k();
        }
    }
}
