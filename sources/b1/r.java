package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8331a;

    public r(Integer num) {
        this.f8331a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        Integer num = this.f8331a;
        r rVar = (r) ((E) obj);
        return num == null ? rVar.f8331a == null : num.equals(rVar.f8331a);
    }

    public final int hashCode() {
        Integer num = this.f8331a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f8331a + "}";
    }
}
