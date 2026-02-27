package kotlin.coroutines;

import Sb.i;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f18167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f18168b;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        j.g(left, "left");
        j.g(element, "element");
        this.f18167a = left;
        this.f18168b = element;
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i4 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f18167a;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i4++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f18167a;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i4 == i) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f18168b;
                    if (!j.b(cVar.get(element.getKey()), element)) {
                        zB = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f18167a;
                    if (!(coroutineContext3 instanceof c)) {
                        j.e(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zB = j.b(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.f18167a.fold(obj, function2), this.f18168b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f key) {
        j.g(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f18168b.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f18167a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f18168b.hashCode() + this.f18167a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f key) {
        j.g(key, "key");
        CoroutineContext.Element element = this.f18168b;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f18167a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        return coroutineContextMinusKey == coroutineContext ? this : coroutineContextMinusKey == g.f18170a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        j.g(context, "context");
        return context == g.f18170a ? this : (CoroutineContext) context.fold(this, new i(6));
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("["), (String) fold("", new i(5)), ']');
    }
}
