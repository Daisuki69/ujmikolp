package s5;

import Bj.E;
import Bj.r;
import android.util.Log;
import b5.C0920l;
import b5.C0921m;
import b5.n;
import bj.AbstractC1039j;
import cj.M;
import com.paymaya.adkit.data.network.AdUserTagApi;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f20021b = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new j(this.f20021b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f20020a;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                Object value = Y4.a.f6750b.getValue();
                kotlin.jvm.internal.j.f(value, "getValue(...)");
                X4.c cVar = new X4.c((AdUserTagApi) value);
                String str = this.f20021b;
                this.f20020a = 1;
                obj = cVar.b(str, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            n nVar = (n) obj;
            if (nVar instanceof C0921m) {
                r rVar = l.f20026d;
                if (rVar != null) {
                    rVar.T(((C0921m) nVar).f8534a);
                }
                l.c = ((C0921m) nVar).f8534a;
                Log.d("UserTagsManager", "User tags successfully fetched and stored.");
            } else if (nVar instanceof C0920l) {
                r rVar2 = l.f20026d;
                if (rVar2 != null) {
                    rVar2.T(M.e());
                }
                l.c = M.e();
                Log.e("UserTagsManager", "Failed to fetch user tags: " + ((C0920l) nVar).f8533a.f8515b);
            }
        } catch (Exception e) {
            r rVar3 = l.f20026d;
            if (rVar3 != null) {
                rVar3.T(M.e());
            }
            l.c = M.e();
            Log.e("UserTagsManager", "An unexpected error occurred during user tags fetch: " + e.getMessage());
        }
        return Unit.f18162a;
    }
}
