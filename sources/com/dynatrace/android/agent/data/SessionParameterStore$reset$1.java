package com.dynatrace.android.agent.data;

import Bj.E;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$reset$1", f = "SessionParameterStore.kt", l = {183}, m = "invokeSuspend")
public final class SessionParameterStore$reset$1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Preferences>, Object> {
    int label;
    final /* synthetic */ SessionParameterStore this$0;

    /* JADX INFO: renamed from: com.dynatrace.android.agent.data.SessionParameterStore$reset$1$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$reset$1$1", f = "SessionParameterStore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC1526a);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            ((MutablePreferences) this.L$0).clear();
            return Unit.f18162a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionParameterStore$reset$1(SessionParameterStore sessionParameterStore, InterfaceC1526a<? super SessionParameterStore$reset$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = sessionParameterStore;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        return new SessionParameterStore$reset$1(this.this$0, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E e, InterfaceC1526a<? super Preferences> interfaceC1526a) {
        return ((SessionParameterStore$reset$1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        DataStore dataStore = this.this$0.dataStore;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.label = 1;
        Object objEdit = PreferencesKt.edit(dataStore, anonymousClass1, this);
        return objEdit == enumC1578a ? enumC1578a : objEdit;
    }
}
