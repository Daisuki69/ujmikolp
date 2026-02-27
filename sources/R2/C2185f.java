package r2;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2185f extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Preferences.Key f19842b;
    public final /* synthetic */ Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185f(Preferences.Key key, Long l6, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19842b = key;
        this.c = l6;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C2185f c2185f = new C2185f(this.f19842b, this.c, interfaceC1526a);
        c2185f.f19841a = obj;
        return c2185f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2185f) create((MutablePreferences) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        ((MutablePreferences) this.f19841a).set(this.f19842b, this.c);
        return Unit.f18162a;
    }
}
