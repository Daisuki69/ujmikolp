package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$switchMap$2$onChanged$1 extends k implements Function1 {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m104invoke(obj);
        return Unit.f18162a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m104invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
