package androidx.datastore.preferences.core;

import Ej.InterfaceC0230h;
import androidx.datastore.core.DataStore;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<Preferences, InterfaceC1526a<? super Preferences>, Object> {
        final /* synthetic */ Function2<Preferences, InterfaceC1526a<? super Preferences>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super Preferences, ? super InterfaceC1526a<? super Preferences>, ? extends Object> function2, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
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
            if (i == 0) {
                AbstractC1039j.b(obj);
                Preferences preferences = (Preferences) this.L$0;
                Function2<Preferences, InterfaceC1526a<? super Preferences>, Object> function2 = this.$transform;
                this.label = 1;
                obj = function2.invoke(preferences, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            j.e(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        j.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC0230h getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super Preferences, ? super InterfaceC1526a<? super Preferences>, ? extends Object> function2, InterfaceC1526a<? super Preferences> interfaceC1526a) {
        return this.delegate.updateData(new AnonymousClass2(function2, null), interfaceC1526a);
    }
}
