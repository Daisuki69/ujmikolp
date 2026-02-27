package androidx.work.impl;

import Bj.E;
import Bj.H;
import Bj.O;
import Ej.C0235m;
import Ej.C0241t;
import Ej.InterfaceC0231i;
import Ej.W;
import Ej.r;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import qj.o;

/* JADX INFO: loaded from: classes2.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements o {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(4, interfaceC1526a);
        }

        public final Object invoke(InterfaceC0231i interfaceC0231i, Throwable th2, long j, InterfaceC1526a<? super Boolean> interfaceC1526a) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC1526a);
            anonymousClass1.L$0 = th2;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                Throwable th2 = (Throwable) this.L$0;
                long j = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th2);
                long jMin = Math.min(j * ((long) 30000), UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                if (O.b(jMin, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Boolean.TRUE;
        }

        @Override // qj.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC0231i) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC1526a<? super Boolean>) obj4);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<Boolean, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$appContext = context;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, interfaceC1526a);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC1526a<? super Unit>) obj2);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return Unit.f18162a;
        }

        public final Object invoke(boolean z4, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(Boolean.valueOf(z4), interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        j.f(strTagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(E e, Context appContext, Configuration configuration, WorkDatabase db2) {
        j.g(e, "<this>");
        j.g(appContext, "appContext");
        j.g(configuration, "configuration");
        j.g(db2, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            H.w(e, null, null, new C0235m(new C0241t(W.h(W.e(new r(db2.workSpecDao().hasUnfinishedWorkFlow(), new AnonymousClass1(null), 1), -1)), new AnonymousClass2(appContext, null), 2), null), 3);
        }
    }
}
