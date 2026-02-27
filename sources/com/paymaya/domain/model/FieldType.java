package com.paymaya.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FieldType {
    private final String cmsName;
    private final String fieldName;
    private final boolean isDate;
    private final int maxLength;
    private final int minLength;

    public static final class AlternativeContactNumber extends FieldType {
        public static final AlternativeContactNumber INSTANCE = new AlternativeContactNumber();

        private AlternativeContactNumber() {
            super("alternativeContactNumber", 12, 0, false, "Alternate contact number", 12, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return false;
        }
    }

    public static final class CivilStatus extends FieldType {
        public static final CivilStatus INSTANCE = new CivilStatus();

        private CivilStatus() {
            super("", 30, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class CompanyName extends FieldType {
        public static final CompanyName INSTANCE = new CompanyName();

        private CompanyName() {
            super("companyName", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return z4;
        }
    }

    public static final class EducationalAttainment extends FieldType {
        public static final EducationalAttainment INSTANCE = new EducationalAttainment();

        private EducationalAttainment() {
            super("", 30, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class EmailAddress extends FieldType {
        public static final EmailAddress INSTANCE = new EmailAddress();

        private EmailAddress() {
            super("emailAddress", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return z4;
        }
    }

    public static final class FirstName extends FieldType {
        public static final FirstName INSTANCE = new FirstName();

        private FirstName() {
            super("firstName", 255, 1, false, null, 24, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isNameFieldType() {
            return true;
        }
    }

    public static final class Gender extends FieldType {
        public static final Gender INSTANCE = new Gender();

        private Gender() {
            super("", 30, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class JobTitle extends FieldType {
        public static final JobTitle INSTANCE = new JobTitle();

        private JobTitle() {
            super("", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return z4;
        }
    }

    public static final class LastName extends FieldType {
        public static final LastName INSTANCE = new LastName();

        private LastName() {
            super("lastName", 255, 2, false, null, 24, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isNameFieldType() {
            return true;
        }
    }

    public static final class MiddleName extends FieldType {
        public static final MiddleName INSTANCE = new MiddleName();

        private MiddleName() {
            super("middleName", 255, 2, false, null, 24, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return z4;
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isNameFieldType() {
            return true;
        }
    }

    public static final class MobileNumber extends FieldType {
        public static final MobileNumber INSTANCE = new MobileNumber();

        private MobileNumber() {
            super("mobileNumber", 12, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class MonthlyTakeHomePay extends FieldType {
        public static final MonthlyTakeHomePay INSTANCE = new MonthlyTakeHomePay();

        private MonthlyTakeHomePay() {
            super("monthlyTakeHomePay", 11, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class NatureOfWork extends FieldType {
        public static final NatureOfWork INSTANCE = new NatureOfWork();

        private NatureOfWork() {
            super("", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class Password extends FieldType {
        public static final Password INSTANCE = new Password();

        private Password() {
            super("password", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class Relationship extends FieldType {
        public static final Relationship INSTANCE = new Relationship();

        private Relationship() {
            super("", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return true;
        }
    }

    public static final class SSS extends FieldType {
        public static final SSS INSTANCE = new SSS();

        private SSS() {
            super("sssNumber", 10, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return false;
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isIdNumberFieldType() {
            return true;
        }
    }

    public static final class SourceOfIncome extends FieldType {
        public static final SourceOfIncome INSTANCE = new SourceOfIncome();

        private SourceOfIncome() {
            super("", 255, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return z4;
        }
    }

    public static final class TIN extends FieldType {
        public static final TIN INSTANCE = new TIN();

        private TIN() {
            super("tinNumber", 12, 0, false, null, 28, null);
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isFieldRequired(boolean z4) {
            return false;
        }

        @Override // com.paymaya.domain.model.FieldType
        public boolean isIdNumberFieldType() {
            return true;
        }
    }

    public /* synthetic */ FieldType(String str, int i, int i4, boolean z4, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i4, z4, str2);
    }

    public static /* synthetic */ boolean isFieldRequired$default(FieldType fieldType, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isFieldRequired");
        }
        if ((i & 1) != 0) {
            z4 = false;
        }
        return fieldType.isFieldRequired(z4);
    }

    public final String getCmsName() {
        return this.cmsName;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final boolean isDate() {
        return this.isDate;
    }

    public boolean isFieldRequired(boolean z4) {
        return false;
    }

    public boolean isIdNumberFieldType() {
        return false;
    }

    public boolean isNameFieldType() {
        return false;
    }

    private FieldType(String str, int i, int i4, boolean z4, String str2) {
        this.cmsName = str;
        this.maxLength = i;
        this.minLength = i4;
        this.isDate = z4;
        this.fieldName = str2;
    }

    public /* synthetic */ FieldType(String str, int i, int i4, boolean z4, String str2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i6 & 4) != 0 ? 0 : i4, (i6 & 8) != 0 ? false : z4, (i6 & 16) != 0 ? "" : str2, null);
    }
}
