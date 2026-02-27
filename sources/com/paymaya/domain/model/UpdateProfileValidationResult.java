package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UpdateProfileValidationResult {

    public static final class DuplicateContactError extends UpdateProfileValidationResult {
        private final int fieldName;

        public DuplicateContactError(int i) {
            super(null);
            this.fieldName = i;
        }

        public static /* synthetic */ DuplicateContactError copy$default(DuplicateContactError duplicateContactError, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = duplicateContactError.fieldName;
            }
            return duplicateContactError.copy(i);
        }

        public final int component1() {
            return this.fieldName;
        }

        public final DuplicateContactError copy(int i) {
            return new DuplicateContactError(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DuplicateContactError) && this.fieldName == ((DuplicateContactError) obj).fieldName;
        }

        public final int getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            return this.fieldName;
        }

        public String toString() {
            return s.g(this.fieldName, "DuplicateContactError(fieldName=", ")");
        }
    }

    public static final class DuplicateContactNumberError extends UpdateProfileValidationResult {
        private final String fieldName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateContactNumberError(String fieldName) {
            super(null);
            j.g(fieldName, "fieldName");
            this.fieldName = fieldName;
        }

        public static /* synthetic */ DuplicateContactNumberError copy$default(DuplicateContactNumberError duplicateContactNumberError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = duplicateContactNumberError.fieldName;
            }
            return duplicateContactNumberError.copy(str);
        }

        public final String component1() {
            return this.fieldName;
        }

        public final DuplicateContactNumberError copy(String fieldName) {
            j.g(fieldName, "fieldName");
            return new DuplicateContactNumberError(fieldName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DuplicateContactNumberError) && j.b(this.fieldName, ((DuplicateContactNumberError) obj).fieldName);
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            return this.fieldName.hashCode();
        }

        public String toString() {
            return s.j("DuplicateContactNumberError(fieldName=", this.fieldName, ")");
        }
    }

    public static final class DuplicationError extends UpdateProfileValidationResult {
        public static final DuplicationError INSTANCE = new DuplicationError();

        private DuplicationError() {
            super(null);
        }
    }

    public static final class OutOfRangeError extends UpdateProfileValidationResult {
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

    public static final class RegExError extends UpdateProfileValidationResult {
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegExError(String message) {
            super(null);
            j.g(message, "message");
            this.message = message;
        }

        public static /* synthetic */ RegExError copy$default(RegExError regExError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = regExError.message;
            }
            return regExError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final RegExError copy(String message) {
            j.g(message, "message");
            return new RegExError(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegExError) && j.b(this.message, ((RegExError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return s.j("RegExError(message=", this.message, ")");
        }
    }

    public static final class RequiredFieldError extends UpdateProfileValidationResult {
        private final UpdateProfileFieldType fieldType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldError(UpdateProfileFieldType fieldType) {
            super(null);
            j.g(fieldType, "fieldType");
            this.fieldType = fieldType;
        }

        public static /* synthetic */ RequiredFieldError copy$default(RequiredFieldError requiredFieldError, UpdateProfileFieldType updateProfileFieldType, int i, Object obj) {
            if ((i & 1) != 0) {
                updateProfileFieldType = requiredFieldError.fieldType;
            }
            return requiredFieldError.copy(updateProfileFieldType);
        }

        public final UpdateProfileFieldType component1() {
            return this.fieldType;
        }

        public final RequiredFieldError copy(UpdateProfileFieldType fieldType) {
            j.g(fieldType, "fieldType");
            return new RequiredFieldError(fieldType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequiredFieldError) && this.fieldType == ((RequiredFieldError) obj).fieldType;
        }

        public final UpdateProfileFieldType getFieldType() {
            return this.fieldType;
        }

        public int hashCode() {
            return this.fieldType.hashCode();
        }

        public String toString() {
            return "RequiredFieldError(fieldType=" + this.fieldType + ")";
        }
    }

    public static final class Success extends UpdateProfileValidationResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ UpdateProfileValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UpdateProfileValidationResult() {
    }
}
