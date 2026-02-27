package yj;

import bj.InterfaceC1031b;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21323b;
    public final InterfaceC1031b c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Sequence sequence, Function1 function1) {
        kotlin.jvm.internal.j.g(sequence, "sequence");
        this.f21323b = sequence;
        this.c = (kotlin.jvm.internal.k) function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f21322a) {
            case 0:
                return new h(this);
            default:
                return new e(this);
        }
    }

    public i(Function0 getInitialValue, Function1 getNextValue) {
        kotlin.jvm.internal.j.g(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.j.g(getNextValue, "getNextValue");
        this.f21323b = getInitialValue;
        this.c = getNextValue;
    }
}
