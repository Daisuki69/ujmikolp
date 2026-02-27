package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1, reason: invalid class name */
    public static final class AnonymousClass1<X> extends k implements Function1<X, Unit> {
        final /* synthetic */ u $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediatorLiveData<X> mediatorLiveData, u uVar) {
            super(1);
            this.$outputLiveData = mediatorLiveData;
            this.$firstTime = uVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m99invoke(obj);
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m99invoke(X x6) {
            X value = this.$outputLiveData.getValue();
            if (this.$firstTime.f18191a || ((value == null && x6 != null) || !(value == null || value.equals(x6)))) {
                this.$firstTime.f18191a = false;
                this.$outputLiveData.setValue(x6);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07921<X> extends k implements Function1<X, Unit> {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function1<X, Y> $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07921(MediatorLiveData<Y> mediatorLiveData, Function1<X, Y> function1) {
            super(1);
            this.$result = mediatorLiveData;
            this.$transform = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m100invoke(obj);
            return Unit.f18162a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m100invoke(X x6) {
            this.$result.setValue((Y) this.$transform.invoke(x6));
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function1 {
        final /* synthetic */ Function $mapFunction;
        final /* synthetic */ MediatorLiveData $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediatorLiveData mediatorLiveData, Function function) {
            super(1);
            this.$result = mediatorLiveData;
            this.$mapFunction = function;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m101invoke(obj);
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m101invoke(Object obj) {
            this.$result.setValue(this.$mapFunction.apply(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07931<X> extends k implements Function1<X, Unit> {
        final /* synthetic */ y $liveData;
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ Function1<X, LiveData<Y>> $transform;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00101<Y> extends k implements Function1<Y, Unit> {
            final /* synthetic */ MediatorLiveData<Y> $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00101(MediatorLiveData<Y> mediatorLiveData) {
                super(1);
                this.$result = mediatorLiveData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m103invoke(obj);
                return Unit.f18162a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m103invoke(Y y7) {
                this.$result.setValue(y7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07931(Function1<X, LiveData<Y>> function1, y yVar, MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$transform = function1;
            this.$liveData = yVar;
            this.$result = mediatorLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m102invoke(obj);
            return Unit.f18162a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m102invoke(X x6) {
            LiveData liveData = (LiveData) this.$transform.invoke(x6);
            Object obj = this.$liveData.f18195a;
            if (obj != liveData) {
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData = this.$result;
                    j.d(obj);
                    mediatorLiveData.removeSource((LiveData<S>) ((LiveData) obj));
                }
                this.$liveData.f18195a = liveData;
                if (liveData != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                    j.d(liveData);
                    mediatorLiveData2.addSource((LiveData<S>) liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C00101(this.$result)));
                }
            }
        }
    }

    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        j.g(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        u uVar = new u();
        uVar.f18191a = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            uVar.f18191a = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(mediatorLiveData, uVar)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, Function1<X, Y> transform) {
        j.g(liveData, "<this>");
        j.g(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(transform.invoke(liveData.getValue()));
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C07921(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, Function1<X, LiveData<Y>> transform) {
        LiveData liveData2;
        j.g(liveData, "<this>");
        j.g(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        y yVar = new y();
        if (liveData.isInitialized() && (liveData2 = (LiveData) transform.invoke(liveData.getValue())) != null && liveData2.isInitialized()) {
            mediatorLiveData.setValue(liveData2.getValue());
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C07931(transform, yVar, mediatorLiveData)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        j.g(liveData, "<this>");
        j.g(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        j.g(liveData, "<this>");
        j.g(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations.switchMap.2
            private LiveData liveData;

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) switchMapFunction.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                if (liveData3 != null) {
                    mediatorLiveData.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    mediatorLiveData2.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData2)));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
