package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, float f, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i4;
        this.height = i6;
        this.bitdepthLuma = i10;
        this.bitdepthChroma = i11;
        this.colorSpace = i12;
        this.colorRange = i13;
        this.colorTransfer = i14;
        this.maxNumReorderFrames = i15;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String strBuildAvcCodecString;
        int i;
        int i4;
        int i6;
        int i10;
        int i11;
        int i12;
        float f;
        int i13;
        int i14;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i15 = 0; i15 < unsignedByte2; i15++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i16 = 0; i16 < unsignedByte3; i16++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i17 = spsNalUnit.width;
                int i18 = spsNalUnit.height;
                int i19 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i20 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i21 = spsNalUnit.colorSpace;
                int i22 = spsNalUnit.colorRange;
                int i23 = spsNalUnit.colorTransfer;
                int i24 = spsNalUnit.maxNumReorderFrames;
                float f3 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i11 = i23;
                i12 = i24;
                f = f3;
                i10 = i20;
                i13 = i21;
                i14 = i22;
                i = i17;
                i4 = i18;
                i6 = i19;
            } else {
                strBuildAvcCodecString = null;
                i = -1;
                i4 = -1;
                i6 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i, i4, i6, i10, i13, i14, i11, i12, f, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
