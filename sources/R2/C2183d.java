package r2;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.W;
import androidx.datastore.preferences.core.Preferences;
import bj.AbstractC1039j;
import cj.M;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2183d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183d(h hVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19838b = hVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C2183d(this.f19838b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2183d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Map<Preferences.Key<?>, Object> mapAsMap;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f19837a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            InterfaceC0230h data = this.f19838b.c.getData();
            this.f19837a = 1;
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
        return (preferences == null || (mapAsMap = preferences.asMap()) == null) ? M.e() : mapAsMap;
    }
}
