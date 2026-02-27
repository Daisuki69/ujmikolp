package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes5.dex */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        final boolean iConvertByWeekyear;
        final long iCutover;
        protected DurationField iDurationField;
        final DateTimeField iGregorianField;
        final DateTimeField iJulianField;
        protected DurationField iRangeDurationField;

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(gJChronology, dateTimeField, dateTimeField2, j, false);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, int i) {
            return this.iGregorianField.add(j, i);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j) {
            return j >= this.iCutover ? this.iGregorianField.get(j) : this.iJulianField.get(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j, Locale locale) {
            return j >= this.iCutover ? this.iGregorianField.getAsShortText(j, locale) : this.iJulianField.getAsShortText(j, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j, Locale locale) {
            return j >= this.iCutover ? this.iGregorianField.getAsText(j, locale) : this.iJulianField.getAsText(j, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j, long j6) {
            return this.iGregorianField.getDifference(j, j6);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j, long j6) {
            return this.iGregorianField.getDifferenceAsLong(j, j6);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j) {
            return j >= this.iCutover ? this.iGregorianField.getLeapAmount(j) : this.iJulianField.getLeapAmount(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j) {
            return this.iConvertByWeekyear ? GJChronology.this.gregorianToJulianByWeekyear(j) : GJChronology.this.gregorianToJulianByYear(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j) {
            return j >= this.iCutover ? this.iGregorianField.isLeap(j) : this.iJulianField.isLeap(j);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j) {
            return this.iConvertByWeekyear ? GJChronology.this.julianToGregorianByWeekyear(j) : GJChronology.this.julianToGregorianByYear(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j);
            }
            long jRoundCeiling = this.iJulianField.roundCeiling(j);
            return (jRoundCeiling < this.iCutover || jRoundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? jRoundCeiling : julianToGregorian(jRoundCeiling);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j) {
            if (j < this.iCutover) {
                return this.iJulianField.roundFloor(j);
            }
            long jRoundFloor = this.iGregorianField.roundFloor(j);
            return (jRoundFloor >= this.iCutover || GJChronology.this.iGapDuration + jRoundFloor >= this.iCutover) ? jRoundFloor : gregorianToJulian(jRoundFloor);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, int i) {
            if (j >= this.iCutover) {
                long jGregorianToJulian = this.iGregorianField.set(j, i);
                if (jGregorianToJulian >= this.iCutover) {
                    return jGregorianToJulian;
                }
                if (GJChronology.this.iGapDuration + jGregorianToJulian < this.iCutover) {
                    jGregorianToJulian = gregorianToJulian(jGregorianToJulian);
                }
                if (get(jGregorianToJulian) == i) {
                    return jGregorianToJulian;
                }
                throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i), (Number) null, (Number) null);
            }
            long jJulianToGregorian = this.iJulianField.set(j, i);
            if (jJulianToGregorian < this.iCutover) {
                return jJulianToGregorian;
            }
            if (jJulianToGregorian - GJChronology.this.iGapDuration >= this.iCutover) {
                jJulianToGregorian = julianToGregorian(jJulianToGregorian);
            }
            if (get(jJulianToGregorian) == i) {
                return jJulianToGregorian;
            }
            throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i), (Number) null, (Number) null);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j, boolean z4) {
            this(dateTimeField, dateTimeField2, null, j, z4);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, long j6) {
            return this.iGregorianField.add(j, j6);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j);
            long j6 = this.iJulianField.set(j, maximumValue);
            long j7 = this.iCutover;
            if (j6 < j7) {
                return maximumValue;
            }
            DateTimeField dateTimeField = this.iJulianField;
            return dateTimeField.get(dateTimeField.add(j7, -1));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        public CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z4) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j;
            this.iConvertByWeekyear = z4;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.iRangeDurationField = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i4) {
            if (i4 == 0) {
                return iArr;
            }
            if (DateTimeUtils.isContiguous(readablePartial)) {
                int size = readablePartial.size();
                long j = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    j = readablePartial.getFieldType(i6).getField(GJChronology.this).set(j, iArr[i6]);
                }
                return GJChronology.this.get(readablePartial, add(j, i4));
            }
            return super.add(readablePartial, i, iArr, i4);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i, Locale locale) {
            return this.iGregorianField.getAsShortText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i, Locale locale) {
            return this.iGregorianField.getAsText(i, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j) {
            if (j < this.iCutover) {
                return this.iJulianField.getMinimumValue(j);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j);
            long j6 = this.iGregorianField.set(j, minimumValue);
            long j7 = this.iCutover;
            return j6 < j7 ? this.iGregorianField.get(j7) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                DateTimeField field = readablePartial.getFieldType(i).getField(instanceUTC);
                if (iArr[i] <= field.getMaximumValue(j)) {
                    j = field.set(j, iArr[i]);
                }
            }
            return getMaximumValue(j);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, String str, Locale locale) {
            if (j >= this.iCutover) {
                long j6 = this.iGregorianField.set(j, str, locale);
                return (j6 >= this.iCutover || GJChronology.this.iGapDuration + j6 >= this.iCutover) ? j6 : gregorianToJulian(j6);
            }
            long j7 = this.iJulianField.set(j, str, locale);
            return (j7 < this.iCutover || j7 - GJChronology.this.iGapDuration < this.iCutover) ? j7 : julianToGregorian(j7);
        }
    }

    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j, false);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, int i) {
            if (j < this.iCutover) {
                long jAdd = this.iJulianField.add(j, i);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j, i);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    jAdd2 = GJChronology.this.iGregorianChronology.weekyear().add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                jAdd2 = GJChronology.this.iGregorianChronology.year().add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j, long j6) {
            long j7 = this.iCutover;
            if (j >= j7) {
                if (j6 >= j7) {
                    return this.iGregorianField.getDifference(j, j6);
                }
                return this.iJulianField.getDifference(gregorianToJulian(j), j6);
            }
            if (j6 < j7) {
                return this.iJulianField.getDifference(j, j6);
            }
            return this.iGregorianField.getDifference(julianToGregorian(j), j6);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j, long j6) {
            long j7 = this.iCutover;
            if (j >= j7) {
                if (j6 >= j7) {
                    return this.iGregorianField.getDifferenceAsLong(j, j6);
                }
                return this.iJulianField.getDifferenceAsLong(gregorianToJulian(j), j6);
            }
            if (j6 < j7) {
                return this.iJulianField.getDifferenceAsLong(j, j6);
            }
            return this.iGregorianField.getDifferenceAsLong(julianToGregorian(j), j6);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j) {
            return j >= this.iCutover ? this.iGregorianField.getMaximumValue(j) : this.iJulianField.getMaximumValue(j);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j) {
            return j >= this.iCutover ? this.iGregorianField.getMinimumValue(j) : this.iJulianField.getMinimumValue(j);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
            this.iRangeDurationField = durationField2;
        }

        public ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z4) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j, z4);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j, long j6) {
            if (j >= this.iCutover) {
                long jAdd = this.iGregorianField.add(j, j6);
                if (jAdd >= this.iCutover || GJChronology.this.iGapDuration + jAdd >= this.iCutover) {
                    return jAdd;
                }
                if (this.iConvertByWeekyear) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd) <= 0) {
                        jAdd = GJChronology.this.iGregorianChronology.weekyear().add(jAdd, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(jAdd) <= 0) {
                    jAdd = GJChronology.this.iGregorianChronology.year().add(jAdd, -1);
                }
                return gregorianToJulian(jAdd);
            }
            long jAdd2 = this.iJulianField.add(j, j6);
            return (jAdd2 < this.iCutover || jAdd2 - GJChronology.this.iGapDuration < this.iCutover) ? jAdd2 : julianToGregorian(jAdd2);
        }
    }

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j, int i) {
            return this.iField.add(j, i);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j, long j6) {
            return this.iField.getDifference(j, j6);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j, long j6) {
            return this.iField.getDifferenceAsLong(j, j6);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j, long j6) {
            return this.iField.add(j, j6);
        }
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j)), chronology.weekOfWeekyear().get(j)), chronology.dayOfWeek().get(j)), chronology.millisOfDay().get(j));
    }

    private static long convertByYear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j), chronology.monthOfYear().get(j), chronology.dayOfMonth().get(j), chronology.millisOfDay().get(j));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j = this.iCutoverMillis;
        this.iGapDuration = j - julianToGregorianByYear(j);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GJChronology) {
            GJChronology gJChronology = (GJChronology) obj;
            if (this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i4, int i6, int i10) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i4, i6, i10);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i4, i6, i10);
        if (dateTimeMillis >= this.iCutoverMillis) {
            return dateTimeMillis;
        }
        long dateTimeMillis2 = this.iJulianChronology.getDateTimeMillis(i, i4, i6, i10);
        if (dateTimeMillis2 < this.iCutoverMillis) {
            return dateTimeMillis2;
        }
        throw new IllegalArgumentException("Specified date does not exist");
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return this.iCutoverInstant.hashCode() + getMinimumDaysInFirstWeek() + getZone().hashCode() + 25025;
    }

    public long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i) {
        Instant instant;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology = concurrentHashMap.get(gJCacheKey);
        if (gJChronology == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
            if (zone == dateTimeZone2) {
                gJChronology = new GJChronology(JulianChronology.getInstance(zone, i), GregorianChronology.getInstance(zone, i), instant);
            } else {
                GJChronology gJChronology2 = getInstance(dateTimeZone2, instant, i);
                gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology2, zone), gJChronology2.iJulianChronology, gJChronology2.iGregorianChronology, gJChronology2.iCutoverInstant);
            }
            GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology);
            if (gJChronologyPutIfAbsent != null) {
                return gJChronologyPutIfAbsent;
            }
        }
        return gJChronology;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i4, int i6, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        int i14;
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i4, i6, i10, i11, i12, i13);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i4, i6, i10, i11, i12, i13);
            i14 = i6;
        } catch (IllegalFieldValueException e) {
            i14 = i6;
            if (i4 == 2 && i14 == 29) {
                long dateTimeMillis2 = this.iGregorianChronology.getDateTimeMillis(i, i4, 28, i10, i11, i12, i13);
                if (dateTimeMillis2 >= this.iCutoverMillis) {
                    throw e;
                }
                dateTimeMillis = dateTimeMillis2;
            } else {
                throw e;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i4, i14, i10, i11, i12, i13);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        return getInstance(dateTimeZone, j == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j), i);
    }
}
