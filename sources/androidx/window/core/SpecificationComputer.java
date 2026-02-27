package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t5, String tag, VerificationMode verificationMode, Logger logger) {
            j.g(t5, "<this>");
            j.g(tag, "tag");
            j.g(verificationMode, "verificationMode");
            j.g(logger, "logger");
            return new ValidSpecification(t5, tag, verificationMode, logger);
        }

        private Companion() {
        }
    }

    public abstract T compute();

    public final String createMessage(Object value, String message) {
        j.g(value, "value");
        j.g(message, "message");
        return message + " value: " + value;
    }

    public abstract SpecificationComputer<T> require(String str, Function1<? super T, Boolean> function1);
}
