package y4;

import M8.A0;
import androidx.camera.video.AudioStats;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.timepicker.TimeModel;
import com.mastercard.mpqr.pushpayment.exception.ConflictiveTagException;
import com.mastercard.mpqr.pushpayment.exception.FormatException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.MissingTagException;
import com.mastercard.mpqr.pushpayment.exception.RFUTagException;
import com.paymaya.domain.model.MfaTencentErrorResult;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;
import x4.EnumC2465b;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2505a {
    public final List e;

    public f() {
        super(x4.f.class, "^(6[5-9]|7[0-9])$");
        this.e = Arrays.asList(Locale.getISOCountries());
    }

    @Override // y4.AbstractC2505a
    public final void j() {
        super.j();
        x4.f[] fVarArrValues = x4.f.values();
        boolean z4 = false;
        for (int i = 2; i < 52 && !z4; i++) {
            Serializable serializableE = e(fVarArrValues[i]);
            z4 = (serializableE == null || serializableE.toString().length() == 0) ? false : true;
        }
        if (!z4) {
            throw new FormatException("At least one merchant identifier must be inserted");
        }
        x4.f fVar = x4.f.i;
        if (f(fVar)) {
            Serializable serializableE2 = e(fVar);
            if ("01".equals(serializableE2)) {
                if (f(x4.f.j)) {
                    throw new ConflictiveTagException("String with tip convenience indicator value '01' should not contain tag '56' or '57'");
                }
                if (f(x4.f.f20919k)) {
                    throw new ConflictiveTagException("String with tip convenience indicator value '01' should not contain tag '56' or '57'");
                }
            } else if ("02".equals(serializableE2)) {
                if (!f(x4.f.j)) {
                    throw new MissingTagException("String with tip convenience indicator value '02' must contain tag '56'");
                }
                if (f(x4.f.f20919k)) {
                    throw new ConflictiveTagException("String with tip convenience indicator value '02' should not contain tag '57'");
                }
            } else if ("03".equals(serializableE2)) {
                if (!f(x4.f.f20919k)) {
                    throw new MissingTagException("String with tip convenience indicator value '03' must contain tag '57'");
                }
                if (f(x4.f.j)) {
                    throw new ConflictiveTagException("String with tip convenience indicator value '03' should not contain tag '56'");
                }
            }
        }
        x4.f fVar2 = x4.f.f20920l;
        String strC = c(fVar2);
        if (!this.e.contains(strC.toUpperCase())) {
            throw new InvalidTagValueException(fVar2, strC);
        }
    }

    public final void k() {
        x4.f fVar = x4.f.e;
        if (f(fVar) && (String.valueOf(e(fVar)).equalsIgnoreCase("11") || String.valueOf(e(fVar)).equalsIgnoreCase("12"))) {
            return;
        }
        if (f(x4.f.h)) {
            h(fVar, "12");
        } else {
            h(fVar, "11");
        }
    }

    public final String l() throws InvalidTagValueException, RFUTagException {
        String strName;
        int defaultFractionDigits;
        a();
        k();
        j();
        String strC = c(x4.f.f20918g);
        Pattern patternCompile = Pattern.compile("^[0.]*$");
        EnumC2465b[] enumC2465bArr = (EnumC2465b[]) EnumC2465b.class.getEnumConstants();
        int length = enumC2465bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strName = null;
                break;
            }
            EnumC2465b enumC2465b = enumC2465bArr[i];
            if (enumC2465b.f20910a.equals(strC)) {
                strName = enumC2465b.name();
                break;
            }
            i++;
        }
        if (strName == null) {
            throw new InvalidTagValueException(x4.f.f20918g, strC);
        }
        switch (EnumC2465b.valueOf(strName).ordinal()) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 51:
            case 54:
            case 55:
            case 56:
            case 58:
            case 59:
            case 61:
            case 62:
            case 64:
            case 65:
            case 67:
            case 68:
            case 70:
            case 71:
            case 72:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 87:
            case 90:
            case 93:
            case 94:
            case 95:
            case 97:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 130:
            case 131:
            case 132:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
            case 142:
            case 144:
            case 145:
            case 146:
            case 148:
            case 149:
            case ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS /* 150 */:
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 158:
            case 159:
            case 160:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
            case 170:
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 182:
            case 185:
            case 186:
            case 187:
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
            case PsExtractor.AUDIO_STREAM /* 192 */:
            case 200:
            case 210:
            case MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS /* 212 */:
            case MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH /* 214 */:
            case MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK /* 216 */:
            case MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA /* 220 */:
            case 221:
                defaultFractionDigits = 2;
                break;
            case 9:
            case 12:
            case 13:
            case 18:
            case 19:
            case 31:
            case 32:
            case 46:
            case 50:
            case 52:
            case 57:
            case 60:
            case 63:
            case 66:
            case 69:
            case 75:
            case 83:
            case 89:
            case 107:
            case 112:
            case 118:
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case 140:
            case 143:
            case 151:
            case 156:
            case 157:
            case 161:
            case 169:
            case 173:
            case 174:
            case 183:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 203:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED /* 211 */:
            case MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE /* 213 */:
            case MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION /* 215 */:
            case MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT /* 217 */:
            case MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK /* 218 */:
            default:
                defaultFractionDigits = Currency.getInstance(strName).getDefaultFractionDigits();
                break;
            case 21:
            case 86:
            case 91:
            case 99:
            case 108:
            case 133:
            case 171:
                defaultFractionDigits = 3;
                break;
            case 22:
            case 41:
            case 53:
            case 73:
            case 88:
            case 92:
            case 96:
            case 98:
            case 141:
            case 147:
            case 180:
            case 184:
            case 190:
            case 191:
            case 193:
            case 202:
            case 204:
                defaultFractionDigits = 0;
                break;
            case 40:
            case MfaTencentErrorResult.TENCENT_ERROR_APP_STOP /* 219 */:
                defaultFractionDigits = 4;
                break;
        }
        Pattern patternCompile2 = Pattern.compile("^\\d+(\\.\\d{0," + defaultFractionDigits + "}[0]*)?$");
        x4.f fVar = x4.f.h;
        if (f(fVar)) {
            String strP = p();
            if (!patternCompile2.matcher(strP).matches()) {
                throw new InvalidTagValueException(fVar, strP);
            }
        }
        x4.f fVar2 = x4.f.j;
        if (f(fVar2)) {
            String strC2 = c(fVar2);
            String strValueOf = String.valueOf(strC2 != null ? strC2 : null);
            if (patternCompile.matcher(strValueOf).matches()) {
                throw new InvalidTagValueException(fVar2, strValueOf);
            }
            if (!patternCompile2.matcher(strValueOf).matches()) {
                throw new InvalidTagValueException(fVar2, strValueOf);
            }
        } else {
            x4.f fVar3 = x4.f.f20919k;
            if (f(fVar3)) {
                String strC3 = c(fVar3);
                Double dValueOf = strC3 != null ? Double.valueOf(strC3) : null;
                if (dValueOf.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE || dValueOf.doubleValue() >= 100.0d) {
                    throw new InvalidTagValueException(fVar3, String.valueOf(dValueOf));
                }
            }
        }
        if (f(x4.f.f20923p)) {
            C2506b c2506bN = n();
            c2506bN.getClass();
            for (int i4 = 1; i4 < 49; i4++) {
                if (i4 != 9) {
                    String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i4));
                    A0.t(str);
                    if (c2506bN.f21056d.containsKey(str)) {
                        String strB = c2506bN.b(str);
                        if (strB.length() > 25) {
                            throw new InvalidTagValueException(str, strB, "Values in additionalData from TAG 1-49 should not exceed length 25 for generation");
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        x4.f fVar4 = x4.f.f20925r;
        fVar4.getClass();
        this.f21056d.remove(fVar4.f20927a);
        String str2 = toString() + "6304";
        String strG = E1.c.g(str2);
        h(fVar4, strG);
        return str2 + strG;
    }

    public final C2506b n() {
        Serializable serializableE = e(x4.f.f20923p);
        if (serializableE == null) {
            return null;
        }
        return (C2506b) serializableE;
    }

    public final C2508d o(String str) {
        if (!A0.u(26, 51, str)) {
            throw new InvalidTagValueException(str, "MAIData", String.format("Merchant account information that are inserted in dynamically allocable tags should appear in Tag '%1$s' to '%2$s'", 26, 51));
        }
        Serializable serializableD = d(str);
        if (serializableD == null) {
            return null;
        }
        return (C2508d) serializableD;
    }

    public final String p() {
        String strC = c(x4.f.h);
        if (strC == null) {
            return null;
        }
        return strC;
    }

    public final h q(String str) throws InvalidTagValueException {
        if (!A0.u(80, 99, str)) {
            throw new InvalidTagValueException(str, "UnrestrictedData", String.format("Tag for Unrestricted Data should be on the range of '%1$s' to '%2$s'", 80, 99));
        }
        Serializable serializableD = d(str);
        if (serializableD == null) {
            return null;
        }
        return (h) serializableD;
    }
}
