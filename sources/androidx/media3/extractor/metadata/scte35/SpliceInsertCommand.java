package androidx.media3.extractor.metadata.scte35;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i, long j, long j6) {
            this.componentTag = i;
            this.componentSplicePts = j;
            this.componentSplicePlaybackPositionUs = j6;
        }
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j, TimestampAdjuster timestampAdjuster) {
        List list;
        long j6;
        boolean z4;
        boolean z5;
        boolean z8;
        boolean z9;
        int i;
        int unsignedByte;
        int unsignedByte2;
        boolean z10;
        int i4;
        long spliceTime;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z11 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = C.TIME_UNSET;
        if (z11) {
            list = list2;
            j6 = -9223372036854775807L;
            z4 = false;
            z5 = false;
            z8 = false;
            z9 = false;
            i = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z12 = (unsignedByte3 & 128) != 0;
            boolean z13 = (unsignedByte3 & 64) != 0;
            boolean z14 = (unsignedByte3 & 32) != 0;
            boolean z15 = (unsignedByte3 & 16) != 0;
            long spliceTime2 = (!z13 || z15) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j);
            if (!z13) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i6 = 0;
                while (i6 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    if (z15) {
                        i4 = unsignedByte4;
                        spliceTime = -9223372036854775807L;
                    } else {
                        i4 = unsignedByte4;
                        spliceTime = TimeSignalCommand.parseSpliceTime(parsableByteArray, j);
                    }
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime)));
                    i6++;
                    unsignedByte4 = i4;
                }
                list2 = arrayList;
            }
            if (z14) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z16 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z10 = z16;
            } else {
                z10 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j7 = spliceTime2;
            j6 = unsignedInt2;
            unsignedInt2 = j7;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i = unsignedShort;
            z9 = z10;
            z4 = z12;
            z5 = z13;
            list = list2;
            z8 = z15;
        }
        return new SpliceInsertCommand(unsignedInt, z11, z4, z5, z8, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z9, j6, i, unsignedByte, unsignedByte2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.programSplicePts);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return s.h(this.programSplicePlaybackPositionUs, " }", sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            this.componentSpliceList.get(i4).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j, boolean z4, boolean z5, boolean z8, boolean z9, long j6, long j7, List<ComponentSplice> list, boolean z10, long j9, int i, int i4, int i6) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z4;
        this.outOfNetworkIndicator = z5;
        this.programSpliceFlag = z8;
        this.spliceImmediateFlag = z9;
        this.programSplicePts = j6;
        this.programSplicePlaybackPositionUs = j7;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z10;
        this.breakDurationUs = j9;
        this.uniqueProgramId = i;
        this.availNum = i4;
        this.availsExpected = i6;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
