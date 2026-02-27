package com.dynatrace.android.agent.data;

import Ej.InterfaceC0231i;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import bj.AbstractC1039j;
import com.dynatrace.android.agent.util.Utility;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import qj.n;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "com.dynatrace.android.agent.data.SessionParameterStore$preload$1$sessionParameters$1", f = "SessionParameterStore.kt", l = {84}, m = "invokeSuspend")
public final class SessionParameterStore$preload$1$sessionParameters$1 extends AbstractC1616j implements n {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionParameterStore$preload$1$sessionParameters$1(InterfaceC1526a<? super SessionParameterStore$preload$1$sessionParameters$1> interfaceC1526a) {
        super(3, interfaceC1526a);
    }

    @Override // qj.n
    public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, InterfaceC1526a<? super Unit> interfaceC1526a) {
        SessionParameterStore$preload$1$sessionParameters$1 sessionParameterStore$preload$1$sessionParameters$1 = new SessionParameterStore$preload$1$sessionParameters$1(interfaceC1526a);
        sessionParameterStore$preload$1$sessionParameters$1.L$0 = interfaceC0231i;
        sessionParameterStore$preload$1$sessionParameters$1.L$1 = th2;
        return sessionParameterStore$preload$1$sessionParameters$1.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            InterfaceC0231i interfaceC0231i = (InterfaceC0231i) this.L$0;
            Utility.devLog(SessionParameterStoreKt.TAG_SESSION_PARAMETER, "failed to read session parameters from data store", (Throwable) this.L$1);
            Preferences preferencesCreateEmpty = PreferencesFactory.createEmpty();
            this.L$0 = null;
            this.label = 1;
            if (interfaceC0231i.emit(preferencesCreateEmpty, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
