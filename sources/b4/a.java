package B4;

import Bj.E;
import R4.i;
import Y.e;
import android.util.Log;
import bg.C0965G0;
import bg.u0;
import bj.AbstractC1039j;
import com.dynatrace.android.agent.Global;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import pg.t;
import x3.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t tVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f341a = cVar;
        this.f342b = tVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a(this.f341a, this.f342b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        d dVarD;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        Wf.d dVar = this.f341a.f346b;
        if (dVar == null) {
            j.n("credoAppService");
            throw null;
        }
        e eVar = dVar.f6432a;
        synchronized (eVar) {
            try {
                try {
                    dVarD = eVar.d();
                    if (dVarD instanceof Wf.b) {
                        Object obj2 = ((LinkedHashMap) ((i) eVar.f6708b).f5470b).get(u0.class.getName());
                        if (obj2 == null) {
                            j.l();
                        }
                        Object objInvoke = ((Function0) obj2).invoke();
                        if (objInvoke == null) {
                            throw new TypeCastException("null cannot be cast to non-null type credoapp.utils.DataCollectionObserver");
                        }
                        ((u0) objInvoke).a(1);
                    }
                    if (dVarD instanceof Wf.a) {
                        Wf.a aVar = (Wf.a) dVarD;
                        Object obj3 = ((LinkedHashMap) ((i) eVar.f6708b).f5470b).get(u0.class.getName());
                        if (obj3 == null) {
                            j.l();
                        }
                        Object objInvoke2 = ((Function0) obj3).invoke();
                        if (objInvoke2 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type credoapp.utils.DataCollectionObserver");
                        }
                        ((u0) objInvoke2).a(2);
                        Xh.i.b(aVar, (C0965G0) eVar.c);
                    }
                } catch (Exception e) {
                    Wf.a aVar2 = new Wf.a(e.toString(), 90);
                    Xh.i.b(aVar2, (C0965G0) eVar.c);
                    dVarD = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t tVar = this.f342b;
        if (dVarD instanceof Wf.b) {
            String str = (String) ((Wf.b) dVarD).f6429b;
            Log.d("collect", str);
            tVar.success(str);
        } else {
            if (!(dVarD instanceof Wf.a)) {
                throw new NoWhenBranchMatchedException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Wf.a aVar3 = (Wf.a) dVarD;
            String str2 = aVar3.f6428b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jCurrentTimeMillis);
            sb2.append(Global.BLANK);
            sb2.append(str2);
            sb2.append(Global.BLANK);
            int i = aVar3.c;
            sb2.append(i);
            Log.d("Error", sb2.toString());
            tVar.error(String.valueOf(i), aVar3.f6428b, "");
        }
        return Unit.f18162a;
    }
}
