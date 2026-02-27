package androidx.work;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class Data$getDoubleArray$$inlined$getTypedArray$1 extends k implements Function1<Integer, Double> {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data$getDoubleArray$$inlined$getTypedArray$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    public final Double invoke(int i) {
        Object obj = ((Object[]) this.$value)[i];
        if (obj != null) {
            return (Double) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
