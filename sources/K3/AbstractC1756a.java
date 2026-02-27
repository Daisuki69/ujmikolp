package k3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.ads.RequestConfiguration;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1756a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2.d f18032a = new z2.d(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f18033b = Logger.getLogger(AbstractC1756a.class.getName());

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet(62);
        hashSet.add(7);
        hashSet.add(27);
        hashSet.add(30);
        hashSet.add(31);
        hashSet.add(34);
        hashSet.add(36);
        hashSet.add(39);
        hashSet.add(43);
        hashSet.add(44);
        hashSet.add(49);
        hashSet.add(52);
        hashSet.add(54);
        hashSet.add(55);
        hashSet.add(58);
        hashSet.add(61);
        hashSet.add(62);
        hashSet.add(63);
        hashSet.add(64);
        hashSet.add(66);
        hashSet.add(81);
        hashSet.add(84);
        hashSet.add(90);
        hashSet.add(91);
        hashSet.add(94);
        hashSet.add(95);
        hashSet.add(255);
        hashSet.add(350);
        hashSet.add(351);
        hashSet.add(352);
        hashSet.add(358);
        hashSet.add(359);
        hashSet.add(372);
        hashSet.add(373);
        hashSet.add(380);
        hashSet.add(381);
        hashSet.add(385);
        hashSet.add(Integer.valueOf(TypedValues.PositionType.TYPE_SIZE_PERCENT));
        hashSet.add(Integer.valueOf(TypedValues.PositionType.TYPE_PERCENT_X));
        hashSet.add(595);
        hashSet.add(675);
        hashSet.add(676);
        hashSet.add(679);
        hashSet.add(855);
        hashSet.add(856);
        hashSet.add(971);
        hashSet.add(972);
        hashSet.add(995);
        HashSet hashSet2 = new HashSet(320);
        hashSet2.add("AC");
        hashSet2.add("AD");
        hashSet2.add("AE");
        hashSet2.add("AF");
        hashSet2.add("AG");
        hashSet2.add("AI");
        hashSet2.add("AL");
        hashSet2.add("AM");
        hashSet2.add("AO");
        hashSet2.add("AR");
        hashSet2.add("AS");
        hashSet2.add("AT");
        hashSet2.add("AU");
        hashSet2.add("AW");
        hashSet2.add("AX");
        hashSet2.add("AZ");
        hashSet2.add("BA");
        hashSet2.add("BB");
        hashSet2.add("BD");
        hashSet2.add("BE");
        hashSet2.add("BF");
        hashSet2.add("BG");
        hashSet2.add("BH");
        hashSet2.add("BI");
        hashSet2.add("BJ");
        hashSet2.add("BL");
        hashSet2.add("BM");
        hashSet2.add("BN");
        hashSet2.add("BO");
        hashSet2.add("BQ");
        hashSet2.add("BR");
        hashSet2.add("BS");
        hashSet2.add("BT");
        hashSet2.add("BW");
        hashSet2.add("BY");
        hashSet2.add("BZ");
        hashSet2.add("CA");
        hashSet2.add("CC");
        hashSet2.add("CD");
        hashSet2.add("CF");
        hashSet2.add("CG");
        hashSet2.add("CH");
        hashSet2.add("CI");
        hashSet2.add("CK");
        hashSet2.add("CL");
        hashSet2.add("CM");
        hashSet2.add("CN");
        hashSet2.add("CO");
        hashSet2.add("CR");
        hashSet2.add("CU");
        hashSet2.add("CV");
        hashSet2.add("CW");
        hashSet2.add("CX");
        hashSet2.add("CY");
        hashSet2.add("CZ");
        hashSet2.add("DE");
        hashSet2.add("DJ");
        hashSet2.add("DK");
        hashSet2.add("DM");
        hashSet2.add("DO");
        hashSet2.add("DZ");
        hashSet2.add("EC");
        hashSet2.add("EE");
        hashSet2.add("EG");
        hashSet2.add("EH");
        hashSet2.add("ER");
        hashSet2.add("ES");
        hashSet2.add("ET");
        hashSet2.add("FI");
        hashSet2.add("FJ");
        hashSet2.add("FK");
        hashSet2.add("FM");
        hashSet2.add("FO");
        hashSet2.add("FR");
        hashSet2.add("GA");
        hashSet2.add("GB");
        hashSet2.add("GD");
        hashSet2.add("GE");
        hashSet2.add("GF");
        hashSet2.add("GG");
        hashSet2.add("GH");
        hashSet2.add("GI");
        hashSet2.add("GL");
        hashSet2.add("GM");
        hashSet2.add("GN");
        hashSet2.add("GP");
        hashSet2.add("GR");
        hashSet2.add("GT");
        hashSet2.add("GU");
        hashSet2.add("GW");
        hashSet2.add("GY");
        hashSet2.add("HK");
        hashSet2.add("HN");
        hashSet2.add("HR");
        hashSet2.add("HT");
        hashSet2.add("HU");
        hashSet2.add("ID");
        hashSet2.add("IE");
        hashSet2.add("IL");
        hashSet2.add("IM");
        hashSet2.add("IN");
        hashSet2.add("IQ");
        hashSet2.add("IR");
        hashSet2.add("IS");
        hashSet2.add("IT");
        hashSet2.add("JE");
        hashSet2.add("JM");
        hashSet2.add("JO");
        hashSet2.add("JP");
        hashSet2.add("KE");
        hashSet2.add("KG");
        hashSet2.add("KH");
        hashSet2.add("KI");
        hashSet2.add("KM");
        hashSet2.add("KN");
        hashSet2.add("KP");
        hashSet2.add("KR");
        hashSet2.add("KW");
        hashSet2.add("KY");
        hashSet2.add("KZ");
        hashSet2.add("LA");
        hashSet2.add("LB");
        hashSet2.add("LC");
        hashSet2.add(i.f16190v);
        hashSet2.add("LK");
        hashSet2.add("LR");
        hashSet2.add("LS");
        hashSet2.add("LT");
        hashSet2.add("LU");
        hashSet2.add("LV");
        hashSet2.add("LY");
        hashSet2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        hashSet2.add("MC");
        hashSet2.add("MD");
        hashSet2.add("ME");
        hashSet2.add("MF");
        hashSet2.add("MG");
        hashSet2.add("MH");
        hashSet2.add("MK");
        hashSet2.add("ML");
        hashSet2.add("MM");
        hashSet2.add("MN");
        hashSet2.add("MO");
        hashSet2.add("MP");
        hashSet2.add("MQ");
        hashSet2.add("MR");
        hashSet2.add("MS");
        hashSet2.add("MT");
        hashSet2.add("MU");
        hashSet2.add("MV");
        hashSet2.add("MW");
        hashSet2.add("MX");
        hashSet2.add("MY");
        hashSet2.add("MZ");
        hashSet2.add("NA");
        hashSet2.add("NC");
        hashSet2.add("NE");
        hashSet2.add("NF");
        hashSet2.add("NG");
        hashSet2.add("NI");
        hashSet2.add("NL");
        hashSet2.add("NO");
        hashSet2.add("NP");
        hashSet2.add("NR");
        hashSet2.add("NU");
        hashSet2.add("NZ");
        hashSet2.add("OM");
        hashSet2.add("PA");
        hashSet2.add("PE");
        hashSet2.add("PF");
        hashSet2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_PG);
        hashSet2.add("PH");
        hashSet2.add("PK");
        hashSet2.add("PL");
        hashSet2.add("PM");
        hashSet2.add("PS");
        hashSet2.add("PR");
        hashSet2.add("PT");
        hashSet2.add("PW");
        hashSet2.add("PY");
        hashSet2.add("QA");
        hashSet2.add("RE");
        hashSet2.add("RO");
        hashSet2.add("RS");
        hashSet2.add("RU");
        hashSet2.add("RW");
        hashSet2.add("SA");
        hashSet2.add("SB");
        hashSet2.add("SC");
        hashSet2.add("SD");
        hashSet2.add("SE");
        hashSet2.add("SG");
        hashSet2.add("SH");
        hashSet2.add("SI");
        hashSet2.add("SJ");
        hashSet2.add("SK");
        hashSet2.add("SL");
        hashSet2.add("SM");
        hashSet2.add("SN");
        hashSet2.add("SO");
        hashSet2.add("SR");
        hashSet2.add("ST");
        hashSet2.add("SV");
        hashSet2.add("SX");
        hashSet2.add("SY");
        hashSet2.add("SZ");
        hashSet2.add("TC");
        hashSet2.add(i.f16154B);
        hashSet2.add("TG");
        hashSet2.add(i.f16153A);
        hashSet2.add("TJ");
        hashSet2.add("TL");
        hashSet2.add("TM");
        hashSet2.add("TN");
        hashSet2.add("TO");
        hashSet2.add(i.f16194z);
        hashSet2.add("TT");
        hashSet2.add("TV");
        hashSet2.add("TW");
        hashSet2.add("TZ");
        hashSet2.add("UA");
        hashSet2.add("UG");
        hashSet2.add("US");
        hashSet2.add("UY");
        hashSet2.add("UZ");
        hashSet2.add("VA");
        hashSet2.add("VC");
        hashSet2.add("VE");
        hashSet2.add("VG");
        hashSet2.add("VI");
        hashSet2.add("VN");
        hashSet2.add("VU");
        hashSet2.add("WF");
        hashSet2.add("WS");
        hashSet2.add("XK");
        hashSet2.add("YE");
        hashSet2.add("YT");
        hashSet2.add("ZA");
        hashSet2.add("ZM");
        hashSet2.add("ZW");
    }

    public static C1759d a(Object obj, ConcurrentHashMap concurrentHashMap, String str, z2.d dVar) throws Throwable {
        ObjectInputStream objectInputStream;
        Logger logger = f18033b;
        C1759d c1759d = (C1759d) concurrentHashMap.get(obj);
        if (c1759d != null) {
            return c1759d;
        }
        String str2 = str + Global.UNDERSCORE + obj;
        dVar.getClass();
        InputStream resourceAsStream = AbstractC1756a.class.getResourceAsStream(str2);
        if (resourceAsStream == null) {
            throw new IllegalStateException(AbstractC1414e.h("missing metadata: ", str2));
        }
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(resourceAsStream);
            } catch (IOException e) {
                throw new RuntimeException("cannot load/parse metadata", e);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            C1760e c1760e = new C1760e();
            c1760e.f18099a = new ArrayList();
            try {
                c1760e.readExternal(objectInputStream);
                try {
                    objectInputStream.close();
                } catch (IOException e7) {
                    logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e7);
                }
                ArrayList arrayList = c1760e.f18099a;
                if (arrayList.size() == 0) {
                    throw new IllegalStateException(AbstractC1414e.h("empty metadata: ", str2));
                }
                if (arrayList.size() > 1) {
                    logger.log(Level.WARNING, "more than one metadata in file " + str2);
                }
                C1759d c1759d2 = (C1759d) arrayList.get(0);
                C1759d c1759d3 = (C1759d) concurrentHashMap.putIfAbsent(obj, c1759d2);
                return c1759d3 != null ? c1759d3 : c1759d2;
            } catch (IOException e10) {
                throw new RuntimeException("cannot load/parse metadata", e10);
            }
        } catch (Throwable th3) {
            th = th3;
            objectInputStream2 = objectInputStream;
            try {
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                } else {
                    resourceAsStream.close();
                }
            } catch (IOException e11) {
                logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e11);
            }
            throw th;
        }
    }
}
