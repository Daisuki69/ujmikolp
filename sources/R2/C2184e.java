package r2;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.W;
import androidx.datastore.preferences.core.Preferences;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2184e extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19840b;
    public final /* synthetic */ Preferences.Key c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2184e(h hVar, Preferences.Key key, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19840b = hVar;
        this.c = key;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C2184e(this.f19840b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2184e) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f19839a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            InterfaceC0230h data = this.f19840b.c.getData();
            this.f19839a = 1;
            obj = W.l(data, this);
            if (obj == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        Preferences preferences = (Preferences) obj;
        if (preferences == null || (obj2 = preferences.get(this.c)) == null) {
            return -1L;
        }
        return obj2;
    }
}
