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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: r2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2182c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19836b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182c(h hVar, Function1 function1, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f19836b = hVar;
        this.c = function1;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C2182c(this.f19836b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2182c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f19835a;
        h hVar = this.f19836b;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                Object obj2 = hVar.f19847b.get();
                Boolean bool = Boolean.TRUE;
                if (j.b(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                hVar.f19847b.set(bool);
                DataStore dataStore = hVar.c;
                C2181b c2181b = new C2181b(this.c, null);
                this.f19835a = 1;
                obj = PreferencesKt.edit(dataStore, c2181b, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return (Preferences) obj;
        } finally {
            hVar.f19847b.set(Boolean.FALSE);
        }
    }
}
