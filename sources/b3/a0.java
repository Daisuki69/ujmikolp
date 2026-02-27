package b3;

import android.util.Log;
import androidx.datastore.core.DataStore;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8430b = e0Var;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a0(this.f8430b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f8429a;
        e0 e0Var = this.f8430b;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                DataStore dataStore = e0Var.e;
                Z z4 = new Z(e0Var, null);
                this.f8429a = 1;
                if (dataStore.updateData(z4, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
            C0868H c0868h = e0Var.h;
            if (c0868h == null) {
                kotlin.jvm.internal.j.n("localSessionData");
                throw null;
            }
            e0Var.h = C0868H.a(c0868h, null, ((j0) e0Var.f8452d).a(), null, 5);
        }
        return Unit.f18162a;
    }
}
