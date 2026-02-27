package androidx.datastore.core;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qj.n;

/* JADX INFO: loaded from: classes.dex */
public final class StorageConnectionKt {

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements n {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(3, interfaceC1526a);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z4, InterfaceC1526a<? super T> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC1526a);
            anonymousClass2.L$0 = readScope;
            return anonymousClass2.invokeSuspend(Unit.f18162a);
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
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == enumC1578a ? enumC1578a : data;
        }

        @Override // qj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (InterfaceC1526a) obj3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", l = {77}, m = "invokeSuspend")
    public static final class C07752<T> extends AbstractC1616j implements Function2<WriteScope<T>, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07752(T t5, InterfaceC1526a<? super C07752> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$value = t5;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C07752 c07752 = new C07752(this.$value, interfaceC1526a);
            c07752.L$0 = obj;
            return c07752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WriteScope<T> writeScope, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C07752) create(writeScope, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t5 = this.$value;
                this.label = 1;
                if (writeScope.writeData(t5, this) == enumC1578a) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object readData(StorageConnection<T> storageConnection, InterfaceC1526a<? super T> interfaceC1526a) {
        return storageConnection.readScope(new AnonymousClass2(null), interfaceC1526a);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t5, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objWriteScope = storageConnection.writeScope(new C07752(t5, null), interfaceC1526a);
        return objWriteScope == EnumC1578a.f17050a ? objWriteScope : Unit.f18162a;
    }
}
