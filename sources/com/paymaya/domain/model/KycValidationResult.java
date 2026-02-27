package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class KycValidationResult {

    public static final class InvalidAmlcCertExpiryDate extends KycValidationResult {
        public static final InvalidAmlcCertExpiryDate INSTANCE = new InvalidAmlcCertExpiryDate();

        private InvalidAmlcCertExpiryDate() {
            super(null);
        }
    }

    public static final class InvalidDateFormat extends KycValidationResult {
        public static final InvalidDateFormat INSTANCE = new InvalidDateFormat();

        private InvalidDateFormat() {
            super(null);
        }
    }

    public static final class InvalidIdDate extends KycValidationResult {
        public static final InvalidIdDate INSTANCE = new InvalidIdDate();

        private InvalidIdDate() {
            super(null);
        }
    }

    public static final class InvalidUserAge extends KycValidationResult {
        private final int minUserAge;

        public InvalidUserAge(int i) {
            super(null);
            this.minUserAge = i;
        }

        public static /* synthetic */ InvalidUserAge copy$default(InvalidUserAge invalidUserAge, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = invalidUserAge.minUserAge;
            }
            return invalidUserAge.copy(i);
        }

        public final int component1() {
            return this.minUserAge;
        }

        public final InvalidUserAge copy(int i) {
            return new InvalidUserAge(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidUserAge) && this.minUserAge == ((InvalidUserAge) obj).minUserAge;
        }

        public final int getMinUserAge() {
            return this.minUserAge;
        }

        public int hashCode() {
            return this.minUserAge;
        }

        public String toString() {
            return s.g(this.minUserAge, "InvalidUserAge(minUserAge=", ")");
        }
    }

    public static final class NationalIdError extends KycValidationResult {
        public static final NationalIdError INSTANCE = new NationalIdError();

        private NationalIdError() {
            super(null);
        }
    }

    public static final class NonPhProvinceError extends KycValidationResult {
        public static final NonPhProvinceError INSTANCE = new NonPhProvinceError();

        private NonPhProvinceError() {
            super(null);
        }
    }

    public static final class OutOfRangeError extends KycValidationResult {
        private final int maxLength;

        public OutOfRangeError(int i) {
            super(null);
            this.maxLength = i;
        }

        public static /* synthetic */ OutOfRangeError copy$default(OutOfRangeError outOfRangeError, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = outOfRangeError.maxLength;
            }
            return outOfRangeError.copy(i);
        }

        public final int component1() {
            return this.maxLength;
        }

        public final OutOfRangeError copy(int i) {
            return new OutOfRangeError(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OutOfRangeError) && this.maxLength == ((OutOfRangeError) obj).maxLength;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public int hashCode() {
            return this.maxLength;
        }

        public String toString() {
            return s.g(this.maxLength, "OutOfRangeError(maxLength=", ")");
        }
    }

    public static final class RegexpError extends KycValidationResult {
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

    public static final class RequiredFieldError extends KycValidationResult {
        public static final RequiredFieldError INSTANCE = new RequiredFieldError();

        private RequiredFieldError() {
            super(null);
        }
    }

    public static final class Success extends KycValidationResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ KycValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KycValidationResult() {
    }
}
