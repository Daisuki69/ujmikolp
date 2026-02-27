package org.joda.time.chrono;

import androidx.camera.core.impl.a;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        if (i == 0) {
            return j;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int i13 = monthOfYear - 1;
        int i14 = i13 + i;
        if (monthOfYear <= 0 || i14 >= 0) {
            i4 = year;
        } else {
            if (Math.signum(this.iMax + i) == Math.signum(i)) {
                i11 = year - 1;
                i12 = i + this.iMax;
            } else {
                i11 = year + 1;
                i12 = i - this.iMax;
            }
            int i15 = i11;
            i14 = i12 + i13;
            i4 = i15;
        }
        if (i14 >= 0) {
            int i16 = this.iMax;
            i6 = (i14 / i16) + i4;
            i10 = (i14 % i16) + 1;
        } else {
            i6 = (i14 / this.iMax) + i4;
            int i17 = i6 - 1;
            int iAbs = Math.abs(i14);
            int i18 = this.iMax;
            int i19 = iAbs % i18;
            if (i19 == 0) {
                i19 = i18;
            }
            i10 = (i18 - i19) + 1;
            if (i10 != 1) {
                i6 = i17;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i6, i10);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i6, i10, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.iChronology.getMonthOfYear(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j6) {
        if (j < j6) {
            return -getDifference(j6, j);
        }
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int year2 = this.iChronology.getYear(j6);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j6, year2);
        long j7 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j6, year2, monthOfYear2) > dayOfMonth) {
            j6 = this.iChronology.dayOfMonth().set(j6, dayOfMonth);
        }
        return j - this.iChronology.getYearMonthMillis(year, monthOfYear) < j6 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j7 - 1 : j7;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j, year) == this.iLeapMonth;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.iMax);
        int year = this.iChronology.getYear(j);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j6) {
        long j7;
        long j9;
        long j10;
        int i = (int) j6;
        if (i == j6) {
            return add(j, i);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        long j11 = ((long) (monthOfYear - 1)) + j6;
        if (j11 >= 0) {
            int i4 = this.iMax;
            j10 = (j11 / ((long) i4)) + ((long) year);
            j9 = (j11 % ((long) i4)) + 1;
            j7 = millisOfDay;
        } else {
            long j12 = ((long) year) + (j11 / ((long) this.iMax));
            long j13 = j12 - 1;
            long jAbs = Math.abs(j11);
            int i6 = this.iMax;
            j7 = millisOfDay;
            int i10 = (int) (jAbs % ((long) i6));
            if (i10 == 0) {
                i10 = i6;
            }
            j9 = (i6 - i10) + 1;
            j10 = j9 == 1 ? j12 : j13;
        }
        if (j10 >= this.iChronology.getMinYear() && j10 <= this.iChronology.getMaxYear()) {
            int i11 = (int) j10;
            int i12 = (int) j9;
            int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
            int daysInYearMonth = this.iChronology.getDaysInYearMonth(i11, i12);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.iChronology.getYearMonthDayMillis(i11, i12, dayOfMonth) + j7;
        }
        throw new IllegalArgumentException(a.f(j6, "Magnitude of add amount is too large: "));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i4) {
        if (i4 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(readablePartial, 0, iArr, ((((i4 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j = 0;
            for (int i6 = 0; i6 < size; i6++) {
                j = readablePartial.getFieldType(i6).getField(this.iChronology).set(j, iArr[i6]);
            }
            return this.iChronology.get(readablePartial, add(j, i4));
        }
        return super.add(readablePartial, i, iArr, i4);
    }
}
