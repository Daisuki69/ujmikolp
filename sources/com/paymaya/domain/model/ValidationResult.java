package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ValidationResult {

    public static final class DuplicateContactNumberError extends ValidationResult {
        private final FieldType fieldType;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateContactNumberError(FieldType fieldType, String str) {
            super(null);
            j.g(fieldType, "fieldType");
            this.fieldType = fieldType;
            this.message = str;
        }

        public static /* synthetic */ DuplicateContactNumberError copy$default(DuplicateContactNumberError duplicateContactNumberError, FieldType fieldType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldType = duplicateContactNumberError.fieldType;
            }
            if ((i & 2) != 0) {
                str = duplicateContactNumberError.message;
            }
            return duplicateContactNumberError.copy(fieldType, str);
        }

        public final FieldType component1() {
            return this.fieldType;
        }

        public final String component2() {
            return this.message;
        }

        public final DuplicateContactNumberError copy(FieldType fieldType, String str) {
            j.g(fieldType, "fieldType");
            return new DuplicateContactNumberError(fieldType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DuplicateContactNumberError)) {
                return false;
            }
            DuplicateContactNumberError duplicateContactNumberError = (DuplicateContactNumberError) obj;
            return j.b(this.fieldType, duplicateContactNumberError.fieldType) && j.b(this.message, duplicateContactNumberError.message);
        }

        public final FieldType getFieldType() {
            return this.fieldType;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.fieldType.hashCode() * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DuplicateContactNumberError(fieldType=" + this.fieldType + ", message=" + this.message + ")";
        }

        public /* synthetic */ DuplicateContactNumberError(FieldType fieldType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldType, (i & 2) != 0 ? null : str);
        }
    }

    public static final class DuplicationError extends ValidationResult {
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public DuplicationError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DuplicationError copy$default(DuplicationError duplicationError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = duplicationError.message;
            }
            return duplicationError.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final DuplicationError copy(String str) {
            return new DuplicationError(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DuplicationError) && j.b(this.message, ((DuplicationError) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return s.j("DuplicationError(message=", this.message, ")");
        }

        public DuplicationError(String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ DuplicationError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class RegExError extends ValidationResult {
        private final FieldType fieldType;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegExError(FieldType fieldType, String str) {
            super(null);
            j.g(fieldType, "fieldType");
            this.fieldType = fieldType;
            this.message = str;
        }

        public static /* synthetic */ RegExError copy$default(RegExError regExError, FieldType fieldType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldType = regExError.fieldType;
            }
            if ((i & 2) != 0) {
                str = regExError.message;
            }
            return regExError.copy(fieldType, str);
        }

        public final FieldType component1() {
            return this.fieldType;
        }

        public final String component2() {
            return this.message;
        }

        public final RegExError copy(FieldType fieldType, String str) {
            j.g(fieldType, "fieldType");
            return new RegExError(fieldType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegExError)) {
                return false;
            }
            RegExError regExError = (RegExError) obj;
            return j.b(this.fieldType, regExError.fieldType) && j.b(this.message, regExError.message);
        }

        public final FieldType getFieldType() {
            return this.fieldType;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.fieldType.hashCode() * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RegExError(fieldType=" + this.fieldType + ", message=" + this.message + ")";
        }

        public /* synthetic */ RegExError(FieldType fieldType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldType, (i & 2) != 0 ? null : str);
        }
    }

    public static final class RequiredFieldError extends ValidationResult {
        private final FieldType fieldType;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredFieldError(FieldType fieldType, String str) {
            super(null);
            j.g(fieldType, "fieldType");
            this.fieldType = fieldType;
            this.message = str;
        }

        public static /* synthetic */ RequiredFieldError copy$default(RequiredFieldError requiredFieldError, FieldType fieldType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldType = requiredFieldError.fieldType;
            }
            if ((i & 2) != 0) {
                str = requiredFieldError.message;
            }
            return requiredFieldError.copy(fieldType, str);
        }

        public final FieldType component1() {
            return this.fieldType;
        }

        public final String component2() {
            return this.message;
        }

        public final RequiredFieldError copy(FieldType fieldType, String str) {
            j.g(fieldType, "fieldType");
            return new RequiredFieldError(fieldType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequiredFieldError)) {
                return false;
            }
            RequiredFieldError requiredFieldError = (RequiredFieldError) obj;
            return j.b(this.fieldType, requiredFieldError.fieldType) && j.b(this.message, requiredFieldError.message);
        }

        public final FieldType getFieldType() {
            return this.fieldType;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.fieldType.hashCode() * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "RequiredFieldError(fieldType=" + this.fieldType + ", message=" + this.message + ")";
        }

        public /* synthetic */ RequiredFieldError(FieldType fieldType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldType, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Success extends ValidationResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ValidationResult() {
    }
}
