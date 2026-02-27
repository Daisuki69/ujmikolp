package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = durationFieldType;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j, long j6) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j, j6));
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i) {
        return getUnitMillis() * ((long) i);
    }

    @Override // org.joda.time.DurationField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j) {
        return FieldUtils.safeToInt(getValueAsLong(j));
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j) {
        return j / getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "DurationField[" + getName() + ']';
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        long unitMillis = durationField.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j) {
        return FieldUtils.safeMultiply(j, getUnitMillis());
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j, long j6) {
        return FieldUtils.safeToInt(getValueAsLong(j, j6));
    }
}
