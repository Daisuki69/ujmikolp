package r2;

import Bj.E;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: r2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2186g extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19844b;
    public final /* synthetic */ Preferences.Key c;
    public final /* synthetic */ Long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186g(h hVar, Preferences.Key key, Long l6, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19844b = hVar;
        this.c = key;
        this.e = l6;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C2186g(this.f19844b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2186g) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f19843a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        DataStore dataStore = this.f19844b.c;
        C2185f c2185f = new C2185f(this.c, this.e, null);
        this.f19843a = 1;
        Object objEdit = PreferencesKt.edit(dataStore, c2185f, this);
        return objEdit == enumC1578a ? enumC1578a : objEdit;
    }
}
