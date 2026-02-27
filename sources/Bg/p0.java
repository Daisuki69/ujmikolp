package bg;

import cj.C1110A;
import cj.C1127m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y.e f9107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Y.e eVar, int i) {
        super(0);
        this.f9106a = i;
        this.f9107b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9106a) {
            case 0:
                Function0 function0 = (Function0) ((LinkedHashMap) ((R4.i) this.f9107b.f6708b).f5470b).get(AbstractC0983W.class.getName());
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return null;
            case 1:
                Y.e eVar = this.f9107b;
                Object obj = ((LinkedHashMap) ((R4.i) eVar.f6708b).f5470b).get(Xf.c[].class.getName());
                if (obj == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke = ((Function0) obj).invoke();
                if (objInvoke == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<credoapp.internal.v1.contract.IModule>");
                }
                Xf.c[] cVarArr = (Xf.c[]) objInvoke;
                ArrayList arrayList = new ArrayList(cVarArr.length);
                for (Xf.c cVar : cVarArr) {
                    Object obj2 = ((LinkedHashMap) ((R4.i) eVar.f6708b).f5470b).get(Wf.c.class.getName());
                    if (obj2 == null) {
                        kotlin.jvm.internal.j.l();
                    }
                    Object objInvoke2 = ((Function0) obj2).invoke();
                    if (objInvoke2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type credoapp.CredoAppService.CredoAppContext");
                    }
                    arrayList.add(cVar.b((Wf.c) objInvoke2));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cj.x.p(C1127m.c((String[]) it.next()), arrayList2);
                }
                Object[] array = C1110A.w(arrayList2).toArray(new String[0]);
                if (array != null) {
                    return (String[]) array;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            default:
                Object obj3 = ((LinkedHashMap) ((R4.i) this.f9107b.f6708b).f5470b).get(Wf.c.class.getName());
                if (obj3 == null) {
                    kotlin.jvm.internal.j.l();
                }
                Object objInvoke3 = ((Function0) obj3).invoke();
                if (objInvoke3 != null) {
                    return (Wf.c) objInvoke3;
                }
                throw new TypeCastException("null cannot be cast to non-null type credoapp.CredoAppService.CredoAppContext");
        }
    }
}
