package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, float f, int i15, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i4;
        this.height = i6;
        this.bitdepthLuma = i10;
        this.bitdepthChroma = i11;
        this.colorSpace = i12;
        this.colorRange = i13;
        this.colorTransfer = i14;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i15;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z4;
        int i;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i4 = 0;
            int i6 = 0;
            int i10 = 0;
            while (true) {
                z4 = true;
                if (i6 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i11 = 0; i11 < unsignedShort; i11++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i10 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i6++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i10];
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f = 1.0f;
            String strBuildHevcCodecString = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i22 = i4;
                while (i22 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z5 = z4;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i23 = unsignedByte;
                    System.arraycopy(bArr2, i4, bArr, i21, bArr2.length);
                    int length = i21 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i22 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i12 = h265SpsNalUnit.width;
                        i13 = h265SpsNalUnit.height;
                        i14 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i15 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i24 = h265SpsNalUnit.colorSpace;
                        int i25 = h265SpsNalUnit.colorRange;
                        i = unsignedByte2;
                        int i26 = h265SpsNalUnit.colorTransfer;
                        float f3 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i27 = h265SpsNalUnit.maxNumReorderPics;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                        f = f3;
                        i19 = i27;
                        i17 = i25;
                        i18 = i26;
                        i16 = i24;
                    } else {
                        i = unsignedByte2;
                    }
                    i21 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i22++;
                    z4 = z5;
                    unsignedByte = i23;
                    unsignedByte2 = i;
                    i4 = 0;
                }
                i20++;
                i4 = 0;
            }
            return new HevcConfig(i10 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i12, i13, i14, i15, i16, i17, i18, f, i19, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}
