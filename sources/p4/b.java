package p4;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    NO_NETWORK(0, "No network"),
    INVALID_ENVIRONMENT(1, "Invalid Environment"),
    INVALID_MERCHANT(2, "Invalid Merchant ID"),
    INVALID_SESSION(3, "Invalid Session ID"),
    RUNTIME_FAILURE(4, "Runtime Failure"),
    /* JADX INFO: Fake field, exist only in values array */
    VALIDATION_FAILURE(5, "Validation Failure"),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(6, "Timeout"),
    CONTEXT_NOT_SET(7, "Context Not Set");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19061b;

    b(int i4, String str) {
        this.f19060a = i4;
        this.f19061b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f19060a + ": " + this.f19061b;
    }
}
