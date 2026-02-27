package mc;

import com.paymaya.domain.model.Operator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Operator f18399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Operator operator) {
        super(0);
        j.g(operator, "operator");
        this.f18399b = operator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.b(this.f18399b, ((c) obj).f18399b);
    }

    public final int hashCode() {
        return this.f18399b.hashCode();
    }

    public final String toString() {
        return "OperatorSelection(operator=" + this.f18399b + ")";
    }
}
