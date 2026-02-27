package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<Preferences, InterfaceC1526a<? super Preferences>, Object> {
        final /* synthetic */ Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super MutablePreferences, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$transform = function2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Preferences preferences, InterfaceC1526a<? super Preferences> interfaceC1526a) {
            return ((AnonymousClass2) create(preferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                AbstractC1039j.b(obj);
                return mutablePreferences;
            }
            AbstractC1039j.b(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> function2 = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return function2.invoke(mutablePreferences2, this) == enumC1578a ? enumC1578a : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, Function2<? super MutablePreferences, ? super InterfaceC1526a<? super Unit>, ? extends Object> function2, InterfaceC1526a<? super Preferences> interfaceC1526a) {
        return dataStore.updateData(new AnonymousClass2(function2, null), interfaceC1526a);
    }
}
