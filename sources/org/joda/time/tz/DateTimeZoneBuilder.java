package org.joda.time.tz;

import We.s;
import androidx.camera.core.impl.a;
import androidx.camera.video.AudioStats;
import androidx.media3.extractor.ts.PsExtractor;
import com.dynatrace.android.agent.Global;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j) {
            long next;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j;
            }
            try {
                j = recurrence2.next(j, i, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DSTZone) {
                DSTZone dSTZone = (DSTZone) obj;
                if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            return findMatchingRecurrence(j).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            long next;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j > 0 && next < 0) {
                next = j;
            }
            try {
                long next2 = recurrence2.next(j, i, recurrence.getSaveMillis());
                if (j <= 0 || next2 >= 0) {
                    j = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j ? j : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long jPrevious;
            long j6 = j + 1;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j6, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j6 < 0 && jPrevious > 0) {
                jPrevious = j6;
            }
            try {
                long jPrevious2 = recurrence2.previous(j6, i, recurrence.getSaveMillis());
                if (j6 >= 0 || jPrevious2 <= 0) {
                    j6 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j6) {
                jPrevious = j6;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c, int i, int i4, int i6, boolean z4, int i10) {
            if (c != 'u' && c != 'w' && c != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c);
            }
            this.iMode = c;
            this.iMonthOfYear = i;
            this.iDayOfMonth = i4;
            this.iDayOfWeek = i6;
            this.iAdvance = z4;
            this.iMillisOfDay = i10;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e;
                }
                while (!chronology.year().isLeap(j)) {
                    j = chronology.year().add(j, 1);
                }
                return setDayOfMonth(chronology, j);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e;
                }
                while (!chronology.year().isLeap(j)) {
                    j = chronology.year().add(j, -1);
                }
                return setDayOfMonth(chronology, j);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j) {
            int i = this.iDayOfWeek - chronology.dayOfWeek().get(j);
            if (i == 0) {
                return j;
            }
            if (this.iAdvance) {
                if (i < 0) {
                    i += 7;
                }
            } else if (i > 0) {
                i -= 7;
            }
            return chronology.dayOfWeek().add(j, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OfYear) {
                OfYear ofYear = (OfYear) obj;
                if (this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay) {
                    return true;
                }
            }
            return false;
        }

        public long next(long j, int i, int i4) {
            char c = this.iMode;
            if (c == 'w') {
                i += i4;
            } else if (c != 's') {
                i = 0;
            }
            long j6 = i;
            long j7 = j + j6;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j7, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j7) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j7) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return dayOfMonthNext - j6;
        }

        public long previous(long j, int i, int i4) {
            char c = this.iMode;
            if (c == 'w') {
                i += i4;
            } else if (c != 's') {
                i = 0;
            }
            long j6 = i;
            long j7 = j + j6;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j7, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j7) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j7) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return dayOfMonthPrevious - j6;
        }

        public long setInstant(int i, int i4, int i6) {
            char c = this.iMode;
            if (c == 'w') {
                i4 += i6;
            } else if (c != 's') {
                i4 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i4);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[OfYear]\nMode: ");
            sb2.append(this.iMode);
            sb2.append("\nMonthOfYear: ");
            sb2.append(this.iMonthOfYear);
            sb2.append("\nDayOfMonth: ");
            sb2.append(this.iDayOfMonth);
            sb2.append("\nDayOfWeek: ");
            sb2.append(this.iDayOfWeek);
            sb2.append("\nAdvanceDayOfWeek: ");
            sb2.append(this.iAdvance);
            sb2.append("\nMillisOfDay: ");
            return s.m(sb2, this.iMillisOfDay, '\n');
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z4, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            int[] iArr;
            int[] iArr2;
            String[] strArr;
            int i;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[size];
            int[] iArr3 = new int[size];
            int[] iArr4 = new int[size];
            String[] strArr2 = new String[size];
            int i4 = 0;
            Transition transition = null;
            int i6 = 0;
            while (i6 < size) {
                Transition transition2 = arrayList.get(i6);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr[i6] = transition2.getMillis();
                iArr3[i6] = transition2.getWallOffset();
                iArr4[i6] = transition2.getStandardOffset();
                strArr2[i6] = transition2.getNameKey();
                i6++;
                transition = transition2;
            }
            String[] strArr3 = new String[5];
            for (String[] strArr4 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr4 != null && strArr4.length == 5 && str.equals(strArr4[0])) {
                    strArr3 = strArr4;
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i4 < size - 1) {
                String str2 = strArr2[i4];
                int i10 = i4 + 1;
                String str3 = strArr2[i10];
                long j = iArr3[i4];
                int i11 = size;
                int i12 = i4;
                long j6 = iArr3[i10];
                long j7 = iArr4[i12];
                long j9 = iArr4[i10];
                Period period = new Period(jArr[i12], jArr[i10], PeriodType.yearMonthDay(), instanceUTC);
                ISOChronology iSOChronology = instanceUTC;
                if (j != j6 && j7 == j9 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr3[2]) && str2.equals(strArr3[4])) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate name key - " + str3);
                        PrintStream printStream = System.out;
                        StringBuilder sb2 = new StringBuilder("     - ");
                        iArr = iArr3;
                        iArr2 = iArr4;
                        sb2.append(new DateTime(jArr[i12], iSOChronology));
                        sb2.append(" - ");
                        strArr = strArr2;
                        sb2.append(new DateTime(jArr[i10], iSOChronology));
                        printStream.println(sb2.toString());
                    } else {
                        iArr = iArr3;
                        iArr2 = iArr4;
                        strArr = strArr2;
                    }
                    if (j > j6) {
                        strArr[i12] = str2.concat("-Summer").intern();
                    } else {
                        if (j < j6) {
                            strArr[i10] = (str3 + "-Summer").intern();
                            i = i10;
                        }
                        i4 = i + 1;
                        instanceUTC = iSOChronology;
                        strArr2 = strArr;
                        iArr3 = iArr;
                        iArr4 = iArr2;
                        size = i11;
                    }
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    strArr = strArr2;
                }
                i = i12;
                i4 = i + 1;
                instanceUTC = iSOChronology;
                strArr2 = strArr;
                iArr3 = iArr;
                iArr4 = iArr2;
                size = i11;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            String[] strArr5 = strArr2;
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z4 ? str : "", jArr, iArr5, iArr6, strArr5, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i = 0; i < unsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int i4 = dataInput.readInt();
            long[] jArr = new long[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            String[] strArr2 = new String[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                jArr[i6] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i6] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i6] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i6] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrecalculatedZone) {
                PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
                if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                    DSTZone dSTZone = this.iTailZone;
                    DSTZone dSTZone2 = precalculatedZone.iTailZone;
                    if (dSTZone != null ? dSTZone.equals(dSTZone2) : dSTZone2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i < jArr.length) {
                return i > 0 ? this.iNameKeys[i - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i - 1] : dSTZone.getNameKey(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i - 1] : dSTZone.getOffset(j);
            }
            if (i > 0) {
                return this.iWallOffsets[i - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i = ~iBinarySearch;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i - 1] : dSTZone.getStandardOffset(j);
            }
            if (i > 0) {
                return this.iStandardOffsets[i - 1];
            }
            return 0;
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            int i = 0;
            for (int i4 = 1; i4 < jArr.length; i4++) {
                long j = jArr[i4] - jArr[i4 - 1];
                if (j < 63158400000L) {
                    d10 += j;
                    i++;
                }
            }
            return i > 0 && (d10 / ((double) i)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            int i = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j;
            }
            long j6 = jArr[jArr.length - 1];
            if (j < j6) {
                j = j6;
            }
            return dSTZone.nextTransition(j);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j);
            if (iBinarySearch < 0) {
                int i = ~iBinarySearch;
                if (i >= jArr.length) {
                    DSTZone dSTZone = this.iTailZone;
                    if (dSTZone != null) {
                        long jPreviousTransition = dSTZone.previousTransition(j);
                        if (jPreviousTransition < j) {
                            return jPreviousTransition;
                        }
                    }
                    long j6 = jArr[i - 1];
                    if (j6 > Long.MIN_VALUE) {
                        return j6 - 1;
                    }
                } else if (i > 0) {
                    long j7 = jArr[i - 1];
                    if (j7 > Long.MIN_VALUE) {
                        return j7 - 1;
                    }
                }
            } else if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return j;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                strArr[i4] = (String) it.next();
                i4++;
            }
            dataOutput.writeShort(size);
            for (int i6 = 0; i6 < size; i6++) {
                dataOutput.writeUTF(strArr[i6]);
            }
            dataOutput.writeInt(length);
            for (int i10 = 0; i10 < length; i10++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i10]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i10]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i10]);
                String str = this.iNameKeys[i10];
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (!strArr[i11].equals(str)) {
                        i11++;
                    } else if (size < 256) {
                        dataOutput.writeByte(i11);
                    } else {
                        dataOutput.writeShort(i11);
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj;
                if (this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear)) {
                    return true;
                }
            }
            return false;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public long next(long j, int i, int i4) {
            return this.iOfYear.next(j, i, i4);
        }

        public long previous(long j, int i, int i4) {
            return this.iOfYear.previous(j, i, i4);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i, int i4) {
            this.iRecurrence = recurrence;
            this.iFromYear = i;
            this.iToYear = i4;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j, int i, int i4) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i6 = i + i4;
            long next = this.iRecurrence.next(((j > Long.MIN_VALUE ? 1 : (j == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i6) + j)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i6)) - 1 : j, i, i4);
            return (next <= j || instanceUTC.year().get(((long) i6) + next) <= this.iToYear) ? next : j;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i = size - 1;
        Transition transition2 = arrayList.get(i);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) == transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            return addTransition(arrayList, transition.withMillis(arrayList.remove(i).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i, int i4) {
        return ("UTC".equals(str) && str.equals(str2) && i == 0 && i4 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i, i4);
    }

    private RuleSet getLastRuleSet() {
        DateTimeZoneBuilder dateTimeZoneBuilder;
        if (this.iRuleSets.size() == 0) {
            dateTimeZoneBuilder = this;
            dateTimeZoneBuilder.addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        } else {
            dateTimeZoneBuilder = this;
        }
        return (RuleSet) a.b(1, dateTimeZoneBuilder.iRuleSets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }

    public static void writeMillis(DataOutput dataOutput, long j) throws IOException {
        if (j % 1800000 == 0) {
            long j6 = j / 1800000;
            if (((j6 << 58) >> 58) == j6) {
                dataOutput.writeByte((int) (j6 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j7 = j / 60000;
            if (((j7 << 34) >> 34) == j7) {
                dataOutput.writeInt(((int) (1073741823 & j7)) | 1073741824);
                return;
            }
        }
        if (j % 1000 == 0) {
            long j9 = j / 1000;
            if (((j9 << 26) >> 26) == j9) {
                dataOutput.writeByte(((int) ((j9 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j9);
                return;
            }
        }
        dataOutput.writeByte(j < 0 ? 255 : PsExtractor.AUDIO_STREAM);
        dataOutput.writeLong(j);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int i4, int i6, int i10, boolean z4, int i11) {
        if (this.iRuleSets.size() > 0) {
            ((RuleSet) a.b(1, this.iRuleSets)).setUpperLimit(i, new OfYear(c, i4, i6, i10, z4, i11));
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i4, int i6, char c, int i10, int i11, int i12, boolean z4, int i13) {
        if (i4 <= i6) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c, i10, i11, i12, z4, i13), str, i), i4, i6));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        getLastRuleSet().setFixedSavings(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z4) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        int size = this.iRuleSets.size();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            RuleSet ruleSet = this.iRuleSets.get(i);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z4, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i = this.iStandardOffset;
                return new Transition(j, str, i + this.iInitialSaveMillis, i);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long millis = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(millis, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                millis = transitionNextTransition.getMillis();
                if (millis == j) {
                    transition = new Transition(j, transitionNextTransition);
                    break;
                }
                if (millis > j) {
                    if (transition == null) {
                        Iterator<Rule> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Rule next = it.next();
                            if (next.getSaveMillis() == 0) {
                                transition = new Transition(j, next, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition == null) {
                        String nameKey = transitionNextTransition.getNameKey();
                        int i4 = this.iStandardOffset;
                        transition = new Transition(j, nameKey, i4, i4);
                    }
                } else {
                    transition = new Transition(j, transitionNextTransition);
                    saveMillis = transitionNextTransition.getSaveMillis();
                }
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i) {
            int i4 = this.iUpperYear;
            if (i4 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i4, this.iStandardOffset, i);
        }

        public Transition nextTransition(long j, int i) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j6 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j, this.iStandardOffset, i);
                if (next2 <= j) {
                    it.remove();
                } else if (next2 <= j6) {
                    rule = next;
                    j6 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j6) >= YEAR_LIMIT) {
                return null;
            }
            int i4 = this.iUpperYear;
            if (i4 >= Integer.MAX_VALUE || j6 < this.iUpperOfYear.setInstant(i4, this.iStandardOffset, i)) {
                return new Transition(j6, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i;
        }

        public void setStandardOffset(int i) {
            this.iStandardOffset = i;
        }

        public void setUpperLimit(int i, OfYear ofYear) {
            this.iUpperYear = i;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + Global.BLANK + this.iUpperOfYear + Global.BLANK + this.iRules;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j, Transition transition) {
            this.iMillis = j;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis) {
                return (this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey)) ? false : true;
            }
            return false;
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + Global.BLANK + this.iStandardOffset + Global.BLANK + this.iWallOffset;
        }

        public Transition withMillis(long j) {
            return new Transition(j, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }

        public Transition(long j, Rule rule, int i) {
            this.iMillis = j;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i;
            this.iStandardOffset = i;
        }

        public Transition(long j, String str, int i, int i4) {
            this.iMillis = j;
            this.iNameKey = str;
            this.iWallOffset = i;
            this.iStandardOffset = i4;
        }
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
