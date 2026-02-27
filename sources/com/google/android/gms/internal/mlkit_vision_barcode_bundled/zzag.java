package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.paymaya.domain.model.MfaTencentErrorResult;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
final class zzag implements zzel {
    static final zzel zza = new zzag();

    private zzag() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i) {
        if (i == 129 || i == 161 || i == 209 || i == 2705 || i == 20753 || i == 20769 || i == 215 || i == 216 || i == 1297 || i == 1298) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    default:
                        switch (i) {
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                return true;
                            default:
                                switch (i) {
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                                    case 169:
                                        return true;
                                    default:
                                        switch (i) {
                                            case MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED /* 211 */:
                                            case MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS /* 212 */:
                                            case MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE /* 213 */:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
