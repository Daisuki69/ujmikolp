package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {
    private final Logger logger;
    private final String tag;
    private final T value;
    private final VerificationMode verificationMode;

    public ValidSpecification(T value, String tag, VerificationMode verificationMode, Logger logger) {
        j.g(value, "value");
        j.g(tag, "tag");
        j.g(verificationMode, "verificationMode");
        j.g(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        return this.value;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String message, Function1<? super T, Boolean> condition) {
        j.g(message, "message");
        j.g(condition, "condition");
        return ((Boolean) condition.invoke(this.value)).booleanValue() ? this : new FailedSpecification(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
