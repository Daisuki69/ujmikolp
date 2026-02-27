package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DosriValidationResult {

    public static final class DuplicateUserRelativeError extends DosriValidationResult {
        public static final DuplicateUserRelativeError INSTANCE = new DuplicateUserRelativeError();

        private DuplicateUserRelativeError() {
            super(null);
        }
    }

    public static final class DuplicationRelativeError extends DosriValidationResult {
        public static final DuplicationRelativeError INSTANCE = new DuplicationRelativeError();

        private DuplicationRelativeError() {
            super(null);
        }
    }

    public static final class RegexpError extends DosriValidationResult {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegexpError(String message) {
            super(null);
            j.g(message, "message");
            this.message = message;
        }

        public static /* synthetic */ RegexpError copy$default(RegexpError regexpError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = regexpError.message;
            }
            return regexpError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final RegexpError copy(String message) {
            j.g(message, "message");
            return new RegexpError(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegexpError) && j.b(this.message, ((RegexpError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return s.j("RegexpError(message=", this.message, ")");
        }
    }

    public static final class RequiredFieldError extends DosriValidationResult {
        private final KycFieldType fieldType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldError(KycFieldType fieldType) {
            super(null);
            j.g(fieldType, "fieldType");
            this.fieldType = fieldType;
        }

        public static /* synthetic */ RequiredFieldError copy$default(RequiredFieldError requiredFieldError, KycFieldType kycFieldType, int i, Object obj) {
            if ((i & 1) != 0) {
                kycFieldType = requiredFieldError.fieldType;
            }
            return requiredFieldError.copy(kycFieldType);
        }

        public final KycFieldType component1() {
            return this.fieldType;
        }

        public final RequiredFieldError copy(KycFieldType fieldType) {
            j.g(fieldType, "fieldType");
            return new RequiredFieldError(fieldType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequiredFieldError) && this.fieldType == ((RequiredFieldError) obj).fieldType;
        }

        public final KycFieldType getFieldType() {
            return this.fieldType;
        }

        public int hashCode() {
            return this.fieldType.hashCode();
        }

        public String toString() {
            return "RequiredFieldError(fieldType=" + this.fieldType + ")";
        }
    }

    public static final class Success extends DosriValidationResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ DosriValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DosriValidationResult() {
    }
}
