package androidx.core.util;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.k;
import qj.o;

/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$3, reason: invalid class name */
    public static final class AnonymousClass3 extends k implements o {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(4);
        }

        public final void invoke(boolean z4, Object obj, Object obj2, Object obj3) {
        }

        @Override // qj.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ Function1<K, V> $create;
        final /* synthetic */ o $onEntryRemoved;
        final /* synthetic */ Function2<K, V, Integer> $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, o oVar) {
            super(i);
            this.$sizeOf = function2;
            this.$create = function1;
            this.$onEntryRemoved = oVar;
        }

        @Override // android.util.LruCache
        public V create(K k8) {
            return (V) this.$create.invoke(k8);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z4, K k8, V v7, V v8) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z4), k8, v7, v8);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k8, V v7) {
            return ((Number) this.$sizeOf.invoke(k8, v7)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, o oVar) {
        return new AnonymousClass4(i, function2, function1, oVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, Function2 function2, Function1 function1, o oVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            function2 = AnonymousClass1.INSTANCE;
        }
        if ((i4 & 4) != 0) {
            function1 = AnonymousClass2.INSTANCE;
        }
        if ((i4 & 8) != 0) {
            oVar = AnonymousClass3.INSTANCE;
        }
        return new AnonymousClass4(i, function2, function1, oVar);
    }
}
