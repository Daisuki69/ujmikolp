package r2;

import androidx.datastore.preferences.core.MutablePreferences;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2181b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f19834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181b(Function1 function1, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19834b = function1;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C2181b c2181b = new C2181b(this.f19834b, interfaceC1526a);
        c2181b.f19833a = obj;
        return c2181b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2181b) create((MutablePreferences) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        this.f19834b.invoke((MutablePreferences) this.f19833a);
        return Unit.f18162a;
    }
}
