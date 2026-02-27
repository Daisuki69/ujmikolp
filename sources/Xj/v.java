package xj;

import bj.C1036g;
import defpackage.AbstractC1414e;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21019a;

    public v(p pVar) {
        this.f21019a = pVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !"PluginConfigT".equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        E e = (E) this.f21019a;
        List listC = e.f18177b;
        if (listC == null) {
            C1790e c1790eA = kotlin.jvm.internal.z.a(Object.class);
            List list = Collections.EMPTY_LIST;
            kotlin.jvm.internal.z.f18196a.getClass();
            listC = cj.r.c(A.b(c1790eA, list, true));
            e.f18177b = listC;
        }
        List list2 = listC;
        ArrayList arrayList = new ArrayList(cj.t.l(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(y.b((o) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C1036g(AbstractC1414e.h("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f21019a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return "PluginConfigT";
    }

    public final int hashCode() {
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return "PluginConfigT";
    }
}
