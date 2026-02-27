package androidx.datastore.core;

import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.r;
import Ej.C0233k;
import Ej.InterfaceC0230h;
import Kj.a;
import Kj.e;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.media3.exoplayer.RendererCapabilities;
import bj.AbstractC1039j;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.domain.model.MfaTencentErrorResult;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private InterfaceC0156n0 collectorJob;
    private final a collectorMutex;
    private final InterfaceC1033d coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final InterfaceC0230h data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final E scope;
    private final Storage<T> storage;
    private final InterfaceC1033d storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final class InitDataStore extends RunOnce {
        private List<? extends Function2<? super InitializerApi<T>, ? super InterfaceC1526a<? super Unit>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends Function2<? super InitializerApi<T>, ? super InterfaceC1526a<? super Unit>, ? extends Object>> initTasksList) {
            j.g(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = C1110A.V(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doRun(gj.InterfaceC1526a<? super kotlin.Unit> r7) throws androidx.datastore.core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                hj.a r1 = hj.EnumC1578a.f17050a
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                bj.AbstractC1039j.b(r7)
                goto L69
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L36:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                bj.AbstractC1039j.b(r7)
                goto L7b
            L3e:
                bj.AbstractC1039j.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super gj.a<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6c
                kotlin.jvm.internal.j.d(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4f
                goto L6c
            L4f:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L68
                goto L79
            L68:
                r0 = r6
            L69:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7d
            L6c:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7a
            L79:
                return r1
            L7a:
                r0 = r6
            L7b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7d:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                kotlin.Unit r7 = kotlin.Unit.f18162a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(gj.a):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "invokeSuspend")
    public static final class AnonymousClass3<R> extends AbstractC1616j implements Function1<InterfaceC1526a<? super R>, Object> {
        final /* synthetic */ Function1<InterfaceC1526a<? super R>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super InterfaceC1526a<? super R>, ? extends Object> function1, InterfaceC1526a<? super AnonymousClass3> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$block = function1;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new AnonymousClass3(this.$block, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super R> interfaceC1526a) {
            return ((AnonymousClass3) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
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
            Function1<InterfaceC1526a<? super R>, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == enumC1578a ? enumC1578a : objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    public static final class C07621 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07621(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07621> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    public static final class C07631 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07631(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07631> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class C07641 extends AbstractC1609c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07641(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07641> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    public static final class C07651 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07651(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07651> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
    public static final class C07663 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07663(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07663> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new C07663(this.this$0, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Pair<? extends State<T>, Boolean>> interfaceC1526a) {
            return ((C07663) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            State readException;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            try {
            } catch (Throwable th3) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th3;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != enumC1578a) {
                    th2 = th3;
                    obj = version;
                }
                return enumC1578a;
            }
            if (i == 0) {
                AbstractC1039j.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.L$0;
                    AbstractC1039j.b(obj);
                    readException = new ReadException(th2, ((Number) obj).intValue());
                    return new Pair(readException, Boolean.TRUE);
                }
                AbstractC1039j.b(obj);
            }
            readException = (State) obj;
            return new Pair(readException, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends AbstractC1616j implements Function2<Boolean, InterfaceC1526a<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(DataStoreImpl<T> dataStoreImpl, int i, InterfaceC1526a<? super AnonymousClass4> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$cachedVersion, interfaceC1526a);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC1526a) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r02;
            ?? r03;
            State state;
            ?? r1;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ?? r12 = this.label;
            try {
            } catch (Throwable th3) {
                if (r12 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th3;
                    this.Z$0 = r12;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != enumC1578a) {
                        r03 = r12;
                        th2 = th3;
                        obj = version;
                    }
                    return enumC1578a;
                }
                ?? r42 = r12;
                th2 = th3;
                iIntValue = this.$cachedVersion;
                r02 = r42 == true ? 1 : 0;
            }
            if (r12 == 0) {
                AbstractC1039j.b(obj);
                boolean z4 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z4;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(z4, this);
                r12 = z4;
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z5 = this.Z$0;
                    th2 = (Throwable) this.L$0;
                    AbstractC1039j.b(obj);
                    r03 = z5;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    ReadException readException = new ReadException(th2, iIntValue);
                    r1 = r02;
                    state = readException;
                    return new Pair(state, Boolean.valueOf((boolean) r1));
                }
                boolean z8 = this.Z$0;
                AbstractC1039j.b(obj);
                r12 = z8;
            }
            state = (State) obj;
            r1 = r12;
            return new Pair(state, Boolean.valueOf((boolean) r1));
        }

        public final Object invoke(boolean z4, InterfaceC1526a<? super Pair<? extends State<T>, Boolean>> interfaceC1526a) {
            return ((AnonymousClass4) create(Boolean.valueOf(z4), interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, RendererCapabilities.DECODER_SUPPORT_MASK}, m = "readDataOrHandleCorruption")
    public static final class C07671 extends AbstractC1609c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07671(DataStoreImpl<T> dataStoreImpl, InterfaceC1526a<? super C07671> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = dataStoreImpl;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<Boolean, InterfaceC1526a<? super Data<T>>, Object> {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DataStoreImpl<T> dataStoreImpl, int i, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$preLockVersion, interfaceC1526a);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC1526a) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                java.lang.Object r0 = r5.L$0
                bj.AbstractC1039j.b(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                boolean r1 = r5.Z$0
                bj.AbstractC1039j.b(r6)
                goto L32
            L20:
                bj.AbstractC1039j.b(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r1
                r5.label = r3
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L32
                goto L44
            L32:
                if (r1 == 0) goto L4e
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L45
            L44:
                return r0
            L45:
                r0 = r6
                r6 = r1
            L47:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L53
            L4e:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L53:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5c
                int r2 = r0.hashCode()
                goto L5d
            L5c:
                r2 = 0
            L5d:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z4, InterfaceC1526a<? super Data<T>> interfaceC1526a) {
            return ((AnonymousClass2) create(Boolean.valueOf(z4), interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    public static final class C07683 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ y $newData;
        final /* synthetic */ w $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07683(y yVar, DataStoreImpl<T> dataStoreImpl, w wVar, InterfaceC1526a<? super C07683> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.$newData = yVar;
            this.this$0 = dataStoreImpl;
            this.$version = wVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new C07683(this.$newData, this.this$0, this.$version, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C07683) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type gj.a to androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 for r5v1 'this'  gj.a
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // ij.AbstractC1607a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r5.L$0
                kotlin.jvm.internal.w r0 = (kotlin.jvm.internal.w) r0
                bj.AbstractC1039j.b(r6)
                goto L74
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                java.lang.Object r1 = r5.L$0
                kotlin.jvm.internal.w r1 = (kotlin.jvm.internal.w) r1
                bj.AbstractC1039j.b(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5f
                goto L56
            L27:
                java.lang.Object r1 = r5.L$0
                kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
                bj.AbstractC1039j.b(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5f
                goto L41
            L2f:
                bj.AbstractC1039j.b(r6)
                kotlin.jvm.internal.y r1 = r5.$newData     // Catch: androidx.datastore.core.CorruptionException -> L5f
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5f
                r5.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L5f
                r5.label = r4     // Catch: androidx.datastore.core.CorruptionException -> L5f
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)     // Catch: androidx.datastore.core.CorruptionException -> L5f
                if (r6 != r0) goto L41
                goto L71
            L41:
                r1.f18195a = r6     // Catch: androidx.datastore.core.CorruptionException -> L5f
                kotlin.jvm.internal.w r1 = r5.$version     // Catch: androidx.datastore.core.CorruptionException -> L5f
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L5f
                androidx.datastore.core.InterProcessCoordinator r6 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r6)     // Catch: androidx.datastore.core.CorruptionException -> L5f
                r5.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L5f
                r5.label = r3     // Catch: androidx.datastore.core.CorruptionException -> L5f
                java.lang.Object r6 = r6.getVersion(r5)     // Catch: androidx.datastore.core.CorruptionException -> L5f
                if (r6 != r0) goto L56
                goto L71
            L56:
                java.lang.Number r6 = (java.lang.Number) r6     // Catch: androidx.datastore.core.CorruptionException -> L5f
                int r6 = r6.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L5f
                r1.f18193a = r6     // Catch: androidx.datastore.core.CorruptionException -> L5f
                goto L7c
            L5f:
                kotlin.jvm.internal.w r6 = r5.$version
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                kotlin.jvm.internal.y r3 = r5.$newData
                java.lang.Object r3 = r3.f18195a
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r3, r4, r5)
                if (r1 != r0) goto L72
            L71:
                return r0
            L72:
                r0 = r6
                r6 = r1
            L74:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r0.f18193a = r6
            L7c:
                kotlin.Unit r6 = kotlin.Unit.f18162a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C07683.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, 226}, m = "invokeSuspend")
    public static final class C07692 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super State<T>>, Object> {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07692(DataStoreImpl<T> dataStoreImpl, boolean z4, InterfaceC1526a<? super C07692> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z4;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C07692(this.this$0, this.$requireLock, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super State<T>> interfaceC1526a) {
            return ((C07692) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                bj.AbstractC1039j.b(r5)
                goto L52
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                bj.AbstractC1039j.b(r5)     // Catch: java.lang.Throwable -> L1c
                goto L45
            L1c:
                r5 = move-exception
                goto L55
            L1e:
                bj.AbstractC1039j.b(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3a
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3a:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1c
                r4.label = r3     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1c
                if (r5 != r0) goto L45
                goto L51
            L45:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L55:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C07692.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    public static final class C07702 extends AbstractC1616j implements Function1<InterfaceC1526a<? super T>, Object> {
        final /* synthetic */ CoroutineContext $callerContext;
        final /* synthetic */ Function2<T, InterfaceC1526a<? super T>, Object> $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07702(DataStoreImpl<T> dataStoreImpl, CoroutineContext coroutineContext, Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super C07702> interfaceC1526a) {
            super(1, interfaceC1526a);
            this.this$0 = dataStoreImpl;
            this.$callerContext = coroutineContext;
            this.$transform = function2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new C07702(this.this$0, this.$callerContext, this.$transform, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC1526a<? super T> interfaceC1526a) {
            return ((C07702) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type gj.a to androidx.datastore.core.DataStoreImpl$transformAndWrite$2 for r8v1 'this'  gj.a
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // ij.AbstractC1607a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                hj.a r0 = hj.EnumC1578a.f17050a
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.L$0
                bj.AbstractC1039j.b(r9)
                return r0
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                bj.AbstractC1039j.b(r9)
                goto L4f
            L25:
                bj.AbstractC1039j.b(r9)
                goto L37
            L29:
                bj.AbstractC1039j.b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L37
                goto L68
            L37:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.coroutines.CoroutineContext r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                kotlin.jvm.functions.Function2<T, gj.a<? super T>, java.lang.Object> r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = Bj.H.C(r5, r9, r8)
                if (r9 != r0) goto L4f
                goto L68
            L4f:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = kotlin.jvm.internal.j.b(r1, r9)
                if (r1 != 0) goto L69
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L69
            L68:
                return r0
            L69:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C07702.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class C07712 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super T>, Object> {
        final /* synthetic */ Function2<T, InterfaceC1526a<? super T>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07712(DataStoreImpl<T> dataStoreImpl, Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super C07712> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.this$0 = dataStoreImpl;
            this.$transform = function2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C07712 c07712 = new C07712(this.this$0, this.$transform, interfaceC1526a);
            c07712.L$0 = obj;
            return c07712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super T> interfaceC1526a) {
            return ((C07712) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
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
            E e = (E) this.L$0;
            r rVarB = H.b();
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, rVarB, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), e.getCoroutineContext()));
            this.label = 1;
            Object objA = rVarB.A(this);
            return objA == enumC1578a ? enumC1578a : objA;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends Function2<? super InitializerApi<T>, ? super InterfaceC1526a<? super Unit>, ? extends Object>> initTasksList, CorruptionHandler<T> corruptionHandler, E scope) {
        j.g(storage, "storage");
        j.g(initTasksList, "initTasksList");
        j.g(corruptionHandler, "corruptionHandler");
        j.g(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = new C0233k((Function2) new DataStoreImpl$data$1(this, null));
        this.collectorMutex = e.a(1, false);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = C1034e.b(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator$delegate = C1034e.b(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(scope, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decrementCollector(gj.InterfaceC1526a<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.core.DataStoreImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            Kj.a r1 = (Kj.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            bj.AbstractC1039j.b(r5)
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            bj.AbstractC1039j.b(r5)
            Kj.a r5 = r4.collectorMutex
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            Kj.d r5 = (Kj.d) r5
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r1 = r5
        L4d:
            r5 = 0
            int r2 = r0.collectorCounter     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + (-1)
            r0.collectorCounter = r2     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L62
            Bj.n0 r2 = r0.collectorJob     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L5d
            r2.b(r5)     // Catch: java.lang.Throwable -> L60
        L5d:
            r0.collectorJob = r5     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r0 = move-exception
            goto L6c
        L62:
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L60
            Kj.d r1 = (Kj.d) r1
            r1.f(r5)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        L6c:
            Kj.d r1 = (Kj.d) r1
            r1.f(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z4, Function1<? super InterfaceC1526a<? super R>, ? extends Object> function1, InterfaceC1526a<? super R> interfaceC1526a) {
        return z4 ? function1.invoke(interfaceC1526a) : getCoordinator().lock(new AnonymousClass3(function1, null), interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.Message$Update, androidx.datastore.core.Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.datastore.core.Message$Update] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, gj.InterfaceC1526a<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementCollector(gj.InterfaceC1526a<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C07631
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C07631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            Kj.a r1 = (Kj.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            bj.AbstractC1039j.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            bj.AbstractC1039j.b(r6)
            Kj.a r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            Kj.d r6 = (Kj.d) r6
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
            r1 = r6
        L4d:
            r6 = 0
            int r2 = r0.collectorCounter     // Catch: java.lang.Throwable -> L64
            int r2 = r2 + r3
            r0.collectorCounter = r2     // Catch: java.lang.Throwable -> L64
            if (r2 != r3) goto L66
            Bj.E r2 = r0.scope     // Catch: java.lang.Throwable -> L64
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r3 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L64
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L64
            r4 = 3
            Bj.B0 r2 = Bj.H.w(r2, r6, r6, r3, r4)     // Catch: java.lang.Throwable -> L64
            r0.collectorJob = r2     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r0 = move-exception
            goto L70
        L66:
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L64
            Kj.d r1 = (Kj.d) r1
            r1.f(r6)
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L70:
            Kj.d r1 = (Kj.d) r1
            r1.f(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(gj.InterfaceC1526a<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C07641
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C07641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            bj.AbstractC1039j.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r6 = move-exception
            goto L71
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            bj.AbstractC1039j.b(r6)
            goto L55
        L42:
            bj.AbstractC1039j.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L54
            goto L69
        L54:
            r2 = r5
        L55:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6d
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L6d:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L71:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, gj.InterfaceC1526a<? super androidx.datastore.core.State<T>> r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(InterfaceC1526a<? super T> interfaceC1526a) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, gj.InterfaceC1526a<? super androidx.datastore.core.Data<T>> r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z4, InterfaceC1526a<? super State<T>> interfaceC1526a) {
        return H.C(new C07692(this, z4, null), this.scope.getCoroutineContext(), interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, InterfaceC1526a<? super T> interfaceC1526a) {
        return getCoordinator().lock(new C07702(this, coroutineContext, function2, null), interfaceC1526a);
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC0230h getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super T, ? super InterfaceC1526a<? super T>, ? extends Object> function2, InterfaceC1526a<? super T> interfaceC1526a) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) interfaceC1526a.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return H.C(new C07712(this, function2, null), new UpdatingDataContextElement(updatingDataContextElement, this), interfaceC1526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, gj.InterfaceC1526a<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.w r11 = (kotlin.jvm.internal.w) r11
            bj.AbstractC1039j.b(r13)
            goto L54
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            bj.AbstractC1039j.b(r13)
            kotlin.jvm.internal.w r5 = new kotlin.jvm.internal.w
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r11 = r5
        L54:
            int r11 = r11.f18193a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, gj.a):java.lang.Object");
    }

    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, E e, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i & 8) != 0 ? H.c(Actual_jvmKt.ioDispatcher().plus(H.e(1))) : e);
    }
}
