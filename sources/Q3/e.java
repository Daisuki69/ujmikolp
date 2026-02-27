package Q3;

import We.s;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.paymaya.domain.model.MfaTencentErrorResult;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5210a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f5211b = {new int[]{MfaTencentErrorResult.TENCENT_ERROR_NO_FACE_WHILE_CAPTURING, 48, 15, 111, 62}, new int[]{23, 68, 144, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, PsExtractor.VIDEO_STREAM_MASK, 92, 254}, new int[]{28, 24, 185, 166, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, 248, 116, 255, 110, 61}, new int[]{175, TsExtractor.TS_STREAM_TYPE_DTS, 205, 12, 194, DateTimeConstants.HOURS_PER_WEEK, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 97, 178, 100, 242}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, 119, TsExtractor.TS_STREAM_TYPE_DTS, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, TsExtractor.TS_PACKET_SIZE, 75, 66, 61, 241, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 109, TsExtractor.TS_STREAM_TYPE_AC3, 94, 254, 225, 48, 90, TsExtractor.TS_PACKET_SIZE}, new int[]{15, 195, 244, 9, 233, 71, DateTimeConstants.HOURS_PER_WEEK, 2, TsExtractor.TS_PACKET_SIZE, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, TsExtractor.TS_STREAM_TYPE_AC4}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, ModuleDescriptor.MODULE_VERSION, 197, 251, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, ModuleDescriptor.MODULE_VERSION, 21, 5, TsExtractor.TS_STREAM_TYPE_AC4, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, TsExtractor.TS_STREAM_TYPE_DTS, 110, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 141, TsExtractor.TS_STREAM_TYPE_DTS_HD, 120, 151, 233, DateTimeConstants.HOURS_PER_WEEK, 93, 255}, new int[]{245, 127, 242, MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, 130, 250, 162, 181, 102, 120, 84, 179, MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, 177, 226, 5, 9, 5}, new int[]{245, 132, TsExtractor.TS_STREAM_TYPE_AC4, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, 96, 32, 117, 22, 238, 133, 238, 231, 205, TsExtractor.TS_PACKET_SIZE, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, TsExtractor.TS_STREAM_TYPE_DTS, 186, PsExtractor.VIDEO_STREAM_MASK, 82, 44, 176, 87, 187, 147, 160, 175, 69, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 92, 253, 225, 19}, new int[]{175, 9, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, 238, 12, 17, MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, 208, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION, 235, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, 159, 36, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, 38, 200, 132, 54, MfaTencentErrorResult.TENCENT_ERROR_NO_FACE_WHILE_CAPTURING, 146, MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, 234, 117, 203, 29, 232, 144, 238, 22, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, ModuleDescriptor.MODULE_VERSION, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, TsExtractor.TS_PACKET_SIZE, 201, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, 185, 112, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, 51, 63, 87, 10, 40, 130, TsExtractor.TS_PACKET_SIZE, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, MfaTencentErrorResult.TENCENT_ERROR_NO_FACE_WHILE_CAPTURING, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, TsExtractor.TS_STREAM_TYPE_DTS_HD, 248, 180, 234, 197, 158, 177, 68, 122, 93, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 15, 160, 227, 236, 66, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 153, 185, 202, 167, 179, 25, MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, 232, 96, 210, 231, TsExtractor.TS_STREAM_TYPE_DTS_HD, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, 239, 181, 241, 59, 52, TsExtractor.TS_STREAM_TYPE_AC4, 25, 49, 232, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    public static final int[] c = new int[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5212d = new int[255];

    static {
        int i = 1;
        for (int i4 = 0; i4 < 255; i4++) {
            f5212d[i4] = i;
            c[i] = i4;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    public static String a(int i, String str) {
        int[] iArr;
        int[] iArr2;
        int i4;
        int i6;
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= 16) {
                i10 = -1;
                break;
            }
            if (f5210a[i10] == i) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(s.f(i, "Illegal number of error correction codewords specified: "));
        }
        int[] iArr3 = f5211b[i10];
        char[] cArr = new char[i];
        for (int i11 = 0; i11 < i; i11++) {
            cArr[i11] = 0;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i - 1;
            int iCharAt = cArr[i13] ^ str.charAt(i12);
            while (true) {
                iArr = c;
                iArr2 = f5212d;
                if (i13 <= 0) {
                    break;
                }
                if (iCharAt == 0 || (i6 = iArr3[i13]) == 0) {
                    cArr[i13] = cArr[i13 - 1];
                } else {
                    cArr[i13] = (char) (iArr2[(iArr[iCharAt] + iArr[i6]) % 255] ^ cArr[i13 - 1]);
                }
                i13--;
            }
            if (iCharAt == 0 || (i4 = iArr3[0]) == 0) {
                cArr[0] = 0;
            } else {
                cArr[0] = (char) iArr2[(iArr[iCharAt] + iArr[i4]) % 255];
            }
        }
        char[] cArr2 = new char[i];
        for (int i14 = 0; i14 < i; i14++) {
            cArr2[i14] = cArr[(i - i14) - 1];
        }
        return String.valueOf(cArr2);
    }
}
