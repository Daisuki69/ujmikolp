package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.DurationField
        public long add(long j, int i) {
            return ImpreciseDateTimeField.this.add(j, i);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j, long j6) {
            return ImpreciseDateTimeField.this.getDifference(j, j6);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j, long j6) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j, j6);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i, long j) {
            return ImpreciseDateTimeField.this.add(j, i) - j;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j, long j6) {
            return ImpreciseDateTimeField.this.getDifference(j + j6, j6);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j, long j6) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j + j6, j6);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }

        @Override // org.joda.time.DurationField
        public long add(long j, long j6) {
            return ImpreciseDateTimeField.this.add(j, j6);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j, long j6) {
            return ImpreciseDateTimeField.this.add(j6, j) - j6;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.iUnitMillis = j;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j, int i);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j, long j6);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j, long j6) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j, j6));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j6) {
        if (j < j6) {
            return -getDifferenceAsLong(j6, j);
        }
        long j7 = (j - j6) / this.iUnitMillis;
        if (add(j6, j7) >= j) {
            if (add(j6, j7) > j) {
                do {
                    j7--;
                } while (add(j6, j7) > j);
            }
            return j7;
        }
        while (true) {
            long j9 = j7 + 1;
            if (add(j6, j9) > j) {
                return j7;
            }
            j7 = j9;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j, int i);
}
