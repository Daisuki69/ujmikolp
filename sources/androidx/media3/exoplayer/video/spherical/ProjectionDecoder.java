package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    @Nullable
    public static Projection decode(byte[] bArr, int i) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i == 1886547818;
    }

    @Nullable
    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i > 10000) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i4 = 0; i4 < i; i4++) {
            fArr[i4] = parsableByteArray.readFloat();
        }
        int i6 = parsableByteArray.readInt();
        if (i6 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i10 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i6 * 5];
        int[] iArr = new int[5];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i6) {
            Projection.Mesh mesh2 = mesh;
            int i13 = 0;
            while (i13 < 5) {
                int iDecodeZigZag = iArr[i13] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i || iDecodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i12] = fArr[iDecodeZigZag];
                iArr[i13] = iDecodeZigZag;
                i13++;
                i12++;
            }
            i11++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i14 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i15 = 0;
        while (i15 < bits) {
            int bits2 = parsableBitArray.readBits(i10);
            int bits3 = parsableBitArray.readBits(i10);
            int bits4 = parsableBitArray.readBits(i14);
            if (bits4 > 128000) {
                return mesh3;
            }
            int i16 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i6) * d10) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i17 = 0;
            int i18 = 0;
            while (i17 < bits4) {
                int iDecodeZigZag2 = i18 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i6) {
                    return mesh3;
                }
                int i19 = i17 * 3;
                int i20 = iDecodeZigZag2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i17 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
                i17++;
                i18 = iDecodeZigZag2;
            }
            subMeshArr[i15] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i15++;
            bits = i16;
            i14 = 32;
            d10 = 2.0d;
            i10 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i = parsableByteArray.readInt();
        if (i == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (i != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i = parsableByteArray.readInt() + position) > position && i <= iLimit) {
            int i4 = parsableByteArray.readInt();
            if (i4 == TYPE_YTMP || i4 == TYPE_MSHP) {
                parsableByteArray.setLimit(i);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i);
            position = i;
        }
        return null;
    }

    @Nullable
    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i = parsableByteArray.readInt() + position;
            if (i <= position || i > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i);
            position = i;
        }
        return arrayList;
    }
}
