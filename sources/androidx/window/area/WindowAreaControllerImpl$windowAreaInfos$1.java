package androidx.window.area;

import Dj.q;
import Dj.r;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import bj.AbstractC1039j;
import cj.C1110A;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", l = {94}, m = "invokeSuspend")
public final class WindowAreaControllerImpl$windowAreaInfos$1 extends AbstractC1616j implements Function2<r, InterfaceC1526a<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowAreaControllerImpl this$0;

    /* JADX INFO: renamed from: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<Unit> {
        final /* synthetic */ Consumer<Integer> $rearDisplayListener;
        final /* synthetic */ Consumer<ExtensionWindowAreaStatus> $rearDisplayPresentationListener;
        final /* synthetic */ WindowAreaControllerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WindowAreaControllerImpl windowAreaControllerImpl, Consumer<Integer> consumer, Consumer<ExtensionWindowAreaStatus> consumer2) {
            super(0);
            this.this$0 = windowAreaControllerImpl;
            this.$rearDisplayListener = consumer;
            this.$rearDisplayPresentationListener = consumer2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m133invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m133invoke() {
            this.this$0.windowAreaComponent.removeRearDisplayStatusListener(this.$rearDisplayListener);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.removeRearDisplayPresentationStatusListener(this.$rearDisplayPresentationListener);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(WindowAreaControllerImpl windowAreaControllerImpl, InterfaceC1526a<? super WindowAreaControllerImpl$windowAreaInfos$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = windowAreaControllerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, r rVar, Integer status) {
        j.f(status, "status");
        windowAreaControllerImpl.updateRearDisplayAvailability(status.intValue());
        q qVar = (q) rVar;
        qVar.getClass();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        j.f(collectionValues, "currentWindowAreaInfoMap.values");
        qVar.j(C1110A.V(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WindowAreaControllerImpl windowAreaControllerImpl, r rVar, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        j.f(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        windowAreaControllerImpl.updateRearDisplayPresentationAvailability(extensionWindowAreaStatus);
        q qVar = (q) rVar;
        qVar.getClass();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        j.f(collectionValues, "currentWindowAreaInfoMap.values");
        qVar.j(C1110A.V(collectionValues));
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, interfaceC1526a);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(r rVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(rVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            final r rVar = (r) this.L$0;
            final WindowAreaControllerImpl windowAreaControllerImpl = this.this$0;
            Consumer consumer = new Consumer() { // from class: androidx.window.area.c
                @Override // androidx.window.extensions.core.util.function.Consumer, Ch.c
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(windowAreaControllerImpl, rVar, (Integer) obj2);
                }
            };
            Consumer consumer2 = new Consumer() { // from class: androidx.window.area.d
                @Override // androidx.window.extensions.core.util.function.Consumer, Ch.c
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(windowAreaControllerImpl, rVar, (ExtensionWindowAreaStatus) obj2);
                }
            };
            windowAreaControllerImpl.windowAreaComponent.addRearDisplayStatusListener(consumer);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.addRearDisplayPresentationStatusListener(consumer2);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, consumer, consumer2);
            this.label = 1;
            if (x3.d.b(rVar, anonymousClass1, this) == enumC1578a) {
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
